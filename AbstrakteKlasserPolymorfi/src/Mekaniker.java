import java.util.Date;

public class Mekaniker extends Ansat {
    private Date svendePrøveÅr;
    private int timeLøn;
    /*
      super() er et metode kald ( call ) til constructoren af super klassen, klassen der extender
      da constructoren ikke arves ved extend det er altså nedarvning fra person til Mekaniker
     */
    public Mekaniker(String navn, String adresse,double timeLon,Date svendePrøveÅr){
        super(navn,adresse,timeLon);
        this.svendePrøveÅr = svendePrøveÅr;
    }

    public Date getSvendePrøveÅr() {
        return svendePrøveÅr;
    }

    public int getTimeLøn() {
        return timeLøn;
    }


    @Override
    public double beregnUgeLon() {
        double sum = super.getTimeLon() * 37;
        return sum;
    }
}
