/*

 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio05 {

    public static void main(String[] args) {
        int[][] matrizA = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};
        int[][] matrizB = new int[3][3];

        llenarMatrices(matrizA, matrizB);
        if (comprobacion(matrizA, matrizB)) {
            System.out.println("Es una matriz antisimetrica");
        } else {
            System.out.println("No es una matriz antisimetrica");
        }
    }

    public static void llenarMatrices(int[][] matrizA, int[][] matrizB) {
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
//                matrizA[i][j] = (int) (Math.random() * 10);
                matrizB[j][i] = matrizA[i][j];
                System.out.print("  " + matrizA[i][j] + "  ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB.length; j++) {
                System.out.print("  " + matrizB[i][j] + "  ");
            }
            System.out.println(" ");
        }
    }

    public static boolean comprobacion(int[][] matrizA, int[][] matrizB) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizA[i][j] != -matrizB[i][j]) {
                   return false;
                }
            }
        }
        return true;
    }

}
