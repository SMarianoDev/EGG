/*

*/
package ejercicio04;
import entidades.Pelicula;
import java.util.ArrayList;
import servicios.PeliculaService;
/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio04 {

    public static void main(String[] args) {
        
        PeliculaService ps = new PeliculaService();
        
        ArrayList<Pelicula> peliculasLista = ps.crearPelicula();
        System.out.println("Lista de peliculas");
        ps.mostrarPeliculas(peliculasLista);
        System.out.println("");
        System.out.println("Peliculas mayor a 1h de duracion");
        ps.mayorUnaHora(peliculasLista);
        System.out.println("");
        System.out.println("Listado de duracion Mayor a Menor");
        ps.mayorAMenor(peliculasLista);
        System.out.println("");
        System.out.println("Listado de duracion Menor a Mayor");
        ps.menorAMayor(peliculasLista);
        System.out.println("");
        System.out.println("Listado de A - Z Alfabeticamente");
        ps.alfabMenorAMayor(peliculasLista);
        System.out.println("");
        System.out.println("Listado de Z - A Alfabeticamente");
        ps.alfabMayorAMenor(peliculasLista);
        System.out.println("");
    }

}
