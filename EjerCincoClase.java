//Leer tres numero enteros x y z compararlos y si al menos dos son iguales escriba un mensaje
// que digan hacen pareja

import org.jcp.xml.dsig.internal.dom.DOMUtils;

import java.util.Scanner;

public class EjerCincoClase {
    public static void main (String[] args){
        int num1;
        int num2;
        int num3;

        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese numero");
        num1 = lector.nextInt();

        System.out.println("Ingrese numero");
        num2 = lector.nextInt();

        System.out.println("Ingrese numero");
        num3 = lector.nextInt();

        if ((num1 == num2) || (num1 == num3) || (num3 == num2)){
            System.out.println("Hacen pareja");
        }else {
            System.out.println("Ninguno hace pareja");
        }


    }
}
