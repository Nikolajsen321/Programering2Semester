import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Biblotek {
    public int beregnBode(LocalDate beeregnsdato, LocalDate faktiskDato, boolean voksen){
        long dage = ChronoUnit.DAYS.between(beeregnsdato,faktiskDato);
        long month = ChronoUnit.MONTHS.between(beeregnsdato,faktiskDato);

        if (dage >= 0 && month >= 0) {
        if(voksen) {
                if (month == 0 && dage < 15) {
                    return dage <= 7 ? 20 : 60;
                } else {
                    return dage >= 15 ? 90 : 90;
                }
            } else {
                if (month == 0 && dage < 15) {
                    return dage <= 7 ? 10 : 30;
                } else {
                    return dage >= 15 ? 45 : 45;
                }
            }
        }else {
            String string = "beregnet dage kan ikke være større end faktiske ";
            throw new RuntimeException(string);
        }

    }
}
