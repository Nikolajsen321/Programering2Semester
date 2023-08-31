public class Hus extends Beboelse {
    private String husNr;
    private int kvadratMeter;

    public Hus(String adresse,int nr,int kvaGrund, String husNr,int kvadratMeter){
        super(adresse,nr,kvaGrund );
        this.husNr = husNr;
        this.kvadratMeter = kvadratMeter;
    }

    public String getHusNr() {
        return husNr;
    }

    public int ejendomsVærdi(){
        int ejVærdi = super.getKvaGrund() * 290 + this.kvadratMeter * 40;
        return ejVærdi;
    }

    public int getKvadratMeter() {
        return kvadratMeter;
    }

    @Override
    public int ejVaerdi() {
        return 0;
    }
}
