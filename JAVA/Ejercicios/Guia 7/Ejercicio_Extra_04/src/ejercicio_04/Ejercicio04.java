/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego, crea un 
método "retirar_dinero" que permita retirar una cantidad de dinero del saldo de la cuenta. 
Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.

 */
package ejercicio_04;

import entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio04 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese titular");
        String titular = leer.next();
        System.out.println("Ingres dinero");
        int saldo = leer.nextInt();
        Cuenta c1 = new Cuenta(saldo, titular);
        do {

            System.out.println("Cuanto desea retirar?");
            int retiro = leer.nextInt();
            if (c1.getSaldo() >= retiro) {
                System.out.println(c1.retirarDinero(retiro));
                System.out.println("Saldo en cuenta: "+ c1.getSaldo());
            } else {
                System.out.println("No tiene fondos suficientes");
                System.out.println("Saldo en cuenta: "+ c1.getSaldo());
            }
            System.out.println("Desea retirar mas dinero? S/N");
            String op = leer.next();
            if (op.equalsIgnoreCase("N")) {
                System.out.println("Saldo en cuenta: " + c1.getSaldo());
                
                break;
            }
        } while (true);

    }

}
