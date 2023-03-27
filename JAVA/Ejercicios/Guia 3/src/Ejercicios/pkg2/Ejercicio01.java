/*
Crear un programa que dado un número determine si es par o impar.
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
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        
        if (num%2 != 1){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
    }

}
