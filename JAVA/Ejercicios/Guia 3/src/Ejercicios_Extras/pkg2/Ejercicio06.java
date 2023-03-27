/*
Leer la altura de N personas y determinar el promedio de estaturas que 
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package Ejercicios_Extras.pkg2;

import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int i = 0,j = 0, suma=0, suma2=0;
        boolean op=false;
        do {
            System.out.println("Ingrese la altura de la " + (i+1) + " persona. Ingrese 0 para terminar");
            double altura = leer.nextDouble()*100;
            if (altura > 0) {
                suma += altura;
                i++;
            }
            if (altura < 160 ){
                if(altura==0){
                    break;
                }
                suma2 += altura;
                j++;
            }
        } while (!op);
        double total = suma/i;
        double totalmenor = suma2/j;
        System.out.println("El promedio total es de: " +(total/100) + "m");
        System.out.println("El promedio debajo de 1.5m es de: "+(totalmenor/100+"m"));
    }

}
