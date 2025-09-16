package Punto3;

import java.util.Scanner;

public class ticketOnlineMain {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        salaCine sala = new salaCine(5);

    while (true){
        System.out.println("---RESERVAS---");
        System.out.println("Asientos disponibles: " + sala.asientosDisponibles());
        System.out.println("Ingrese el numero de asiento a reservar (0 para salir del sistema): ");

        int numero;
        try{
            numero = scanner.nextInt();
        }catch (Exception e){
            System.out.println("Entrada invalida, debe ingresar un numero");
            scanner.nextLine();
            continue;
        }
        if (numero == 0){
            System.out.println("GRACIAS POR USAR TICKETONLINE, VUELVA PRONTO");
            break;
        }

        try {
            sala.reservar(numero);
        }catch (IllegalArgumentException | IllegalStateException e){
            System.out.println(" ❌ Error: " + e.getMessage());
            System.out.println(" Intente nuevamente");
        }
    }
    scanner.close();

    }
}
