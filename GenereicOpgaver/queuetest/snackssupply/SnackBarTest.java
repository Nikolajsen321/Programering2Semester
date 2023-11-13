package snackssupply;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import snacks.Limb;
import snacks.Snack;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SnackBarTest {
    private SnackBar<Limb> snackBar = new SnackBar<>();
    Limb[] limbArray;

    private Limb limb1;
    private Limb limb2;
    private Limb limb3;
    private Limb limb4;
    private Limb limb5;
    private Limb limb6;

    @BeforeEach
    void setUp() throws Exception
    {
        this.limb1 = new Limb(Limb.Types.Finger);
        limb1.setWeight(30);
        this.limb2 = new Limb(Limb.Types.Foot);
        limb2.setWeight(500);
        this.limb3 = new Limb(Limb.Types.Hand);
        limb3.setWeight(220);
        this.limb4 = new Limb(Limb.Types.Heel);
        limb4.setWeight(70);
        this.limb5 = new Limb(Limb.Types.Knee);
        limb5.setWeight(1000);
        this.limb6 = new Limb(Limb.Types.Toe);
        limb6.setWeight(50);

      this.limbArray = new Limb[]{limb1, limb2, limb3, limb4, limb5, limb6};
    }




    @Test
    @Order(0)
    void sortSnacks_Limbs() {

        //ACT
        /*
        Ved runtime bliver objekt men extender også compareable
         */

      Comparable[] faktiskeListe = snackBar.sortSnacks(limbArray);

        //Assert
        assertEquals(faktiskeListe[0],limbArray[0]);


    }
}