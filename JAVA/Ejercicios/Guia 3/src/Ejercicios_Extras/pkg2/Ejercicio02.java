/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor 
diferente a cada una. A continuación, realizar las instrucciones necesarias 
para que: B tome el valor de C, C tome el valor de A, A tome el valor de D 
y D tome el valor de B. Mostrar los valores iniciales y los valores finales 
de cada variable. Utilizar sólo una variable auxiliar.
 */
package Ejercicios_Extras.pkg2;

import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int A = 1, B = 2, C = 3, D = 4, aux = 0;
        System.out.println("A= " + A + "\n" + "B= " + B + "\n" + "C= " + C + "\n" + "D= " + D + "\n");
        aux = B;B = C;C = A; A = D;D = aux;
        System.out.println("A= " + A + "\n" + "B= " + B + "\n" + "C= " + C + "\n" + "D= " + D);
    }

}
