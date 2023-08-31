public abstract class Ansat extends Person {
    private double timeLon;

    public Ansat(String navn, String adresse,double timeLon) {
        super(navn, adresse);
        this.timeLon = timeLon;
    }

    public abstract double beregnUgeLon();


    public double getTimeLon(){
        return timeLon;
    }

}
