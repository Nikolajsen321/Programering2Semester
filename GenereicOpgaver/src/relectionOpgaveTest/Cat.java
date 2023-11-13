package relectionOpgaveTest;

public class Cat {
    /*
    fordi name er en final variable kan man kune angive den engang derfor kan man ikke have en setMetode
     */
    private final String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void meow(){
        System.out.println("Meow");
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    private void heyThisIsPrivate(){
        System.out.println("How did you call this??");
    }

    public static void thisIsAPublicStaticMethod(){
        System.out.println("I'm public and static ");

    }

    private static void thisIsAPrivateStaticMethod(){
        System.out.println("I'm private and static ");
    }

}
