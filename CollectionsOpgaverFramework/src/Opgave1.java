import java.util.HashSet;
import java.util.List;

public class Opgave1 {
    public static void main(String[] args) {
        HashSet<Integer> mængde = new HashSet<>(List.of(34,12,23,45,67,34,98));
        System.out.println(mængde);
        System.out.println("Antal " + mængde.size());
        mængde.add(23);
        System.out.println();
        System.out.println(mængde);
        mængde.remove(67);
        System.out.println();
        System.out.println(mængde);
        System.out.println();
        System.out.println( mængde.contains(23));
        System.out.println(mængde.size());



    }
}
