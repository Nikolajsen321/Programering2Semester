import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Customer [] listCustomer = new Customer[3];

        Customer c1 = new Customer("Mikkel","Bang",45);
        Customer c2 = new Customer("Niels","Bang",20);
        Customer c3 = new Customer("Loshan","Bang",300);

        listCustomer[0] = c1;
        listCustomer[1] = c2;
        listCustomer[2] = c3;

//        Arrays.sort(listCustomer);

        System.out.println(lastCustomer(listCustomer).toString());
        System.out.println();

        System.out.println(Arrays.toString( afterCustomer(listCustomer,c3)));

//        List<Customer> list = Arrays.asList(listCustomer);
//        Collections.sort(list);

    }

    private static Customer[] afterCustomer(Customer[] listCustomer, Customer customer) {
        Customer[] customers = null;
        Customer temp = customer;
        int størreEndAntal = 0;
        for(int i = 0; i < listCustomer.length; i++){
            if(listCustomer[i].compareTo(customer) > 0){
                størreEndAntal++;
            }
        }
        customers = new Customer[størreEndAntal];
        for(int i = 0; i < customers.length; i++){
            if(listCustomer[i].compareTo(customer) > 0){
                customers[i] = listCustomer[i];
                System.out.println(listCustomer[i].compareTo(customer));
            }
        }
//        System.out.println(størreEnd);
        return customers;
    }

    private static Customer lastCustomer(Customer[] listCustomer) {
        Customer customer = listCustomer[0];
        for(Customer c: listCustomer){
            if(c.compareTo(customer) > 0){
                customer = c;
            }
        }
        return customer;

    }
}