/*
Escribir un programa que pida dos números enteros por teclado y calcule 
la suma de los dos. El programa deberá después mostrar el resultado de la suma
 */

package Ejercicios.pkg2;
import java.util.Scanner;
/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese 2 numeros enteros");
        int num1 = leer.nextInt(),num2 = leer.nextInt();
        
        int total = num1 + num2;
        System.out.println("La suma es de: " + total);
    }

}
