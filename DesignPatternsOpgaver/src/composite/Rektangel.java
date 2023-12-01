package composite;

public class Rektangel extends GeometriskeFigur {
    private int længde;
    private int brede;

    private String navn;

    public Rektangel(String navn,int længde, int brede) {
        this.længde = længde;
        this.brede = brede;
        this.navn = navn;
    }


    public double getAreal() {
        double areal =  længde * brede;
        return areal;
    }

    public String getNavn() {
        return navn;
    }



    public int getLængde() {
        return længde;
    }

    public void setLængde(int længde) {
        this.længde = længde;
    }

    public int getBrede() {
        return brede;
    }

    public void setBrede(int brede) {
        this.brede = brede;
    }
}
