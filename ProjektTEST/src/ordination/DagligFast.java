package ordination;

import gui.TypeOrdination;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;

public class DagligFast extends Ordination {

    private Dosis[] doses = new Dosis[4];
    private Laegemiddel laegemiddel;

    public DagligFast(LocalDate startDen, LocalDate slutDen, Laegemiddel laegemiddel) {
        super(startDen, slutDen, laegemiddel);
        this.laegemiddel = laegemiddel;
    }

    public Dosis[] getDoser() {
        return doses;
    }



    public Dosis opretDosis(LocalTime tid, double antal) {
        Dosis dosis = new Dosis(tid,antal);
        if(tid.isAfter(LocalTime.of(6,00)) && tid.isBefore(LocalTime.of(10,00))){
            doses[0] = dosis;
        }
        else if(tid.isAfter(LocalTime.of(10,00)) && tid.isBefore(LocalTime.of(15,00))){
            doses[1] = dosis;
        }
        else if(tid.isAfter(LocalTime.of(15,00)) && tid.isBefore(LocalTime.of(19,00))){
            doses[2] = dosis;
        }
        else{
            doses[3] = dosis;
        }
        return dosis;
    }

    @Override
    public double samletDosis() {
        double samletDosis = 0;
        for (int i = 0; i < antalDage(); i++) {
          samletDosis += doegnDosis();
        }
        return samletDosis;
    }

    @Override
    public double doegnDosis() {
        double antalDoses = 0;
        for (int i = 0; i < doses.length; i++) {
            if(doses[i] != null) {
                antalDoses += doses[i].getAntal();
            }
        }
        return antalDoses;
    }

    @Override
    public String getType() {
        return String.valueOf(TypeOrdination.FAST);
    }

    public Laegemiddel getLaegemiddel() {
        return laegemiddel;
    }
}
