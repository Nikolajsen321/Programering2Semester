package controller;

import ordination.Laegemiddel;
import ordination.Ordination;
import ordination.Patient;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import storage.StorageInterface;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ControllerTest {
    @Test
    void opret_Ordination(){
        //Arrange
        StorageInterface storage = mock(StorageInterface.class);
        Controller controller = new Controller(storage);

        Patient patient = mock(Patient.class);
        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(patient);


        Laegemiddel laegemiddel = mock(Laegemiddel.class);

        Ordination ordination = mock(Ordination.class);
        ArrayList<Ordination> ordinations = new ArrayList<>();
        ordinations.add(ordination);

        when(patient.getOrdinationer()).thenReturn(ordinations);
        when(ordination.getLaegemiddel()).thenReturn(laegemiddel);
        when(patient.getVaegt()).thenReturn(25.0);



        when(storage.getAllPatienter()).thenReturn(patients);


        //ACT
       int antal = controller.antalOrdinationerPrVægtPrLægemiddel(20,30,laegemiddel);

        //ASSERT
        assertEquals(1, antal);
    }

}