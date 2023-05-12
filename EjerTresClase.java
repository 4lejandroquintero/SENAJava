//De 3 numero cualquiera, escribirlos en orden ascendente de menor a mayor

import java.util.Scanner;

public class EjerTresClase {
    public static void main (String[] args){

        int num1;
        int num2;
        int num3;

        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        num1 = lector.nextInt();

        System.out.println("Ingrese el segundo numero");
        num2 = lector.nextInt();

        System.out.println("Ingrese el tercer numero");
        num3 = lector.nextInt();

        if (num1 > num2){
            if (num1 > num3){
                if (num2 > num3){
                    System.out.println("Orden Ascendente es " + num3 + "" + num2 + "" + num1);
                    System.out.println("Orden Descendente es " + num1 + "" + num2 + "" + num3);
                }
                else {
                    System.out.println("Orden ascendente es " + num1 + "" + num3 + "" + num2);
                    System.out.println("Orden Descendente es " + num2 + "" + num3 + "" + num1);
                }

                }else {
                System.out.println("Orden ascendente es " + num2 + "" + num1 + "" + num3);
                System.out.println("Orden Descendente es " + num3 + "" + num1 + "" + num2);
            }

            }else {
            if (num2 > num3){
                if (num1 > num3){
                    System.out.println("Orden ascendente es " + num3 + "" + num1 + "" + num2);
                    System.out.println("Orden Descendente es " + num2 + "" + num1 + "" + num3);
                }else {
                    System.out.println("Orden ascendente es " + num1 + "" + num3 + "" + num2);
                    System.out.println("Orden Descendente es " + num2 + "" + num3 + "" + num1);
                }
            }else {
                System.out.println("Orden ascendente es " + num1 + "" + num2 + "" + num3);
                System.out.println("Orden Descendente es " + num3 + "" + num2 + "" + num1);
            }
        }
        }

    }




