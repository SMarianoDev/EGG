/*
Los profesores del curso de programación de Egg necesitan llevar un 
registro de las notas adquiridas por sus 10 alumnos para luego obtener 
una cantidad de aprobados y desaprobados. Durante el período de cursado 
cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales. 
Las ponderaciones de cada nota son:

Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%

 */
package Ejercicios_Extras;

import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int alumnos = 10;
        int notas = 4;
        double[][] matriz = new double[alumnos][notas];

        llenarNotas(matriz, alumnos, notas, leer);
        calcularNotas(matriz, alumnos, notas);

    }

    public static void llenarNotas(double[][] matriz, int a, int n, Scanner leer) {
        int nota;
        double suma = 0;
        for (int i = 0; i < a; i++) {
            System.out.println("Alumno " + (i + 1));
            suma = 0;
            for (int j = 0; j < n; j++) {
                switch (j) {
                    case 0:
                        System.out.print("Nota Primer Trabajo practico: ");
                        nota = leer.nextInt();
                        matriz[i][j] = nota * 0.10;
                        suma += nota;
                        break;
                    case 1:
                        System.out.print("Segundo Trabajo practico: ");
                        nota = leer.nextInt();
                        matriz[i][j] = nota * 0.15;
                        suma += nota;
                        break;
                    case 2:
                        System.out.print("Primer Integrador: ");
                        nota = leer.nextInt();
                        matriz[i][j] = nota * 0.25;
                        suma += nota;
                        break;
                    case 3:
                        System.out.print("Segundo Integrador: ");
                        nota = leer.nextInt();
                        matriz[i][j] = nota * 0.50;
                        suma += nota;
                        break;
                }//                
            }
            System.out.println("Promedio:"+(int)(suma/4)+"\n");
            
        }
    }

    public static void calcularNotas(double[][] matriz, int a, int n) {
        int aprobados = 0, desaprobados = 0;
        for (int i = 0; i < a; i++) {
            double suma = 0;
            for (int j = 0; j < n; j++) {
                suma += matriz[i][j];
            }
            if (suma >= 6) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }
        System.out.println("\nAlumnos aprobados: " + aprobados);
        System.out.println("Alumnos desaprobados: " + desaprobados);
    }

}
