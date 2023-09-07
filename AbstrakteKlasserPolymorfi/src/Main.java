import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ArrayList<Ansat> list = new ArrayList<>();


        /*
        husk at Ansat i erklæring i den instans nede under mekaniker 1
         her er det man kalder for en erklærede type af reference variable
         det er den type som bestemmer hvilken metode beregnUgeLon() der matcher ved compile time
         compiler finder altså en matching metode iforhold til parameter type, antallet af parameter,
         og hvilken order parameter kommer, en metode kan altså implementeres i flere klasser som her
         langs nedarvningskæden  JVM kan dynamisk binde implementation af metode ved runtime bestemt af
         actual type fx under Mekaniker
         */


        Ansat mekaniker1 = new Mekaniker("Hans", "JamsenVej1", 130,
                new Date(2015 - 1900, Calendar.DECEMBER, 10));
       Ansat værkfører = new Værkfører("Jens","VimmersVej12",130,
               new Date(2000-1900,Calendar.JANUARY,10),25);
       ArrayList<String> ugeList = new ArrayList<>();

       ugeList.add("Bil1");
       ugeList.add("Bil2");


       Ansat synsMand = new SynsMand("Martin","SimmerVej11",130,
               new Date(2010-1900,Calendar.JANUARY,10),true,ugeList);




        list.add(mekaniker1);
        list.add(værkfører);
        list.add(synsMand);


        System.out.println(mekaniker1.beregnUgeLon());
        System.out.println(værkfører.beregnUgeLon());
        System.out.println(synsMand.beregnUgeLon());

        samletUgeLøn(list);



    }

    private static void samletUgeLøn(ArrayList<Ansat> list) {
        double samletLon = 0;
        for(Ansat a : list){
            samletLon += a.beregnUgeLon();
        }
        System.out.println("Samlet lon er " + samletLon);

    }


}