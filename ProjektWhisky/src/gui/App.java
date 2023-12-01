package gui;

import applikation.controller.Controller;
import applikation.model.*;
import storage.Storage;

import java.time.LocalDate;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Storage storage = Storage.getStorage();

        Batch batch = Controller.createBatch("20000", LocalDate.of(2002,10,
                10),LocalDate.of(2005,10,11),10,"Hvad er det",
                "CORN",100,true,
                "Dette er en test af controller",new Medarbejder("hans",1111));



        Fad fad = Controller.createFad(110,"Burbon",135,"A20");

        Påfyldning påfyldning1 = Controller.createPåfyldning(30,batch);
        Påfyldning påfyldning2 = Controller.createPåfyldning(30,batch);
        Påfyldning påfyldning3 = Controller.createPåfyldning(70,batch);





        ArrayList<Påfyldning> påfyldnings = new ArrayList<>();
        påfyldnings.add(påfyldning1);
        påfyldnings.add(påfyldning2);


        System.out.println(batch.beregnResterendeMængde());

        Destillat destillat = Controller.createDestillat(LocalDate.of(2005,10,13),60,fad,påfyldnings);
        destillat.setFad(fad);


        System.out.println(Controller.getTilgængligeBatchs("CORN",true));



        for(Batch batch1 : storage.getBatchs()){
            System.out.println(batch1.getKornsort());
        }











    }



}
