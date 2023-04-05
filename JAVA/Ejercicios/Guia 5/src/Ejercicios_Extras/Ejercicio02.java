/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales 
(la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
 */
package Ejercicios_Extras;

import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese tamaño de vector");
        int n = leer.nextInt();

//        int[] vectorA = {1, 2, 3, 4, 5};
//        int[] vectorB = {1, 2, 3, 4, 5};
        int[] vectorA = new int[n];
        int[] vectorB = new int[n];
        llenarVector(vectorA, vectorB, leer, n);

        if (compararVectores(vectorA, vectorB, n)) {
            System.out.println("Los vectores son iguales");
        } else {
            System.out.println("Los vectores NO son iguales");
        }

    }

    public static void llenarVector(int[] vectorA, int[] vectorB, Scanner leer, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("VectorA - Posicion: " + (i + 1));
            vectorA[i] = leer.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("VectorB - Posicion: " + (i + 1));
            vectorB[i] = leer.nextInt();
        }
    }

    public static boolean compararVectores(int[] vectorA, int[] vectorB, int n) {

        for (int i = 0; i < n; i++) {
            if (vectorA[i] != vectorB[i]) {
                return false;
            }
        }
        return true;
    }
}
