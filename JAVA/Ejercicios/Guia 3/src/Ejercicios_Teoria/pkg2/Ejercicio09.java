/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero 
se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero".  
El programa deberá calcular y mostrar el resultado de la suma de los números 
leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso 
de la sentencia break.
 */
package Ejercicios_Teoria.pkg2;

import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int num, i= 0, suma = 0;

        do {
            System.out.println("Ingrese hasta 20 numeros positivos");
            num = leer.nextInt();
            if (num > 0) {
                suma += num;
            } else if (num == 0) {
                break;
            }
            i++;
        } while (i <= 20);
        
        System.out.println(suma);
    }

}
