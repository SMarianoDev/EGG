package servicios;

import entidades.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class PaisService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public HashSet<Pais> crearPaises() {
        HashSet paisesLista = new HashSet();

        do {
            System.out.print("Ingrese un pais: ");
            paisesLista.add(leer.next());

            System.out.print("Desea agregar otro pais? S/N : ");

        } while (leer.next().equalsIgnoreCase("S"));

        System.out.println("\nLista de Paises");
        for (Object object : paisesLista) {
            System.out.println("- " + object);
        }

        return paisesLista;
    }

    public void mostrarPaises(HashSet<Pais> paisesLista) {
        ArrayList<String> ordenados = new ArrayList(paisesLista);
        Collections.sort(ordenados);
        System.out.println("\nLista de paises ordenada A-Z");
        for (String aux : ordenados) {
            System.out.println("- " + aux);
        }
    }

    public void buscarBorrar(HashSet<Pais> paisesLista) {
        ArrayList<String> paises = new ArrayList(paisesLista);
        Iterator<String> it = paises.iterator();

        System.out.print("\nIngrese el pais que desea borrar: ");
        String pais = leer.next();
        boolean op = true;
        
        while (it.hasNext()) {
            if (it.next().equals(pais)) {
                it.remove();
                System.out.println("---- pais eliminado ----");
                System.out.println("\nLista de paises");
                op = false;
                for (String aux : paises) {
                    System.out.println("- " + aux);
                }
            }

        }
        if (op) {
            System.out.println("---- el pais no existe ----");
            buscarBorrar(paisesLista);
        }

    }

}
