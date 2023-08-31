import java.time.LocalDate;
import java.util.ArrayList;

public class Customer {
    private String name;
    private LocalDate birthDay;
    private ArrayList<Order> listOrder = new ArrayList<>();
    private Discount discount;



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
        if(listOrder.contains(order)) {
            listOrder.remove(order);
        }
    }
    public double totalBuys(){
        double pris = 0;
        for(int i = 0; i < listOrder.size(); i++){
            pris += listOrder.get(i).getOrderPris();
        }
        return pris;
    }
    public double totalBuyWithDiscount(){
      return discount.getDiscountPris(totalBuyWithDiscount());
    }
}
