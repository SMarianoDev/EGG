
package servicios;

import entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class PersonaService {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona() {
        System.out.println("Ingrese nombre");
        String nombre = leer.next();
        System.out.println("Ingrese edad");
        int edad = leer.nextInt();
        return new Persona(nombre,edad);
    }
    
    
    public void mostrarPersona(Persona persona) {
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
    }
    

}
