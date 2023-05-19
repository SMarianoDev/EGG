package servicios;

import entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class AhorcadoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Ahorcado crearJuego() {

        System.out.print("Ingrese la palabra: ");
        String palabra = leer.next();
        System.out.print("Igrese la cantidad de intentos: ");
        int jugadasMaximas = leer.nextInt();

        String[] vector = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            vector[i] = palabra.substring(i, i + 1);
        }

        return new Ahorcado(vector, jugadasMaximas);
    }

    public void longitud(Ahorcado j1) {
        System.out.println("La palabra tiene: " + j1.getPalabra().length + " letras.");
    }

    public void buscar(Ahorcado j1) {
        System.out.println("Ingrese letra");
        String letraUser = leer.next();

        int cantidadletras = j1.getPalabra().length;
        int encontrado = 0;
        for (int i = 0; i < cantidadletras; i++) {
            String letraOriginal = j1.getPalabra()[i];
            if (letraUser.equalsIgnoreCase(letraOriginal)) {
                encontrado++;
            }

        }

        if (encontrado > 0) {
            System.out.println("La letra es parte de la palabra");
            boolean ok = true;
            encontradas(j1, ok, encontrado, cantidadletras);
        } else {
            System.out.println("La letra no es parte de la palabra");
            boolean ok = false;
            encontradas(j1, ok, encontrado, cantidadletras);
        }
    }

    public void encontradas(Ahorcado j1, boolean ok, int encontrado, int cantidadletras) {

        if (ok) {
            j1.setLetrasEncontradas(j1.getLetrasEncontradas() + encontrado);

        } else {
            j1.setJugadasMaximas(j1.getJugadasMaximas() - 1);
        }

        System.out.println("Numero de letras (Encontradas/faltantes)" + j1.getLetrasEncontradas() + "/" + (cantidadletras - j1.getLetrasEncontradas()));

    }

    public void intentos(Ahorcado j1) {
        System.out.println("Le quedan: " + j1.getJugadasMaximas() + " intentos.");
    }

    public void juego() {
        Ahorcado j1 = crearJuego();
        longitud(j1);

        while (j1.getJugadasMaximas()!=0 && j1.getLetrasEncontradas() != j1.getPalabra().length) {
            buscar(j1);
            intentos(j1);
            
        }
    }

}
