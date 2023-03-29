/*
Crear un programa que dibuje una escalera de números, donde cada línea de 
números comience en uno y termine en el número de la línea. Solicitar la 
altura de la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123

*/
package Ejercicios_Extras.pkg2;
import java.util.Scanner;
/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el alto de la escalera");
        int num = leer.nextInt(),j=1,l;
        
        for (int i = 0; i < num; i++) {
            l=1;
            for (int k = 0; k < j; k++) {
                System.out.print(l++);
            }
            System.out.println("");
            j++;
        }
    }

}
