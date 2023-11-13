import java.util.Comparator;

public class ComparatorStuderende implements Comparator<Studerende2> {
    @Override
    public int compare(Studerende2 o1, Studerende2 o2) {
        return o1.getNavn().toLowerCase().compareTo(o2.getNavn().toLowerCase());

    }
}
