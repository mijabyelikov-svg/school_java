package strings;
import java.util.Scanner;

public class QuantitatDeA {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a word: ");
        String word = input.nextLine();

        int totalA = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'A') {
                totalA++;
            }
        }

        System.out.println("The word has " + totalA + " A's.");

    }
}
