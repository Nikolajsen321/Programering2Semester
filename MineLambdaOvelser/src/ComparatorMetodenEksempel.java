import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class ComparatorMetodenEksempel {
    public static void main(String[] args) {
        /*
        Klassen ArrayList<E> har en sort() metode, som sortere objekterne i listen ved at bruge en
        comparator() metode  Metoden sort() ser sålede ud
        public class ArrayList<E> {
        public void sort(Comparator<E> comparator) { … }
         }
         Her er Comparator<E> et funktionelt interface:
           @FunctionalInterface
           public interface Comparator<E> {
           int compare(E e1, E e2);
            }
            Metoden sort() kan derofr kaldes med en lambda funktion
            Antag man har en person klasse, hvor alle personer har et name felt med
            tilhørende getName() metode man kan nu sortere en ArrayList<Person>
            ved at bruge sort() metoden med en lambdafunktion
         */
        List<Person> list = List.of(
                new Person("Mikael", 60), new Person("Susan", 34),
                new Person("Bent", 25), new Person("Klaus", 44),
                new Person("Birgitte", 17), new Person("Liselotte", 9));

        for(Person p : list){
            System.out.println(p.getName());
        }

        list = new ArrayList<Person>(list);
        list.sort((p1,p2) -> p1.getName().compareTo(p2.getName()));
        /*
        Her benyttes, at String klassen har en compareTo() metode, som kan sammenligne strings
        hvis udtryk ikke er let at læse kan Lambda funktionen  gemmes i en variable
         */

        System.out.println();
        // dette er et eksempel på hvis man vil have en variable i sorten i stedet for hele udtrykket
        Comparator<Person> pc = (p1, p2) -> p1.getName().compareTo(p2.getName());
        list.sort(pc);





        for(Person p : list){
            System.out.println(p.getName());
        }
        System.out.println(findFirstPerson(list,p->p.getName() == "Bent"));


        System.out.println();

        System.out.println(findAllPersons(list,p ->p.getName().indexOf("M")==1 || p.getName().indexOf("M")==-1));

        System.out.println(findAllPersons(list,p->p.getName().compareTo("Bent") > 0 || p.getName().compareTo("Bent") < 0));

        System.out.println();


    }


    public static Person findFirstPerson(List<Person> list, Predicate<Person> filter){
        for(Person p: list){
            if(filter.test(p)){
                return p;
            }
        }
        return null;

    }

    public static ArrayList<Person> findAllPersons(List<Person> list, Predicate<Person> filter){
        ArrayList<Person> newList = new ArrayList<>();
        for(Person p: list){
            if(filter.test(p)){
                newList.add(p);
            }
        }
        return newList;

    }

    public static ArrayList<Person> findAllPerson(List<Person> list,Filter filter){
        ArrayList<Person> newList = new ArrayList<>();
        for(Person p : list){
            if(filter.accept(p.getName())){
                newList.add(p);
            }
        }
        return newList;
    }
}
