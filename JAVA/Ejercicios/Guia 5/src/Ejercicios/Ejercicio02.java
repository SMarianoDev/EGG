/*
Realizar un algoritmo que llene un vector de tamaño N con valores 
aleatorios y le pida al usuario un número a buscar en el vector. 
El programa mostrará dónde se encuentra el numero y si se encuentra repetido.
 */
package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio02 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int[] vector = new int[10];
        int cont = 0;

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);
            System.out.print(vector[i]);
        }

        System.out.println("\nIngrese numero a buscar");
        int num = leer.nextInt();

        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                for (int contador : vector) {
                    if (contador == num) {
                        cont++;
                    }
                }
                System.out.println("El numero se encontro "+ cont + " veces.");
            }else{
                for (int j = 0; j < vector.length; j++) {
                    if (num == vector[j]) {
                        System.out.println("En la posicion "+ (j+1));
                    }
                }
            }
        }

    }

}
