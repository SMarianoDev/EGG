/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar 
lo siguiente:
* * * *
*     *
*     *
* * * *

 */
package Ejercicios.pkg2;

import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamaño del cuadrado");
        int tamanio = leer.nextInt();

        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                if (i == 0 || i == (tamanio-1)) {
                    System.out.print("*");
                }else if (j == 0 || j == (tamanio-1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");

        }
    }

}
