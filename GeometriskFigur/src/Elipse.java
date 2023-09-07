public class Elipse extends Cirkel {
    private double r2;

    public Elipse(double x, double y,double r1, double r2){
        super(x,y,r1);
        this.r2 = r2;
    }

    @Override
    public double getAreal() {
        return Math.PI * super.getRadius()* r2;
    }


}
