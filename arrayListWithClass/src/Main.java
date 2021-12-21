import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer(1, "Esra", "Akat"));
        customers.add(new Customer(2, "Elif", "Akat"));
        customers.add(new Customer(3, "Eyüp", "Akat"));

        for (Customer customer:customers){
            System.out.println(customer.firstName);
        }
    }
}
