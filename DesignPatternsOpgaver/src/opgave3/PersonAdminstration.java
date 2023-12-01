package opgave3;


import java.util.ArrayList;
import java.util.List;

public class PersonAdminstration {
   private static List<Person> personList  = new ArrayList<>();
    private static PersonAdminstration uniqueInstance;

    private PersonAdminstration() {
    }


    public static PersonAdminstration getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new PersonAdminstration();
        }

        return uniqueInstance;
    }

    public static void addPerson(Person person){
        if(!personList.contains(person)) {
            personList.add(person);
        }
    }

    public static ArrayList<Person> getPersoner(){
        return new ArrayList<>(personList);
    }

    public static void removePerson(Person person){
        if(personList.contains(person)){
            personList.remove(person);
        }
    }



}
