import java.util.*;

public class Opgave2 {
    public static void main(String[] args) {
        //Opgave 3
        List<Integer> listKarakter1 = new ArrayList<>(List.of(10,12,7,12,12,12));
        List<Integer> listKarakter2 = new ArrayList<>(List.of(7,12,7,4,12,12));
        List<Integer> listKarakter3 = new ArrayList<>(List.of(7,12,7,4,12,12));

        System.out.println();
        System.out.println("Opgave 2,2");
        Studerende2 studerende1 = new Studerende2(2131331,"Mikkel",listKarakter1);
        Studerende2 studerende2 = new Studerende2(2131444,"Hans",listKarakter2);
        Studerende2 studerende3 = new Studerende2(21314,"Jens",listKarakter2);
        Studerende2 studerende4 = new Studerende2(21314,"Mads",listKarakter2);

        Set<Studerende2> setStuderende= new HashSet<>();
        setStuderende.add(studerende1);
        setStuderende.add(studerende2);
        setStuderende.add(studerende3);
        setStuderende.add(studerende4);



        Skole2 skole2 = new Skole2("ErhversAkademi",setStuderende);
        System.out.println();
        System.out.println(skole2);
        System.out.println();

        Set<Studerende2> s = new TreeSet<>();
        s.add(studerende1);
        s.add(studerende2);
        s.add(studerende3);
        s.add(studerende4);

        Set<Studerende2> s1 = new TreeSet<>((o1, o2) -> {
            return o1.getNavn().toLowerCase().compareTo(o2.getNavn().toLowerCase());
        });
        s1.add(studerende1);
        s1.add(studerende2);
        s1.add(studerende3);
        s1.add(studerende4);


        System.out.println(s);
        System.out.println();
        System.out.println(s1);







    }
}
