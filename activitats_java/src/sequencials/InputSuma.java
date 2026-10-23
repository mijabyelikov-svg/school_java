package sequencials;
import java.util.Scanner;

public class InputSuma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter A");
        int num_a = input.nextInt();

        System.out.println("Enter B");
        int num_b = input.nextInt();


        int sum = num_a + num_b;

        System.out.print("" + num_a + " + " + "" + num_b + " = " + sum);

    }
}
