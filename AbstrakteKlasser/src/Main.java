import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Bil minBil;
        ElBil minElBil;

        minBil = new Bil();
        minBil.maerke = "Ford";
        minBil.vaegt = 1000;
//        minBil.farve = "Rød";

        minElBil = new ElBil();
        minElBil.maerke = "Volvo";
        minElBil.vaegt = 1500;
//        minElBil.farve = "Sort";

        /*
        Den aktuelle type  er ElBil man prøver at sige  minBil der er sat af den
        genrelle type Bil skal være  lige elBil men elbil er en subclass af Bil derfor
        kan man ikke
         */

//        minElBil = minBil;
        minBil = new ElBil();



//        minBil.getOpladningsTid();
        minBil.getFarve();

        /*
        I instanceof Elbil kigger man i minBil af general type Bil efter om
        der er sub class af aktuelle type elbil
         */

        if (minBil instanceof ElBil){
            ((ElBil)minBil).getOpladningsTid();
        }
    }




}



