import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Produkt produkt1 = new Produkt(10,"Pepsi Max dåser",1000000);
        Produkt produkt2 = new Produkt(-10,"Dårlige coca cola",-100000);
        Produkt produkt3 = new Produkt(10,"Ritter Sport ",10);
        Produkt produkt4 = new Produkt(20,"Sæbe prdok",100);
        Produkt produkt5 = new Produkt(30,"DåseMad",1000);

        PercentDiscount percentDiscount = new PercentDiscount(15);
        FixedDiscount fixedDiscount = new FixedDiscount(250,1000);

        Customer customer1 = new Customer("Hans", LocalDate.of(1900,11,11),percentDiscount);
        Customer customer2 = new Customer("Jens",LocalDate.of(2000,10,11),fixedDiscount);



        Order order1 = new Order(0);
        customer1.addOrder(order1);
        OrderLine orderLine1 = order1.createOrderLine(1010320,1,produkt1);
        OrderLine orderLine2 = order1.createOrderLine(10333000,1,produkt2);

        Order order2 = new Order(0);
        OrderLine orderLine3 = order2.createOrderLine(1232321,10,produkt3);
        OrderLine orderLine4 = order2.createOrderLine(13142424,134,produkt4);


        System.out.println( customer1.totalBuyWithDiscount());



        System.out.println(customer1.totalBuys());





    }
}