import java.time.LocalDate;
import java.time.OffsetDateTime;

public class AgeDiscount implements Discount {
    private LocalDate birthYear;




    public AgeDiscount(LocalDate birthYear){
        this.birthYear = birthYear;
    }

    @Override
    public double getDiscountPris(double pris){
        LocalDate currentYear = LocalDate.now();
        System.out.println(currentYear.getYear() - birthYear.getYear());
       return pris / 100 * (100 -  (currentYear.getYear() - birthYear.getYear()));
    }
}
