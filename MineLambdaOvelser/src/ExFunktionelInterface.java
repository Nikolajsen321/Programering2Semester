
import java.util.ArrayList;
import java.util.List;

public class ExFunktionelInterface {
    public static void main(String[] args) {

        /*
        En lambda funktion er en metode med navn, parametre og returtype som enhver anden metode. Det
        specielle ved en lambda funktion er syntaksen for metoden1.
        Lambda funktion er knyttet til en funktionel interface da variable af en
        funktionel interface type er de eneste variable som kan refere til en
        lambda funktion
        Altså et funktionel interface har præcis 1 metode
        Kode under erklære en variable af funktionel interface type som refere til lambda
         */


        /*
        Lambda funktionen står på højre side af assigment sætning
        Højresiden definere metode som tager parameter af String type og returnere værdi af boolean type
        Parameter til lambda funktion står i parentes til venstre for pilen
        metoden krop er udtrykket i kryllet parenteser til højre for pilen

        metode navn  er accept()
         - kan ikke ses på lambda funktionen men da den funktionelle interface Filter
            beskriver præcis en metode med navnet accept, så kan metodens navn udledes herfra
            retur type boolean kan også ses i filter ses påå defeinetionen af accept() metoden  man kan
            også ses indrikerte på lambda funktiones return sætning  str.length > 5  */



         Filter f5 = (String str ) -> {
                return str.length() > 5;
            };

            boolean accepted = f5.accept("Lambda Funktion");
        System.out.println(accepted);


        ArrayList<String> list = new ArrayList<>(List.of("dadsadads","daddadsasdada","dsdadadad",
                "dsdasdsadaasd","d","michael","Ma"));

        // tæller hvor mange ord er længere end 5
        System.out.println(countAccepted(list,f5));

        /*
        Metoden tæller hvor mange af strengne i ArrayList som accepteres af acept() metoden.
        Metoden countAceptted() er en generel tælle metode, hvor accept() metoden bestemmer , hvad der tælles

         */

        Filter fm = (String str) ->{
          return str.startsWith("m");
        };

        //Tæller hvor mange starter med et lille m
        System.out.println(countAccepted(list,fm));

       // ****************************************************'
      /*  Lambda funktioner skrevet med forkortet syntaks
         overstående parameter til lambda funktionen kan også unlades fra det funktionelle interface*/

        /*
        Defenitonen af accept metoden i Filter viser at metoden tager en parameter af typen String
        det samme må derfor gælde for lambda funktionen, derfor kan man undlade typen
        parametre til en lambda funktion
         */
        Filter f6 =(str) ->{
            return str.length() > 5;
        };

        /*
        i specielle tilfælde kan syntaksen for en lambda funktion forkortes yderligere
        Hvis der er kun en parameter til lambda funktionen, kan parentesen omkring parameteren fjernes
         */
        Filter f7 = str -> str.length() > 5;
        /*
        hvis kun en komando i lambda funktions krop, kan de krøllede parenteser og evt en returns
        fjernes
         */
        Filter f8 = str -> str.length() > 5;

        /*
        når man har den helt kort syntaks for en lambda funktion, så undlader man ofte at definere en
        variable af funktionel interface type, når en lambda funktion skal bruges som parameter til en metode

         */
        Filter f9 = str -> str.length() > 5;
        //blive til
        int countLongerThan5 = countAccepted(list,str -> str.length() > 5);
        System.out.println(countLongerThan5);
        /*
        eller endnu kortere til
         */
        System.out.println(countAccepted(list,str -> str.length() > 5));













    }


        /*
         Mest almindelig avendelse af lambda funktion er som parameter til en metode
         eksempel
         */
    public static int countAccepted(ArrayList<String> list, Filter f){
        int count = 0;
        for(String s: list){
            if(f.accept(s)){
                count++;
            }
        }
        return count;
    }




}
