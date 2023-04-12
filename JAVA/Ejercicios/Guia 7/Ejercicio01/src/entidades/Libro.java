
package entidades;

import java.util.Scanner;

/**
 *
 * @author maria
 */

public class Libro {
    public int ISBN;
    public String titulo;
    public String autor;
    public int numeroPaginas;

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int numeroPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public void llenarDatos(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese ISBN");
        this.ISBN = leer.nextInt();
        System.out.println("Ingrese Titulo");
        this.titulo = leer.next();
        System.out.println("Ingrese Autor");
        this.autor = leer.next();
        System.out.println("Ingrese numero de paginas");
        this.numeroPaginas = leer.nextInt();
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", numeroPaginas=" + numeroPaginas + '}';
    }
    
    
    
}
