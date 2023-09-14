import java.util.ArrayList;

public class Order {
    private int number;

    private final ArrayList<OrderLine> listOfOrderLine = new ArrayList<>();


    public Order(int number){
        this.number = number;
    }

    public int getNumber() {
        return number;
    }


    public OrderLine createOrderLine(int lineNumber,int count,Produkt produkt){
        OrderLine orderLine = new OrderLine(lineNumber,count,produkt);
        listOfOrderLine.add(orderLine);
        number++;
        return orderLine;
    }

    public ArrayList<OrderLine> getOrderLines(){
        return new ArrayList<>(listOfOrderLine);
    }

    public double getOrderPris(){
        double pris = 0;
        for(OrderLine o : listOfOrderLine){
          pris += o.getOrderLinePris();
        }
        return pris;
    }
}

// vælget at lave ArrayList final så man ikke kan assigne variable til en anden
// reference