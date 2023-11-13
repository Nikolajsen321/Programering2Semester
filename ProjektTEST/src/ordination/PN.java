package ordination;

import controller.Controller;
import gui.TypeOrdination;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;

public class PN extends Ordination {

    private double antalEnheder;
    private ArrayList<LocalDate> antalGangePåDato = new ArrayList<>();
    private Laegemiddel laegemiddel;


    /*
    TODO
     */

    public PN(LocalDate startDen, LocalDate slutDen, Laegemiddel laegemiddel,double antalEnheder) {
        super(startDen, slutDen, laegemiddel);
        this.antalEnheder = antalEnheder;
        this.laegemiddel = laegemiddel;

    }

    /**
     * Registrerer at der er givet en dosis paa dagen givesDen
     * Returnerer true hvis givesDen er inden for ordinationens gyldighedsperiode og datoen huskes
     * Returner false ellers og datoen givesDen ignoreres
     * @param givesDen
     * @return
     */

    public boolean givDosis(LocalDate givesDen) {
        Long chronoUnit = ChronoUnit.DAYS.between(getStartDen(), givesDen);
        if (chronoUnit >= 0 && chronoUnit <= antalDage()) {
            antalGangePåDato.add(givesDen);
            Collections.sort(antalGangePåDato);
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<LocalDate> getAntalGangePåDato() {
        return antalGangePåDato;
    }

    public double doegnDosis() {
        if(antalGangePåDato.isEmpty()) {
            return  0;
        }
           long chronoUnit = ChronoUnit.DAYS.between(antalGangePåDato.get(0), antalGangePåDato.get(antalGangePåDato.size()-1))+1;
//            double antalDosisPrDøgn = (getAntalGangeGivet() * antalEnheder) / (chronoUnit);
//            antalDosisPrDøgn = antalDosisPrDøgn == 0?1 : antalDosisPrDøgn;
            return samletDosis() / chronoUnit;


    }



    @Override
    public String getType() {
        String type = String.valueOf(TypeOrdination.PN);
        return type;
    }


    public double samletDosis() {
        return getAntalGangeGivet()*antalEnheder;
    }

    /**
     * Returnerer antal gange ordinationen er anvendt
     * @return
     */
    public int getAntalGangeGivet() {
        return antalGangePåDato.size();
    }



    public double getAntalEnheder() {
        return antalEnheder;
    }

    public Laegemiddel getLaegemiddel() {
        return laegemiddel;
    }
}