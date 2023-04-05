/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir 
entre sumar, restar, multiplicar y dividir. La aplicación debe tener una 
función para cada operación matemática y deben devolver sus resultados 
para imprimirlos en el main. 
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros");
        int num1 = leer.nextInt(), num2 = leer.nextInt(),res;
        System.out.println("MENU               Que desea hacer? \n" + "1 - Sumar \n" + "2 - Restar \n" + "3 - Multiplicar \n" + "4 - Dividir \n");
        int opc = leer.nextInt();
        switch (opc) {
            case 1:
                res = suma(num1, num2);
                System.out.println("La suma de " + num1 + "+" + num2 + "=" + res);
                break;
            case 2:
                res = resta(num1, num2);
                System.out.println("La resta de " + num1 + "-" + num2 + "=" + res);
                break;
            case 3:
                res = mult(num1, num2);
                System.out.println("La multiplicacion de " + num1 + "*" + num2 + "=" + res);
                break;
            case 4:
                res = div(num1, num2);
                System.out.println("La division de " + num1 + "/" + num2 + "=" + res);
                break;
            default:
                System.out.println("No es una opcion correcta");
        }
    }
    public static int suma(int num1, int num2) {
        int suma = num1+num2;
        return suma;
    }
    public static int resta(int num1, int num2) {
        int resta = num1-num2;
        return resta;
    }
    public static int mult(int num1, int num2) {
        int mult = num1*num2;
        return mult;
    }
    public static int div(int num1, int num2) {
        int div = num1/num2;
        return div;
    }

}
