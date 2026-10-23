package sequencials;
import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter width: ");
        int w = input.nextInt();

        System.out.println("Enter height: ");
        int h = input.nextInt();

        int solution = (w + h) * 2;

        System.out.println("The perimeter of the rectangle is: " + solution);

    }
}
