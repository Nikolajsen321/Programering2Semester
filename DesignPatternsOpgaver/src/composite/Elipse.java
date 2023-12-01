package composite;

import java.util.ArrayList;
import java.util.List;

public class Elipse extends GeometriskeFigur {


    private int radius1;
    private int radius2;
    private double areal;
    private String navn;

    public Elipse(int radius1, int radius2,String navn){
        this.radius1 = radius1;
        this.radius2 = radius2;
        this.navn =navn;
    }




    public int getRadius1() {
        return radius1;
    }

    public int getRadius2() {
        return radius2;
    }

    public void setRadius1(int radius1) {
        this.radius1 = radius1;
    }

    public void setRadius2(int radius2) {
        this.radius2 = radius2;
    }



    public String getNavn() {
        return navn;
    }


    public void setNavn(String string) {

    }






    public double getAreal() {
        areal = Math.PI * radius1 * radius2;
        return areal;
    }
}
