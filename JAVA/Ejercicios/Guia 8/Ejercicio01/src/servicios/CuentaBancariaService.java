package servicios;

import entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Mariano Sotelo
 */
public class CuentaBancariaService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public CuentaBancaria crearCuenta() {
        System.out.println("Ingresar numero de cuenta");
        int cuenta = leer.nextInt();
        System.out.println("Ingresar DNI");
        long dni = leer.nextLong();
        System.out.println("Ingresar Saldo");
        int saldo = leer.nextInt();

        return new CuentaBancaria(cuenta, dni, saldo);
    }

    public double ingresar(CuentaBancaria saldo) {
        System.out.print("Cuanto desea ingresar? ");
        double ingreso = leer.nextDouble();
        saldo.setSaldoActual(saldo.getSaldoActual() + ingreso);

        return saldo.getSaldoActual();
    }

    public double retirar(CuentaBancaria saldo) {
        System.out.print("Cuanto desea retirar? ");
        double retiro = leer.nextDouble();
        if (retiro > saldo.getSaldoActual()) {
            System.out.println("Saldo insuficiente, usted posee " + saldo.getSaldoActual());
            saldo.setSaldoActual(0);
        } else {
            System.out.println("Usted retiro " + retiro);
            saldo.setSaldoActual(saldo.getSaldoActual() - retiro);
        }
        return saldo.getSaldoActual();
    }

    public void extraccionRapida(CuentaBancaria saldo) {

        do {
            System.out.print("Cuanto desea retirar? ");
            double retiroRapido = leer.nextDouble();

            if (retiroRapido <= saldo.getSaldoActual() * 0.2) {
                saldo.setSaldoActual(saldo.getSaldoActual() - retiroRapido);
                break;
            } else {
                System.out.println("monto invalido, puede sacar hasta " + (saldo.getSaldoActual() * 0.2));
            }
        } while (true);

    }

    public void consultarSaldo(CuentaBancaria saldo) {
        System.out.println("Saldo: " + saldo.getSaldoActual());
    }
    
    public void consultarDatos(CuentaBancaria saldo) {
        System.out.println("Numero de cuenta: " + saldo.getCuentaBancaria());
        System.out.println("DNI: " + saldo.getDniCliente());
        System.out.println("Saldo actual: " + saldo.getSaldoActual());
        
    }
    

}
