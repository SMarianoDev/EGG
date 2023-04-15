/**
 * d(P1,P2)=√(x2−x1)2+(y2−y1)2
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class Puntos {
    public int x1;
    public int y1;
    public int x2;
    public int y2;
    
    public void crearPuntos() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese x1");
        this.x1 = leer.nextInt();
        System.out.println("Ingrese y1");
        this.y1 = leer.nextInt();
        System.out.println("Ingrese x2");
        this.x2 = leer.nextInt();
        System.out.println("Ingrese y2");
        this.y2 = leer.nextInt();
    }
    
    public double calcularPuntos() {
        return Math.sqrt(Math.pow((this.x2-this.x1),2)+Math.pow((this.y2-this.y1),2));
    }
    
    
}
