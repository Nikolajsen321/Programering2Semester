public class FixedDiscount implements Discount{
    private double fixedDiscount;
    private double discountLimit;


    public FixedDiscount(double fixedDiscount,double discountLimit){
        this.fixedDiscount = fixedDiscount;
        this.discountLimit = discountLimit;
    }

    @Override
    public double getDiscountPris(double pris){
        double sumPDiscountPris = 0;
        if(pris > discountLimit){
            sumPDiscountPris = pris - fixedDiscount;
        }
        return sumPDiscountPris;
    }


}
