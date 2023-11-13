import java.util.ArrayList;
import java.util.List;

public class Studerende2 {
    private int studieNr;
    private String navn;
    private List<Integer> karakter = new ArrayList<>();

    public Studerende2(int studieNr, String navn, List<Integer> karakter) {
        this.studieNr = studieNr;
        this.navn = navn;
        this.karakter = karakter;
    }

    public int getStudieNr() {
        return studieNr;
    }

    public void setStudieNr(int studieNr) {
        this.studieNr = studieNr;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void addKarakter(int karakter){
        this.karakter.add(karakter);
    }

    public List<Integer> getKarakter() {
        return new ArrayList<>(karakter);
    }

    public double gennemsnitKarakter(){
        double sum = 0;
        for(int k : karakter){
            sum+= k;

        }
        return sum / karakter.size();
    }


    @Override
    public String toString() {
        return "Studerende{" +
                "\nstudieNr=" + studieNr +
                ", \nnavn='" + navn + '\'' +
                ", \nkarakter=" + karakter +
                '}' + "\n";
    }
}
