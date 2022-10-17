import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        int a, b;

        System.out.print("Unesi prvi broj: ");
        a = input.nextInt();

        System.out.print("Unesi drugi broj: ");
        b = input.nextInt();

        System.out.printf("Izlaz +: %d\n", a + b);
        System.out.printf("Izlaz -: %d\n", a - b);
        System.out.printf("Izlaz *: %d\n", a * b);
        System.out.printf("Izlaz /: %d\n", a / b);
        System.out.printf("Izlaz mod: %d\n", a % b);
        

    }
}
