import BIlforsikring.BilForsikring;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
public class BilTest {


    @Test
    @Order(1)
    void beregnPremieMandUnder25SKadeFrimindre3år(){
        //Arrange
        int alder = 20;
        boolean isKvinde = false;
        int skadeIntFrieaer = 2;
        double grundPremie = 1000;
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(grundPremie);

        //Act
        double faktiskPris = bilForsikring.beregnPraemie(alder,isKvinde,skadeIntFrieaer);
        double forventedePris = 1250;

        //Assert
        assertEquals(forventedePris,faktiskPris);

    }
    @Test
    @Order(2)
    void beregnPremieKvindeUnder25SkadeFrimindre3år(){
        //Arrange
        int alder = 20;
        boolean isKvinde = true;
        int skadeFriearr = 2;
        double grundPreame = 1000;
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(grundPreame);
        //Act
        double faktiskePris = bilForsikring.beregnPraemie(alder,isKvinde,skadeFriearr);
        double forventedePris = 1187.5;

        //Assert
        assertEquals(forventedePris,faktiskePris);
    }

    @Test
    @Order(3)
    void beregnPremieMandUnder25SkadeFrimindre6år(){
        boolean[] erKvindeArray = {true,false};
        int[] alderArray = {24,25,26};
        int[] skadeFriAarArray = {-1,0,1,2,3,4,5,6,7,8,9};

        for(int i = 0; i < erKvindeArray.length; i++){

        }

        //Arrange
        int alder = 22;
        boolean isKvinde = false;
        int skadeFriearr = 4;
        double grundPreame = 1000;
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(grundPreame);
        //Acts
        double faktiskPris = bilForsikring.beregnPraemie(alder,isKvinde,skadeFriearr);
        double forventedePris = 1062.5;
        //Assert
        assertEquals(forventedePris,faktiskPris);
    }

    @Test
    @Order(4)
    void beregnPremieMandUnder25SkadeFriFra6Til8År(){
        //Arrange
        int alder = 24;
        boolean isKvinde = false;
        int skadeFriearr = 6;
        double grundPreame = 1000;
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(grundPreame);
        //Acts
        double faktiskPris = bilForsikring.beregnPraemie(alder,isKvinde,skadeFriearr);
        double forventedePris = 937.5;
        //Assert
        assertEquals(forventedePris,faktiskPris);
    }

    @Test
    @Order(6)
    void beregnPremieMandUnder25SkadeFriMere8(){
        //Arrange
        int alder = 24;
        boolean isKvinde = false;
        int skadeFriearr = 9;
        double grundPreame = 1000;
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(grundPreame);
        //Acts
        double faktiskPris = bilForsikring.beregnPraemie(alder,isKvinde,skadeFriearr);
        double forventedePris = 812.5;
        //Assert
        assertEquals(forventedePris,faktiskPris);
    }

    @Test
    @Order(7)
    void beregnPremieMand25OverSkadeFriMindre3År(){
        //Arrange
        int alder = 25;
        boolean isKvinde = false;
        int skadeFriearr = 2;
        double grundPreame = 1000;
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(grundPreame);
        //Acts
        double faktiskPris = bilForsikring.beregnPraemie(alder,isKvinde,skadeFriearr);
        double forventedePris = 1000;
        //Assert
        assertEquals(forventedePris,faktiskPris);
    }
    @Test
    @Order(8)
    void beregnPremieMand25OverSkadeFriMindre3ÅrKvinde(){
        //Arrange
        int alder = 25;
        boolean isKvinde = true;
        int skadeFriearr = 2;
        double grundPreame = 1000;
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(grundPreame);
        //Acts
        double faktiskPris = bilForsikring.beregnPraemie(alder,isKvinde,skadeFriearr);
        double forventedePris = 950;
        //Assert
        assertEquals(forventedePris,faktiskPris);
    }

    @Test
    @Order(9)
    void beregnPremieMand25OverSkadeFri3ÅrTil5År(){
        //Arrange
        int alder = 25;
        boolean isKvinde = false;
        int skadeFriearr = 4;
        double grundPreame = 1000;
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(grundPreame);
        //Acts
        double faktiskPris = bilForsikring.beregnPraemie(alder,isKvinde,skadeFriearr);
        double forventedePris = 850;
        //Assert
        assertEquals(forventedePris,faktiskPris);
    }
    @Test
    @Order(10)
    void beregnPremieMand25OverSkadeFri6ÅrTil8År(){
        //Arrange
        int alder = 25;
        boolean isKvinde = false;
        int skadeFriearr = 7;
        double grundPreame = 1000;
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(grundPreame);
        //Acts
        double faktiskPris = bilForsikring.beregnPraemie(alder,isKvinde,skadeFriearr);
        double forventedePris = 750;
        //Assert
        assertEquals(forventedePris,faktiskPris);
    }
    @Test
    @Order(11)
    void beregnPremieMand25OverSkadeFriOver8År(){
        //Arrange
        int alder = 30;
        boolean isKvinde = false;
        int skadeFriearr = 9;
        double grundPreame = 1000;
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(grundPreame);
        //Acts
        double faktiskPris = bilForsikring.beregnPraemie(alder,isKvinde,skadeFriearr);
        double forventedePris = 650;
        //Assert
        assertEquals(forventedePris,faktiskPris);
    }

    @Test
    @Order(12)
     void set_grund_premie(){
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(1000);
        //Acts
        double faktisk = bilForsikring.getGrundPraemie();
        double forventede = 1000;
        //Assert
        assertEquals(forventede,faktisk);


    }

//    @Test
//    @Order()
//    void beregnPremieForMand25ogOverUnder3År(){



}
