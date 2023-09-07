public class Kvadrat extends GeometriskObjekt{
    private double brede;

    public Kvadrat(double x, double y,double brede){
        super(x,y);
        this.brede = brede;
    }


    @Override
    public double getAreal(){
        return  Math.pow(brede,2);
    }

    public double getBrede() {
        return brede;
    }
}
