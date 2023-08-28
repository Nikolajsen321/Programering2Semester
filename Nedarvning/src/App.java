import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;

public class App {
    public static void main(String[] args) {
        ArrayList<Mekaniker> listeMekaniker = new ArrayList<>();

        Mekaniker mekaniker1 = new Mekaniker("Hans","Vimmers2",
                new Date(2014, Calendar.FEBRUARY,11),160);
        Mekaniker mekaniker2 =  new Mekaniker("Jens","HammerVej 3",
                new java.util.Date(2019,Calendar.JANUARY,11),190);
        Værkfører værkfører = new Værkfører("Mads","BimmersVej 3",
                new java.util.Date(2010,Calendar.JANUARY,10),200,
                new java.util.Date(2013,Calendar.MARCH,12),90);

        ArrayList<String> synsListe = new ArrayList<>();
        synsListe.add("syns1");
        synsListe.add("syns2");
        synsListe.add("syns3");

        SynsMand synsMand = new SynsMand("Børge","Bjegsenvej",
                new java.util.Date(2000,Calendar.DECEMBER,24),200,synsListe);


        listeMekaniker.add(mekaniker1);
        listeMekaniker.add(mekaniker2);
        listeMekaniker.add(værkfører);
        listeMekaniker.add(synsMand);

        for(Mekaniker m : listeMekaniker){
            System.out.println(m.beregnUgeLon());
        }
    }
}
