
package servicios;

import entidades.Estudiante;
import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class EstudianteService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Estudiante crearEstudiante(int i) {
        
        System.out.println("Ingrese el nombre del estudiante " + (i+1));
        String nombre = leer.next();
        System.out.println("Ingrese la nota del estudiante " + (i+1));
        int nota = leer.nextInt();
        
        return new Estudiante(nombre, nota);
    }
    
    public double calcularPromedio(Estudiante[] estudiantes) {
        double sumaNotas = 0;
        
        for (int i = 0; i < estudiantes.length; i++) {
            sumaNotas += estudiantes[i].getNota();
        }
        
        return sumaNotas/estudiantes.length;
        
    }
    
    public int notasMayores(Estudiante[] estudiantes) {
        double promedio = calcularPromedio(estudiantes);
        int cont = 0;
        
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].getNota()>promedio) {
                cont++;
            }
        }
        return cont;
    }
    
    public String[] nombres(Estudiante[] estudiantes) {
        String[] nombres = new String[notasMayores(estudiantes)];
        double promedio = calcularPromedio(estudiantes);
        int cont = 0;
        
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].getNota()>promedio) {
                nombres[cont] = estudiantes[i].getNombre();
                cont++;
            }
        }
        return nombres;
    }
    
    public void mostrarNombres(Estudiante[] estudiantes) {
        String[] vec = nombres(estudiantes);
        System.out.println("Los estudiantes con nota mayor al promedio son");
        for (int i = 0; i < vec.length; i++) {
            System.out.println("- "+vec[i]);
        }
        
    }
    
    

}
