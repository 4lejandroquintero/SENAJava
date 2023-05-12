//Leer un numero y escribir su raiz cuadrada, si el numero es menor que cero escribir un mensaje
// el numero tiene raiz imaginaria

import java.util.Scanner;

public class EjerDosClase {
    public static void main (String[] args){
        double num;
        double raiz;

        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese el numero ");
        num = lector.nextDouble();

        if (num > 0){
            raiz = Math.sqrt(num);
            System.out.println("La raiz del numero es: " + raiz);
        }else {
            System.out.println("El numero tiene raiz imaginaria");
        }

    }
}
