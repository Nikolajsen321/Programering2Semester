import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
/* polymorfi flere egensakber for en opgave */
public class App {
    public static void main(String[] args) {
        int samletLon = 0;
        ArrayList<Mekaniker> listeMekaniker = new ArrayList<>();

        Mekaniker mekaniker1 = new Mekaniker("Hans","Vimmers2",
                new Date(2014-1900, Calendar.FEBRUARY,2),160);

        Mekaniker mekaniker2 =  new Mekaniker("Jens","HammerVej 3",
                new Date(2019 - 1900,Calendar.JANUARY,11),190);

        Værkfører værkfører = new Værkfører("Mads","BimmersVej 3",
                new Date(2010 - 1900,Calendar.JANUARY,10),200,
                new Date(2013 - 1900,Calendar.MARCH,12),90);

        ArrayList<String> synsListe = new ArrayList<>();

        synsListe.add("syns1");
        synsListe.add("syns2");
        synsListe.add("syns3");

        SynsMand synsMand = new SynsMand("Børge","Bjegsenvej",
                new Date(2000 - 1900,Calendar.DECEMBER,24),200,synsListe);


        listeMekaniker.add(mekaniker1);
        listeMekaniker.add(mekaniker2);
        listeMekaniker.add(værkfører);
        listeMekaniker.add(synsMand);

        for(Mekaniker m : listeMekaniker){
            System.out.println(m.beregnUgeLon() + " Kr" + " Svende prøve " + m.getSvendePrøveÅr());
            samletLon += m.beregnUgeLon();
        }

        System.out.println("Samlet løn " + samletLon);
    }
}
