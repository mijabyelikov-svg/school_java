package funcions;

public class countdown {
    public static void main(String[] args) {
        countdown(5);
    }

    public static void countdown(int n) {
        if (n <= 0) {
            System.out.println("BOOM!");
        }
        else {
            System.out.println(n);
            countdown(n - 1);
        }

    }

}
