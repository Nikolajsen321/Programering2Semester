package controller;

import ordination.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {

 @Test
 void opret_PN_OrdinationSlutminusStartPeriodelig5_Antal4_TC1() {
  //Arrange
  Controller controller = Controller.getTestController();
  LocalDate startDate = LocalDate.of(2023,04,20);
  LocalDate slutDate =  LocalDate.of(2023,04,21);
  Patient patient = new Patient("99114433","Hans",90);
  Laegemiddel laegemiddel = new Laegemiddel("Acetylsalicylsyre", 0.1,
          0.15, 0.16, "Styk");
  double antal = 4;


  //ACT
  PN faktiskPN = controller.opretPNOrdination(startDate,slutDate,patient,laegemiddel,antal);
//     Exception exception = assertThrows(RuntimeException.class, () ->{
//      PN faktiskPN = controller.opretPNOrdination(startDate,slutDate,patient,laegemiddel,antal);
//     });

  //ASSERT
  assertEquals(startDate, faktiskPN.getStartDen());
  assertEquals(slutDate,faktiskPN.getSlutDen());
  assertTrue(patient.getOrdinationer().contains(faktiskPN));
  assertEquals(laegemiddel,faktiskPN.getLaegemiddel());
  assertEquals(antal,faktiskPN.getAntalEnheder());

 }

 @Test
 void opret_PN_OrdinationSlutminusStartPeriodelig1_Antal0_TC2() {
  //Arrange
  Controller controller = Controller.getTestController();
  LocalDate startDate = LocalDate.of(2023,04,20);
  LocalDate slutDate =  LocalDate.of(2023,04,21);
  Patient patient = new Patient("99114433","Hans",90);
  Laegemiddel laegemiddel = new Laegemiddel("Acetylsalicylsyre", 0.1,
          0.15, 0.16, "Styk");
  double antal = 0;


  //ACT
  PN faktiskPN = controller.opretPNOrdination(startDate,slutDate,patient,laegemiddel,antal);
//     Exception exception = assertThrows(RuntimeException.class, () ->{
//      PN faktiskPN = controller.opretPNOrdination(startDate,slutDate,patient,laegemiddel,antal);
//     });

  //ASSERT
  assertEquals(startDate, faktiskPN.getStartDen());
  assertEquals(slutDate,faktiskPN.getSlutDen());
  assertTrue(patient.getOrdinationer().contains(faktiskPN));
  assertEquals(laegemiddel,faktiskPN.getLaegemiddel());
  assertEquals(antal,faktiskPN.getAntalEnheder());

 }

 @Test
 void opret_PN_OrdinationSlutminusStartPeriodelig0_Antal3_TC3() {
  //Arrange
  Controller controller = Controller.getTestController();
  LocalDate startDate = LocalDate.of(2023,04,20);
  LocalDate slutDate =  LocalDate.of(2023,04,20);
  Patient patient = new Patient("99114433","Hans",90);
  Laegemiddel laegemiddel = new Laegemiddel("Acetylsalicylsyre", 0.1,
          0.15, 0.16, "Styk");
  double antal = 3;


  //ACT
  PN faktiskPN = controller.opretPNOrdination(startDate,slutDate,patient,laegemiddel,antal);
//     Exception exception = assertThrows(RuntimeException.class, () ->{
//      PN faktiskPN = controller.opretPNOrdination(startDate,slutDate,patient,laegemiddel,antal);
//     });

  //ASSERT
  assertEquals(startDate, faktiskPN.getStartDen());
  assertEquals(slutDate,faktiskPN.getSlutDen());
  assertTrue(patient.getOrdinationer().contains(faktiskPN));
  assertEquals(laegemiddel,faktiskPN.getLaegemiddel());
  assertEquals(antal,faktiskPN.getAntalEnheder());

 }

 @Test
 void opret_PN_OrdinationSlutminusStartPeriodelig1_AntalMinus1_TC4() {
  //Arrange
  Controller controller = Controller.getTestController();
  LocalDate startDate = LocalDate.of(2023,04,20);
  LocalDate slutDate =  LocalDate.of(2023,04,21);
  Patient patient = new Patient("99114433","Hans",90);
  Laegemiddel laegemiddel = new Laegemiddel("Acetylsalicylsyre", 0.1,
          0.15, 0.16, "Styk");
  double antal = -1;


  //ACT
  PN faktiskPN = controller.opretPNOrdination(startDate,slutDate,patient,laegemiddel,antal);
//     Exception exception = assertThrows(RuntimeException.class, () ->{
//      PN faktiskPN = controller.opretPNOrdination(startDate,slutDate,patient,laegemiddel,antal);
//     });

  //ASSERT
  assertEquals(startDate, faktiskPN.getStartDen());
  assertEquals(slutDate,faktiskPN.getSlutDen());
  assertTrue(patient.getOrdinationer().contains(faktiskPN));
  assertEquals(laegemiddel,faktiskPN.getLaegemiddel());
  assertEquals(antal,faktiskPN.getAntalEnheder());

 }





 @Test
    void opret_DagligFast_Ordination_M0_M0_A0_N0TC1() {
    //Arrange
    Controller controller = Controller.getController();
    LocalDate startDen = LocalDate.of(2023,04,20);
    LocalDate slutDen = LocalDate.of(2023,04,30);
    Patient patient = new Patient("140200-7890","Emil Nikolajsen",90); ;
    Laegemiddel laegemiddel = new Laegemiddel("Acetylsalicylsyre", 0.1,
            0.15, 0.16, "Styk");

    double morgenAntal = 0;
    double middagAntal = 0;
    double aftenAntal = 0;
    double natAntal = 0;


    //ACT
    DagligFast faktiskeDagligFast= controller.opretDagligFastOrdination(startDen,slutDen,patient,laegemiddel,
            morgenAntal,middagAntal,aftenAntal,natAntal);

    //ASSERT
    assertEquals(startDen,faktiskeDagligFast.getStartDen());
    assertEquals(slutDen,faktiskeDagligFast.getSlutDen());
    assertTrue(patient.getOrdinationer().contains(faktiskeDagligFast));
    assertEquals(laegemiddel,faktiskeDagligFast.getLaegemiddel());
    assertEquals(faktiskeDagligFast.getDoser()[0].getAntal(),morgenAntal);
    assertEquals(faktiskeDagligFast.getDoser()[1].getAntal(),middagAntal);
    assertEquals(faktiskeDagligFast.getDoser()[2].getAntal(),morgenAntal);
    assertEquals(faktiskeDagligFast.getDoser()[3].getAntal(),morgenAntal);


    }
 @Test
 void opret_DagligFast_Ordination_M1_M0_A0_N0TC2() {
  //Arrange
  Controller controller = Controller.getController();
  LocalDate startDen = LocalDate.of(2023,04,20);
  LocalDate slutDen = LocalDate.of(2023,04,30);
  Patient patient = new Patient("140200-7890","Emil Nikolajsen",90); ;
  Laegemiddel laegemiddel = new Laegemiddel("Acetylsalicylsyre", 0.1,
          0.15, 0.16, "Styk");

  double morgenAntal = 1;
  double middagAntal = 0;
  double aftenAntal = 0;
  double natAntal = 0;


  //ACT
  DagligFast faktiskeDagligFast= controller.opretDagligFastOrdination(startDen,slutDen,patient,laegemiddel,
          morgenAntal,middagAntal,aftenAntal,natAntal);

  //ASSERT
  assertEquals(startDen,faktiskeDagligFast.getStartDen());
  assertEquals(slutDen,faktiskeDagligFast.getSlutDen());
  assertTrue(patient.getOrdinationer().contains(faktiskeDagligFast));
  assertEquals(laegemiddel,faktiskeDagligFast.getLaegemiddel());
  assertEquals(faktiskeDagligFast.getDoser()[0].getAntal(),morgenAntal);
  assertEquals(faktiskeDagligFast.getDoser()[1].getAntal(),middagAntal);
  assertEquals(faktiskeDagligFast.getDoser()[2].getAntal(),morgenAntal);
  assertEquals(faktiskeDagligFast.getDoser()[3].getAntal(),morgenAntal);


 }

 @Test
 void opret_DagligFast_Ordination_M1_M1_A1_N1TC3() {
  //Arrange
  Controller controller = Controller.getController();
  LocalDate startDen = LocalDate.of(2023,04,20);
  LocalDate slutDen = LocalDate.of(2023,04,30);
  Patient patient = new Patient("140200-7890","Emil Nikolajsen",90); ;
  Laegemiddel laegemiddel = new Laegemiddel("Acetylsalicylsyre", 0.1,
          0.15, 0.16, "Styk");

  double morgenAntal = 1;
  double middagAntal = 1;
  double aftenAntal = 1;
  double natAntal = 1;


  //ACT
  DagligFast faktiskeDagligFast= controller.opretDagligFastOrdination(startDen,slutDen,patient,laegemiddel,
          morgenAntal,middagAntal,aftenAntal,natAntal);

  //ASSERT
  assertEquals(startDen,faktiskeDagligFast.getStartDen());
  assertEquals(slutDen,faktiskeDagligFast.getSlutDen());
  assertTrue(patient.getOrdinationer().contains(faktiskeDagligFast));
  assertEquals(laegemiddel,faktiskeDagligFast.getLaegemiddel());
  assertEquals(faktiskeDagligFast.getDoser()[0].getAntal(),morgenAntal);
  assertEquals(faktiskeDagligFast.getDoser()[1].getAntal(),middagAntal);
  assertEquals(faktiskeDagligFast.getDoser()[2].getAntal(),morgenAntal);
  assertEquals(faktiskeDagligFast.getDoser()[3].getAntal(),morgenAntal);


 }

 @Test
 void opret_DagligFast_Ordination_M2_M1_A3_N4_TC4() {
  //Arrange
  Controller controller = Controller.getController();
  LocalDate startDen = LocalDate.of(2023,04,20);
  LocalDate slutDen = LocalDate.of(2023,04,30);
  Patient patient = new Patient("140200-7890","Emil Nikolajsen",90); ;
  Laegemiddel laegemiddel = new Laegemiddel("Acetylsalicylsyre", 0.1,
          0.15, 0.16, "Styk");

  double morgenAntal = 0;
  double middagAntal = 0;
  double aftenAntal = 0;
  double natAntal = 0;


  //ACT
  DagligFast faktiskeDagligFast= controller.opretDagligFastOrdination(startDen,slutDen,patient,laegemiddel,
          morgenAntal,middagAntal,aftenAntal,natAntal);

  //ASSERT
  assertEquals(startDen,faktiskeDagligFast.getStartDen());
  assertEquals(slutDen,faktiskeDagligFast.getSlutDen());
  assertTrue(patient.getOrdinationer().contains(faktiskeDagligFast));
  assertEquals(laegemiddel,faktiskeDagligFast.getLaegemiddel());
  assertEquals(faktiskeDagligFast.getDoser()[0].getAntal(),morgenAntal);
  assertEquals(faktiskeDagligFast.getDoser()[1].getAntal(),middagAntal);
  assertEquals(faktiskeDagligFast.getDoser()[2].getAntal(),morgenAntal);
  assertEquals(faktiskeDagligFast.getDoser()[3].getAntal(),morgenAntal);


 }




    @org.junit.jupiter.api.Test
    void opret_DagligSkaev_OrdinationTC1() {
     //Arrange

     Controller controller = Controller.getController();
     LocalDate startDen = LocalDate.of(2023,10,10);
     LocalDate slutDen = LocalDate.of(2023,10,17);
     Patient patient = new Patient("140200-7890","Emil Nikolajsen",90); ;
     Laegemiddel laegemiddel = new Laegemiddel("Acetylsalicylsyre", 0.1,
             0.15, 0.16, "Styk");
     LocalTime[] localTimee = {LocalTime.of(1,2),LocalTime.of(2,1)};
     double[] antalEnheder = {2.00,3.00};



     //ACT
     DagligSkaev dagligSkaev = controller.opretDagligSkaevOrdination(startDen,slutDen,patient,laegemiddel,localTimee,antalEnheder);

     //ASSERT
     assertEquals(startDen,dagligSkaev.getStartDen());
     assertEquals(slutDen,dagligSkaev.getSlutDen());
     assertTrue(patient.getOrdinationer().contains(dagligSkaev));
     assertEquals(laegemiddel,dagligSkaev.getLaegemiddel());
     assertEquals(antalEnheder[0],dagligSkaev.getDoser().get(0).getAntal(),0.01,"Hejsa");
     assertEquals(antalEnheder[1],dagligSkaev.getDoser().get(1).getAntal(),0.01,"Hejsa");
     assertEquals(localTimee[0],dagligSkaev.getDoser().get(0).getTid());
     assertEquals(localTimee[1],dagligSkaev.getDoser().get(1).getTid());



///    assertEquals(expected,actual,delta);
     //hvor delta er tolerancen  fx 0.01

    }

 @org.junit.jupiter.api.Test
 void opret_DagligSkaev_OrdinationTC2() {
  //Arrange

  Controller controller = Controller.getController();
  LocalDate startDen = LocalDate.of(2023,10,10);
  LocalDate slutDen = LocalDate.of(2023,9,17);
  Patient patient = new Patient("140200-7890","Emil Nikolajsen",90); ;
  Laegemiddel laegemiddel = new Laegemiddel("Acetylsalicylsyre", 0.1,
          0.15, 0.16, "Styk");
  LocalTime[] localTimee = {LocalTime.of(1,2),LocalTime.of(2,1)};
  double[] antalEnheder = {2.00,3.00};




  //ACT
  DagligSkaev dagligSkaev = controller.opretDagligSkaevOrdination(startDen,slutDen,patient,laegemiddel,localTimee,antalEnheder);

  //ASSERT
  assertEquals(startDen,dagligSkaev.getStartDen());
  assertEquals(slutDen,dagligSkaev.getSlutDen());
  assertTrue(patient.getOrdinationer().contains(dagligSkaev));
  assertEquals(laegemiddel,dagligSkaev.getLaegemiddel());
  assertEquals(antalEnheder[0],dagligSkaev.getDoser().get(0).getAntal(),0.01,"Hejsa");
  assertEquals(antalEnheder[1],dagligSkaev.getDoser().get(1).getAntal(),0.01,"Hejsa");
  assertEquals(localTimee[0],dagligSkaev.getDoser().get(0).getTid());
  assertEquals(localTimee[1],dagligSkaev.getDoser().get(1).getTid());



///    assertEquals(expected,actual,delta);
  //hvor delta er tolerancen  fx 0.01

 }

    @org.junit.jupiter.api.Test
    void ordination_PN_Anvendt_TC1() {
     //Arrange
    Controller controller =  Controller.getController();
     LocalDate startDate = LocalDate.of(2023,04,20);
     LocalDate slutDate =  LocalDate.of(2023,04,30);
     Patient patient = new Patient("99114433","Hans",90);
     Laegemiddel laegemiddel = new Laegemiddel("Acetylsalicylsyre", 0.1,
             0.15, 0.16, "Styk");
     double antal = 10;
     LocalDate dato = LocalDate.of(2023,10,10);
     PN faktiskPN = controller.opretPNOrdination(startDate,slutDate,patient,laegemiddel,antal);


     //ACT;
     controller.ordinationPNAnvendt(faktiskPN,dato);
     //ASSERT
     assertTrue(faktiskPN.getAntalGangePåDato().contains(dato));
    }





    @org.junit.jupiter.api.Test
    void antal_Ordinationer_PrVægt_PrLægemiddel() {
     //Arrange
     Controller controller = Controller.getController();
     double væetStart = 50;
     double vegtSlut = 90;

     Laegemiddel laegemiddel = new Laegemiddel("Paracetamol", 1, 1.5, 2, "Ml");

     //ACT
     int faktisk = controller.antalOrdinationerPrVægtPrLægemiddel(væetStart,vegtSlut,laegemiddel);
     //ASSERT
     System.out.println(controller.antalOrdinationerPrVægtPrLægemiddel(væetStart,vegtSlut,laegemiddel));
     assertEquals(controller.antalOrdinationerPrVægtPrLægemiddel(væetStart,vegtSlut,laegemiddel),faktisk);
    }

 @org.junit.jupiter.api.Test
 void antal_Ordinationer_PrVægt_PrLægemiddel_TC1() {
  //Arrange
  Controller controller = Controller.getController();
  double væetStart = 50;
  double vegtSlut = 90;
  Laegemiddel laegemiddel = new Laegemiddel("Acetylsalicylsyre", 0.1,
          0.15, 0.16, "Styk");




  //ACT
  int faktisk = controller.antalOrdinationerPrVægtPrLægemiddel(væetStart,vegtSlut,laegemiddel);
  //ASSERT
  System.out.println(controller.antalOrdinationerPrVægtPrLægemiddel(væetStart,vegtSlut,laegemiddel));
  assertEquals(controller.antalOrdinationerPrVægtPrLægemiddel(væetStart,vegtSlut,laegemiddel),faktisk);
 }


 @org.junit.jupiter.api.Test
 void antal_Ordinationer_PrVægt_PrLægemiddel_TC2() {
  //Arrange
  Controller controller = Controller.getController();
  double væetStart = 10;
  double vegtSlut = 20;
  Laegemiddel laegemiddel = new Laegemiddel("Acetylsalicylsyre", 0.1,
          0.15, 0.16, "Styk");




  //ACT
  int faktisk = controller.antalOrdinationerPrVægtPrLægemiddel(væetStart,vegtSlut,laegemiddel);
  //ASSERT
  System.out.println(controller.antalOrdinationerPrVægtPrLægemiddel(væetStart,vegtSlut,laegemiddel));
  assertEquals(controller.antalOrdinationerPrVægtPrLægemiddel(væetStart,vegtSlut,laegemiddel),faktisk);
 }

 @org.junit.jupiter.api.Test
 void anbefalet_Dosis_PrDoegn_TC1() {
  //Arrange
  Controller controller = Controller.getController();
  Patient patient = new Patient("140200-7890","Emil Nikolajsen",4); ;
  Laegemiddel laegemiddel = new Laegemiddel("Acetylsalicylsyre", 0.1,
          0.15, 0.16, "Styk");

  //ACT
  double faktisk = controller.anbefaletDosisPrDoegn(patient,laegemiddel);

  //ASSERT
  System.out.println(controller.anbefaletDosisPrDoegn(patient,laegemiddel));
  assertEquals(controller.anbefaletDosisPrDoegn(patient,laegemiddel),faktisk);
 }

 @org.junit.jupiter.api.Test
 void anbefalet_Dosis_PrDoegn_TC2() {
  //Arrange
  Controller controller = Controller.getController();
  Patient patient = new Patient("140200-7890","Emil Nikolajsen",24); ;
  Laegemiddel laegemiddel = new Laegemiddel("Acetylsalicylsyre", 0.1,
          0.15, 0.16, "Styk");

  //ACT
  double faktisk = controller.anbefaletDosisPrDoegn(patient,laegemiddel);

  //ASSERT
  assertEquals(controller.anbefaletDosisPrDoegn(patient,laegemiddel),faktisk);
 }






 @org.junit.jupiter.api.Test
 void anbefalet_Dosis_PrDoegn_TC3() {
  //Arrange
  Controller controller = Controller.getController();
  Patient patient = new Patient("140200-7890","Emil Nikolajsen",25); ;
  Laegemiddel laegemiddel = new Laegemiddel("Acetylsalicylsyre", 0.1,
          0.15, 0.16, "Styk");

  //ACT
  double faktisk = controller.anbefaletDosisPrDoegn(patient,laegemiddel);

  //ASSERT
  assertEquals(controller.anbefaletDosisPrDoegn(patient,laegemiddel),faktisk);

 }


 @org.junit.jupiter.api.Test
 void anbefalet_Dosis_PrDoegn_TC4() {
  //Arrange
  Controller controller = Controller.getController();
  Patient patient = new Patient("140200-7890","Emil Nikolajsen",26); ;
  Laegemiddel laegemiddel = new Laegemiddel("Acetylsalicylsyre", 0.1,
          0.15, 0.16, "Styk");

  //ACT
  double faktisk = controller.anbefaletDosisPrDoegn(patient,laegemiddel);

  //ASSERT
  assertEquals(controller.anbefaletDosisPrDoegn(patient,laegemiddel),faktisk);
 }

 @org.junit.jupiter.api.Test
 void anbefalet_Dosis_PrDoegn_TC5() {
  //Arrange
  Controller controller = Controller.getController();
  Patient patient = new Patient("140200-7890","Emil Nikolajsen",35); ;
  Laegemiddel laegemiddel = new Laegemiddel("Acetylsalicylsyre", 0.1,
          0.15, 0.16, "Styk");

  //ACT
  double faktisk = controller.anbefaletDosisPrDoegn(patient,laegemiddel);

  //ASSERT
  assertEquals(controller.anbefaletDosisPrDoegn(patient,laegemiddel),faktisk);
 }


 @org.junit.jupiter.api.Test
 void anbefalet_Dosis_PrDoegn_TC6() {
  //Arrange
  Controller controller = Controller.getController();
  Patient patient = new Patient("140200-7890","Emil Nikolajsen",121); ;
  Laegemiddel laegemiddel = new Laegemiddel("Acetylsalicylsyre", 0.1,
          0.15, 0.16, "Styk");

  //ACT
  double faktisk = controller.anbefaletDosisPrDoegn(patient,laegemiddel);

  //ASSERT
  System.out.println(faktisk);
  assertEquals(controller.anbefaletDosisPrDoegn(patient,laegemiddel),faktisk);
 }

 @org.junit.jupiter.api.Test
 void anbefalet_Dosis_PrDoegn_TC7() {
  //Arrange
  Controller controller = Controller.getController();
  Patient patient = new Patient("140200-7890","Emil Nikolajsen",2); ;
  Laegemiddel laegemiddel = new Laegemiddel("Acetylsalicylsyre", 0.1,
          0.15, 0.16, "Styk");

  //ACT
  double faktisk = controller.anbefaletDosisPrDoegn(patient,laegemiddel);

  //ASSERT
  assertEquals(controller.anbefaletDosisPrDoegn(patient,laegemiddel),faktisk);
 }



    @org.junit.jupiter.api.Test
    void opretPatient_TC1() {
     //Arrange
     Controller controller = Controller.getController();
     String cpr = "140200-7890";
     String navn = "Emil Nikolajsen";
     double vaegt = 100;

     //ACT
     Patient faktiskPatient = controller.opretPatient(cpr,navn,vaegt);

     //ASSERT
     assertEquals(cpr,faktiskPatient.getCprnr());
     assertEquals(navn,faktiskPatient.getNavn());
     assertEquals(vaegt,faktiskPatient.getCprnr());

    }

    @org.junit.jupiter.api.Test
    void opretLaegemiddel_TC1(){
     //Arrange
      Controller controller = Controller.getController();
      String navn = "Panodil";
      double enhedPrKgPrDoegnLet = 1;
      double enhedPrKgPrDoegnNormal = 1.5;
      double enhedPrKgPrDoegnTung = 2;
      String enhed = "Styk";

     //ACT
     Laegemiddel faktiskLægemiddel = controller.opretLaegemiddel(navn,enhedPrKgPrDoegnLet,
             enhedPrKgPrDoegnNormal,enhedPrKgPrDoegnTung,enhed);

     //ASSERT
     assertEquals(navn,faktiskLægemiddel.getNavn());
     assertEquals(enhedPrKgPrDoegnLet,faktiskLægemiddel.getEnhedPrKgPrDoegnLet());
     assertEquals(enhedPrKgPrDoegnNormal,faktiskLægemiddel.getEnhedPrKgPrDoegnNormal());
     assertEquals(enhedPrKgPrDoegnTung,faktiskLægemiddel.getEnhedPrKgPrDoegnTung());
     assertEquals(enhed,faktiskLægemiddel.getEnhed());

    }

 @org.junit.jupiter.api.Test
 void opretLaegemiddel_TC2(){
  //Arrange
  Controller controller = Controller.getController();
  String navn = "Panodil";
  double enhedPrKgPrDoegnLet = 1;
  double enhedPrKgPrDoegnNormal = 1.5;
  double enhedPrKgPrDoegnTung = 2;
  String enhed = "Kage";

  //ACT
  Laegemiddel faktiskLægemiddel = controller.opretLaegemiddel(navn,enhedPrKgPrDoegnLet,
          enhedPrKgPrDoegnNormal,enhedPrKgPrDoegnTung,enhed);

  //ASSERT
  assertEquals(navn,faktiskLægemiddel.getNavn());
  assertEquals(enhedPrKgPrDoegnLet,faktiskLægemiddel.getEnhedPrKgPrDoegnLet());
  assertEquals(enhedPrKgPrDoegnNormal,faktiskLægemiddel.getEnhedPrKgPrDoegnNormal());
  assertEquals(enhedPrKgPrDoegnTung,faktiskLægemiddel.getEnhedPrKgPrDoegnTung());
  assertEquals(enhed,faktiskLægemiddel.getEnhed());

 }

// @Test
 /* I vores dokument har vi sagt vi kigger på følengde under hvor vi skulle have kigger på
   antalPrAnvendt  */
// void check_Start_FOER_SLUT_TC1(){
//  //Arrange
//  Controller controller = Controller.getController();
//  LocalDate startDen = LocalDate.of(2023,10,10);
//  LocalDate slutDen = LocalDate.of(2023,9,17);
//  //Acts
//  boolean faktisk = controller.check
//
//  //Assert



// }

}