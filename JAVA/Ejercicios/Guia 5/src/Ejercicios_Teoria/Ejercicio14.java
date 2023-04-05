/*

*/
package Ejercicios_Teoria;
import java.util.Scanner;
/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio14 {

    public static void main(String[] args) {
        
               
        String[] equipo = new String[2];
        int[][] matriz = {{4,8,9},{5,8,6}};
        String aux;
//        for (int i = 0; i < equipo.length; i++) {
//            equipo[i] = leer.next();
//        }
        
        for (int[] fila: matriz) {
            aux = "";
            for (int columna:fila){
                aux += " "+ columna; // aux = aux + " " + columna
            }
            System.out.println(aux);
        }
    }

}
