package bucles;
import java.util.Scanner;

public class ExempleBreak2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        double num = 0;
        double sum = 0;

        int counter = 0;

        do {
            
            counter++;

            System.out.println("Enter a number:");
            num = scanner.nextDouble();
            sum += num;

            System.out.println("\nDo you wish to continue?\n(y) - Yes\n(n) - No");

            char choice = scanner.next().charAt(0);

            if (choice == 'y') {
                continue;
            }
            else {
                System.out.println("\nProgram stopped.\n");
                System.out.println("Total sum: " + sum);
                System.out.println("Average: " + sum/counter);
                break;
            }


        } while (running == true);

    }
}
