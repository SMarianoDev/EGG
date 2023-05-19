package servicios;

import entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class PersonaService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public boolean esMayorDeEdad(Persona persona) {
        if (persona.getEdad() >= 18) {
            System.out.println("Es mayor de edad");
        }else
            System.out.println("Es menor de edad");

        return persona.getEdad() >= 18;

    }

    public Persona crearPersona() {
        System.out.print("Ingrese nombre: ");
        String nombre = leer.next();

        System.out.print("Ingrese edad: ");
        int edad = leer.nextInt();
        String sexo;
        do {
            System.out.print("Ingrese sexo (Hombre/Mujer/Otro) ");
            sexo = leer.next();
            if (sexo.substring(0,1).equalsIgnoreCase("H") || sexo.substring(0,1).equalsIgnoreCase("M") || sexo.substring(0,1).equalsIgnoreCase("O")) {
                break;
            }else{
                System.out.println("Dato incorrecto");
            }
        } while (true);

        System.out.print("Ingrese peso: ");
        int peso = leer.nextInt();
        
        System.out.print("Ingrese altura en metros: ");
        double altura = leer.nextDouble();
        
        return new Persona(nombre,edad,sexo,peso,altura);
    }
    
    public int calcularIMC(Persona persona) {
        double peso = persona.getPeso();
        double altura2 = persona.getAltura()*persona.getAltura();
        double IMC = peso/altura2;
        
        if (IMC < 20) {
            System.out.println("Se encuentra por debajo del peso ideal.");
            return -1;            
        }else if (IMC >= 20 && IMC<=25){
            System.out.println("Se encuentra en su peso ideal.");
            return 0;
        }else{
            System.out.println("Se encuentra con sobrepeso.");
            return 1;
        }
        
    }
    public int llenarArray() {
        
        
        
        return 0;
    }
    
    
    
}
