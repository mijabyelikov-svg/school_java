package funcions;

public class recursiveParImpar {
    public static void main(String[] args) {
        System.out.println(even(3));
    }

    public static boolean even(int n) {
        if (n == 0) {
            return true;
        }
        return !odd(n);
    }

    public static boolean odd(int n) {
        if (n % 2 == 0) {
            return false;
        }
        return true;
    }
}
