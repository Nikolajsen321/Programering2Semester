public class PercentDiscount extends Discount{
    private int discountPercent;

    public PercentDiscount(int discountPercent){
        this.discountPercent = discountPercent;
    }


    @Override
    public double getDiscountPris(double pris) {
        return getDiscountPris(pris) * (100-discountPercent);
    }


}
