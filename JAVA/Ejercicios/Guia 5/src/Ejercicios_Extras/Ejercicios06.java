/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, 
a medida que el usuario las va ingresando, construya una “sopa de letras para 
niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden 
horizontal en una fila que será seleccionada de manera aleatoria. Una vez 
concluida la ubicación de las palabras, rellene los espacios no utilizados con 
un número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras creada.

Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las 
siguientes funciones de Java substring(), Length() y Math.random().
 */
package Ejercicios_Extras;

import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicios06 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cont = 0;

        String[][] matrizPrincipal = new String[20][20];
        String[][] matrizPalabras = new String[5][2];

        generarPalabras(matrizPalabras, leer);
        colocarPalabra(matrizPrincipal, matrizPalabras);

    }

    public static void generarPalabras(String[][] matrizPalabras, Scanner leer) {

        for (int i = 0; i < 5; i++) {
            int filaN = (int) (Math.random() * 10) + (int) (Math.random() * 10);
            String filaT = String.valueOf(filaN);
            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    System.out.println("Ingrese una palabra entre 3 y 5 caracteres");
                    String palabra = leer.nextLine();
                    while (palabra.length() < 3 || palabra.length() > 5) {
                        System.out.println("Ingrese una palabra entre 3 y 5 caracteres");
                        palabra = leer.nextLine();
                    }
                    matrizPalabras[i][j] = palabra;
                }
                if (j == 1) {
                    while (filaT.equals(matrizPalabras[0][j]) || filaT.equals(matrizPalabras[1][j]) || filaT.equals(matrizPalabras[2][j]) || filaT.equals(matrizPalabras[3][j]) || filaT.equals(matrizPalabras[4][j])) {
                        filaN = (int) (Math.random() * 10) + (int) (Math.random() * 10);
                        filaT = String.valueOf(filaN);
                    }
                    matrizPalabras[i][j] = filaT;

                }
            }
        }

    }

    public static void colocarPalabra(String[][] matrizPrincipal, String[][] matrizPalabras) {
        int longitudP = 0, rand = 0, cont = 0, cont2 = 0;
        String palabra = "";
        boolean si;

        for (int i = 0; i < 20; i++) {
            if (i == Integer.valueOf(matrizPalabras[0][1]) || i == Integer.valueOf(matrizPalabras[1][1]) || i == Integer.valueOf(matrizPalabras[2][1]) || i == Integer.valueOf(matrizPalabras[3][1]) || i == Integer.valueOf(matrizPalabras[4][1])) {
                palabra = matrizPalabras[cont2][0].toUpperCase();
                longitudP = palabra.length();
                rand = (int) (Math.random() * 10);
                si = true;
                cont2++;
            } else {
                si = false;
            }
            for (int j = 0; j < 20; j++) {
                if (si) {
                    if (j > rand && j <= (rand + longitudP)) {
                        System.out.print(palabra.substring(cont, (cont + 1)) + " ");
                        cont++;
                    } else {
                        int rand2 = (int) (Math.random() * 10);
                        System.out.print(rand2 + " ");
                    }

                } else {
                    int rand2 = (int) (Math.random() * 10);
                    System.out.print(rand2 + " ");
                }
            }
            System.out.println("");
            cont = 0;

        }

    }
}
