public class Reaktangel extends Kvadrat {
    private double længde;

    public Reaktangel(double x, double y,double brede,double længde){
        super(x,y,brede);
        this.længde = længde;

    }
    @Override
    public double getAreal(){
        return super.getBrede() * længde;
    }
}
