/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo 
privado altura. La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados 
por el usuario. También incluirá un método para calcular la superficie del rectángulo y un método para 
calcular el perímetro del rectángulo. Por último, tendremos un método que dibujará el rectángulo 
mediante asteriscos usando la base y la altura. Se deberán además definir los métodos getters, setters 
y constructores correspondientes.

Superficie = base * altura / Perímetro = (base + altura) * 2.

 */
package ejercicio04;

import entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Rectangulo r1 = new Rectangulo();

        System.out.print("Ingrese Base: ");
        r1.setBase(leer.nextDouble());
        System.out.print("Ingrese Altura: ");
        r1.setAltura(leer.nextDouble());
        
        System.out.println("Superficie: " + r1.superficie());
        System.out.println("Perimetro: " + r1.perimetro());
        
        r1.dibujar(r1.getBase(),r1.getAltura());

    }

}
