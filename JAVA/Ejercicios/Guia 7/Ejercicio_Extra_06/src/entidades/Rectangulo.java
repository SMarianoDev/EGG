package entidades;

/**
 *
 * @author Mariano Sotelo
 */
public class Rectangulo {

    public int lado1;
    public int lado2;

    public Rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public int calcularArea() {
        return this.lado1 * this.lado2;
    }

}
