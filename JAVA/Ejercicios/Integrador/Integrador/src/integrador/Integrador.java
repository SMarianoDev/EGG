/*

 */
package integrador;

import entidades.Estudiante;
import servicios.EstudianteService;

/**
 *
 * @author Mariano Sotelo
 */
public class Integrador {

    public static void main(String[] args) {

        EstudianteService es = new EstudianteService();
        Estudiante[] estudiantes = new Estudiante[3];
        
        
        for (int i = 0; i < estudiantes.length; i++) {
            estudiantes[i] = es.crearEstudiante(i);
        }
        
        System.out.println("El promedio total es de: " + es.calcularPromedio(estudiantes));
        es.mostrarNombres(estudiantes);
        
        

    }

}
