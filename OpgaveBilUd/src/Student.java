public class Student {

    private String name;
    private Pencil pencil;

    public Student(String name, Pencil pencil) {
        this.name = name;
        this.pencil = pencil;
    }
// ligner et objekt men er et lambda udtryk pencil hvor objektet er en funktion
    public void drawCar(Car car) {
        pencil.drawCar(car);
    }

    @Override
    public String toString() {
        return name;
    }
}