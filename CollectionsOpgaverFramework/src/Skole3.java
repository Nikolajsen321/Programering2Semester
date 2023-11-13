import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Skole3 {
    private String navn;
    private Map<Integer,Studerende3> studerende3Map = new HashMap<>();

    public Skole3(String navn, Map<Integer,Studerende3> studerende3Map) {
        this.navn = navn;
        this.studerende3Map = studerende3Map;
    }


    public void addStuderende(Studerende3 studerende3){
        studerende3Map.put(studerende3.getStudieNr(),studerende3);
    }
    public void removeStuderende(Studerende3 studerende3){
        studerende3Map.remove(studerende3.getStudieNr());
    }

    public double gennemsnit(){
        double sumAlleKarakter = 0;
        double antalKarakter = 0;
        for(Studerende3 s: studerende3Map.values()){
            sumAlleKarakter += s.gennemsnitKarakter();
//            for(int i : s.getKarakter()){
//                sumAlleKarakter += i;
//                antalKarakter++;
//            }
        }
        return sumAlleKarakter / studerende3Map.size();
    }

    public Studerende3 findStuderende(int studieNr){

        return studerende3Map.get(studieNr);
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
                "\navn='" + navn + '\'' +
                ", \nstuderendeList=" + studerende3Map +
                '}' + "\n" +
                "Gennemsnit " + gennemsnit();
    }
}
