package funcions;

public class primeraFuncio {

    public static void main(String[] args) {
        printNumsFromTo(0, 100000);
    }

    public static void printNumsFromTo(int begin, int end) {

        for (int i = begin; i <= end; i++) {
            System.out.println(i);
        }

    }

}
