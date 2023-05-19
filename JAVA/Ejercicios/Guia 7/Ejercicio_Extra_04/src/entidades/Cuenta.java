package entidades;

/**
 *
 * @author Mariano Sotelo
 */
public class Cuenta {

    private int saldo;
    private String titular;

    public Cuenta() {
    }

    public Cuenta(int saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String retirarDinero(int retiro) {

        this.saldo -= retiro;
        return "saldo:" + this.saldo;

    }

}
