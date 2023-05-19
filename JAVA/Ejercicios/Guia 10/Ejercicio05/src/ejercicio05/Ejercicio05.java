/*

*/
package ejercicio05;
import entidades.Pais;
import java.util.HashSet;
import servicios.PaisService;
/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio05 {

    public static void main(String[] args) {
        
        PaisService ps = new PaisService();
        
        HashSet<Pais> paisesLista = ps.crearPaises();
        
        ps.mostrarPaises(paisesLista);
        
        ps.buscarBorrar(paisesLista);
    }

}
