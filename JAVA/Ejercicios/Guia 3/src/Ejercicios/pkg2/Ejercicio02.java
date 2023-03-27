/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el 
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. 
Nota: investigar la función equals() en Java.
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
        
        String frase = leer.nextLine();
        
        if (frase.equalsIgnoreCase("eureka")){
            System.out.println("La frase es correcta");
        }else{
            System.out.println("La frase es incorrecta");
        }
    }

}
