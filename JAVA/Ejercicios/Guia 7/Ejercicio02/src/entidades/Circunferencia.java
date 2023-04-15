package entidades;

import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class Circunferencia {

    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public void crearCircunferencia() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese Radio");
        this.radio = leer.nextInt();
    }

    public double area(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public double perimetro(double radio) {
        return 2 * Math.PI * radio;
    }
    
}
