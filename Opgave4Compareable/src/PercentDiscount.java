public class PercentDiscount implements Discount{
    private int discountPercent;

    public PercentDiscount(int discountPercent){
        this.discountPercent = discountPercent;
    }


    @Override
    public double getDiscountPris(double pris) {
       double sum;
       return sum = pris / 100 * (100-discountPercent);
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}
