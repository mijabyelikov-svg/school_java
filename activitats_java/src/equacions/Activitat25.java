package equacions;

public class Activitat25 {
    public static void main(String[] args) {
        
        // Notes
        double n1 = 8;
        double n2 = 10;
        double n3 = 9;

        // Percentatges de ponderacions
        double p1 = 0.2;
        double p2 = 0.3;
        double p3 = 0.5;

        double mitjaPonderada = (n1 * p1) + (n2 * p2) + (n3 * p3);

        System.out.println("Nota : " + mitjaPonderada);

        if (mitjaPonderada >= 5) {
            System.out.println("Aprovat.");
        }
        else {
            System.out.println("Suspes.");
        }


    }

}
