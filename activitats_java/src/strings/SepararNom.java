package strings;

import java.util.Scanner;

public class SepararNom {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        String[] words = Text.getWords(fullName);
       
        for (int i = 0; i < words.length; i++) {
            
            String prefix = null;
            
            if (i == 0) {
                prefix = "Name";
            }
            else {
                prefix = "Surname " + i;
            }

            System.out.printf("%n%s: %s", prefix, words[i]);

        }

    }
}
