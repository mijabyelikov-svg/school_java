package funcions;

public class fibonacciFunction {
    public static void main(String[] args) {
        System.out.println(fibonacci(7));
    }

    public static int fibonacci(int n) {
        //F(n) = F(n-2) + F(n - 1) -- F(0) = 1, F(1) = 1

        if (n == 0 || n == 1) {
            return 1;
        }
        return fibonacci(n - 2) + fibonacci(n - 1);

    }

}
