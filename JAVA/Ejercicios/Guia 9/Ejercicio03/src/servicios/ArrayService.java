package servicios;

import java.util.Arrays;
import java.text.DecimalFormat; // Packete que importo para poder usar el formato de decimales.

/**
 *
 * @author Mariano Sotelo
 */
public class ArrayService {

    public float[] inicializarA(float[] vectorA) {

        for (int i = 0; i < vectorA.length; i++) {

            vectorA[i] =(float) (Math.random() * 100 + 1);
        }
        return vectorA;
    }

    public void mostrar(float[] vector) {
        DecimalFormat df = new DecimalFormat("##.##");              // Genera un formato de decimales de 2 numeros y 2 decimales. NO ESTA EN LA GUIA

        for (int i = 0; i < vector.length; i++) {
            System.out.print(" [" + df.format(vector[i]) + "] ");   // Aplico el formato de decimales con el valor que tengo en mi posicion del array.
//            System.out.print(" [" + (vector[i]) + "] ");
        }
        System.out.println("");

    }

    public float[] ordenar(float[] vector) {
        float[] vectorAux = new float[vector.length];               //Creo un array para poder pasar todos los valores del parametro en este array y no perder sus valores.
        
        Arrays.sort(vector);                                        // Ordeno el array de menor a mayor
        System.arraycopy(vector, 0, vectorAux, 0, vector.length);       // Copio el array vector en vectorAux. ESTE FORMATO NO ESTA EN LA GUIA pero es lo mismo que haria en la linea 45 a 47..
        for (int i = 0; i < vector.length; i++) {
            vector[i] = vectorAux[vector.length - 1 - i];           // Remplazo los valores de Vector por los que tengo en VectorAux pero en forma invertida.
        }
        return vector;

    }

    public float[] inicializarB(float[] vectorA, float[] vectorB) {
        for (int i = 0; i < vectorB.length / 2; i++) {
            vectorB[i] = vectorA[i];                            // Reemplazo los valores de vectorB por los 10 primeros numeros de vectorA.
        }
        Arrays.fill(vectorB, 10, vectorB.length, (float)0.5); // Reemplazo los valores de vectorB desde su posicion 10 hasta el largo, por el numero 0.5

        return vectorB;
    }

}
