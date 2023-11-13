package snackssupply;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import snacks.Limb;
import snacks.Snack;

import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

class SnackFactoryTest {


        @Test
    void getNewSnacks() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        //Arrange
            SnackFactory snackFactory = new SnackFactory();
            Limb limb1 = new Limb();
            Snack[] snackList = {limb1};

        //ACT
        Object [] faktiskeListe = snackFactory.getNewSnacks(snackList);

        for(Object o : faktiskeListe){
            System.out.println(o);
        }

        //Assert

         assertNotEquals(snackList.length,faktiskeListe.length);




    }
}