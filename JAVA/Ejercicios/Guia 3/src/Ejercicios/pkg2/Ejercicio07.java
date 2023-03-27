/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este 
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben 
llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de 
largo, el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la 
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y 
toda secuencia distinta de FDE, que no respete el formato se considera 
incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de 
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio deberá 
investigar cómo se utilizan las siguientes funciones de Java 
 */
package Ejercicios.pkg2;

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
        boolean control = false;
        String cadena;
        int i = 0, j = 0;

        while (!control) {
            cadena = leer.next();
            if (cadena.length() == 5 && cadena.substring(0, 1).equalsIgnoreCase("X") && cadena.substring(4, 5).equalsIgnoreCase("O")) {
                System.out.println("CORRECTO");
                i++;
            } else if (cadena.length() == 5 && cadena.equals("&&&&&")) {
                break;
            } else if (cadena.length() == 5) {
                System.out.println("INCORRECTO");
                j++;
            } else {
                System.out.println("No es una cadena de 5 digitos");

            }

        }
        System.out.println("Lecturas correctas: " + i);
        System.out.println("Lecturas incorrectas: " + j);
    }

}
