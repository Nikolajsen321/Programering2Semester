import java.util.HashSet;
import java.util.Set;

public class Skole2 {
    private String navn;
    private Set<Studerende2> studerende2Set = new HashSet<>();

    public Skole2(String navn, Set<Studerende2> studerende2Set) {
        this.navn = navn;
        this.studerende2Set = studerende2Set;
    }


    public void addStuderende(Studerende2 studerende2){
        studerende2Set.add(studerende2);
    }
    public void removeStuderende(Studerende2 studerende2){
        studerende2Set.remove(studerende2);
    }

    public double gennemsnit(){
        double sumAlleKarakter = 0;
        double antalKarakter = 0;
        for(Studerende2 s: studerende2Set){
            sumAlleKarakter += s.gennemsnitKarakter();
//            for(int i : s.getKarakter()){
//                sumAlleKarakter += i;
//                antalKarakter++;
//            }
        }
        return sumAlleKarakter / studerende2Set.size();
    }

    public Studerende2 findStuderende(int studieNr){
        for(Studerende2 s : studerende2Set){
            if(s.getStudieNr() == studieNr){
                return s;
            }
        }
        return null;
    }


    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }


    @Override
    public String toString() {
        return "Skole{" +
                "avn='" + navn + '\'' +
                ", studerendeList=" + studerende2Set +
                '}'  +
                "Gennemsnit " + gennemsnit();
    }
}
