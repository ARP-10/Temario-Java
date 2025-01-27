package Fundamentos.POO.Encapsulacion;

public class Banco {
    public static void main(String[] args) {

        CuentaBancaria cuenta1 = new CuentaBancaria("ES56 67876 6453", "Alejandra", 0);

        cuenta1.detalles();
        cuenta1.depositar(30);
        cuenta1.retirar(20);
        cuenta1.detalles();
        cuenta1.depositar(100);
        cuenta1.retirar(30);

    }
}
