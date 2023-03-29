/*
Escribir un programa que lea un número entero y devuelva el número de 
dígitos que componen ese número. Por ejemplo, si introducimos el número 
12345, el programa deberá devolver 5. Calcular la cantidad de dígitos 
matemáticamente utilizando el operador de división. Nota: recordar 
que las variables de tipo entero truncan los números o resultados.
 */
package Ejercicios_Extras.pkg2;

import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero para saber la cantidad de digitos");
        int numero = leer.nextInt(),i=0;
        while (true) {
            i++;
            numero /= 10;
            if (numero == 0) {
                break;
            }
        }
        System.out.println("la longitud del numero es: "+ i);
    }

}
