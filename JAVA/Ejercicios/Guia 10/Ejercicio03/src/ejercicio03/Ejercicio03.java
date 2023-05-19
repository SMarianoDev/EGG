/*

 */
package ejercicio03;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;
import servicios.AlumnoService;

/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        AlumnoService as = new AlumnoService();
        
        ArrayList<Alumno> alumnoLista = as.crearAlumno();
        
        System.out.print("Nombre del alumno que desea saber su nota final: ");
        String nombre = leer.next();
        
        for (Alumno alumno : alumnoLista) {
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Nota final: "+as.notaFinal(alumno));
            }
        }
        
        System.out.println("");
        as.mostrarAlumnos(alumnoLista);
    }

}
