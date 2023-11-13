package ordination;


import controller.Controller;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class DagligSkaevTest {

    @Test
    void DagligSkaev_Konstruktor() {
        //Arrange
        //LocalDate startDen, LocalDate slutDen, Laegemiddel laegemiddel,LocalTime[] localTimes,double[] antalEnheder
        LocalDate startDen = LocalDate.of(2021,10,10);
        LocalDate slutDen = LocalDate.of(2021,10,17);
        Laegemiddel laegemiddel = new Laegemiddel("Rainbows",1,2,3,"Styk");
        LocalTime[] localTimes = new LocalTime[4];
        int tid = 10;
        for (int i = 0; i < localTimes.length; i++) {
            localTimes[i] = LocalTime.of(tid,0);
            tid++;
        }
        double[] antalEnhder = new double[4];
        for (int i = 0; i < antalEnhder.length; i++) {
            antalEnhder[i] = 1;
        }

        //ACT
        DagligSkaev faktiskDagligSkaev = new DagligSkaev(startDen,slutDen,laegemiddel,localTimes,antalEnhder);

        //ASSERT
        assertEquals(startDen,faktiskDagligSkaev.getStartDen());
        assertEquals(slutDen,faktiskDagligSkaev.getSlutDen());
        assertEquals(laegemiddel,faktiskDagligSkaev.getLaegemiddel());
        for (int i = 0; i < faktiskDagligSkaev.getDoser().size(); i++) {
            assertEquals(localTimes[i],faktiskDagligSkaev.getDoser().get(i).getTid());
        }
        for (int i = 0; i < faktiskDagligSkaev.getDoser().size(); i++) {
            assertEquals(antalEnhder[i],faktiskDagligSkaev.getDoser().get(i).getAntal());
        }

    }
    @Test
    void opretDosis() {
        //Arrange
        Laegemiddel laegemiddel = new Laegemiddel("Morfin",1,2,3,"Styk");
        LocalTime[] localTimes = {};
        double[] antalEnhder = {};
        Patient patient = new Patient("1234556655","Lars",60);
//        int tid = 10;
//        for (int i = 0; i < localTimes.length; i++) {
//            localTimes[i] = LocalTime.of(tid,0);
//            tid++;
//        }
//        double[] antalEnhder = new double[4];
//        for (int i = 0; i < antalEnhder.length; i++) {
//            antalEnhder[i] = 1;
//        }
        DagligSkaev dagligSkaev = new DagligSkaev(LocalDate.of(2021, 10, 10), LocalDate.of(2021, 10, 17),laegemiddel,localTimes,antalEnhder);

        //ACT
        Dosis faktiskDosis = dagligSkaev.opretDosis(LocalTime.of(10,00),1);

        //ASSERT
        assertEquals(dagligSkaev.getDoser().get(0).getAntal(),faktiskDosis.getAntal());
        assertEquals(dagligSkaev.getDoser().get(0).getTid(),faktiskDosis.getTid());
    }

    @Test
    void samletDosis_SammeMåned_antalDoser4_antalEnheder4PrDosis() {
        //Arrange
        Laegemiddel laegemiddel = new Laegemiddel("Morfin",1,2,3,"Styk");
        LocalTime[] localTimes = new LocalTime[4];
        int tid = 10;
        for (int i = 0; i < localTimes.length; i++) {
            localTimes[i] = LocalTime.of(tid,0);
            tid++;
        }
        double[] antalEnhder = new double[4];
        for (int i = 0; i < antalEnhder.length; i++) {
            antalEnhder[i] = 1;
        }
        DagligSkaev dagligSkaev = new DagligSkaev(LocalDate.of(2021,10,10),LocalDate.of(2021,10,17),laegemiddel,localTimes,antalEnhder);
        //ACT
        double faktiskDosis = dagligSkaev.samletDosis();
        double forventet = 32;
        //ASSERT
        assertEquals(forventet,faktiskDosis);
    }

    @Test
    void samletDosis_MånedSkift_antalDoser4_antalEnheder4PrDosis() {
        //Arrange
        Laegemiddel laegemiddel = new Laegemiddel("Morfin",1,2,3,"Styk");
        LocalTime[] localTimes = new LocalTime[4];
        int tid = 10;
        for (int i = 0; i < localTimes.length; i++) {
            localTimes[i] = LocalTime.of(tid,0);
            tid++;
        }
        double[] antalEnhder = new double[4];
        for (int i = 0; i < antalEnhder.length; i++) {
            antalEnhder[i] = 1;
        }
        DagligSkaev dagligSkaev = new DagligSkaev(LocalDate.of(2021,10,10),LocalDate.of(2021,11,10),laegemiddel,localTimes,antalEnhder);
        //ACT
        double faktiskDosis = dagligSkaev.samletDosis();
        double forventet = 128;
        //ASSERT
        assertEquals(forventet,faktiskDosis);
    }

    @Test
    void samletDosis_StartDatoEfterSlut_antalDoser4_antalEnheder4PrDosis() {
        //Arrange
        Laegemiddel laegemiddel = new Laegemiddel("Morfin",1,2,3,"Styk");
        LocalTime[] localTimes = new LocalTime[4];
        int tid = 10;
        for (int i = 0; i < localTimes.length; i++) {
            localTimes[i] = LocalTime.of(tid,0);
            tid++;
        }
        double[] antalEnhder = new double[4];
        for (int i = 0; i < antalEnhder.length; i++) {
            antalEnhder[i] = 1;
        }
        DagligSkaev dagligSkaev = new DagligSkaev(LocalDate.of(2021,11,10),LocalDate.of(2021,10,10),laegemiddel,localTimes,antalEnhder);
        //ACT
        double faktiskDosis = dagligSkaev.samletDosis();
        double forventet = 0;

        //ASSERT
        assertEquals(forventet,faktiskDosis);
    }

    @Test
    void doegnDosis_FastAntal() {
        //Arrange
        Laegemiddel laegemiddel = new Laegemiddel("Morfin",1,2,3,"Styk");
        LocalTime[] localTimes = new LocalTime[4];
        int tid = 10;
        for (int i = 0; i < localTimes.length; i++) {
            localTimes[i] = LocalTime.of(tid,0);
            tid++;
        }
        int antal = 1;
        double[] antalEnhder = new double[4];
        for (int i = 0; i < antalEnhder.length; i++) {
            antalEnhder[i] = antal;
        }
        DagligSkaev dagligSkaev = new DagligSkaev(LocalDate.of(2021,10,10),LocalDate.of(2021,10,15),laegemiddel,localTimes,antalEnhder);

        //ACT
        double faktiskDosis = dagligSkaev.doegnDosis();
        double forventet = 4;

        //ASSERT
        assertEquals(forventet,faktiskDosis);
    }

    @Test
    void doegnDosis_AntalStigende() {
        //Arrange
        Laegemiddel laegemiddel = new Laegemiddel("Morfin",1,2,3,"Styk");
        LocalTime[] localTimes = new LocalTime[4];
        int tid = 10;
        for (int i = 0; i < localTimes.length; i++) {
            localTimes[i] = LocalTime.of(tid,0);
            tid++;
        }
        int antal = 1;
        double[] antalEnhder = new double[4];
        for (int i = 0; i < antalEnhder.length; i++) {
            antalEnhder[i] = antal;
            antal++;
        }
        DagligSkaev dagligSkaev = new DagligSkaev(LocalDate.of(2021,10,10),LocalDate.of(2021,10,15),laegemiddel,localTimes,antalEnhder);

        //ACT
        double faktiskDosis = dagligSkaev.doegnDosis();
        double forventet = 10;

        //ASSERT
        assertEquals(forventet,faktiskDosis);
    }
}