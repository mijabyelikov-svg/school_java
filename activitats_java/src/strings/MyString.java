package strings;

public class MyString {
    public static void main(String[] args) {
        
        String myName = "Hello World!";
        System.out.println(myName.indexOf("o"));
        System.out.println(myName.charAt(4));
        System.out.println(myName.length());
        System.out.println(myName.lastIndexOf("o"));
        System.out.println(myName.charAt(myName.length() - 1));
        System.out.println(myName.substring(6));
        System.out.println(myName.substring(0,5));
        System.out.println(myName.concat(" Goodbye!"));
        System.out.println(myName.toUpperCase());
        System.out.println(myName.toLowerCase());
        System.out.println(Text.getWordCount("abc dfg@kula"));
    }

}
