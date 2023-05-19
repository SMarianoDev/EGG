/*

 */
package ejercicio01;

import entidades.Persona;
import servicios.PersonaService;

/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio01 {

    public static void main(String[] args) {

        PersonaService pservice = new PersonaService();

        Persona persona1 = pservice.crearPersona();
        
        pservice.mostrarPersona(persona1);

    }

}
