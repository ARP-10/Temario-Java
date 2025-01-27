package Fundamentos.POO.Encapsulacion;

public class CuentaBancaria {
    // Atributos 
    private String numeroCuenta;
    private String titular;
    private double saldo;

    // Constructor
    public CuentaBancaria(String numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    // Metodos
    public void depositar(double cantidad) {
        System.out.println("Depositando la cantidad de: " + cantidad);
        double nuevoSaldo = saldo + cantidad;
        System.out.println("El nuevo saldo es de: " + nuevoSaldo);
    }

    public void retirar(double cantidad) {
        System.out.println("Retirando la cantidad de: " + cantidad);
        if (saldo >= cantidad) {
            saldo -= cantidad;
            System.out.println("El nuevo saldo es de: " + saldo);
        } else {
            System.out.println("No se puede retirar mas de lo que tiene en la cuenta");
        }
    }

    public void detalles() {
        System.out.println("El titular de esta cuenta es: " + titular);
        System.out.println("El numero de cuenta es: " + numeroCuenta);
        System.out.println("El saldo actual es de: " + saldo);
    }
}
