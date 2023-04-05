/*
Crea un procedimiento EsMultiplo que reciba los dos números pasados 
por el usuario, validando que el primer sea número múltiplo del segundo e 
imprima si el primer número es múltiplo del segundo, sino informe 
que no lo son.
*/
package Ejercicios_Teoria;
import java.util.Scanner;
/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros");
        int num1 = leer.nextInt(), num2 = leer.nextInt();
        
        esMultiplo(num1,num2);
        
    }
    public static void esMultiplo(int num1, int num2) {
        if (num1%num2 == 0) {
            System.out.println("Es multiplo");
        }else{
            System.out.println("No es multiplo");
        }
    }
    

}
