/*
Crear una función rellene un vector con números aleatorios, pasándole un 
arreglo por parámetro. Después haremos otra función o procedimiento que imprima el vector.
*/
package Ejercicios_Extras;
/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        
        int[] vector = new int[5];
        
        llenarVector(vector);
        mostrarVector(vector);
    }
    
    public static void llenarVector(int[] vector) {
        for (int i = 0; i < 5; i++) {
            vector[i] = (int) (Math.random()*10);
        }
    }
    
    public static void mostrarVector(int[] vector) {
        for (int i = 0; i < 5; i++) {
            System.out.print(vector[i]+" ");
        }
    }

}
