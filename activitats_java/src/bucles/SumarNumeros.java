package bucles;
import java.util.Scanner;

public class SumarNumeros {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter how many numbers you want to sum: ");
        int numSuma = input.nextInt();
        int suma = 0;

        for (int i = 1; i <= numSuma; i++) {
            System.out.println("Enter number " + i + ": ");
            int num = input.nextInt();
            suma += num;
        }
        System.out.println("Total sum: " + suma);

    }

}
