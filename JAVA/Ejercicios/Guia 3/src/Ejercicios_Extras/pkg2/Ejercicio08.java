/*
Escriba un programa que lea números enteros. Si el número es múltiplo de 
cinco debe detener la lectura y mostrar la cantidad de números leídos, la 
cantidad de números pares y la cantidad de números impares. Al igual que 
en el ejercicio anterior los números negativos no deben sumarse. 
Nota: recordar el uso de la sentencia break.
 */
package Ejercicios_Extras.pkg2;

import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int i = 0,numPar = 0,numImpar = 0;
        do {
                System.out.println("Ingrese un numero");
            int num = leer.nextInt();
            
            if (num % 5 == 0) {
                break;
            }if (num<0){
                System.out.println("Ingrese numeros positivos");
            }else {
                i++;
                if(num%2 == 0){
                    numPar++;
                }else{
                    numImpar++;
                }
            }
        } while (i>0);
        System.out.println("Numeros Pares: "+numPar);
        System.out.println("Numeros Impares: "+numImpar);
    }

}
