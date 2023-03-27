/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima 
el número ingresado seguido de tantos asteriscos como indique su valor.
 */
package Ejercicios_Teoria.pkg2;

import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese 4 numeros");
        for (int i = 0; i < 4; i++) {

            num = leer.nextInt();
            System.out.print(num + ":");
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

}
