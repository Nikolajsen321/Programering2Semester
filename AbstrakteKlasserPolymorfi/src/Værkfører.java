import java.util.Date;

public class Værkfører extends Ansat {
    private Date værkFørerUdNAr;
    private int tillæg;

    public Værkfører(String navn, String adresse,double timeLon,Date værkFørerUdNAr,int tillæg){
        super(navn,adresse,timeLon);
        this.værkFørerUdNAr = værkFørerUdNAr;
        this.tillæg = tillæg;
    }


    public Date getVærkFørerUdNAr() {
        return værkFørerUdNAr;
    }

    public int getTillæg() {
        return tillæg;
    }
    @Override
    public double beregnUgeLon(){
        double ugeLon =  37*(super.getTimeLon() + tillæg);
        return ugeLon;
    }
}
