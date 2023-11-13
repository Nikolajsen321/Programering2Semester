import java.util.*;

public class Opgave2 {
    public static void main(String[] args) {
        //Opgave 2.1
        List<Integer> listKarakter1 = new ArrayList<>(List.of(10,12,7,12,12,12));
        List<Integer> listKarakter2 = new ArrayList<>(List.of(7,12,7,4,12,12));
        List<Integer> listKarakter3 = new ArrayList<>(List.of(7,12,7,4,12,12));

        Studerende1 studerende1 = new Studerende1(2131331,"Mikkel",listKarakter1);
        Studerende1 studerende12 = new Studerende1(2131444,"Hans",listKarakter2);
        Studerende1 studerende13 = new Studerende1(2131444,"Hans",listKarakter2);

        List<Studerende1> listOfStude = new ArrayList<>(List.of(studerende1, studerende12, studerende13));
         SkoleOpg1 skole = new SkoleOpg1("ErhversAkademi",listOfStude);

        System.out.println(skole);

        //Opgave 2.2
        System.out.println();
        System.out.println("Opgave 2,2");
        Studerende2 studerende21 = new Studerende2(2131331,"Mikkel",listKarakter1);
        Studerende2 studerende22 = new Studerende2(2131444,"Hans",listKarakter2);
        Studerende2 studerende23 = new Studerende2(2131444,"Hans",listKarakter2);

        Set<Studerende2> setStuderende= new HashSet<>(List.of(studerende21, studerende22, studerende23));
        Skole2 skole2 = new Skole2("ErhversAkademi",setStuderende);

        System.out.println(skole2);

        // opgave 2.3
        System.out.println();
        System.out.println("Opgave 2.3");
        Studerende3 studerende31 = new Studerende3(2131331,"Mikkel",listKarakter1);
        Studerende3 studerende32 = new Studerende3(2131444,"Hans",listKarakter2);
        Studerende3 studerende33 = new Studerende3(2131444,"Hans",listKarakter2);

        Map<Integer,Studerende3> mapStuderende= new HashMap();

        mapStuderende.put(studerende31.getStudieNr(),studerende31);
        mapStuderende.put(studerende32.getStudieNr(),studerende32);
        mapStuderende.put(studerende33.getStudieNr(),studerende33);

        Skole3 skole3 = new Skole3("ErhversAkademi", mapStuderende);

        System.out.println(skole3);




    }
}
