import java.util.Date;

/*
Fokus på kontrolstruktur sekvenser når Værkfører objektet skal laves så sættes parameterne i constructoren
i person først så mekaniker og tilsdist værkfører
 */

public class Værkfører extends Mekaniker{
    private Date værkFørerUdNAr;
    private int tillæg;

    public Værkfører(String navn, String adresse,Date svendePrøveÅr,int timeLøn,Date værkFørerUdNAr,int tillæg){
        super(navn,adresse,svendePrøveÅr,timeLøn);
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
    public int beregnUgeLon(){
        int ugeLon = super.beregnUgeLon() + (tillæg * 37);
        return ugeLon;
    }
}
