/*
Escribir un programa que procese una secuencia de caracteres ingresada 
por teclado y terminada en punto, y luego codifique la palabra o frase 
ingresada de la siguiente manera: cada vocal se reemplaza por el carácter 
que se indica en la tabla y el resto de los caracteres (incluyendo a las 
vocales acentuadas) se mantienen sin cambios.
Realice un subprograma que reciba una secuencia de caracteres y retorne
la codificación correspondiente. Utilice la estructura “según” para la transformación. 

Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

 */
package Ejercicios_Teoria;

import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String frase = "";
        do {
            System.out.println("Ingrese palabra o frase");
            String palabra = leer.nextLine();
            if (palabra.equals(".")) {
                break;
            }
            if (frase.equals("")) {
                frase += palabra;
            } else {
                frase += " " + palabra;
            }

        } while (true);
        System.out.println(frase);
        System.out.println(codigo(frase));

    }

    public static String codigo(String frase) {

        String codificado = "";
        for (int i = 0; i < frase.length(); i++) {
            String letra = frase.substring(i, (i + 1));

            switch (letra.toLowerCase()) {
                case "a":
                    codificado += "@";
                    break;
                case "e":
                    codificado += "#";
                    break;
                case "i":
                    codificado += "$";
                    break;
                case "o":
                    codificado += "%";
                    break;
                case "u":
                    codificado += "*";
                    break;
                default:
                    codificado += letra;
                    break;
            }
        }
        return codificado;
    }

}
