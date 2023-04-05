/*

 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio06 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dimension de matriz");
        int n = leer.nextInt();
//        int[][] matriz = {{2,7,6},{9,5,1},{4,3,8}};
        int[][] matriz = new int[n][n];

        llenarMatriz(matriz, n, leer);
        boolean bandera = esMagica(matriz, n);

        if (bandera) {
            System.out.println("Es magica");
        } else {
            System.out.println("No es magica");
        }

    }

    public static void llenarMatriz(int[][] matriz, int n, Scanner leer) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("fila: " + (i + 1) + " colum: " + (j + 1));
                matriz[i][j] = leer.nextInt();
                while (matriz[i][j] < 0 || matriz[i][j] >= 10) {
                    System.out.println("Ingrese numeros entre 0 y 9");
                    matriz[i][j] = leer.nextInt();
                }
            }
        }
    }

    public static boolean esMagica(int[][] matriz, int n) {
        int sumaD1 = 0, sumaD2 = 0;
        int[] lineas = new int[n];
        int[] columnas = new int[n];
        for (int i = 0; i < n; i++) {
            int sumaF = 0, sumaC = 0;
            for (int j = 0; j < n; j++) {
                lineas[i] = sumaF += matriz[i][j];
                columnas[i] = sumaC += matriz[j][i];
                if (i == j) {
                    sumaD1 += matriz[i][j];
                }
                if (i + j == n - 1) {
                    sumaD2 += matriz[i][j];
                }
            }
            System.out.println("Suma Fila " + (i + 1) + ": " + sumaF);
            System.out.println("Suma columna " + (i + 1) + ": " + sumaC);
            if (i == n - 1) {
                System.out.println("Suma de diagonal 1:" + sumaD1);
                System.out.println("Suma de diagonal 2:" + sumaD2);
            }
            System.out.println("");
            if (i == 0 && sumaF != sumaC) {
                return false;
            }
            if (i > 0 && lineas[i - 1] != sumaF) {
                return false;
            } else if (i > 0 && columnas[i - 1] != sumaC) {
                return false;
            } else if (i > (n - 1) && sumaD1 != sumaF) {
                return false;
            } else if (i > (n - 1) && sumaD2 != sumaC) {
                return false;
            }
        }
        return true;
    }

}
