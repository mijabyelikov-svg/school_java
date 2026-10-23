package funcions;

public class funcioImprimirN {
    public static void main(String[] args) {
        String s = "bread";
        System.out.println(s + " - (main)");
        printS(s);
        System.out.println(s + " - (main)");
    }

    public static void printS(String s) {
        System.out.println(s + " - (function)");
        s = s.toUpperCase();
        System.out.println(s + " - (function)");
    }
}
