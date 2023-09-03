public abstract class Ansat extends Person {
    private double timeLon;

    public Ansat(String navn, String adresse,double timeLon) {
        super(navn, adresse);
        this.timeLon = timeLon;
    }

    /*
    det nedeunder kaldes for et interface og bruges i java til at opnå abstraktion
     */
    public abstract double beregnUgeLon();

    public double getTimeLon(){
       return this.timeLon;
    }
}
