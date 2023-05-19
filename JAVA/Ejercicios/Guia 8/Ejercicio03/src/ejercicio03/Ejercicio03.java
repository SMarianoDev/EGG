/*

 */
package ejercicio03;

import entidades.Persona;
import java.util.Scanner;
import servicios.PersonaService;

/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio03 {

    public static void main(String[] args) {

        PersonaService ps = new PersonaService();

        int[] cont = new int[5];
        int contBP = 0, contPI = 0, contSP = 0, contMa = 0, contMe = 0;

        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    Persona persona0 = ps.crearPersona();
                    switch (ps.calcularIMC(persona0)) {
                        case -1:
                            cont[0] = contBP++;
                            break;
                        case 0:
                            cont[1] = contPI++;
                            break;
                        case 1:
                            cont[2] = contSP++;
                            break;
                    }
                    if (ps.esMayorDeEdad(persona0) == true) {
                        cont[3] = contMa++;
                    } else {
                        cont[4] = contMe++;
                    }

                    break;

                case 1:
                    Persona persona1 = ps.crearPersona();
                    switch (ps.calcularIMC(persona1)) {
                        case -1:
                            cont[0] = contBP++;
                            break;
                        case 0:
                            cont[1] = contPI++;
                            break;
                        case 1:
                            cont[2] = contSP++;
                            break;
                    }
                    if (ps.esMayorDeEdad(persona1) == true) {
                        cont[3] = contMa++;
                    } else {
                        cont[4] = contMe++;
                    }
                    break;
                case 2:
                    Persona persona2 = ps.crearPersona();
                    switch (ps.calcularIMC(persona2)) {
                        case -1:
                            cont[0] = contBP++;
                            break;
                        case 0:
                            cont[1] = contPI++;
                            break;
                        case 1:
                            cont[2] = contSP++;
                            break;
                    }
                    if (ps.esMayorDeEdad(persona2) == true) {
                        cont[3] = contMa++;
                    } else {
                        cont[4] = contMe++;
                    }
                    break;
                case 3:
                    Persona persona3 = ps.crearPersona();
                    switch (ps.calcularIMC(persona3)) {
                        case -1:
                            cont[0] = contBP++;
                            break;
                        case 0:
                            cont[1] = contPI++;
                            break;
                        case 1:
                            cont[2] = contSP++;
                            break;
                    }
                    if (ps.esMayorDeEdad(persona3) == true) {
                        cont[3] = contMa++;
                    } else {
                        cont[4] = contMe++;
                    }
                    break;
                case 4:
                    Persona persona4 = ps.crearPersona();
                    switch (ps.calcularIMC(persona4)) {
                        case -1:
                            cont[0] = contBP++;
                            break;
                        case 0:
                            cont[1] = contPI++;
                            break;
                        case 1:
                            cont[2] = contSP++;
                            break;
                    }
                    if (ps.esMayorDeEdad(persona4) == true) {
                        cont[3] = contMa++;
                    } else {
                        cont[4] = contMe++;
                    }
                    break;
                default:
                    System.out.println("");
            }

        }

        for (int i = 0; i < 5; i++) {
            System.out.print(cont[i]);
        }

    }

}
