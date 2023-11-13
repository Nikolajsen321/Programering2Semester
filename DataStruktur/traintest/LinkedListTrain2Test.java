import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import train.LinkedListTrain2;
import train.WagonNode;

public class LinkedListTrain2Test {
        private  WagonNode locomotive;
        private WagonNode wagon1;
        private WagonNode wagon2;
        private WagonNode wagon3;
        private WagonNode wagon4;
        private WagonNode wagon5;

        @BeforeEach
        void setUp ()
        {
            this.locomotive = new WagonNode("Locomotive");
            this.wagon1 = new WagonNode("Passenger carriage");
            this.wagon2 = new WagonNode("Platform wagon");
            this.wagon3 = new WagonNode("Centerbeam");
            this.wagon4 = new WagonNode("Autorack");
            this.wagon5 = new WagonNode("Hopper");
        }
    @Test
    @Order(1)
    void test_linkedListTrain_canAddLastWagon()
    {
        // --------------------------------------------------
        // ARRANGE
        // --------------------------------------------------

        LinkedListTrain2 train = new LinkedListTrain2();

        // --------------------------------------------------
        // ACT
        // --------------------------------------------------

        train.addLast(locomotive);
        train.addLast(wagon1);
        train.addLast(wagon2);
        train.addLast(wagon3);
        train.addLast(wagon4);
        train.addLast(wagon5);

        // --------------------------------------------------
        // ASSERT
        // --------------------------------------------------

        WagonNode wagonSelected = train.getLast();
        Assertions.assertEquals(wagon5, wagonSelected);
        wagonSelected = wagonSelected.getNextWagon();
        Assertions.assertEquals(wagon4, wagonSelected);
        wagonSelected = wagonSelected.getNextWagon();
//        wagonSelected = wagonSelected.getPreviousWagon();
        Assertions.assertEquals(wagon3, wagonSelected);
        wagonSelected = wagonSelected.getNextWagon();
//        wagonSelected = wagonSelected.getPreviousWagon();
        Assertions.assertEquals(wagon2, wagonSelected);
        wagonSelected = wagonSelected.getNextWagon();
//        wagonSelected = wagonSelected.getPreviousWagon();
        Assertions.assertEquals(wagon1, wagonSelected);
        wagonSelected = wagonSelected.getNextWagon();
        Assertions.assertEquals(locomotive, wagonSelected);










    }
    }

