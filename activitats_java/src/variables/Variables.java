package variables;

public class Variables {
    public static void main(String[] args) {
        
        String name = "Mijail";
        String surname1 = "Byelikov";
        String surname2 = "Shvidak";
        int age = 16;
        float height = 1.72f;
        String studies = "1Batx";
        char myClass = 'E';
        boolean isLegalAge = false;

        if (age >= 18) {
            isLegalAge = true;
        }

        System.out.print("Name: " + name + " " + surname1 + " " + surname2 + "\n");
        System.out.print("Age: " + age + "\n");
        System.out.print("Height: " + height + "cm\n");
        System.out.print("Class: " + studies + myClass + "\n");
        System.out.print("Is legal age: ");

        if (isLegalAge == true) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }



    }

}
