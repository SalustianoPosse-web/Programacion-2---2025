package Punto4;
import java.util.Scanner;

public class MainValidacionContraseña {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Contraseña");
        System.out.println("Ingrese contraseña por favor:");
        String contraseña = scanner.nextLine();

        validacionContraseña.validacionLongitud(contraseña);

        if (!validacionContraseña.validacionDigitos(contraseña)) {
            System.out.println("No es válida, no contiene carácter numérico");
            System.exit(0);
        }

        if (!validacionContraseña.validacionCaracter(contraseña)) {
            System.out.println("No es válida, no contiene carácter especial");
            System.exit(0);
        }

        System.out.println("Contraseña segura");
        System.out.println("Contraseña aleatoria: " + validacionContraseña.contraseñaAleatoria(10));

        scanner.close();
    }
}
