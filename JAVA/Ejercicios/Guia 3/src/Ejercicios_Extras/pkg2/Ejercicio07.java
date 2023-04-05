/*
Realice un programa que calcule y visualice el valor máximo, el 
valor mínimo y el promedio de n números (n>0). El valor de n se 
solicitará al principio del programa y los números serán introducidos 
por el usuario. Realice dos versiones del programa, una usando el 
bucle “while” y otra con el bucle “do - while”.
 */
package Ejercicios_Extras.pkg2;

import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros");

        int n = leer.nextInt(), numMax = 0, numMin = 0, i = 0, suma = 0;

        while (i < n) {
            System.out.println("Ingrese un numero");
            int num = leer.nextInt();
            if (num > 0) {
                suma += num;
                numMax = Integer.max(numMax, num);
                if (numMin == 0) {
                    numMin = num;
                } else{
                    numMin = Integer.min(numMin, num);
                }
                i++;
            }else{
                System.out.println("ingrese un numero positivo");
            }
        }
        System.out.println("El promedio es de: " + (suma / i));
        System.out.println("Numero Maximo: " + numMax);
        System.out.println("Numero Minimo: " + numMin + "\n");
        numMax = 0;
        numMin = 0;
        i = 0;
        suma = 0;
        do {
            System.out.println("Ingrese un numero");
            int num = leer.nextInt();
            if (num > 0) {
                suma += num;
                numMax = Integer.max(numMax, num);
                if (numMin == 0) {
                    numMin = num;
                } else{
                    numMin = Integer.min(numMin, num);
                }
                i++;
            }else{
                System.out.println("ingrese un numero positivo");
            }
        } while (i < n);
        System.out.println("El promedio es de: " + (suma / i));
        System.out.println("Numero Maximo: " + numMax);
        System.out.println("Numero Minimo: " + numMin);

    }

}
