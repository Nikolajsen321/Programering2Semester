package opgave3;

public class Person {
    private String navn;
    public Person(String navn) {
        this.navn = navn;
    }
    public Person() {
    }


    public String getNavn() {
        return navn;
    }

    @Override
    public String toString() {
        return "Person{" +
                "navn='" + navn + '\'' +
                '}';
    }
}
