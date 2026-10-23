package funcions;

import java.util.Scanner;

public class recursivaPotencia {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter base: ");
        int b = s.nextInt();

        System.out.println("Enter exponent: ");
        int e = s.nextInt();

        System.out.println(b + "^" + e + " = " + power(b, e));
    }

    public static int power(int b, int e) {
        // 2^3 = 2 x 2^2 -> b^e = b * b^e - 1 -> b^e = b * power(b, e - 1)
        // 2^4 = 2^2 x 2^2 -> b^b/2 * b^b/2

        if (b == 0) {
            return 0;
        }
        else if (e == 0) {
            return 1;
        }
        
        return b * power(b, e - 1);    
     
        
    }
}
