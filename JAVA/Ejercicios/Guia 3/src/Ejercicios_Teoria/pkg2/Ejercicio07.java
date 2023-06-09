/*
Considera que estás desarrollando una web para una empresa que fabrica motores 
(suponemos que se trata del tipo de motor de una bomba para mover fluidos). 
Definir una variable tipoMotor y permitir que el usuario ingrese un valor entre
1 y 4. El programa debe mostrar lo siguiente:

o	Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una 
bomba de agua”.

o	Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una
bomba de gasolina”.

o	Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una
bomba de hormigón”.

o	Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una 
bomba de pasta alimenticia”.

o	Si no se cumple ninguno de los valores anteriores mostrar el mensaje 
“No existe un valor válido para tipo de bomba”

*/
package Ejercicios_Teoria.pkg2;
import java.util.Scanner;
/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero segun el menu");
        System.out.println("1 - Bomba 1");
        System.out.println("2 - Bomba 2");
        System.out.println("3 - Bomba 3");
        System.out.println("4 - Bomba 4");
        int tipoMotor = leer.nextInt();
        
        switch (tipoMotor){
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigon");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe tipo de bomba");
        }
    }

}
