/*
Crea una aplicación que nos pida un número por teclado y con una función
se lo pasamos por parámetro para que nos indique si es o no un número primo,
debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
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
        while (true) {

            System.out.println("Ingrese un numero");
            int num = leer.nextInt();

            if (primo(num)) {
                System.out.println("es primo");

            } else {
                System.out.println("no es primo");
            }
        }

    }

    public static boolean primo(int num) {
        int cont = 0;
        for (int i = 0; i < num + 1; i++) {
            if (i == 0) {
            } else if (num % i == 0) {
                cont++;
            }
        }
        String numCadena = String.valueOf(cont);

        boolean resultado = numCadena.equalsIgnoreCase("2");
        return resultado;
    }

}
