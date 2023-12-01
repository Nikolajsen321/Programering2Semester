package singleton;

public class App {
    public static void main(String[] args) {
       Counter counter = Counter.getInstance();
        counter.count();
        counter.count();
        counter.count();
        counter.count();
        System.out.println(counter.getValue());
        counter.times2();
        System.out.println(counter.getValue());
        counter.zero();
        System.out.println(counter.getValue());
        counter.count();
        counter.count();
        counter.count();
        counter.count();
        counter.count();
        counter.count();
        System.out.println(counter.getValue());
        counter.potens(2);
        System.out.println(counter.getValue());
        counter.squareRoot();
        System.out.println(counter.getValue());
    }
}
