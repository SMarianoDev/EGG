package entidades;

import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class Operacion {

    private int num1;
    private int num2;

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Operacion() {
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void crearOperacion() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresar num1");
        this.num1 = leer.nextInt();
        System.out.println("Ingrese num2");
        this.num2 = leer.nextInt();
    }

    public void sumar(int num1, int num2) {
        System.out.println("Suma: " + (num1 + num2));

    }

    public void restar(int num1, int num2) {
        System.out.println("Resta: " + (num1 - num2));
    }

    public void multiplicar(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            System.out.println("Multiplicacion: " + 0 + " ¡Error 404!");
        } else {
            System.out.println("Multiplicacion: " + (num1 * num2));
        }

    }

    public void dividir(double num1, double num2) {
        if (num1 == 0 || num2 == 0) {
            System.out.println("Division: " + 0 + " ¡Error 404!");
        } else {
            System.out.println("Division: " + (num1 / num2));
        }

    }
//    public void mostrarTodo(){
//        sumar(num1, num2);
//        restar(num1, num2);
//        multiplicar(num1, num2);
//        dividir(num1, num2);
//    }

}
