package strings;
import java.util.Scanner;

public class ContraseñesIgualsSenseEqual {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.println("Please create a password: ");
        String pass1 = input.nextLine();

        System.out.println("Please enter your password again: ");
        String pass2 = input.nextLine();

        boolean equal = true;

        if (pass1.length() != pass2.length()) {
            equal = false;
        }


        for (int i = 0; i < pass1.length(); i++) {
            if (pass1.charAt(i) != pass2.charAt(i)) {
                equal = false;
                break;
            }
        }

        if (equal) {
            System.out.println("Logged in successfully!");
        }
        else {
            System.out.println("Incorrect password!");
        }

    }



}
