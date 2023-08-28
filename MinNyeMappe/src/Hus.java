public class Hus extends Beboelse {
    private String husNr;
    private int kvadratMeter;

    public Hus(String adresse,int nr, String husNr,int kvadratMeter){
        super(adresse,nr );
        this.husNr = husNr;
        this.kvadratMeter = kvadratMeter;
    }

    public String getHusNr() {
        return husNr;
    }

    public int getKvadratMeter() {
        return kvadratMeter;
    }
}
