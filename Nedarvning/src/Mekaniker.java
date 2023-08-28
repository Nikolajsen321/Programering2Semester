import java.util.Date;


public class Mekaniker extends Person{
    private Date svendePrøveÅr;
    private int timeLøn;
/*
      super() er et metode kald ( call ) til constructoren af super klassen, klassen der extender
      da constructoren ikke arves ved extend det er altså nedarvning fra person til Mekaniker
 */
    public Mekaniker(String navn, String adresse,Date svendePrøveÅr,int timeLøn){
        super(navn,adresse);
        this.svendePrøveÅr = svendePrøveÅr;
        this.timeLøn = timeLøn;
    }

    public Date getSvendePrøveÅr() {
        return svendePrøveÅr;
    }

    public int getTimeLøn() {
        return timeLøn;
    }


    public int beregnUgeLon(){
        int ugeLon = 37 * timeLøn;
        return ugeLon;
    }
}
