/*

 */
package ejercicio01;

import entidades.Cancion;
import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Cantidad de canciones a ingresar");
        int n = leer.nextInt();
        String[] vector = new String[n];
        Cancion cancion = new Cancion();

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese titulo de la cancion "+(i+1));
            cancion.setTitulo(leer.next());
            System.out.println("Ingrese autor de la cancion "+(i+1));
            cancion.setAutor(leer.next());
            
            vector[i] = "Cancion"+(i+1)+" - Titulo: " + cancion.getTitulo() + " Autor: " + cancion.getAutor();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(vector[i]);
        }

    }

}
