package bucles;
import java.util.Scanner;

public class Activitat22 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int pos = 0;
        int neg = 0;
        int odd = 0;
        int even = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter number " + i + ": ");
            int num = input.nextInt();

            if (num >= 0) {
                pos++;
            }
            else {
                neg++;
            }

            if (num % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }

        }
        
        System.out.println("\n" + "Positives: " + pos + "\nNegatives: " + neg + "\nEvens: " + even + "\nOdds: " + odd);

    }

}
