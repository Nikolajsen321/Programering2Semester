import java.util.Date;


public class Mekaniker extends Person{
    private Date svendePrøveÅr;
    private int timeLøn;
/*
Husk at super() er et metode kald ( call ) til constructoren af super klassen, klassen der extender
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
