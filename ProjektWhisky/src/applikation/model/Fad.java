package applikation.model;

public class Fad {
    private int fadNr;
    private String fadType;
    private int størrelse;
    private String lagerMidlertidligLokation;
    private boolean ledig;

    public Fad(int fadNr, String fadType, int størrelse, String lagerMidlertidligLokation) {
        this.fadNr = fadNr;
        this.fadType = fadType;
        this.størrelse = størrelse;
        this.lagerMidlertidligLokation = lagerMidlertidligLokation;
        this.ledig = true;
    }


    public int getFadNr() {
        return fadNr;
    }

    public boolean isLedig() {
        return ledig;
    }

    public void setLedig(boolean ledig) {
        this.ledig = ledig;
    }

    public String getFadType() {
        return fadType;
    }

    public int getStørrelse() {
        return størrelse;
    }

    public String getLagerMidlertidligLokation() {
        return lagerMidlertidligLokation;
    }
}
