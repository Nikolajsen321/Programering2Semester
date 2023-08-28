public class Beboelse {
    private String adresse;
    private int nr;

    public Beboelse(String adresse,int nr){
        this.adresse = adresse;
        this.nr = nr;
    }

    public String getAdresse(){
        return this.adresse;
    }

    public void setAdresse(String adresse){
        this.adresse = adresse;
    }
}
