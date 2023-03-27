/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por 
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su 
equivalente: 1 día, 2 horas.
*/
package Ejercicios_Extras.pkg2;
import java.util.Scanner;
/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los minutos");
        int minutos = leer.nextInt();
        int horas = minutos/60;
        int dias = 0;
        if (horas >= 24){
            dias++;
            horas -= 24;
            System.out.print(dias + " Dia/s, ");
            System.out.print(horas + " Hora/s.\n");
        }else{
            System.out.print(horas + " Hora/s.\n");
        }
    }

}
