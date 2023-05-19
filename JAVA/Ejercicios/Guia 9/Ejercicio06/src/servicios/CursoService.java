
package servicios;

import entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class CursoService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public String[] cargarAlumnos() {
        String[] vector = new String[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese nombre alumno " +(i+1));
            vector[i] = leer.next();
        }
        return vector;
    }
    
    public Curso crearCurso() {
        
        System.out.println("Ingrese nombre del curso");
        String nombreCurso = leer.next();
        System.out.println("Ingrese cantidad de horas por dia");
        int horas = leer.nextInt();
        System.out.println("Ingrese cantidad de dias por semana");
        int dias = leer.nextInt();
        System.out.println("Ingrese turno (Mañana/Tarde)");
        String turno = leer.next();
        System.out.println("Ingrese precio por hora");
        float precio = leer.nextFloat();
        String[] alumnos = cargarAlumnos();
        
        return new Curso(nombreCurso, horas, dias, turno, precio, alumnos);
    }
    
    public float calcularGananciaSemana(Curso c1) {
       
        return c1.getCantidadHorasPorDia()*c1.getPrecioPorHora()*5*c1.getCantidadDiasPorSemana();
    }
    

}
