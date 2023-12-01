package composite;

import java.util.ArrayList;
import java.util.List;

public class FigurComposite extends GeometriskeFigur {
    private String navn;
    private List<GeometriskeFigur> listFigur = new ArrayList<>();


    public FigurComposite(String navn) {
        this.navn = navn;
    }

    public void add(GeometriskeFigur geometriskeFigur){
        listFigur.add(geometriskeFigur);
    }
    public void remove(GeometriskeFigur geometriskeFigur){
        listFigur.remove(geometriskeFigur);
    }


    public String getNavn() {
        String string ="";

        for(GeometriskeFigur figur : listFigur){
            string += figur.getNavn();
//            System.out.println(figur.getNavn());
        }

        return string;

    }



    public String tegn() {
        String string ="";

        for(GeometriskeFigur figur : listFigur){
            string += figur.tegn();
//            System.out.println(figur.getNavn());
        }

        return string;
    }



    public double getAreal() {
        double sum = 0;
        for(GeometriskeFigur figur : listFigur){
            sum += figur.getAreal();
        }
        return sum;
    }
}
