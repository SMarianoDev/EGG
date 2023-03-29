/*
Realice un programa para que el usuario adivine el resultado de una 
multiplicación entre dos números generados aleatoriamente entre 0 y 10. 
El programa debe indicar al usuario si su respuesta es o no correcta. 
En caso que la respuesta sea incorrecta se debe permitir al usuario 
ingresar su respuesta nuevamente. Para realizar este ejercicio 
investigue como utilizar la función Math.random() de Java.
 */
package Ejercicios_Extras.pkg2;

import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int num1 = (int) (Math.random() * 10), num2 = (int) (Math.random() * 10), mult, user;
        mult = num1 * num2;

        System.out.println(mult);
        while (true) {
            System.out.println("Ingrese un nuemero para adivinar");
            user = leer.nextInt();
            if (user == mult) {
                break;
            } else {
                System.out.println("¡ERROR!");
            }
        }
        System.out.println("Adivinaste!");
    }

}
