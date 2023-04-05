/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A 
se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio04 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        llenarMatriz(matriz);
        System.out.println(" ");
        mostrarMatriz(matriz);

    }

    public static void llenarMatriz(int[][] matriz) {

        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz.length; j++) {
                matriz1[j] = (int) (Math.random() * 10);
                System.out.print("|" + matriz1[j] + "|");
            }
            System.out.println("");
        }
    }
    
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("|" + matriz[j][i] + "|");
            }
            System.out.println("");
        }
    }

}
