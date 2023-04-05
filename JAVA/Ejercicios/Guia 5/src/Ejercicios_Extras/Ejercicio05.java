/*
Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios y muestre la suma de sus elementos.
 */
package Ejercicios_Extras;

import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio05 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Numero de filas");
        int n = leer.nextInt();
        System.out.println("Numero de columnas");
        int m = leer.nextInt();
        int[][] matriz = new int[n][m];

        int total = llenarMatriz(matriz, n, m);
        System.out.println("La suma es de: " +total);
    }

    public static int llenarMatriz(int[][] matriz, int n, int m) {
        int suma = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                System.out.print("[ " + matriz[i][j] + " ]");
                suma += matriz[i][j];
            }
            System.out.println("");
        }
        return suma;
    }

}
