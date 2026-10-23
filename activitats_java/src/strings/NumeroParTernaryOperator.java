package strings;
import java.util.Scanner;

public class NumeroParTernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        String msg = (num % 2 == 0) ? "Par." : "Impar.";

        System.out.println(msg);

    }
}
