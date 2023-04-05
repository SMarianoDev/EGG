/*
Realizar un algoritmo que llene un vector con los 100 primeros números enteros y los muestre por pantalla en orden descendente.
*/
package Ejercicios;
import java.util.Scanner;
/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        
        int[] numeros = new int[100]; 
        
        for (int i = numeros.length-1; i >= 0; i--) {
            numeros[i] = i;
            System.out.print(numeros[i]+"-");
        }
        
        
        
    }

}
