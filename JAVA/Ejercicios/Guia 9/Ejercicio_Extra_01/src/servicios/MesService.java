package servicios;

import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class MesService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    String[] mes = {"enero", "febraro", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    String mesSecreto = mes[(int) (Math.random() * 11 + 1)];

    public void adivinar() {
        System.out.println("Ingrese mes a ver si tenes suerte");
        String eleccion = leer.next();

        do {
            if (eleccion.equals(mesSecreto)) {
                System.out.println("CORRECTO");
                break;
            } else {
                System.out.println("FALLASTE\n"
                        + "Elige otro mes: ");
            }
            eleccion = leer.next();
        } while (true);
    }
    
}
