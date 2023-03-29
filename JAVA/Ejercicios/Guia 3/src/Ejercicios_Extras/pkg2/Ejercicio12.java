/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números 
del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo 
sustituya por una E. Ejemplo:

 */
package Ejercicios_Extras.pkg2;

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
        int cont1 = 0, cont2 = 0, cont3 = 0;

        while (true) {
            if (cont3 < 9) {
                cont3++;
            } else if (cont2 < 9) {
                cont3 = 0;
                cont2++;
            } else if (cont1 < 9) {
                cont3 = 0;
                cont2 = 0;
                cont1++;
            } else {
                break;
            }
            if (cont1 == 3 || cont2 == 3 || cont3 == 3) {
                if (cont1 == 3) {
                    if (cont2 == 3 && cont3 == 3) {
                        System.out.println("E" + "-" + "E" + "-" + "E");
                    } else if (cont2 == 3) {
                        System.out.println("E" + "-" + "E" + "-" + cont3);
                    } else if (cont3 == 3) {
                        System.out.println("E" + "-" + cont2 + "-" + "E");
                    } else {
                        System.out.println("E" + "-" + cont2 + "-" + cont3);
                    }
                } else if (cont2 == 3) {
                    if (cont3 == 3) {
                        System.out.println(cont1 + "-" + "E" + "-" + "E");
                    } else {
                        System.out.println(cont1 + "-" + "E" + "-" + cont3);
                    }
                } else if (cont3 == 3) {
                    System.out.println(cont1 + "-" + cont2 + "-" + "E");
                }
            } else {
                System.out.println(cont1 + "-" + cont2 + "-" + cont3);
            }
        }
    }

}
