import java.util.ArrayList;
import java.util.List;

public class SkoleOpg1 {
    private String navn;
    List<Studerende1> studerende1List = new ArrayList<>();

    public SkoleOpg1(String navn, List<Studerende1> studerende1List) {
        this.navn = navn;
        this.studerende1List = studerende1List;
    }


    public void addStuderende(Studerende1 studerende1){
        studerende1List.add(studerende1);
    }
    public void removeStuderende(Studerende1 studerende1){
        studerende1List.remove(studerende1);
    }

    public double gennemsnit(){
        double sumAlleKarakter = 0;
        double antalKarakter = 0;
        for(Studerende1 s: studerende1List){

           sumAlleKarakter += s.gennemsnitKarakter();
//            for(int i : s.getKarakter()){
//                sumAlleKarakter += i;
//                antalKarakter++;
//            }
        }
        return sumAlleKarakter / studerende1List.size();
    }

    public Studerende1 findStuderende(int studieNr){
        Studerende1 studerende1 = null;
        for(Studerende1 s : studerende1List){
            if(s.getStudieNr() == studieNr){
                return studerende1 = s;
            }
        }
        return studerende1;
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
                ", \nstuderendeList=" + studerende1List +
                '}' + "\n" +
                "Gennemsnit " + gennemsnit();
    }
}
