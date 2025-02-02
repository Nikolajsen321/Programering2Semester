
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import train.LinkedListTrain;
import train.WagonNode;

@TestMethodOrder(OrderAnnotation.class)
class LinkedListTrainTest
{
    private WagonNode locomotive;

    private WagonNode wagon1;
    private WagonNode wagon2;
    private WagonNode wagon3;
    private WagonNode wagon4;
    private WagonNode wagon5;

    @BeforeEach
    void setUp()
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
    void test_linkedListTrain_canAddFirstWagon()
    {
        // --------------------------------------------------
        // ARRANGE
        // --------------------------------------------------

        LinkedListTrain train = new LinkedListTrain();

        // --------------------------------------------------
        // ACT
        // --------------------------------------------------

        train.addFirst(wagon5);
        train.addFirst(wagon4);
        train.addFirst(wagon3);
        train.addFirst(wagon2);
        train.addFirst(wagon1);
        train.addFirst(locomotive);

        // --------------------------------------------------
        // ASSERT
        // --------------------------------------------------

        WagonNode wagonSelected = train.getFirst();
        Assertions.assertEquals(locomotive, wagonSelected);

        wagonSelected = wagonSelected.getNextWagon();
        Assertions.assertEquals(wagon1, wagonSelected);

        wagonSelected = wagonSelected.getNextWagon();
        Assertions.assertEquals(wagon2, wagonSelected);

        wagonSelected = wagonSelected.getNextWagon();
        Assertions.assertEquals(wagon3, wagonSelected);

        wagonSelected = wagonSelected.getNextWagon();
        Assertions.assertEquals(wagon4, wagonSelected);

        wagonSelected = wagonSelected.getNextWagon();
        Assertions.assertEquals(wagon5, wagonSelected);
    }

    @Test
    @Order(2)
    void test_linkedListTrain_canRemoveFirstWagon()
    {
        // --------------------------------------------------
        // ARRANGE
        // --------------------------------------------------

        LinkedListTrain train = new LinkedListTrain();
        train.addFirst(wagon5);
        train.addFirst(wagon4);
        train.addFirst(wagon3);
        train.addFirst(wagon2);
        train.addFirst(wagon1);
        train.addFirst(locomotive);

        // --------------------------------------------------
        // ACT & ASSERT
        // --------------------------------------------------

        WagonNode wagonRemoved = train.removeFirst();
        Assertions.assertEquals(locomotive, wagonRemoved);

        wagonRemoved = train.removeFirst();
        Assertions.assertEquals(wagon1, wagonRemoved);

        wagonRemoved = train.removeFirst();
        Assertions.assertEquals(wagon2, wagonRemoved);

        wagonRemoved = train.removeFirst();
        Assertions.assertEquals(wagon3, wagonRemoved);

        wagonRemoved = train.removeFirst();
        Assertions.assertEquals(wagon4, wagonRemoved);

        wagonRemoved = train.removeFirst();
        Assertions.assertEquals(wagon5, wagonRemoved);

        Assertions.assertThrows(NoSuchElementException.class, () -> {
            train.removeFirst();
        });
    }

    @Test
    @Order(3)
    void test_linkedListTrain_canCountWagons()
    {
        // --------------------------------------------------
        // ARRANGE
        // --------------------------------------------------

        LinkedListTrain train = new LinkedListTrain();
        train.addFirst(wagon5);
        train.addFirst(wagon4);
        train.addFirst(wagon3);
        train.addFirst(wagon2);
        train.addFirst(wagon1);
        train.addFirst(locomotive);

        // --------------------------------------------------
        // ACT & ASSERT
        // --------------------------------------------------

        for (int expectedCount = 6; expectedCount > 0; expectedCount--)
        {
            int actualCount = train.count();
            Assertions.assertEquals(expectedCount, actualCount);
            train.removeFirst();
        }
    }

    @Test
    @Order(4)
    void test_linkedListTrain_canRemoveWagon()
    {
        // --------------------------------------------------
        // ARRANGE
        // --------------------------------------------------

        LinkedListTrain train = new LinkedListTrain();
        train.addFirst(wagon5);
        train.addFirst(wagon4);
        train.addFirst(wagon3);
        train.addFirst(wagon2);
        train.addFirst(wagon1);
        train.addFirst(locomotive);

        // --------------------------------------------------
        // ACT & ASSERT
        // --------------------------------------------------

        boolean wagonWasRemoved = train.remove(wagon4);
        Assertions.assertTrue(wagonWasRemoved);

        WagonNode wagonSelected = train.getFirst();
        Assertions.assertEquals(locomotive, wagonSelected);

        wagonSelected = wagonSelected.getNextWagon();
        Assertions.assertEquals(wagon1, wagonSelected);

        wagonSelected = wagonSelected.getNextWagon();
        Assertions.assertEquals(wagon2, wagonSelected);

        wagonSelected = wagonSelected.getNextWagon();
        Assertions.assertEquals(wagon3, wagonSelected);

        wagonSelected = wagonSelected.getNextWagon();
        Assertions.assertEquals(wagon5, wagonSelected);

        wagonWasRemoved = train.remove(wagon4);
        Assertions.assertFalse(wagonWasRemoved);
    }

    @Test
    @Order(5)
    void test_linkedListTrain_canInsertWagonAtPosition()
    {
        // --------------------------------------------------
        // ARRANGE
        // --------------------------------------------------

        LinkedListTrain train = new LinkedListTrain();
        train.addFirst(wagon5);
        train.addFirst(wagon3);
        train.addFirst(wagon2);
        train.addFirst(wagon1);
        train.addFirst(locomotive);

        // --------------------------------------------------
        // ACT
        // --------------------------------------------------

        train.insertAt(wagon4, 4);

        // --------------------------------------------------
        // ASSERT
        // --------------------------------------------------

        WagonNode wagonSelected = train.getFirst();
        Assertions.assertEquals(locomotive, wagonSelected);

        wagonSelected = wagonSelected.getNextWagon();
        Assertions.assertEquals(wagon1, wagonSelected);

        wagonSelected = wagonSelected.getNextWagon();
        Assertions.assertEquals(wagon2, wagonSelected);

        wagonSelected = wagonSelected.getNextWagon();
        Assertions.assertEquals(wagon3, wagonSelected);

        wagonSelected = wagonSelected.getNextWagon();
        Assertions.assertEquals(wagon4, wagonSelected);

        wagonSelected = wagonSelected.getNextWagon();
        Assertions.assertEquals(wagon5, wagonSelected);
        System.out.println(train.count());
    }

}
