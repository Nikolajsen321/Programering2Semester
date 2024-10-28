package Iterator;


import java.util.Iterator;

public class App {
    public static void main(String[] args) {
        int i = 0;

        PersonCollection personCollection = new PersonCollection();

        Person person1 = new Person("Hans");
        Person person2 = new Person("Mikkel");
        Person person3 = new Person("Jens");
        Person person4 = new Person("Emil");


        personCollection.add(person1);
        personCollection.add(person2);
        personCollection.add(person3);
        personCollection.add(person4);


      Iterator<Person> iterator =  personCollection.iterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        personCollection.add(new Person("Jens2"));
        System.out.println(iterator.next());

//      for(Person p : personCollection){
//          System.out.println(p);
//      }



//        System.out.println();
//      personCollection.forEach(person -> System.out.println(person));
//
//        System.out.println();
//
//
//      while (iterator.hasNext()){
//          System.out.println(iterator.next());
//      }





//        while (i < personCollection.size()){
//            System.out.println(personCollection.get(i));
//            i++;
//        }

        Person person5 = new Person("Benjamin");

        personCollection.add(2,person5);
        System.out.println();





    }
}
