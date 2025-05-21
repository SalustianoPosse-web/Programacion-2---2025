package Punto3;
public class CuentaBancaria {

    //Atributos
    String numeroCuenta;
    String titular;
    double saldo;

    //Constructor
    public CuentaBancaria(String numCuenta, String nombreTitular, double saldoInicial){
        numeroCuenta = numCuenta;
        titular = nombreTitular;
        saldo = saldoInicial;
    }

    //Metodo para depositar dinero
    public void depositar(double cantidadDepositado){
        if (cantidadDepositado > 0){
            saldo += cantidadDepositado;
            System.out.println("Deposito exitoso. Nuevo saldo es:" +saldo);
        }else {
            System.out.println("Cantidad invalida para depositar");
        }
    }

    //Metodo para retirar dinero
    public  void retirar(double cantidadRetiro){
        if (cantidadRetiro <= saldo){
            saldo -= cantidadRetiro;
            System.out.println("Retiro exitoso. Nuevo saldo es:" +saldo);
        }else {
            System.out.println("Error saldo insuficiente, intente nuevamente");
        }

    }

    //Metodo para consultar el saldo
    public double consultarSaldo(){
        return saldo;
    }

}

