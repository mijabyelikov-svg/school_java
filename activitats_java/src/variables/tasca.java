package variables;
import java.util.Scanner;

public class tasca {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String name;
        String surname;
        int age;
        float height;
        String studies;
        char myClass;
        boolean isLegalAge = false;

        System.out.print("Enter Name: ");
        name = input.next();
        System.out.print("Enter Surname: ");
        surname = input.next();
        System.out.print("Enter Age: ");
        age = input.nextInt();
        System.out.print("Enter Height(meters): ");
        height = input.nextFloat();
        System.out.print("Enter Studies: ");
        studies = input.next();
        System.out.print("Enter Class: ");
        myClass = input.next().charAt(0);

        if (age >= 18) {
            isLegalAge = true;
        }

        System.out.print("\n\n\n");
        System.out.print("Name: " + name + " " + surname + "\n");
        System.out.print("Age: " + age + "\n");
        System.out.print("Height: " + height + "m\n");
        System.out.print("Class: " + studies + myClass + "\n");
        System.out.print("Is legal age: ");

        if (isLegalAge == true) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }



    }

}
