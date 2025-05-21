package Punto3;
import java.util.Scanner;
public class MainBanco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Crear una cuenta bancaria con datos fijos
        CuentaBancaria miCuenta = new CuentaBancaria("12345", "Salustiano Posse", 10000);

        //Verificacion del numero de cuenta
        System.out.println("Ingrese el numero de cuenta para acceder:");
        String numeeroIngresado = teclado.nextLine();

        if (numeeroIngresado.equals("12345")) {
            System.out.println("Acceso concedido a la cuenta bancaria");
            System.out.println("Bienvenido Salustiano Posse");

            //Menu de opciones
            int opcion;

            do {
                System.out.println("Elija alguna de las siguientes opciones");
                System.out.println("1.Retirar dinero");
                System.out.println("2.Depositar dinero");
                System.out.println("3.Consultar saldo disponible");
                System.out.println("Opcion:");
                opcion = teclado.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese la cantidad de dinero a retirar:");
                        double retiro = teclado.nextDouble();
                        miCuenta.retirar(retiro);
                        return;
                    case 2:
                        System.out.println("Ingrese la cantidad de dinero que desea depositar:");
                        double deposito = teclado.nextDouble();
                        miCuenta.depositar(deposito);
                        return;
                    case 3:
                        System.out.println("Saldo actual:" + miCuenta.consultarSaldo());
                        break;
                    case 4:
                        System.out.println("Gracias por utilizar el banco. Regrese pronto");
                        break;
                    default:
                        System.out.println("Opcion invalida. Intente nuevamente");
                }
            } while (opcion != 4);
        }else {
            System.out.println("Numero de cuenta incorrecta. Acceso denegado.");
        }
        teclado.close();
    }



}

