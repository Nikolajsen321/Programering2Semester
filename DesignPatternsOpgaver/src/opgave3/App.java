package opgave3;

public class App {
    public static void main(String[] args) {
        Person p1 = new Person("Hans");
        Person p2 = new Person("Morten");
        Person p3 = new Person("Mikkel BANG MED DEN LYSERØDE NIKE trøje ");
        Person p4 = new Person("Emil");

        PersonAdminstration.getInstance();

        PersonAdminstration.addPerson(p1);
        PersonAdminstration.addPerson(p2);
        PersonAdminstration.addPerson(p3);
        PersonAdminstration.addPerson(p4);

        System.out.println(PersonAdminstration.getPersoner());

        PersonAdminstration.removePerson(p1);

        System.out.println();
        System.out.println(PersonAdminstration.getPersoner());





    }
}
