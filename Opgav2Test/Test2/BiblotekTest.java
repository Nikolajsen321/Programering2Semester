import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BiblotekTest {
    @Test
    @Order(1)
    void beregn_1dag_barn () {
        //Arrange
        LocalDate beregnsDato = LocalDate.of(2023,6,1);
        LocalDate faktiskDato = LocalDate.of(2023,8,3);
        boolean voksen = false;
        Biblotek bib = new Biblotek();

        //ACT
        int faktiske = bib.beregnBode(beregnsDato,faktiskDato,voksen);
        int forventedeBøde = 10; // for et barn 1 dag

        //Assert

        assertEquals(forventedeBøde,faktiske);
    }


    @Test
    @Order(2)
    void beregn_8dag_barn(){
        //Arrange
        LocalDate beregnDato = LocalDate.of(2023,6,1); //forventet afleverignsdato
        LocalDate faktiskDato = LocalDate.of(2023,9,9);
        boolean voksen = false;
        Biblotek bib = new Biblotek();
        //Act
        int faktiske = bib.beregnBode(beregnDato,faktiskDato,voksen);
        int forventedeBøde = 30; // for et barn 1 dag
        //Assert
        assertEquals(forventedeBøde,faktiske);
    }

    @Test
    @Order(3)
    void beregn_15_dag_barn(){
        //Arrange
        LocalDate beregnsDato = LocalDate.of(2023,6,1);
        LocalDate faktiskDato = LocalDate.of(2023,6,16);
        boolean voksen = false;
        Biblotek bib = new Biblotek();

        //Acts
        int faktisk = bib.beregnBode(beregnsDato,faktiskDato,voksen);
        int forventedeBøde = 45;

        //Assert
        assertEquals(forventedeBøde,faktisk);

    }

    @Test
    @Order(4)
    void beregn_1dag_voksen () {
        //Arrange
        LocalDate beregnsDato = LocalDate.of(2023,6,1);
        LocalDate faktiskDato = LocalDate.of(2023,6,3);
        boolean voksen = true;
        Biblotek bib = new Biblotek();

        //ACT
        int faktiske = bib.beregnBode(beregnsDato,faktiskDato,voksen);
        int forventedeBøde = 20; // for et barn 1 dag

        //Assert
        assertEquals(forventedeBøde,faktiske);
    }

    @Test
    @Order(5)
    void beregn_8_dag_voksen(){
        //Arrange
        LocalDate beregnsDato = LocalDate.of(2023,6,1);
        LocalDate faktiskDato = LocalDate.of(2023,6,9);
        boolean voksen = true;
        Biblotek bib = new Biblotek();

        //Acts
        int faktisk = bib.beregnBode(beregnsDato,faktiskDato,voksen);
        int forventedeBøde = 60;

        //Assert
        assertEquals(forventedeBøde,faktisk);

    }

    @Test
    @Order(6)
    void beregn_15_dag_voksen(){

        //Arrange
        LocalDate beregnsDato = LocalDate.of(2023,6,1);
        LocalDate faktiskDato = LocalDate.of(2023,6,16);
        boolean voksen = true;
        Biblotek bib = new Biblotek();

        //Acts
        int faktisk = bib.beregnBode(beregnsDato,faktiskDato,voksen);
        int forventedeBøde = 90;

        //Assert
        assertEquals(forventedeBøde,faktisk);

    }
}
