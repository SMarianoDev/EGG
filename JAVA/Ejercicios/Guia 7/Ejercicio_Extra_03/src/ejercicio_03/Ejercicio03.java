/*
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores jugar un 
juego de adivinanza de números. El primer jugador elige un número y el segundo jugador intenta adivinarlo. 
El segundo jugador tiene un número limitado de intentos y recibe una pista de "más alto" o "más bajo" 
después de cada intento. El juego termina cuando el segundo jugador adivina el número o se queda sin intentos. 
Registra el número de intentos necesarios para adivinar el número y el número de veces que cada jugador ha ganado.
 */
package ejercicio_03;

import entidades.Juego;
import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        String op;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Juego j1 = new Juego();

        j1.setNum1((int) (Math.random() * 20));

        do {
            j1.iniciarJuego();
            System.out.println("Desea seguir jugando? S/N");
            op = leer.next();
            
            while (true) {
                if (op.equalsIgnoreCase("S") || op.equalsIgnoreCase("N")) {
                    break;
                } else {
                    System.out.println("Ingrese una opcion correcta S/N");
                    op = leer.next();
                }
            }
            
            if (op.equalsIgnoreCase("N")) {
                System.out.println("Jugador 1 ganó: " + j1.getGanador1() + " veces.");
                System.out.println("Jugador 2 ganó: " + j1.getGanador2() + " veces.");
                break;
            } else if (op.equalsIgnoreCase("S")) {
                j1.setNum1((int) (Math.random() * 20));
                j1.intentos = 0;
            }
            
        } while (true);

    }

}
