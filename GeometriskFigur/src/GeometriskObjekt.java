public abstract class GeometriskObjekt {
    private double length;
    private double height;

    protected GeometriskObjekt(double length,double height){
        this.length = length;
        this.height = height;
    }


    public abstract double getAreal();

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }
}
