
package servicios;

import entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class PeliculaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public ArrayList<Pelicula> crearPelicula() {
        
        ArrayList<Pelicula> peliculaLista = new ArrayList();
        boolean op = true;
        
        do {
            System.out.print("Ingrese titulo");
            String titulo = leer.next();
            System.out.print("Ingrese director");
            String director = leer.next();
            System.out.print("Ingrese duracion");
            Double duracion = leer.nextDouble();
            Pelicula pelicula = new Pelicula(titulo, director, duracion);
            peliculaLista.add(pelicula);
            
            System.out.print("Desea agregar mas peliculas S/N");
            if (leer.next().equalsIgnoreCase("N")) {
                op = false;
            }
        } while (op);
        
        
        return peliculaLista;
    }
    
    public void mostrarPeliculas(ArrayList<Pelicula> peliculaLista) {
        for (Pelicula pelicula : peliculaLista) {
            System.out.println(pelicula);
        }
    }
    
    public void mayorUnaHora(ArrayList<Pelicula> peliculaLista) {
        for (Pelicula pelicula : peliculaLista) {
            if (pelicula.getDuracion()>1.0) {
                System.out.println(pelicula);
            }
        }
    }
    
    public void mayorAMenor(ArrayList<Pelicula> peliculaLista) {
        peliculaLista.sort(Pelicula.compararDuracion);
        for (Pelicula pelicula : peliculaLista) {
            System.out.println(pelicula);
        }
    }
    
    public void menorAMayor(ArrayList<Pelicula> peliculaLista) {
        peliculaLista.sort(Pelicula.compararDuracion);
        Collections.reverse(peliculaLista);
        for (Pelicula pelicula : peliculaLista) {
            System.out.println(pelicula);
        }
    }
    
    public void alfabMayorAMenor(ArrayList<Pelicula> peliculaLista) {
        peliculaLista.sort(Pelicula.compararLetra);
        for (Pelicula pelicula : peliculaLista) {
            System.out.println(pelicula);
        }
    }
    
    public void alfabMenorAMayor(ArrayList<Pelicula> peliculaLista) {
        peliculaLista.sort(Pelicula.compararLetra);
        Collections.reverse(peliculaLista);
        for (Pelicula pelicula : peliculaLista) {
            System.out.println(pelicula);
        }
    }

}
