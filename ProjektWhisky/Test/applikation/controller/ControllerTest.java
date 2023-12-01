package applikation.controller;

import applikation.model.Batch;
import applikation.model.Fad;
import applikation.model.Medarbejder;
import applikation.model.Påfyldning;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import storage.Storage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ControllerTest {

    @Test
    void createBatch_TC1() {
        //Arrange
        Storage storage = mock(Storage.class);


        doNothing().when(storage).addBatch(any(Batch.class));

        String spiritBatchNr = "20000";
        LocalDate startDato = LocalDate.of(2002,10, 10);
        LocalDate slutDato = LocalDate.of(2005,10,11);
        int alkoholProcent = 10;
        String malBatch = "MAL42";
        String kornsort = "CORN";
        int antalLiter = 100;
        boolean rygemateriale = true;
        String kommentar = "Dette er en test af controller";
        Medarbejder medarbejder = new Medarbejder("Hans",1111);










        //ACT
        Batch aktuelleBatch = Controller.createBatch(spiritBatchNr,startDato ,slutDato,alkoholProcent,malBatch,
                kornsort,antalLiter,true,
                kommentar,medarbejder);

        Batch forventetBatch = new Batch(spiritBatchNr,startDato ,slutDato,alkoholProcent,malBatch,
                kornsort,antalLiter,true,
                kommentar,medarbejder);

        //ASSERT

        assertEquals(forventetBatch.getNewSpiritBatchNr(),aktuelleBatch.getNewSpiritBatchNr());
        assertEquals(forventetBatch.getStartDato(),aktuelleBatch.getStartDato());
        assertEquals(forventetBatch.getSlutDato(),aktuelleBatch.getSlutDato());
        assertEquals(forventetBatch.getAlkoholProcent(),aktuelleBatch.getAlkoholProcent());
        assertEquals(forventetBatch.getMalBatch(),aktuelleBatch.getMalBatch());
        assertEquals(forventetBatch.getKornsort(),aktuelleBatch.getKornsort());
        assertEquals(forventetBatch.getKommentar(),aktuelleBatch.getKommentar());
        assertEquals(forventetBatch.isRygemateriale(),aktuelleBatch.isRygemateriale());
        assertEquals(forventetBatch.isRygemateriale(),aktuelleBatch.isRygemateriale());
        assertEquals(forventetBatch.getMedarbejder(),aktuelleBatch.getMedarbejder());

    }


    @Test
    void createPåfyldning_TC1() {
        //Arrange
        Batch batch = Controller.createBatch("20000", LocalDate.of(2002,10,
                        10),LocalDate.of(2005,10,11),10,"Hvad er det",
                "CORN",100,true,
                "Dette er en test af controller",new Medarbejder("hans",1111));

        int antalLitter = 30;


        //ACT
        Påfyldning aktuelPåfyldning = Controller.createPåfyldning(antalLitter,batch);
      aktuelPåfyldning.setBatch(batch);


        //Assert
        assertEquals(antalLitter,aktuelPåfyldning.getAntalLitter());
        assertEquals(batch,aktuelPåfyldning.getBatch());



    }


    @Test
    void createPåfyldning_TC2() {
//        try {

            //Arrange
            Batch batch = Controller.createBatch("20000", LocalDate.of(2002, 10,
                            10), LocalDate.of(2005, 10, 11), 10, "Hvad er det",
                    "CORN", 100, true,
                    "Dette er en test af controller", new Medarbejder("hans", 1111));

            int antalLitter = 0;


            //ACT & Assert
            assertThrows(RuntimeException.class,()->{
                Controller.createPåfyldning(antalLitter,batch);
            });

//            Påfyldning aktuelPåfyldning = Controller.createPåfyldning(antalLitter,batch);
//            aktuelPåfyldning.setBatch(batch);


            //Assert
//            assertEquals(antalLitter, aktuelPåfyldning.getAntalLitter());
//            assertEquals(batch, aktuelPåfyldning.getBatch());




//        }
//        catch (RuntimeException e){
//            System.out.println( e.getMessage());
//        }



    }


    @Test
    void getTilgængligeBatchs() {
//        public static ArrayList<Batch> getTilgængligeBatchs(String kornsort, boolean rygeMateriale){
//            ArrayList<Batch> tilgængligeBatches = new ArrayList<>();
//            for(Batch batch : storage.getBatchs()){
//                if(batch.getKornsort().equals(kornsort) &&
//                        batch.isRygemateriale() == rygeMateriale && batch.beregnResterendeMængde() > 0){
//                    tilgængligeBatches.add(batch);
//                }
//
//            }
//            return tilgængligeBatches;
//        }

        //Arrange



    }


    @Test
    void findLedigFad_TC1() {
//        public ArrayList<Fad> findLedigFad(String fadType){
//            ArrayList<Fad> ledigeFad = new ArrayList<>();
//            for(Fad fad : storage.getFad()){
//                if(fad.isLedig() && fad.getFadType() == fadType){
//                    ledigeFad.add(fad);
//
//            }
//            return ledigeFad;
//        }


        //Arrange
        boolean ikkeRygeMateriale = false;
        boolean erRygeMateriale = true;
        String kornsort1 = "Irina";
        String kornsort2 = "Evergreen";

        Medarbejder medarbejder = Controller.createMedarbejder("Hans",100);

        Batch batch1 = Controller.createBatch("NM2",
                LocalDate.of(2023,12,1),LocalDate.of(2023,12,3),
                50,"MAL41",kornsort1,1000,erRygeMateriale,
                "Et god produkt",medarbejder);

        Batch batch2 = Controller.createBatch("NM3",
                LocalDate.of(2023,12,1),LocalDate.of(2023,12,3),
                50,"MAL40",kornsort1,1000,erRygeMateriale,
                "Et god produkt",medarbejder);

        Batch batch3 = Controller.createBatch("NM2",
                LocalDate.of(2023,12,1),LocalDate.of(2023,12,3),
                50,"MAL40",kornsort2,1000,ikkeRygeMateriale,
                "Et god produkt",medarbejder);


        Batch batch4 = Controller.createBatch("NM3",
                LocalDate.of(2023,12,1),LocalDate.of(2023,12,3),
                50,"MAL40",kornsort2,1000,ikkeRygeMateriale,
                "Et god produkt",medarbejder);


        //ACT
        ArrayList<Batch> aktuelleBatches = Controller.getTilgængligeBatchs(kornsort1,erRygeMateriale);


        //ASSERT
        assertEquals(batch1.isRygemateriale(),aktuelleBatches.get(0).isRygemateriale());
        assertEquals(batch1.getKornsort(),aktuelleBatches.get(0).getKornsort());

        assertEquals(batch2.isRygemateriale(),aktuelleBatches.get(1).isRygemateriale());
        assertEquals(batch2.getKornsort(),aktuelleBatches.get(1).getKornsort());







    }



}