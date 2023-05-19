/*

 */
package ejercicio03;
//import java.util.Scanner;

import servicios.ArrayService;

/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        float[] vectorA = new float[50];
        float[] vectorB = new float[20];

        ArrayService as = new ArrayService();
        

        as.inicializarA(vectorA);
        System.out.print("VectorA sin ordenar: ");
        as.mostrar(vectorA);
        as.ordenar(vectorA);
        System.out.print("VectorA ordenado:    ");
        as.mostrar(vectorA);
        as.inicializarB(vectorA, vectorB);
        System.out.print("VectorA: ");
        as.mostrar(vectorA);
        System.out.print("VectorB: ");
        as.mostrar(vectorB);

    }

}
