package funcions;

import static java.lang.Math.pow;

public class algebraFunctions {
    
    public static void main(String[] args) {
        System.out.println(getRectanglePerimeter(10, 5));
        System.out.println(getCircleArea(10));
        getMultiplicationTable(11);
    }

    public static double getRectanglePerimeter(double w, double h) {
        return (w + h) * 2;
    }

    public static double getCircleArea(double radius) {
        return Math.PI * pow(radius, 2);
    }

    public static void getMultiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }

    }
    
}
