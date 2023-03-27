/*
Implementar un programa que le pida dos números enteros al usuario 
y determine si ambos o alguno de ellos es mayor a 25.
 */
package Ejercicios_Teoria.pkg2;

import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese 2 numeros enteros");
        int num1 = leer.nextInt(), num2 = leer.nextInt();

        if (num1 > 25 && num2 > 25) {
            System.out.println("Ambos son mayor a 25");
        } else if (num1 > 25) {
            System.out.println("Numero 1 es mayor a 25");
        } else if (num2 > 25) {
            System.out.println("Numero 2 es mayor a 25");
        }else{
            System.out.println("Ninguno es mayor a 25");
        }
    }

}
