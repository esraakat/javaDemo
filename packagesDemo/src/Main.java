import java.util.Scanner;
import maths.FourOperations;
import maths.Logarithm;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your name:");
        String name = scanner.nextLine();  //kullanıcının girdiği değeri oku
        System.out.println("Hello " + name);

        FourOperations fourOperations = new FourOperations();
        fourOperations.add(4,7);

        Logarithm logarithm = new Logarithm();

    }
}
