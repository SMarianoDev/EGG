/*
Realizar un programa que pida dos números enteros positivos por teclado y 
muestre por pantalla el siguiente menú:El usuario deberá elegir una opción y 
el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta 
que, si el usuario selecciona la opción 5, en vez de salir del programa 
directamente, se debe mostrar el siguiente mensaje de confirmación: 
¿Está seguro que desea salir del programa (S/N)? 
Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario 
se vuelve a mostrar el menú.
 */
package Ejercicios.pkg2;

import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros enteros positivos");
        int num1 = leer.nextInt(), num2 = leer.nextInt();
        int opcion;
        do {
            
            System.out.println("MENU\n"
                    + "1. Sumar\n"
                    + "2. Restar\n"
                    + "3. Multiplicar\n"
                    + "4. Dividir\n"
                    + "5. Salir\n"
                    + "Elija la opcion\n");
            opcion = leer.nextInt();
            switch(opcion) {
                case 1: System.out.println("la suma da: " + (num1+num2) +"\n \n");
                break;
                case 2: System.out.println("la resta da: " + (num1-num2)+"\n \n");
                break;
                case 3: System.out.println("La multp. da: " + (num1*num2)+"\n \n");
                break;
                case 4: System.out.println("La div. da: " + (num1/num2)+"\n \n");
                break;
                case 5: System.out.println("Seguro que desea salir? (S/N)");
                String confirmacion = leer.next();
                if (confirmacion.equalsIgnoreCase("S")){
                    break;
                }else
                    opcion = 0;
            }
        } while (opcion != 5);
    }

}
