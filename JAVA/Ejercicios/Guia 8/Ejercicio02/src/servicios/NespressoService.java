package servicios;

import entidades.Nespresso;
import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class NespressoService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Nespresso crearCafetera() {
        System.out.println("Ingrese cantidad maxima de la cafetera");
        int cantidadMax = leer.nextInt();
        int capacidadAct = (int) ((Math.random() * cantidadMax));
        System.out.println("Capacidad actual: " + capacidadAct);

        return new Nespresso(cantidadMax, capacidadAct);
    }

    public void llenarCafetera(Nespresso cafetera) {
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        System.out.println("Capacidad actual: " + cafetera.getCantidadActual());
    }

    public int servirTaza(Nespresso cafetera) {

        System.out.println("Ingrese tamaño de taza");
        int taza = leer.nextInt();
        if (taza <= cafetera.getCantidadActual()) {
            System.out.println("La taza se lleno correctamente con: " + taza);
            cafetera.setCantidadActual(cafetera.getCantidadActual() - taza);
        } else {
            taza = cafetera.getCantidadActual();
            System.out.println("Cafe insuficiente, se lleno con: " + taza);
            cafetera.setCantidadActual(0);
        }
        System.out.print("Capacidad actual: ");
        return cafetera.getCantidadActual();
    }

    public void vaciaCafetera(Nespresso cafetera) {
        cafetera.setCantidadActual(0);
        System.out.println("Capacidad actual: " + cafetera.getCantidadActual());
    }

    public int agregarCafe(Nespresso cafetera) {
        System.out.println("Puede llenar hasta " + (cafetera.getCapacidadMaxima()-cafetera.getCantidadActual()));
        
        do {
            System.out.print("Ingrese la cantidad que desea agregar: ");
            int cantidad = leer.nextInt();
            
            if (cantidad + cafetera.getCantidadActual() <= cafetera.getCapacidadMaxima()) {
                cafetera.setCantidadActual(cantidad + cafetera.getCantidadActual());
                System.out.println("Llenado correctamente");
                break;
            } else {
                System.out.println("La cantidad sobrepasa la capacidad maxima: " + cafetera.getCapacidadMaxima());
            }

        } while (true);
        
        System.out.print("Capacidad actual: ");
        return cafetera.getCantidadActual();
    }

}
