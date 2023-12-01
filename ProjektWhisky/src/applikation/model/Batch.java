package applikation.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.SortedMap;

public class Batch {
    private String newSpiritBatchNr;
    private LocalDate startDato;
    private LocalDate slutDato;
    private int alkoholProcent;
    private String malBatch;
    private String kornsort;
    private int antalLiter;
    private boolean rygemateriale;
    private String kommentar;
    private ArrayList<Påfyldning> påfyldnings;
    private Medarbejder medarbejder;

    public Batch(String newSpiritBatchNr, LocalDate startDato, LocalDate slutDato,
                 int alkoholProcent, String malBatch, String kornsort, int antalLiter, boolean rygemateriale,
                 String kommentar,Medarbejder medarbejder) {
        this.newSpiritBatchNr = newSpiritBatchNr;
        this.startDato = startDato;
        this.slutDato = slutDato;
        this.alkoholProcent = alkoholProcent;
        this.malBatch = malBatch;
        this.kornsort = kornsort;
        this.antalLiter = antalLiter;
        this.rygemateriale = rygemateriale;
        this.kommentar = kommentar;
        this.medarbejder = medarbejder;
        this.påfyldnings = new ArrayList<>();
    }

    public ArrayList<Påfyldning> getPåfyldnings(){
        return new ArrayList<>(påfyldnings);
    }

    public void addPåfyldning(Påfyldning påfyldning){
        if(påfyldning.getAntalLitter() <= beregnResterendeMængde()) {
            if (!påfyldnings.contains(påfyldning)) {
                påfyldnings.add(påfyldning);
                påfyldning.setBatch(this);
            }
        }
        else {
            System.out.println("Der er ikke mere tilbage ");
        }

    }

    public void removePåfyldning(Påfyldning påfyldning){
        if(påfyldnings.contains(påfyldning)){
            påfyldnings.remove(påfyldning);
            påfyldning.setBatch(null);
        }
    }

//    public void setMedarbejder(Medarbejder medarbejder){
//        if(medarbejder != medarbejder){
//            this.medarbejder = medarbejder;
//        }
//    }






    public int beregnResterendeMængde(){
        int nytEstimatLiter = antalLiter;
        for(Påfyldning p: påfyldnings){
            nytEstimatLiter -=p.getAntalLitter();
//            System.out.println(nytEstimatLiter);

        }
        return nytEstimatLiter;
    }





    public String getNewSpiritBatchNr() {
        return newSpiritBatchNr;
    }

    public LocalDate getStartDato() {
        return startDato;
    }

    public LocalDate getSlutDato() {
        return slutDato;
    }

    public int getAlkoholProcent() {
        return alkoholProcent;
    }

    public String getMalBatch() {
        return malBatch;
    }

    public String getKornsort() {
        return kornsort;
    }

    public int getAntalLiter() {
        return antalLiter;
    }

    public boolean isRygemateriale() {
        return rygemateriale;
    }

    public String getKommentar() {
        return kommentar;
    }


    public Medarbejder getMedarbejder() {
        return medarbejder;
    }

    @Override
    public String toString() {
        return "Batch{" +
                "newSpiritBatchNr='" + newSpiritBatchNr + '\'' +
                ", startDato=" + startDato +
                ", slutDato=" + slutDato +
                ", alkoholProcent=" + alkoholProcent +
                ", malBatch='" + malBatch + '\'' +
                ", kornsort='" + kornsort + '\'' +
                ", antalLiter=" + antalLiter +
                ", rygemateriale=" + rygemateriale +
                ", kommentar='" + kommentar + '\'' +
                ", påfyldnings=" + påfyldnings +
                ", medarbejder=" + medarbejder +
                '}';
    }
}
