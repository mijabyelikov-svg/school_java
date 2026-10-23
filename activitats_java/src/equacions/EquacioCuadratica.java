package equacions;
import java.util.Scanner;
import java.lang.Math;

public class EquacioCuadratica {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter A: \n");
        double a = input.nextDouble();
        System.out.print("Enter B: \n");
        double b = input.nextDouble();
        System.out.print("Enter C: \n");
        double c = input.nextDouble();

        double determinant = Math.pow(b, 2) - 4 * a * c;

        double x_0 = 0;
        double x_1 = 0;

        if (determinant < 0) {
            System.out.print("No solution.");
        }

        else if (determinant == 0) {
            x_0 = -b / 2 * a;
            System.out.print("X = " + x_0);
        }
        else {
            x_0 = (-b + Math.sqrt(determinant)) / (2 * a);
            x_1 = (-b - Math.sqrt(determinant)) / (2 * a);

            System.out.print("X0 = " + x_0 + "\n");
            System.out.print("X1 = " + x_1);
        }

    }

}
