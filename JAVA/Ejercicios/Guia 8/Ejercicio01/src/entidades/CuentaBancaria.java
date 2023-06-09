
package entidades;

/**
 *
 * @author Mariano Sotelo
 */
public class CuentaBancaria {
    private int cuentaBancaria;
    private long dniCliente;
    private double saldoActual;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int cuentaBancaria, long dniCliente, int saldoActual) {
        this.cuentaBancaria = cuentaBancaria;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    public int getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(int cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    

}
