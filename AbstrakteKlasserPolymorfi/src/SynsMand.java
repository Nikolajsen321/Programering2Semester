import java.util.ArrayList;
import java.util.Date;

public class SynsMand extends Mekaniker {
    private boolean ekstraBetaling;
    private ArrayList<String> ugeLigListe = new ArrayList<>();

    public SynsMand(String navn, String adresse,double timeLøn,Date svendePrøveÅr,boolean ekstraBetaling, ArrayList<String> ugeLigListe){
        super(navn,adresse,timeLøn,svendePrøveÅr);
        this.ugeLigListe = ugeLigListe;
        this.ekstraBetaling = ekstraBetaling;
    }


    @Override
    public double beregnUgeLon(){
        double ugeLon = 0;
        if(ekstraBetaling) {
             ugeLon = 37 * (super.getTimeLon() + 29 * ugeLigListe.size());
        }else {
             ugeLon = super.getTimeLon() * 37;
        }
        return ugeLon;
    }

    public ArrayList<String> getUgeLigListe() {
        return this.ugeLigListe;
    }

    public void setUgeLigListe(String synsTest){
        ugeLigListe.add(synsTest);
    }
}
