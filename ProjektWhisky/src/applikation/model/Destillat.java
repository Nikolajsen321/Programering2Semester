package applikation.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Destillat {
    private LocalDate påfyldningsDato;
    private int alkoholProcent;
    private ArrayList<Påfyldning> påfyldnings;
    private Medarbejder medarbejder;

    private Fad fad;


    public Destillat(LocalDate påfyldningsDato, int alkoholProcent,ArrayList<Påfyldning> påfyldnings) {
        this.påfyldningsDato = påfyldningsDato;
        this.alkoholProcent = alkoholProcent;
        this.påfyldnings = påfyldnings;
    }

    public ArrayList<Påfyldning> getPåfyldnings(){
        return new ArrayList<>(påfyldnings);
    }

    public void addPåfyldning(Påfyldning påfyldning){
        if(!påfyldnings.contains(påfyldning)){
            påfyldnings.add(påfyldning);
            påfyldning.setDestillat(this);
        }
    }

    public Fad getFad() {
        return fad;
    }

    public void setFad(Fad fad) {
        if(this.fad != fad){
            this.fad = fad;
            this.fad.setLedig(false);
        }
    }

    public LocalDate getPåfyldningsDato() {
        return påfyldningsDato;
    }

    public int getAlkoholProcent() {
        return alkoholProcent;
    }

    public Medarbejder getMedarbejder() {
        return medarbejder;
    }
}
