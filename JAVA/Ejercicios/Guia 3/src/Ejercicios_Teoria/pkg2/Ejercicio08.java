/*
Escriba un programa que valide si una nota está  entre 0 y 10, sino está  entre
0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
package Ejercicios_Teoria.pkg2;

import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int nota;
        boolean valid = false;

        while (!valid) {
            System.out.println("Ingrese una nota");
            nota = leer.nextInt();
            if (nota >= 0 && nota <= 10) {
                System.out.println("La nota es correcta");
                break;
            } else {
                System.out.println("La nota no es correcta");
            }
        }

    }

}
