/*
Se dispone de un conjunto de N familias, cada una de las cuales 
tiene una M cantidad de hijos. Escriba un programa que pida la cantidad 
de familias y para cada familia la cantidad de hijos para averiguar 
la media de edad de los hijos de todas las familias.
*/
package Ejercicios_Extras.pkg2;
import java.util.Scanner;
/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familias");
        int familias = leer.nextInt(),sumaEdad=0,sumaHijos=0;
        
        for (int i = 0; i < familias; i++) {
            System.out.println("ingrese la cantidad de hijos que posee la familia " + (i+1));
            int hijos = leer.nextInt();
            sumaHijos +=hijos;
            for (int j = 0; j < hijos; j++) {
                System.out.println("ingrese la edad de hijo "+(j+1));
                int edad = leer.nextInt();
                sumaEdad +=edad;
            }
        }
        double total = (double)sumaEdad/sumaHijos;
        System.out.println("la media de edades es de:" + total);
        
    }

}
