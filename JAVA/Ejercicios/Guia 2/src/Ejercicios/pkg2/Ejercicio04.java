/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente 
en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
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
        
        System.out.println("Ingrese Grados Celsius");
        float cent = leer.nextFloat();
        System.out.println(cent + "°C" + " son " + (32+(9*cent/5)) + "°F");
    }

}
