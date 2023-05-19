/*

 */
package ejercicio06;

import java.util.HashMap;
import java.util.Scanner;
import servicios.ProductoService;

/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio06 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ProductoService ps = new ProductoService();
        HashMap<String, Integer> productosLista = new HashMap();
        
        int op = 0;
        do {
            System.out.println("MENU\n1- Ingresar producto\n2- Modificar precio\n3- Eliminar producto\n4- Mostrar lista de productos\n5- Salir");
            System.out.print("Elegir opcion: ");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    ps.cargarProducto(productosLista);
                    break;
                case 2:
                    ps.cambiarPrecio(productosLista);
                    break;
                case 3:
                    ps.eliminarProducto(productosLista);
                    break;
                case 4:
                    ps.mostrarLista(productosLista);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("No es una opcion correcta");
            }
        } while (op!=5);
        
    }
    
}
