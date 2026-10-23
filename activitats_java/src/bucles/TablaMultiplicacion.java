package bucles;

import java.util.Scanner;

public class TablaMultiplicacion {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter table: ");
        int table = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(table + " x " + i + " = " + (table * i));
        }

    }

}
