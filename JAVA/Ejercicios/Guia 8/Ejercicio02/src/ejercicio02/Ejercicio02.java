/*

 */
package ejercicio02;

import entidades.Nespresso;
import java.util.Scanner;
import servicios.NespressoService;

/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        NespressoService ns = new NespressoService();
        Nespresso cafetera1 = ns.crearCafetera();

        int op;

        do {
            System.out.println("MENU\n1- Llenar cafetera.\n2- Servir taza.\n3- Vaciar cafetera.\n4- Agregar cafe.\n5- Salir");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    ns.llenarCafetera(cafetera1);
                    break;
                case 2:
                    System.out.println(ns.servirTaza(cafetera1));
                    break;
                case 3:
                    ns.vaciaCafetera(cafetera1);
                    break;
                case 4:
                    System.out.println(ns.agregarCafe(cafetera1));
                    break;
                case 5:
                    break;
                default:
                    System.out.println("No es una opcion valida");
            }
        } while (op != 5);

    }

}
