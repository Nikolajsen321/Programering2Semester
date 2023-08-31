import java.util.ArrayList;
import java.util.Date;

public class SynsMand {
    private ArrayList<String> ugeLigListe = new ArrayList<>();

    public SynsMand(String navn, String adresse, Date svendePrøveÅr, int timeLøn, ArrayList<String> ugeLigListe){
        super(navn,adresse,svendePrøveÅr,timeLøn);
        this.ugeLigListe = ugeLigListe;
    }

    @Override
    public int beregnUgeLon(){
        int ugeLon = super.beregnUgeLon() + (29 * ugeLigListe.size());
        return ugeLon;
    }

    public ArrayList<String> getUgeLigListe() {
        return this.ugeLigListe;
    }

    public void setUgeLigListe(String synsTest){
        ugeLigListe.add(synsTest);
    }
}
