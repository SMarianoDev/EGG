/*
Simular la división usando solamente restas. Dados dos números enteros mayores 
que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo 
restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor 
que el divisor, este resultado es el residuo, y el número de restas realizadas 
es el cociente.

Por ejemplo: 50 / 13:
50 – 13 = 37     una resta realizada
37 – 13 = 24     dos restas realizadas
24 – 13 = 11     tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas

 */
package Ejercicios_Extras.pkg2;

import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese primer y segundo numero");
        int num1 = leer.nextInt(), num2 = leer.nextInt(), i = 0, res = num2;

        while (res >= num2) {
            res = num1 - num2;
            System.out.println(num1 + "-" + num2 + "=" + res);
            num1 = res;
            i++;
        }
        System.out.println("\n"+ "Cociente = " + i + "\n" + "Resto = " + res);
    }
}
