package applikation.controller;

import applikation.model.*;
import storage.Storage;

import java.time.LocalDate;
import java.util.ArrayList;

public class Controller  {
    private  static Storage storage = Storage.getStorage();











    /**
     * her starter det
     */


    public  static Batch createBatch(String newSpiritBatchNr, LocalDate startDato, LocalDate slutDato, int alkoholProcent,
                              String malBatch, String kornSort, int antalLiter, boolean rygemateriale, String kommentar,
                              Medarbejder medarbejder) {

        Batch batch = new Batch(newSpiritBatchNr,startDato,slutDato,alkoholProcent,
                malBatch,kornSort,antalLiter,rygemateriale,kommentar,medarbejder );
        storage.addBatch(batch);
        return batch;
    }



    public static ArrayList<Batch> getTilgængligeBatchs(String kornsort, boolean rygeMateriale){
        ArrayList<Batch> tilgængligeBatches = new ArrayList<>();
        for(Batch batch : storage.getBatchs()){
            if(batch.getKornsort().equals(kornsort) &&
                    batch.isRygemateriale() == rygeMateriale && batch.beregnResterendeMængde() > 0){
                tilgængligeBatches.add(batch);
            }

        }
        return tilgængligeBatches;
    }






    public static Fad createFad(int fadNr, String fadType, int størrelse, String lagerMidlertidligLokation){
        Fad fad = new Fad(fadNr,fadType,størrelse,lagerMidlertidligLokation);
        storage.addFad(fad);
        return fad;
    }


    public static ArrayList<Fad> findLedigFad(String fadType){
        ArrayList<Fad> ledigeFad = new ArrayList<>();
        for(Fad fad : storage.getFad()){
            if(fad.isLedig() && fad.getFadType() == fadType){
                ledigeFad.add(fad);
            }
        }
        return ledigeFad;
    }





    public  static Destillat createDestillat(LocalDate påfyldningsDato, int alkoholProcent, Fad fad, ArrayList<Påfyldning> påfyldnings){
        Destillat destillat = new Destillat(påfyldningsDato,alkoholProcent,påfyldnings);
        destillat.setFad(fad);
        storage.addDestillat(destillat);
        return destillat;
    }



    public static Påfyldning createPåfyldning(int antalLitter,Batch batch){
        if(antalLitter > 0) {
            Påfyldning påfyldning = new Påfyldning(antalLitter);
            påfyldning.setBatch(batch);
            storage.addPåfyldning(påfyldning);
            return påfyldning;
        }
        else {
            throw new RuntimeException("Antal Litter må ikke være mindre end eller lig med 0");
        }
    }







    public static Medarbejder createMedarbejder(String navn, int medNr){
        Medarbejder medarbejder = new Medarbejder(navn,medNr);
        storage.addMedarbejder(medarbejder);
        return medarbejder;
    }






}
