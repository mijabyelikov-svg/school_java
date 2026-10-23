package bucles;
import java.util.Scanner;

public class Producte {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter A: ");
        int a = input.nextInt();
        System.out.println("Enter B: ");
        int b = input.nextInt();

        int product = 0;

        for (int i = 1; i <= b; i++) {
            product += a;
        }

        System.out.println(a + " x " + b + " = " + product);

    }
}
