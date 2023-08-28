public class SommerHus extends Hus{
    private boolean beboet;

    public SommerHus(String adresse, int nr, int kvaGrund, String husNr,int kvadratMeter,boolean beboet){
        super(adresse,nr,kvaGrund,husNr,kvadratMeter);
        this.beboet = beboet;
    }

    @Override
    public int ejendomsVærdi(){
        return super.ejendomsVærdi() - 24;
    }

}
