/*

*/
package ejercicio01;

import entidades.CuentaBancaria;
import java.util.Scanner;
import servicios.CuentaBancariaService;

/**
 *
 * @author Mariano Sotelo
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CuentaBancariaService cbs = new CuentaBancariaService();
        
        CuentaBancaria usuario1 = cbs.crearCuenta();
        int op;
        
         do {
        System.out.println("MENU\n1- Ingresar dinero.\n2- Retirar dinero.\n3- Extraccion rapida.\n4- Consutlar saldo.\n5-Consultar datos\n6- Salir");
        
        op = leer.nextInt();
        switch (op) {
            case 1:
                System.out.println(cbs.ingresar(usuario1));
                break;
            case 2:
                System.out.println(cbs.retirar(usuario1));;
                break;
            case 3:
                cbs.extraccionRapida(usuario1);
                break;
            case 4:
                cbs.consultarSaldo(usuario1);
                break;
            case 5:
                cbs.consultarDatos(usuario1);
                break;
            case 6:
                break;
            default:
                System.out.println("La opcion no es correcta.");
        }
        } while (op != 6);
    }

}
