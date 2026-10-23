package strings;

import java.util.ArrayList;

public class Text {

    public static boolean isSeparator(char c) {
        
        char[] separators = {
        ' ', 
        '.', ',', ';', ':', '!', '?',
        '-', '_',
        '"', '`',
        '(', ')', '[', ']', '{', '}',
        '<', '>',
        '/', '\\', '|',
        '@', '#', '$', '%', '^', '&', '*',
        '+', '=', '~',
        '…', '·',
        '¿', '¡',
        '©', '®', '™',
        '°', '§', '¶',
        '€', '£', '¥', '¢',
        '§', '¬'};
        
        for (int i = 0; i < separators.length; i++) {
            if (c == separators[i]) {
                return true;
            }
        }

        return false;
    }

    public static String[] getWords(String s) {

        int wordStart = 0;

        ArrayList<String> names = new ArrayList<String>();

        for (int i = wordStart; i < s.length(); i++) {
            
            String name = null;

            if (isSeparator(s.charAt(i))) {
                name = s.substring(wordStart, i);
                wordStart = i + 1;
            }
            else if (i == s.length() - 1) {
                name = s.substring(wordStart, s.length());
            }

            if (name != null && name.isBlank() == false) {
                names.add(name);                    
            }

        }

        
        return names.toArray(new String[0]);

    }

    public static int getWordCount(String s) {
        return getWords(s).length;
    }

}
