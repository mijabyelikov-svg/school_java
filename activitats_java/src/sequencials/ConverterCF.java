package sequencials;
import java.util.Scanner;

public class ConverterCF {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("********************Cº/Fº Converter********************" + "\n");
        System.out.println("Select a mode:");
        System.out.println("(1) - Fahrenheit to Celcius");
        System.out.println("(2) - Celcius to Fahrenheit");

        int mode = input.nextInt();

        switch (mode) {
            case 1:
                System.out.println("Enter Fº: ");

                float f = input.nextFloat();
                System.out.print(convert_to_celcius(f) + "Cº");
                
                break;
            
            case 2:
                System.out.println("Enter Cº: ");

                float c = input.nextFloat();
                System.out.print(convert_to_fahrenheit(c) + "Fº");
                
                break;
            
            default:
                System.out.println("Invalid mode!");
                break;
        }
    }

    public static float convert_to_celcius(float f) {
        return (f - 32) * 5/9;
    }

    public static float convert_to_fahrenheit(float c) {
        return (c * 9/5) + 32;
    }
}   

