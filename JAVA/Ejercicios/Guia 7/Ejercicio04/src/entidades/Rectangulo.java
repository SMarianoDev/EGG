package entidades;

/**
 *
 * @author Mariano Sotelo
 */
public class Rectangulo {

    private double base;
    private double altura;

    public Rectangulo() {
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    

    public double superficie() {
            return this.base * this.altura;

    }

    public double perimetro() {
            return (this.base + this.altura) * 2;
    }

    public void dibujar(double base, double altura) {

        for (int i = 0; i < (int)altura; i++) {
            for (int j = 0; j < (int)base; j++) {
                if (i == 0 || i == ((int)altura - 1) && j < (int)base) {
                    System.out.print("* ");
                } else if (j == 0 || j == ((int)base - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

    }

}
