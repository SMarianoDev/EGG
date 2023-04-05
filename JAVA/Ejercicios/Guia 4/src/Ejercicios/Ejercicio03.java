/*
Crea una aplicación que a través de una función nos convierta una cantidad 
de euros introducida por teclado a otra moneda, estas pueden ser a dólares, 
yenes o libras. La función tendrá como parámetros, la cantidad de euros y 
la moneda a convertir que será una cadena, este no devolverá ningún valor y 
mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        do {
            System.out.print("Ingrese monto: ");
            int euros = leer.nextInt();
            System.out.println("\nQue divisa quiere cambiar? \nDolares \nYenes \nLibras");
            String divisas = leer.next();
            cambio(divisas, euros);
        } while (true);
    }

    public static void cambio(String divisa, int euros) {

        switch (divisa.toLowerCase()) {
            case "dolares":
                double dolares = euros * 1.28611;
                System.out.println("\n"+euros + "€ = " + dolares + "$ \n");
                break;
            case "yenes":
                double yenes = euros * 129.852;
                System.out.println("\n"+euros + "€ = " + yenes + " yenes \n");
                break;
            case "libras":
                double libras = euros * 0.86;
                System.out.println("\n"+euros + "€ = " + libras + " libras \n");
                break;
            default:
                System.out.println("no es una opcion correcta");
        }
    }

}
