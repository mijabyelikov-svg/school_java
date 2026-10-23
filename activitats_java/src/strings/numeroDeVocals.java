package strings;
import java.lang.reflect.Array;
import java.util.Scanner;

public class numeroDeVocals {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a word: ");
        String word = input.nextLine();

        char[] vocalsList = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        int vocals = 0;

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < vocalsList.length; j++) {
                if (word.charAt(i) == vocalsList[j]) {
                    vocals++;
                }
            }            

        }
        
        System.out.println("Vocals totals: " + vocals);


    }
}
