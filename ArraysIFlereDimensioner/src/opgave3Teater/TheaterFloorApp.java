package opgave3Teater;

import java.util.ArrayList;
import java.util.Scanner;

public class TheaterFloorApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		TheaterFloor theater = new TheaterFloor();
		int sæde = 0;
		int række = 0;
		int pris = 0;
		String svar = null;
		// TODO
		System.out.println("følgende er en oversigt over ledige pladser samt deres pris," +
				" \nfor et sæde på en givende række \n" +
				" " );
		theater.printTheaterFloor();
		System.out.println("Vil du vælge en bestemt ledig plads eller bare den første til " +
				" \nden ønskede pris 10 / 20 kr  skriv ja hvis selv vil finde plads og række");

		svar = input.nextLine();

		if(svar.equalsIgnoreCase("ja")){
			System.out.println("Hvilken række? (1 - 9)");
			række = input.nextInt();
			System.out.println("Hvilket sæde? (1 - 10)");
			sæde = input.nextInt();
			theater.buySeat(række,sæde);
			theater.printTheaterFloor();
		}
		else {
			System.out.println("Pris skal være fra 10, 20, 30, 40, 50 kr skriv bare tallet");
			while (pris == 0) {
				pris = input.nextInt();
				if (pris == 10 || pris == 20 || pris == 30 || pris == 40 || pris == 50) {
					theater.buySeat(pris);
					theater.printTheaterFloor();
				}
				else {
					System.out.println("Vælg en pris der er mellem 10,20,30,40,50 kr");
				}
			}



		}



	}
}
