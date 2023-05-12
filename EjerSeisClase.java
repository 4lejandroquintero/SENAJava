//Leer tres numeros entreros a b c y mostrar el que sea multiplo de 7, si no lo es, escriba
//un mensaje "no es divisible por 7"

import  java.util.Scanner;

public class EjerSeisClase {
    public static void main (String[] args){
        int a;
        int b;
        int c;
        double mult1;
        double mult2;
        double mult3;

        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese numero");
        a = lector.nextInt();

        System.out.println("Ingrese numero");
        b = lector.nextInt();

        System.out.println("Ingrese numero");
        c = lector.nextInt();

        mult1 = a%7;
        mult2 = b%7;
        mult3 = c%7;

        if (mult1==0){
            System.out.println("Es multiplo de 7: " + " " + a);
             if (mult2==0){
                System.out.println("Es multiplo de 7: " + " " + b);
                if (mult3==0){
                    System.out.println("Es multiplo de 7: " + " " + c);
        }else {
            System.out.println("Ninguno es multiplo de 7");
            }
                }
            }
         }
}

