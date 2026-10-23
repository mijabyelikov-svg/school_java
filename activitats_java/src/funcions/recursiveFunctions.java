package funcions;
import java.util.Scanner;

public class recursiveFunctions {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number to get factorial:");
        int n = s.nextInt();
        System.out.println("Factorial of " + n + " is " + getFactorialRecursive(n));

    }

    public static long getFactorial(int num) {
        long accumulator = 1;

        for (int i = num; i > 0; i--) {
            accumulator *= i;
        }

        return accumulator;
    }

    public static long getFactorialRecursive(int num) {
        
        // N! = N * (N-1)!
        
        if (num == 0) {
            return 1;
        }
        else {
            return num * getFactorialRecursive(num - 1);
        }
    }

}
