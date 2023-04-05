/*
Diseñe una función que pida el nombre y la edad de N personas e imprima 
los datos de las personas ingresadas por teclado e indique si son 
mayores o menores de edad. Después de cada persona, el programa debe 
preguntarle al usuario si quiere seguir mostrando personas y frenar 
cuando el usuario ingrese la palabra “No”.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        while (true) {
            int personas = (int) (Math.random() * 10);
            System.out.println(personas);
            datos(personas);
            System.out.println("Quiere seguir mostrando personas? S/N");
            String opcion = leer.next();
            if (opcion.equalsIgnoreCase("N")) {
                break;
            }
        }

    }

    public static void datos(int personas) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        for (int i = 0; i < personas; i++) {
            System.out.print("Ingrese nombre: ");
            String nombre = leer.next();
            System.out.print("Ingrese edad: ");
            int edad = leer.nextInt();
            System.out.println("Nombre: " + nombre + "\nEdad: " + edad);

            if (edad > 18) {
                System.out.println("Mayor/Menor: Mayor \n");
            } else {
                System.out.println("Mayor/Menor: Menor \n");

            }
        }
    }

}
