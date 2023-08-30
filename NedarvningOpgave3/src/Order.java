import java.util.ArrayList;

public class Order {
    private int number;

    // vælget at lave ArrayList final så man ikke kan assigne variable til en anden
    // reference
    private final ArrayList<OrderLine> listOfOrderLine = new ArrayList<>();

    public Order(int number){
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public OrderLine createOrderLine(int lineNumber,int count){
        OrderLine orderLine = new OrderLine(lineNumber,count);
        ord
    }
}

