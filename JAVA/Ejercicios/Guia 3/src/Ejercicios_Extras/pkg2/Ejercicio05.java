/*
Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en 
todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre 
dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un 
valor real que represente el costo del tratamiento (previo al descuento) y 
determine el importe en efectivo a pagar por dicho socio.

 */
package Ejercicios_Extras.pkg2;

import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int i = 0;
        while (i <= 0) {
            System.out.println("MENU" + "\n" + "A = Socios tipo A" + "\n" + "B = Socios tipo B" + "\n" + "C = Socios tipo C");
            char socio = leer.next().toUpperCase().charAt(0);
            double costo;
            switch (socio) {
                case 'A':
                    System.out.println("Ingrese costo del tratamiento");
                    costo = (leer.nextDouble());
                    System.out.println("Por ser socio '" + socio + "' deberá abonar un total de:" + (costo - (costo * 0.5)));
                    i++;
                    break;
                case 'B':
                    System.out.println("Ingrese costo del tratamiento");
                    costo = (leer.nextDouble());
                    System.out.println("Por ser socio '" + socio + "' deberá abonar un total de:" + (costo - (costo * 0.35)));
                    i++;
                    break;
                case 'C':
                    System.out.println("Ingrese costo del tratamiento");
                    costo = (leer.nextDouble());
                    System.out.println("Por ser socio '" + socio + "' deberá abonar un total de:" + (costo));
                    break;
                default:
                    System.out.println("El tipo de socio no existe" + "\n");
                    break;
            }
        }
    }

}
