public class  Beboelse {
    private String adresse;
    private int nr;
    private int kvaGrund;

    public  Beboelse(String adresse,int nr,int kvaGrund){
        this.adresse = adresse;
        this.nr = nr;
        this.kvaGrund = kvaGrund;
    }

    public String getAdresse(){
        return this.adresse;
    }

    public int getKvaGrund() {
        return kvaGrund;
    }

    public void setAdresse(String adresse){
        this.adresse = adresse;
    }
}
