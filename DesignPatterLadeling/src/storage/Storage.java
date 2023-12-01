package storage;

import java.util.List;

import ordination.Patient;

public class Storage implements StorageInterface {

    private static  Storage storage;

    private Storage(){

    }

    public static Storage getStorage(){
        if(storage == null){
            storage = new Storage();
        }
        return storage;
    }


    /**
     * Returnerer en liste med alle gemte patienter
     */
    @Override
    public List<Patient> getAllPatienter() {
        throw new UnsupportedOperationException();
    }



}
