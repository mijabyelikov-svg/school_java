package bucles;
import java.util.Scanner;

public class Activitat18 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int n = 10;
        int x = 1;

        for (int i = 1; i <= n; i++) {
            System.out.println(2 * x * i - 1);
        }

    }

}
