/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se 
trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar la 
función equals() de la clase String.
*/
package Ejercicios_Extras.pkg2;
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
        System.out.println("Ingrese una letra");
        String vocal = leer.next();
        if(vocal.equalsIgnoreCase("A")||vocal.equalsIgnoreCase("E")||vocal.equalsIgnoreCase("I")||vocal.equalsIgnoreCase("O")||vocal.equalsIgnoreCase("U")){
            System.out.println("La letra es una VOCAL");
        }else{
            System.out.println("La letra NO es una VOCAL");
        }
    }

}
