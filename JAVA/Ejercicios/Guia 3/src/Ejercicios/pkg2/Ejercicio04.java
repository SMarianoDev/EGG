/*
Escriba un programa que pida una frase o palabra y valide si la primera letra 
de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir 
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se 
deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y equals() 
de Java.
*/
package Ejercicios.pkg2;
import java.util.Scanner;
/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra que comience con 'A'");
        String palabra = leer.next();
        if(palabra.substring(0, 1).equalsIgnoreCase("A") ){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
    }

}
