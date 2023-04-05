/*

*/
package Ejercicios_Extras;
import java.util.Scanner;
/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio07 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cantidad de sucesiones que desea saber");
        int n = leer.nextInt();
        int[] vector = new int[n];
        llenarVector(vector,n);
        mostrarVector(vector,n);
        
    }
    public static void llenarVector(int[] vector,int n) {
        
        for (int i = 0; i < n; i++) {
            if (i <= 1) {
                vector[i] = 1;
            }else{
                vector[i] = (vector[i-1]) + (vector[i-2]);
            }
            
        }
    }
    public static void mostrarVector(int[] vector,int n) {
        for (int i = 0; i < n; i++) {
            if (i<n-1) {
                System.out.print(vector[i]+"-");
            }else{
                System.out.print(vector[i]+"\n");
            }
            
        }
    }

}
