package ordination;

import java.util.ArrayList;

public class Patient {
    private String cprnr;
    private String navn;
    private double vaegt;
    private ArrayList<Ordination> ordinations = new ArrayList<>();



    public Patient(String cprnr, String navn, double vaegt,ArrayList<Ordination> ordinations) {
        this.cprnr = cprnr;
        this.navn = navn;
        this.vaegt = vaegt;
        this.ordinations = ordinations;
    }

    public String getCprnr() {
        return cprnr;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public double getVaegt(){
        return vaegt;
    }

    public void addOrdanition(Ordination ordination){
        if(!ordinations.contains(ordination)){
            addOrdanition(ordination);
        }
    }

    public void removeOrdanition(Ordination ordination){
        if(ordinations.contains(ordination)){
            ordinations.remove(ordination);
        }
    }



    public void setVaegt(double vaegt){
        this.vaegt = vaegt;
    }


    public ArrayList<Ordination> getOrdinations(){
        return new ArrayList<>(ordinations);
    }

    @Override
    public String toString(){
        return navn + "  " + cprnr;
    }

}
