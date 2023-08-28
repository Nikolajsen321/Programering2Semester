public class SommerHus extends Hus{
    private String gamlePersonNavn;

    public SommerHus(String adresse, int nr, int kvaGrund, String husNr,int kvadratMeter,String gamlePersonNavn){
        super(adresse,nr,kvaGrund,husNr,kvadratMeter);
    }

    @Override
    public int ejendomsVærdi(){
        return super.ejendomsVærdi() - 24;
    }

}
