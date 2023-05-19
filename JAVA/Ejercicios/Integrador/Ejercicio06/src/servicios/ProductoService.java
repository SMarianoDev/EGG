package servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class ProductoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void cargarProducto(HashMap<String, Integer> productosLista) {
        System.out.print("\n\nIngrese nombre del producto: ");
        String nombre = leer.next();
        System.out.print("Ingrese precio del producto: ");
        Integer precio = leer.nextInt();
        productosLista.put(nombre, precio);
        System.out.println("\n");
    }

    public void cambiarPrecio(HashMap<String, Integer> productosLista) {
        System.out.print("\n\nNombre del producto que desea cambiar el precio: ");
        String nombre = leer.next();
        boolean op = false;
        for (Map.Entry<String, Integer> aux : productosLista.entrySet()) {
            if (nombre.equalsIgnoreCase(aux.getKey())) {
                System.out.print("Ingrese el nuevo precio: ");
                int precio = leer.nextInt();
                aux.setValue(precio);
                op = true;
            }
        }
        if(op){
                System.out.println("--- PRECIO MODIFICADO ---\n");
            }else
                System.out.println("--- PRODUCTO NO EXISTE ---\n");
    }

    public void eliminarProducto(HashMap<String, Integer> productosLista) {
        System.out.print("\n\nIngrese el nombre del producto a eliminar: ");
        String nombre = leer.next();
        boolean op = false;
        
        for (Map.Entry<String, Integer> aux : productosLista.entrySet()) {
            if (nombre.equalsIgnoreCase(aux.getKey())) {
                productosLista.remove(nombre);
                op = true;
            }
        }
        if(op){
                System.out.println("--- PRODUCTO ELIMINADO ---\n");
            }else
                System.out.println("--- PRODUCTO NO EXISTE ---\n");
        
    }

    public void mostrarLista(HashMap<String, Integer> productosLista) {
        for (Map.Entry<String, Integer> aux : productosLista.entrySet()) {
            System.out.println("Producto: " + aux.getKey() + " $" + aux.getValue());
        }
        System.out.println("\n");
    }

}
