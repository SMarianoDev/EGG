package entidades;

import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class Empleado {

    private String nombre;
    private int edad;
    private int salario;

    public Empleado() {
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void llenarDatos() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Igrese nombre: ");
        this.nombre = leer.next();
        System.out.print("Ingrese edad: ");
        this.edad = leer.nextInt();
        System.out.println("Ingrese salario: ");
        this.salario = leer.nextInt();
    }

    public void calcularAumento(int edad) {
        if (edad <= 30) {
            this.salario += this.salario * 0.05;
            
        } else {
            this.salario += this.salario * 0.10;
        }

    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre= " + nombre + ", edad= " + edad + ", salario con aumento= " + salario + '}';
    }
    

}
