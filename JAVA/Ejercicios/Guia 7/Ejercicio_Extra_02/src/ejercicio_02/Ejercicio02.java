/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus atributos 
serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos usando un método crearPuntos() 
que le pide al usuario los dos números y los ingresa en los atributos del objeto. Después, a través 
de otro método calcular y devolver la distancia que existe entre los dos puntos que existen en 
la clase Puntos.

d(P1,P2)=√(x2−x1)2+(y2−y1)2

 */
package ejercicio_02;

import entidades.Puntos;
import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio02 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Puntos p1 = new Puntos();

        p1.crearPuntos();
        System.out.println("Distancia de: "+p1.calcularPuntos());
        
    }

}
