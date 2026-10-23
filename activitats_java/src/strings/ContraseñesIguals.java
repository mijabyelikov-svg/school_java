package strings;
import java.util.Scanner;

public class ContraseñesIguals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.println("Please create a password: ");
        String pass1 = input.nextLine();

        System.out.println("Please enter your password again: ");
        String pass2 = input.nextLine();

        if (pass1.equals(pass2)) {
            System.out.println("Logged in successfully!");
        }
        else {
            System.out.println("Incorrect password!");
        }

    }



}
