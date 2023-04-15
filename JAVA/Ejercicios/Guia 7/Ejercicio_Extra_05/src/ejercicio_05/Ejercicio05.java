/*
Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". 
Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un empleado en 
función de su edad y salario actual. El aumento salarial debe ser del 10% si el empleado 
tiene más de 30 años o del 5% si tiene menos de 30 años.
*/
package ejercicio_05;
import entidades.Empleado;
import java.util.Scanner;
/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio05 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Empleado empleado = new Empleado();
        
        empleado.llenarDatos();
        empleado.calcularAumento(empleado.getEdad());
        System.out.println(empleado.toString());
    }

}
