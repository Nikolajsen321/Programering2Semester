package ordination;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class PNTest {

    @Test
    void TC1constructorPNkorrektInput() {
        // Arrange
        LocalDate startDen = LocalDate.of(2023, 10, 15);
        LocalDate slutDen = LocalDate.of(2023, 10, 20);
        Laegemiddel laegemiddel = new Laegemiddel("Test", 1, 1,
                1, "Styk");
        double antalEnheder = 5.0;

        // Act
        PN pn = new PN(startDen, slutDen, laegemiddel, antalEnheder);

        // Assert
        assertEquals(startDen, pn.getStartDen());
        assertEquals(slutDen, pn.getSlutDen());
        assertEquals(laegemiddel, pn.getLaegemiddel());
        assertEquals(antalEnheder, pn.getAntalEnheder(), 0.001);
    }

    @Test
    void TC2constructorPN() {
        // Arrange
        LocalDate startDen = LocalDate.of(2023, 12, 21);
        LocalDate slutDen = LocalDate.of(2023, 12, 20);
        Laegemiddel laegemiddel = new Laegemiddel("Test", 1, 1,
                1, "Styk");
        double antalEnheder = 5.0;

        // Act
        PN pn = new PN(startDen, slutDen, laegemiddel, antalEnheder);

        // Assert
        assertEquals(startDen, pn.getStartDen());
        assertEquals(slutDen, pn.getSlutDen());
        assertEquals(laegemiddel, pn.getLaegemiddel());
        assertEquals(antalEnheder, pn.getAntalEnheder(), 0.001);
    }

    @Test
    void TC1givDosisErIndenforGyldighedsperiode() {
        //Arrange
        LocalDate startDen = LocalDate.of(2023, 10, 10);
        LocalDate slutDen = LocalDate.of(2023, 10, 15);
        LocalDate givesDen = LocalDate.of(2023, 10, 12);
        PN pn = new PN(startDen,
        slutDen, new Laegemiddel("Test", 1, 1,
                1, "Styk"), 1);

        //ACT
        boolean actual = pn.givDosis(givesDen);

        //ASSERT
        assertTrue(actual);
        assertTrue(pn.getAntalGangePåDato().contains(givesDen));

    }

    @Test
    void TC2givDosisErIkkeIndenforGyldighedsperiode() {
        //Arrange
        LocalDate startDen = LocalDate.of(2023, 10, 10);
        LocalDate slutDen = LocalDate.of(2023, 10, 15);
        LocalDate givesDen = LocalDate.of(2023, 10, 9);
        PN pn = new PN(startDen,
                slutDen, new Laegemiddel("Test", 1, 1,
                1, "Styk"), 1);

        //ACT
        boolean actual = pn.givDosis(givesDen);

        //ASSERT
        assertTrue(actual);
        assertTrue(pn.getAntalGangePåDato().contains(givesDen));

    }

    @Test
    void TC1doegnDosis() {
        //Arrange
        LocalDate startDen = LocalDate.of(2023, 1, 1);
        LocalDate slutDen = LocalDate.of(2023, 1, 10);
        LocalDate givesDen = LocalDate.of(2023, 1, 5);
        LocalDate givesDen2 = LocalDate.of(2023, 1, 6);
        LocalDate givesDen3 = LocalDate.of(2023, 1, 7);
        ArrayList<LocalDate> antalGangePåDato = new ArrayList<>();
        PN pn = new PN(startDen,
                slutDen, new Laegemiddel("Test", 1, 1,
                1, "Styk"), 10);
        antalGangePåDato.add(givesDen);



        //ACT
        pn.givDosis(givesDen);
        pn.givDosis(givesDen2);
        pn.givDosis(givesDen3);
        double actual = pn.doegnDosis()/ pn.getAntalGangeGivet();

        //ASSERT
        assertEquals(3.3, actual, 0.1);
    }

    @Test
    void TC2doegnDosis() {
        //Arrange
        LocalDate startDen = LocalDate.of(2023, 1, 1);
        LocalDate slutDen = LocalDate.of(2023, 1, 10);
        LocalDate givesDen = LocalDate.of(2023, 1, 5);
        LocalDate givesDen2 = LocalDate.of(2023, 1, 5);
        LocalDate givesDen3 = LocalDate.of(2023, 1, 5);
        ArrayList<LocalDate> antalGangePåDato = new ArrayList<>();
        PN pn = new PN(startDen,
                slutDen, new Laegemiddel("Test", 1, 1,
                1, "Styk"), 10);
        antalGangePåDato.add(givesDen);


        //ACT
        pn.givDosis(givesDen);
        pn.givDosis(givesDen2);
        pn.givDosis(givesDen3);
        double actual = pn.doegnDosis()/ pn.getAntalGangeGivet();

        //ASSERT
        assertEquals(3.3, actual, 0.1);
    }

    @Test
    void TC1samletDosis() {
        //Arrange
        LocalDate startDen = LocalDate.of(2023, 1, 1);
        LocalDate slutDen = LocalDate.of(2023, 1, 10);
        LocalDate givesDen = LocalDate.of(2023, 1, 5);
        ArrayList<LocalDate> antalGangePåDato = new ArrayList<>();
        PN pn = new PN(startDen,
                slutDen, new Laegemiddel("Test", 1, 1,
                1, "Styk"), 20);

        //ACT
        pn.givDosis(givesDen);

        //ASSERT
        assertEquals(20, pn.samletDosis(), 0.1);
    }

    @Test
    void TC2samletDosis() {
        //Arrange
        LocalDate startDen = LocalDate.of(2023, 6, 20);
        LocalDate slutDen = LocalDate.of(2023, 4, 29);
        LocalDate givesDen = LocalDate.of(2023, 1, 5);
        ArrayList<LocalDate> antalGangePåDato = new ArrayList<>();
        PN pn = new PN(startDen,
                slutDen, new Laegemiddel("Test", 1, 1,
                1, "Styk"), 20);

        //ACT
        pn.givDosis(givesDen);

        //ASSERT
        assertEquals(20, pn.samletDosis(), 0.1);
    }
}