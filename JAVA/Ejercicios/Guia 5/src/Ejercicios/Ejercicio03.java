/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio03 {

    public static void main(String[] args) {

        int[] vector = new int[5];
        llenarVector(vector);
        mostrarVector(vector);
        cantDigitos(vector);

    }

    public static void llenarVector(int[] vector) {

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10500);
        }
    }

    public static void mostrarVector(int[] vector) {
        for (int i : vector) {
            System.out.print(i+"-");
        }
    }

    public static void cantDigitos(int[] vector) {
        int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
        for (int i : vector) {
            String num = String.valueOf(i);
            int cant = num.length();
            switch (cant) {
                case 1:
                    cont1++;
                    break;
                case 2:
                    cont2++;
                    break;
                case 3:
                    cont3++;
                    break;
                case 4:
                    cont4++;
                    break;
                case 5:
                    cont5++;
                    break;
            }
        }
        System.out.println("\nNumeros de 1 digito: " + cont1);
        System.out.println("Numeros de 2 digito: " + cont2);
        System.out.println("Numeros de 3 digito: " + cont3);
        System.out.println("Numeros de 4 digito: " + cont4);
        System.out.println("Numeros de 5 digito: " + cont5);
    }

}
