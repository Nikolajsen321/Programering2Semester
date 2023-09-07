public class Cirkel extends GeometriskObjekt {
    private double radius;


    public Cirkel(double x ,double y,double radius){
        super(x,y);
    }


    @Override
    public double getAreal() {
        return Math.PI * Math.pow(radius,2);
    }

    public double getRadius() {
        return radius;
    }
}
