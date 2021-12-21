import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList numbers = new ArrayList();
        numbers.add(1);
        numbers.add(56);
        numbers.add("İstanbul");
        System.out.println(numbers.size());
        System.out.println(numbers.get(2));
        System.out.println(numbers.set(0,100));
        numbers.remove(0);
        numbers.clear();

        for (Object number:numbers)
        {
            System.out.println(number);
        }
    }
}
