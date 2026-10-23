package equacions;
import java.util.Scanner;

public class Segurata {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: \n");
        int edat = input.nextInt();

        if (edat < 18) {
            System.out.print("You're underage! Access prohibited!");
        } else {
            System.out.print("You're allowed to enter!");
        }
        

    }
}
