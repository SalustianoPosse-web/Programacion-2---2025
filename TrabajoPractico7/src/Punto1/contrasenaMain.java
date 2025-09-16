package Punto1;
import java.util.Scanner;

public class contrasenaMain {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese una contraseña: (o escriba salir para terminar): ");
            String pass = scanner.nextLine();

            if (pass.equalsIgnoreCase("salir")) {
                System.out.println("Programa finalizado.");
                break;
                    }

             contrasenaValida validador = new contrasenaValida(pass);

            try {
                validador.validar();
            } catch (contrasenaInvalida e) {
                System.out.println("Error: " + e.getMessage());
            }
            System.out.println("--------------------");
                }
              scanner.close();
            }
        }
