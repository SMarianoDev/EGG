/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas 
y después toda en minúsculas. 
 */

package Ejercicios.pkg2;
import java.util.Scanner;
/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());
    }

}
