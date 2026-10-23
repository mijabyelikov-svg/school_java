package equacions;
import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter A: \n");
        double a = input.nextDouble();
        System.out.print("Enter B: \n");
        double b = input.nextDouble();

        if (a < b) {
            System.out.print("Min: " + a);
        }
        else {
            System.out.print("Min: " + b);
        }
    }

}
