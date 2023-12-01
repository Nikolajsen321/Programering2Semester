package composite;

public class Trekant extends GeometriskeFigur {
    private double højde;
    private double grundLinje;
    private String navn;


    public Trekant(String navn,double højde, double grundLinje) {
        this.navn = navn;
        this.højde = højde;
        this.grundLinje = grundLinje;

    }

    public double getAreal() {
        double areal = 0.5 * højde * grundLinje;
        return areal;
    }


    public String getNavn() {
        return navn;

    }

    public String tegn(){
        return navn;
    }

    public double getHøjde() {
        return højde;
    }

    public void setHøjde(int højde) {
        this.højde = højde;
    }

    public double getGrundLinje() {
        return grundLinje;
    }

    public void setGrundLinje(int grundLinje) {
        this.grundLinje = grundLinje;
    }
}
