package funcions;

public class afegirIva {
    public static void main(String[] args) {
        
        System.out.println(addIVA(50, 21));

    }

    public static float addIVA(float preu, float ivaPercentage) {
        float iva = 1 + ivaPercentage/100;
        
        return preu * iva;

    }

}
