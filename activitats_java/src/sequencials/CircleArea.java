package sequencials;
import java.util.Scanner;

import static java.lang.Math.PI;

public class CircleArea {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        double radius = input.nextDouble();

        double solution = PI * radius * radius;

        System.out.println("The area of the circle is: " + solution);


    }
}
