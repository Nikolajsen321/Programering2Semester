public class PercentDiscount extends Discount{
    private int discountPercent;

    public PercentDiscount(int discountPercent){
        this.discountPercent = discountPercent;
    }


    @Override
    public void getDiscountPris(double pris) {
        double sum = pris * (100 - discountPercent);
    }


}
