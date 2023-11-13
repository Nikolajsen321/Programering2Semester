package ordination;

import controller.Controller;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class DagligFastTest {

    @Test
    void DagligFast_Konstruktor() {
        //Arrange
        //LocalDate startDen, LocalDate slutDen, Laegemiddel laegemiddel
        LocalDate startDen = LocalDate.of(2021,10,10);
        LocalDate slutDen = LocalDate.of(2021,10,17);
        Laegemiddel laegemiddel = new Laegemiddel("Coke",1,2,3,"Gram");

        //ACT
        DagligFast faktiskDagligFast = new DagligFast(startDen,slutDen,laegemiddel);

        //ASSERT
        assertEquals(startDen,faktiskDagligFast.getStartDen());
        assertEquals(slutDen,faktiskDagligFast.getSlutDen());
        assertEquals(laegemiddel,faktiskDagligFast.getLaegemiddel());

    }
    @Test
    void opretDosis_1gang_Tid7() {
        //Arrange
        Laegemiddel laegemiddel = new Laegemiddel("Morfin",1,2,3,"Styk");
        DagligFast dagligFast = new DagligFast(LocalDate.of(2021,10,10),LocalDate.of(2021,10,17),laegemiddel);
        LocalTime tid = LocalTime.of(7,00);
        double antal = 1;
        //ACT
        dagligFast.opretDosis(tid, antal);
        Dosis[] faktiskDosis = dagligFast.getDoser();

        //ASSERT
        assertEquals(tid,faktiskDosis[0].getTid());
        assertEquals(antal,faktiskDosis[0].getAntal());

    }

    @Test
    void opretDosis_1gang_Tid9() {
        //Arrange
        Laegemiddel laegemiddel = new Laegemiddel("Morfin",1,2,3,"Styk");
        DagligFast dagligFast = new DagligFast(LocalDate.of(2021,10,10),LocalDate.of(2021,10,17),laegemiddel);
        LocalTime tid = LocalTime.of(9,00);
        double antal = 1;
        //ACT
        dagligFast.opretDosis(tid, antal);
        Dosis[] faktiskDosis = dagligFast.getDoser();

        //ASSERT
        assertEquals(tid,faktiskDosis[0].getTid());
        assertEquals(antal,faktiskDosis[0].getAntal());

    }
    @Test
    void opretDosis_1gang_Tid10() {
        //Arrange
        Laegemiddel laegemiddel = new Laegemiddel("Morfin",1,2,3,"Styk");
        DagligFast dagligFast = new DagligFast(LocalDate.of(2021,10,10),LocalDate.of(2021,10,17),laegemiddel);
        LocalTime tid = LocalTime.of(10,00);
        double antal = 1;
        //ACT
        dagligFast.opretDosis(tid, antal);
        Dosis[] faktiskDosis = dagligFast.getDoser();

        //ASSERT
        assertEquals(tid,faktiskDosis[1].getTid());
        assertEquals(antal,faktiskDosis[1].getAntal());

    }

    @Test
    void opretDosis_1gang_Tid14() {
        //Arrange
        Laegemiddel laegemiddel = new Laegemiddel("Morfin",1,2,3,"Styk");
        DagligFast dagligFast = new DagligFast(LocalDate.of(2021,10,10),LocalDate.of(2021,10,17),laegemiddel);
        LocalTime tid = LocalTime.of(14,00);
        double antal = 1;
        //ACT
        dagligFast.opretDosis(tid, antal);
        Dosis[] faktiskDosis = dagligFast.getDoser();

        //ASSERT
        assertEquals(tid,faktiskDosis[1].getTid());
        assertEquals(antal,faktiskDosis[1].getAntal());

    }
    @Test
    void opretDosis_1gang_Tid15() {
        //Arrange
        Laegemiddel laegemiddel = new Laegemiddel("Morfin",1,2,3,"Styk");
        DagligFast dagligFast = new DagligFast(LocalDate.of(2021,10,10),LocalDate.of(2021,10,17),laegemiddel);
        LocalTime tid = LocalTime.of(15,00);
        double antal = 1;
        //ACT
        dagligFast.opretDosis(tid, antal);
        Dosis[] faktiskDosis = dagligFast.getDoser();

        //ASSERT
        assertEquals(tid,faktiskDosis[2].getTid());
        assertEquals(antal,faktiskDosis[2].getAntal());

    }
    @Test
    void opretDosis_1gang_Tid18() {
        //Arrange
        Laegemiddel laegemiddel = new Laegemiddel("Morfin",1,2,3,"Styk");
        DagligFast dagligFast = new DagligFast(LocalDate.of(2021,10,10),LocalDate.of(2021,10,17),laegemiddel);
        LocalTime tid = LocalTime.of(18,00);
        double antal = 1;
        //ACT
        dagligFast.opretDosis(tid, antal);
        Dosis[] faktiskDosis = dagligFast.getDoser();

        //ASSERT
        assertEquals(tid,faktiskDosis[2].getTid());
        assertEquals(antal,faktiskDosis[2].getAntal());

    }

    @Test
    void opretDosis_1gang_Tid19() {
        //Arrange
        Laegemiddel laegemiddel = new Laegemiddel("Morfin",1,2,3,"Styk");
        DagligFast dagligFast = new DagligFast(LocalDate.of(2021,10,10),LocalDate.of(2021,10,17),laegemiddel);
        LocalTime tid = LocalTime.of(19,00);
        double antal = 1;
        //ACT
        dagligFast.opretDosis(tid, antal);
        Dosis[] faktiskDosis = dagligFast.getDoser();

        //ASSERT
        assertEquals(tid,faktiskDosis[3].getTid());
        assertEquals(antal,faktiskDosis[3].getAntal());

    }

    @Test
    void opretDosis_4gange_Tid7_10_15_19() {
        //Arrange
        Laegemiddel laegemiddel = new Laegemiddel("Morfin",1,2,3,"Styk");
        DagligFast dagligFast = new DagligFast(LocalDate.of(2021,10,10),LocalDate.of(2021,10,17),laegemiddel);
        LocalTime tid7 = LocalTime.of(7,00);
        LocalTime tid10 = LocalTime.of(10,00);
        LocalTime tid15 = LocalTime.of(15,00);
        LocalTime tid19 = LocalTime.of(19,00);
        double antal = 1;
        //ACT
        dagligFast.opretDosis(tid7, antal);
        dagligFast.opretDosis(tid10, antal);
        dagligFast.opretDosis(tid15, antal);
        dagligFast.opretDosis(tid19, antal);
        Dosis[] faktiskDosis = dagligFast.getDoser();

        //ASSERT
        assertEquals(tid7,faktiskDosis[0].getTid());
        assertEquals(antal,faktiskDosis[0].getAntal());
        assertEquals(tid10,faktiskDosis[1].getTid());
        assertEquals(antal,faktiskDosis[1].getAntal());
        assertEquals(tid15,faktiskDosis[2].getTid());
        assertEquals(antal,faktiskDosis[2].getAntal());
        assertEquals(tid19,faktiskDosis[3].getTid());
        assertEquals(antal,faktiskDosis[3].getAntal());

    }
    @Test
    void samletDosis_Efter7Dage_IndenForSammeMåned() {
        //Arrange
        LocalDate startDato = LocalDate.of(2021,10,10);
        LocalDate slutDato = LocalDate.of(2021,10,17);
        Laegemiddel laegemiddel = new Laegemiddel("Slik",1,2,3,"Styk");
        Patient patient = new Patient("1230405544","Mark",75);
        DagligFast dagligFast = Controller.getTestController().opretDagligFastOrdination(startDato,slutDato,patient,laegemiddel,2,2,2,2);

        //ACT
        double faktiskDosis = dagligFast.samletDosis();
        double forventet = 64;

        //ASSERT
        assertEquals(forventet,faktiskDosis);
    }

    @Test
    void samletDosis_Efter31Dage_NæsteMåned() {
        //Arrange
        LocalDate startDato = LocalDate.of(2021,10,10);
        LocalDate slutDato = LocalDate.of(2021,11,10);
        Laegemiddel laegemiddel = new Laegemiddel("Slik",1,2,3,"Styk");
        Patient patient = new Patient("1230405544","Mark",75);
        DagligFast dagligFast = Controller.getTestController().opretDagligFastOrdination(startDato,slutDato,patient,laegemiddel,2,2,2,2);

        //ACT
        double faktiskDosis = dagligFast.samletDosis();
        double forventet = 256;

        //ASSERT
        assertEquals(forventet,faktiskDosis);
    }

    @Test
    void samletDosis_SlutDato_MindreEnd_StartDato() {
        //Arrange
        LocalDate startDato = LocalDate.of(2021,10,10);
        LocalDate slutDato = LocalDate.of(2021,10,7);
        Laegemiddel laegemiddel = new Laegemiddel("Slik",1,2,3,"Styk");
        Patient patient = new Patient("1230405544","Mark",75);
        DagligFast dagligFast = Controller.getTestController().opretDagligFastOrdination(startDato,slutDato,patient,laegemiddel,2,2,2,2);

        //ACT
        double faktiskDosis = dagligFast.samletDosis();

        Exception exception = assertThrows(RuntimeException.class, () -> {
                    dagligFast.samletDosis();
                });
        assertEquals(exception.getMessage(), "Start dato kommer efter slut dato");
    }

    @Test
    void doegnDosis_AntalDoser1() {
        //Arrange
        LocalDate startDato = LocalDate.of(2021,10,10);
        LocalDate slutDato = LocalDate.of(2021,11,10);
        Laegemiddel laegemiddel = new Laegemiddel("Slik",1,2,3,"Styk");
        Patient patient = new Patient("1230405544","Mark",75);
        DagligFast dagligFast = Controller.getTestController().opretDagligFastOrdination(startDato,slutDato,patient,laegemiddel,2,0,0,0);

        //ACT
        double faktiskDosis = dagligFast.doegnDosis();
        double forventet = 2;
        //ASSERT
        assertEquals(forventet,faktiskDosis);
    }
    @Test
    void doegnDosis_AntalDoser2() {
        //Arrange
        LocalDate startDato = LocalDate.of(2021,10,10);
        LocalDate slutDato = LocalDate.of(2021,11,10);
        Laegemiddel laegemiddel = new Laegemiddel("Slik",1,2,3,"Styk");
        Patient patient = new Patient("1230405544","Mark",75);
        DagligFast dagligFast = Controller.getTestController().opretDagligFastOrdination(startDato,slutDato,patient,laegemiddel,2,2,0,0);

        //ACT
        double faktiskDosis = dagligFast.doegnDosis();
        double forventet = 4;
        //ASSERT
        assertEquals(forventet,faktiskDosis);
    }

    @Test
    void doegnDosis_AntalDoser3() {
        //Arrange
        LocalDate startDato = LocalDate.of(2021,10,10);
        LocalDate slutDato = LocalDate.of(2021,11,10);
        Laegemiddel laegemiddel = new Laegemiddel("Slik",1,2,3,"Styk");
        Patient patient = new Patient("1230405544","Mark",75);
        DagligFast dagligFast = Controller.getTestController().opretDagligFastOrdination(startDato,slutDato,patient,laegemiddel,2,2,2,0);

        //ACT
        double faktiskDosis = dagligFast.doegnDosis();
        double forventet = 6;
        //ASSERT
        assertEquals(forventet,faktiskDosis);
    }

    @Test
    void doegnDosis_AntalDoser4() {
        //Arrange
        LocalDate startDato = LocalDate.of(2021,10,10);
        LocalDate slutDato = LocalDate.of(2021,11,10);
        Laegemiddel laegemiddel = new Laegemiddel("Slik",1,2,3,"Styk");
        Patient patient = new Patient("1230405544","Mark",75);
        DagligFast dagligFast = Controller.getTestController().opretDagligFastOrdination(startDato,slutDato,patient,laegemiddel,2,2,2,2);

        //ACT
        double faktiskDosis = dagligFast.doegnDosis();
        double forventet = 8;
        //ASSERT
        assertEquals(forventet,faktiskDosis);
    }
}
