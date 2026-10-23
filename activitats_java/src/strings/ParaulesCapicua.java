package strings;
import java.util.Scanner;

public class ParaulesCapicua {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = input.nextLine();

        boolean capicua = true;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                capicua = false;
                break;
            }
        }

        if (capicua) {
            System.out.println("Es capicua.");
        }
        else {
            System.out.println("No es capicua.");
        }

    }
}
