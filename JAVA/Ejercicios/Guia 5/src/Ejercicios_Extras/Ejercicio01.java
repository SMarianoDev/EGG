/*
Realizar un algoritmo que calcule la suma de todos los elementos 
de un vector de tamaño N, con los valores ingresados por el usuario.
 */
package Ejercicios_Extras;

import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio01 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamaño de vector");
        int n = leer.nextInt();
        int[] vector = new int[n];
        llenarVector(vector, n, leer);
        int total = sumaVector(vector, n);
        System.out.println("El total es de: " + total);
    }

    public static void llenarVector(int[] vector, int n, Scanner leer) {

        for (int i = 0; i < n; i++) {
            vector[i] = leer.nextInt();
        }
    }

    public static int sumaVector(int[] vector, int n) {
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += vector[i];
        }
        return suma;
    }

}
