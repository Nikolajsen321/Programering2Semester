public class Produkt {
    private int number;
    private String name;
    private double unitPrice;

    private OrderLine orderLine;


    public Produkt(int number,String name,double unitPrice){
        this.number = number;
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setOrderLine(OrderLine orderLine){
        if(this.orderLine != orderLine){
            this.orderLine = orderLine;
        }
    }
}
