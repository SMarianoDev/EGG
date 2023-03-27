/*
Escribir un programa que pida tu nombre, lo guarde en una variable y 
lo muestre por pantalla.
 */

package Ejercicios.pkg2;
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
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese su nombre");
        String nombre = leer.nextLine();
        System.out.println("Su nombre es: " + nombre);
        
    }

}
