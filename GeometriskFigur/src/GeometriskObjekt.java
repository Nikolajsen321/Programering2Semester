public abstract class GeometriskObjekt {

    private double x;
    private double y;


    protected GeometriskObjekt(double x, double y){
        this.x = x;
        this.y = y;
    }


    public abstract double getAreal();


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
