package ordination;

import gui.TypeOrdination;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class DagligSkaev extends Ordination{
    private ArrayList<Dosis> doses = new ArrayList<>();
    private Laegemiddel laegemiddel;

    public DagligSkaev(LocalDate startDen, LocalDate slutDen, Laegemiddel laegemiddel,LocalTime[] localTimes,double[] antalEnheder) {
        super(startDen, slutDen, laegemiddel);
        for(int i = 0; i < localTimes.length; i++){
            opretDosis(localTimes[i],antalEnheder[i]);
        }
        this.laegemiddel = laegemiddel;
    }

    public ArrayList<Dosis> getDoser() {
        return new ArrayList<>(doses);
    }

    public Dosis opretDosis(LocalTime tid, double antal) {
        Dosis dosis = new Dosis(tid,antal);
            doses.add(dosis);

        return dosis;
    }



    @Override
    public double samletDosis() {
        double samletDosis = 0;
        int antaldage = (int) ChronoUnit.DAYS.between(getStartDen(),getSlutDen())+1;
        for (int i = 0; i < antaldage; i++) {
            samletDosis += doegnDosis();
        }
        return samletDosis;
    }

    @Override
    public double doegnDosis() {
        double antalDoser = 0;
        for (Dosis d : doses) {
          antalDoser += d.getAntal();
        }
        return antalDoser;
    }

    @Override
    public String getType() {
        return String.valueOf(TypeOrdination.SKAEV);
    }
    public Laegemiddel getLaegemiddel() {
        return laegemiddel;
    }
}
