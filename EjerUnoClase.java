//Leer 2 numero para realizar una divisón. Si el segundo numero es cero escriba
// la division no es posible//

import java.util.Scanner;

public class EjerUnoClase {
    public static void main(String[] args) {
        double num1;
        double num2;
        double divi;

        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        num1 = lector.nextDouble();

        System.out.println("Ingrese el segundo numero");
        num2 = lector.nextDouble();

        if (num2 != 0) {
            divi = (num1 / num2);
            System.out.println("El resultado de la division es : " + divi);
        } else {
            System.out.println("La division no es posible");

        }

    }
}
