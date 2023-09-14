public interface Discount {

    /*
    Interface minder om en abstrakt klasse men dens intent er at specificere almindelig opførelse for objekter
    af en relateret eller urelateret klasse
    Kan bruge interface stort set på samme måde som en abstrakt
     fx kan bruge en interface som en data type reference variable, som resultat ved casting osv.
    Som ved abstrakt kan ikke lave en interface instans ved new operator
    fordele ved interface man kan lave multiple arv
    ingen consturcor i en interface da de en interface er public static by default  altså
    er de konstanter  og ingen data felter som kan initaliseres gennem konstruktor
    interfaces deles i alle instanser
     */

    public  double getDiscountPris(double pris);  // laver et interface
}
