/*
Escribir un programa que lea un número entero por teclado y muestre 
por pantalla el doble, el triple y la raíz cuadrada de ese número. 
*/
package Ejercicios.pkg2;
import java.util.Scanner;
/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        System.out.println("El doble es: " + num*2);
        System.out.println("El triple es: " + num*3);
        float raiz = (float) Math.sqrt(num);
        System.out.println("La raiz es de: " + raiz);
    }

}
