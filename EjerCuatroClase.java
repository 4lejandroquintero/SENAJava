//Leer 4 numero y escribir el mayor de ellos

import java.util.Scanner;

public class EjerCuatroClase {
    public static void  main (String[] args){
        int a;
        int b;
        int c;
        int d;

        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        a = lector.nextInt();

        System.out.println("Ingrese un numero: ");
        b = lector.nextInt();

        System.out.println("Ingrese un numero: ");
        c = lector.nextInt();

        System.out.println("Ingrese un numero: ");
        d = lector.nextInt();

        if ((a > b) && (a > c) && (a > d)){
            System.out.println("El numero mayor es " + a);
        }if ((b > a) && (b > c) && (b > d)){
            System.out.println("El numero mayor es " + b);
        }if ((c > a) && (c > b) && (c > d)){
            System.out.println("El numero mayor es " + c);
        }if ((d > a) && (d > b) && (d > c)){
            System.out.println("El numero mayor es " + d);
        }
    }
}
