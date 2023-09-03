public class FixedDiscount extends Discount{
    private int fixedDiscount;
    private int discountLimit;


    public FixedDiscount(int fixedDiscount,int discountLimit){
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
