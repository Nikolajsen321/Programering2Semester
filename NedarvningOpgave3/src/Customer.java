import java.time.LocalDate;
import java.util.ArrayList;

public class Customer {
    private String name;
    private LocalDate birthDay;
    private ArrayList<Order> listOrder = new ArrayList<>();



    public Customer(String name,LocalDate birthDay){
        this.name = name;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public ArrayList<Order> getOrders(){
        return new ArrayList<>(listOrder);
    }

    public void addOrder(Order order){
        if(!listOrder.contains(order)){
            listOrder.add(order);
        }
    }
    public void removeOrder(Order order){
        if(listOrder.contains(order)){
            listOrder.remove(order);
        }
    }
}
