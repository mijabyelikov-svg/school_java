package equacions;
import java.util.Scanner;

public class EntradesCine {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int entrades = input.nextInt();
        double preu = 5;
        double total = 0;

        if (entrades < 5) {
            total = 5;
        }
        else if (entrades >= 5 && entrades <= 7) {
            total = 4;
        }
        else if (entrades < 10) {
            total = 3;
        }
        else {
            total = preu * entrades;
        }
        
        System.out.print("El preu total es: " + total + " Euros.");

    }


}
