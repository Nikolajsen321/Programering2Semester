package controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import ordination.*;
import storage.Storage;

public class Controller {
	private Storage storage;
	private static Controller controller;

	private Controller() {
		storage = new Storage();
	}

	public static Controller getController() {
		if (controller == null) {
			controller = new Controller();
		}
		return controller;
	}

	public static Controller getTestController() {
		return new Controller();
	}

	/**
	 * Hvis startDato er efter slutDato kastes en IllegalArgumentException og
	 * ordinationen oprettes ikke
	 * Pre: startDen, slutDen, patient og laegemiddel er ikke null
	 * Pre: antal >= 0
	 * @return opretter og returnerer en PN ordination.
	 */
	public PN opretPNOrdination(LocalDate startDen, LocalDate slutDen,
								Patient patient, Laegemiddel laegemiddel, double antal) {
		PN pNOrdination = new PN(startDen,slutDen,laegemiddel,antal);
		patient.addOrdanition(pNOrdination);
		if(pNOrdination.antalDage() >= 0){
			return pNOrdination;
		}else {
			String message = "Start dato kommer efter slut dato";
			throw new IllegalArgumentException(message);
		}
	}

	/**
	 * Opretter og returnerer en DagligFast ordination. Hvis startDato er efter
	 * slutDato kastes en IllegalArgumentException og ordinationen oprettes ikke
	 * Pre: startDen, slutDen, patient og laegemiddel er ikke null
	 * Pre: margenAntal, middagAntal, aftanAntal, natAntal >= 0
	 */
	public DagligFast opretDagligFastOrdination(LocalDate startDen,
												LocalDate slutDen, Patient patient, Laegemiddel laegemiddel,
												double morgenAntal, double middagAntal, double aftenAntal,
												double natAntal) {

//		long dage = ChronoUnit.DAYS.between(startDen,slutDen);
//		long month = ChronoUnit.MONTHS.between(startDen,slutDen);

		DagligFast dagligFastOrdination = new DagligFast(startDen,slutDen,laegemiddel);
		patient.addOrdanition(dagligFastOrdination);

		if(dagligFastOrdination.antalDage() >= 0){
			return dagligFastOrdination;
		}else {
			String message = "Start dato kommer efter slut dato";
			throw new IllegalArgumentException(message);
		}

	}

	/**
	 * Opretter og returnerer en DagligSkæv ordination. Hvis startDato er efter
	 * slutDato kastes en IllegalArgumentException og ordinationen oprettes ikke.
	 * Hvis antallet af elementer i klokkeSlet og antalEnheder er forskellige kastes også en IllegalArgumentException.
	 *
	 * Pre: startDen, slutDen, patient og laegemiddel er ikke null
	 * Pre: alle tal i antalEnheder > 0
	 */
	public DagligSkaev opretDagligSkaevOrdination(LocalDate startDen,
												  LocalDate slutDen, Patient patient, Laegemiddel laegemiddel,
												  LocalTime[] klokkeSlet, double[] antalEnheder) {
//		long dage = ChronoUnit.DAYS.between(startDen,slutDen);
//		long month = ChronoUnit.MONTHS.between(startDen,slutDen);
		DagligSkaev dagligSkaevOrdination = new DagligSkaev(startDen,slutDen,laegemiddel,klokkeSlet,antalEnheder);
		patient.addOrdanition(dagligSkaevOrdination);

		if(dagligSkaevOrdination.antalDage() >= 0){
			return dagligSkaevOrdination;
		}else {
			String message = "Start dato kommer efter slut dato";
			throw new IllegalArgumentException(message);
		}

	}

	/**
	 * En dato for hvornår ordinationen anvendes tilføjes ordinationen. Hvis
	 * datoen ikke er indenfor ordinationens gyldighedsperiode kastes en
	 * IllegalArgumentException
	 * Pre: ordination og dato er ikke null
	 */

	public void ordinationPNAnvendt(PN ordination, LocalDate dato) {

		ordination.givDosis(dato);
	}

	/**
	 * Den anbefalede dosis for den pågældende patient (der skal tages hensyn
	 * til patientens vægt). Det er en forskellig enheds faktor der skal
	 * anvendes, og den er afhængig af patientens vægt.
	 * Pre: patient og lægemiddel er ikke null
	 */

	public double anbefaletDosisPrDoegn(Patient patient, Laegemiddel laegemiddel) {
		double anbefalede = 0;
		if (patient.getVaegt() <= 25) {
			anbefalede = laegemiddel.getEnhedPrKgPrDoegnLet() * patient.getVaegt();
		} else if (patient.getVaegt() < 25 && patient.getVaegt() < 120) {
			anbefalede = laegemiddel.getEnhedPrKgPrDoegnNormal() * patient.getVaegt();
		} else if (patient.getVaegt() >= 120) {
			anbefalede = laegemiddel.getEnhedPrKgPrDoegnTung() * patient.getVaegt();
		}

		return anbefalede;
	}

	/**
	 * For et givent vægtinterval og et givent lægemiddel, hentes antallet af
	 * ordinationer.
	 * Pre: laegemiddel er ikke null
	 */
	public int antalOrdinationerPrVægtPrLægemiddel(double vægtStart,
												   double vægtSlut, Laegemiddel laegemiddel) {
		int antalOrdinationer = 0;
		ArrayList<Patient> patienter = new ArrayList<>(storage.getAllPatienter());
		for (Patient p : patienter) {
			if (vægtStart >= p.getVaegt() && vægtSlut <= p.getVaegt()) {
				for (Ordination o : p.getOrdinations()) {
					if (o.getLaegemiddel().equals(laegemiddel)) {
						antalOrdinationer++;
					}

				}
			}
		}


		return antalOrdinationer;
	}

	public List<Patient> getAllPatienter() {
		return storage.getAllPatienter();
	}

	public List<Laegemiddel> getAllLaegemidler() {
		return storage.getAllLaegemidler();
	}

	/**
	 * Metode der kan bruges til at checke at en startDato ligger før en
	 * slutDato.
	 *
	 * @return true hvis startDato er før slutDato, false ellers.
	 */
	private boolean checkStartFoerSlut(LocalDate startDato, LocalDate slutDato) {
		boolean result = true;
		if (slutDato.compareTo(startDato) < 0) {
			result = false;
		}
		return result;
	}

	public Patient opretPatient(String cpr, String navn, double vaegt) {
		Patient p = new Patient(cpr, navn, vaegt);
		storage.addPatient(p);
		return p;
	}

	public Laegemiddel opretLaegemiddel(String navn,
										double enhedPrKgPrDoegnLet, double enhedPrKgPrDoegnNormal,
										double enhedPrKgPrDoegnTung, String enhed) {
		Laegemiddel lm = new Laegemiddel(navn, enhedPrKgPrDoegnLet,
				enhedPrKgPrDoegnNormal, enhedPrKgPrDoegnTung, enhed);
		storage.addLaegemiddel(lm);
		return lm;
	}

	public void createSomeObjects() {
		this.opretPatient("121256-0512", "Jane Jensen", 63.4);
		this.opretPatient("070985-1153", "Finn Madsen", 83.2);
		this.opretPatient("050972-1233", "Hans Jørgensen", 89.4);
		this.opretPatient("011064-1522", "Ulla Nielsen", 59.9);
		this.opretPatient("090149-2529", "Ib Hansen", 87.7);

		this.opretLaegemiddel("Acetylsalicylsyre", 0.1, 0.15, 0.16, "Styk");
		this.opretLaegemiddel("Paracetamol", 1, 1.5, 2, "Ml");
		this.opretLaegemiddel("Fucidin", 0.025, 0.025, 0.025, "Styk");
		this.opretLaegemiddel("Methotrexat", 0.01, 0.015, 0.02, "Styk");

		this.opretPNOrdination(LocalDate.of(2021, 1, 1), LocalDate.of(2021, 1, 12),
				storage.getAllPatienter().get(0), storage.getAllLaegemidler()
						.get(1),
				123);

		this.opretPNOrdination(LocalDate.of(2021, 2, 12), LocalDate.of(2021, 2, 14),
				storage.getAllPatienter().get(0), storage.getAllLaegemidler()
						.get(0),
				3);

		this.opretPNOrdination(LocalDate.of(2021, 1, 20), LocalDate.of(2021, 1, 25),
				storage.getAllPatienter().get(3), storage.getAllLaegemidler()
						.get(2),
				5);

		this.opretPNOrdination(LocalDate.of(2021, 1, 1), LocalDate.of(2021, 1, 12),
				storage.getAllPatienter().get(0), storage.getAllLaegemidler()
						.get(1),
				123);

		this.opretDagligFastOrdination(LocalDate.of(2021, 1, 10),
				LocalDate.of(2021, 1, 12), storage.getAllPatienter().get(1),
				storage.getAllLaegemidler().get(1), 2, 0, 1, 0);

		LocalTime[] kl = { LocalTime.of(12, 0), LocalTime.of(12, 40),
				LocalTime.of(16, 0), LocalTime.of(18, 45) };
		double[] an = { 0.5, 1, 2.5, 3 };

		this.opretDagligSkaevOrdination(LocalDate.of(2021, 1, 23),
				LocalDate.of(2021, 1, 24), storage.getAllPatienter().get(1),
				storage.getAllLaegemidler().get(2), kl, an);
	}

}
