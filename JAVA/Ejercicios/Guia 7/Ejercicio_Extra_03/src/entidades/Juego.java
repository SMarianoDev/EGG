
package entidades;

import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class Juego {
    private int num1;
    public int num2;
    public int intentos;
    public int ganador1;
    public int ganador2;

//    public Juego() {
//    }

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

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public int getGanador1() {
        return ganador1;
    }

    public void setGanador1(int ganador1) {
        this.ganador1 = ganador1;
    }

    public int getGanador2() {
        return ganador2;
    }

    public void setGanador2(int ganador2) {
        this.ganador2 = ganador2;
    }

    
    public void iniciarJuego() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Cuantos intentos se podran? ");
        int i = leer.nextInt();
        do {        
        System.out.print("Ingrese un numero: ");
        this.num2 = leer.nextInt();
        intentos++;
            if (num2 == num1) {
                ganador2++;
                System.out.println("ADIVINASTE!\n");
                break;
            }else if (num2<num1){
                System.out.println("El numero es mayor al ingresado. "+(i-intentos)+" intentos restantes.\n");
            }else{
                System.out.println("El numero es menor al ingresado. "+(i-intentos)+" intentos restantes.\n");
            }
        } while (intentos<i);
        if (num2 != num1) {
            ganador1++;
            System.out.println("PERDISTE! El numero era: "+this.num1);
        }
        
    }
    
    
}
