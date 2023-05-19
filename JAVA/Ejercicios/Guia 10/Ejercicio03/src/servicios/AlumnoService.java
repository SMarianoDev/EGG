package servicios;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class AlumnoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Alumno> crearAlumno() {

        ArrayList<Alumno> alumnoLista = new ArrayList();

        do {
            ArrayList<Integer> notas = new ArrayList();

            System.out.print("Ingrese nombre del alumno: ");
            String nombre = leer.next();

            for (int i = 0; i < 3; i++) {
                System.out.print("Ingrese nota " + (i + 1) + " del alumno: ");
                notas.add(leer.nextInt());
                
                
            }

            Alumno alumno = new Alumno(nombre, notas);
            alumnoLista.add(alumno);

            System.out.print("Desea agregar mas alumnos? S/N : ");

        } while (leer.next().equalsIgnoreCase("S"));

        return alumnoLista;

    }

    public int notaFinal(Alumno alumno) {

        int total = 0;
        int cantNotas = alumno.getNotas().size();

        for (Integer nota : alumno.getNotas()) {
            total += nota;
        }

        return total / cantNotas;
    }

    public void mostrarAlumnos(ArrayList<Alumno> alumnoLista) {
        for (Alumno object : alumnoLista) {
            System.out.println(object);
        }

    }
}
