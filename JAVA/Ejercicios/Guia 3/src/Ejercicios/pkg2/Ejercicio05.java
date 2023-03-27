/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a 
continuación solicite números al usuario hasta que la suma de los números 
introducidos supere el límite inicial.
*/
package Ejercicios.pkg2;
import java.util.Scanner;
/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un limite");
        int limite = leer.nextInt(),suma = 0;
        while (suma <= limite) {
            System.out.println("Ingrese numeros a sumar");
            int num = leer.nextInt();
            suma += num;
            if (suma > limite){ 
                suma -= num;
                break;
            }
        }
        System.out.println("La suma de los numeros supero el limite");
        System.out.println(suma);
    }

}
