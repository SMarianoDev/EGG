/*

*/
package ejercicio_02;
import java.util.Scanner;
import servicios.AhorcadoService;
/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio_02 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        AhorcadoService as = new AhorcadoService();
        
        as.juego();
        
    }

}
