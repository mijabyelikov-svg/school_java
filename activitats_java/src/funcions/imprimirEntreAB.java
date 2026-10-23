package funcions;

import static java.lang.Math.max;

public class imprimirEntreAB {
    public static void main(String[] args) {
        printRange(-5, -5);
    }

    public static void printRange(int a, int b) {
        
        if (max(a, b) == a) {
            for (int i = a; i >= b; i--) {
            System.out.println(i);
            }
        }
        else {
            for (int i = a; i <= b; i++) {
            System.out.println(i);
            }
        }

    }
}
