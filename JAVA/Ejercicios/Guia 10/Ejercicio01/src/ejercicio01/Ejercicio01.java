/*

 */
package ejercicio01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio01 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ArrayList<String> perros = new ArrayList();
        String op;
        do {
            System.out.print("Ingrese una raza de perro: ");
            String raza = leer.next();
            perros.add(raza);
            System.out.print("Desea agragar otra raza de perro? S/N: ");
            op = leer.next();
        } while (op.equalsIgnoreCase("S"));

        System.out.println("");
        System.out.println("Lista de razas");
        for (String aux : perros) {
            System.out.println("- " + aux);
        }

        System.out.println("");

        System.out.print("Ingrese una raza a eliminar: ");
        String raza2 = leer.next();

        Iterator it = perros.iterator();
        boolean asd = false;

        while (it.hasNext()) {
            if (it.next().equals(raza2)) {
                it.remove();
                asd = true;
            }
        }

        System.out.println("");

        if (asd) {
            System.out.println("La raza estaba en la lista");
        } else {
            System.out.println("La raza NO estaba en la lista");
        }

        System.out.println("");
        System.out.println("Lista de razas");
        for (String aux : perros) {
            System.out.println("- " + aux);
        }

    }

}
