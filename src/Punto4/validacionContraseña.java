package Punto4;
import java.util.Random;

public class validacionContraseña {

    public static void validacionLongitud(String contraseña) {
        int longitud = contraseña.length();

        if (longitud >= 8) {
            System.out.println("Longitud de contraseña válida");
        } else {
            System.out.println("Longitud de contraseña inválida");
            System.exit(0);
        }
    }

    public static boolean validacionDigitos(String contraseña) {
        for (int i = 0; i < contraseña.length(); i++) {
            if (Character.isDigit(contraseña.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean validacionCaracter(String contraseña) {
        for (int i = 0; i < contraseña.length(); i++) {
            char c = contraseña.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public static String contraseñaAleatoria(int longitud) {
        String letrasMay = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        String letrasMin = "abcdefghijklmnñopqrstuvwxyz";
        String numeros = "0123456789";
        String caracteres = "!@#$%^&*";
        String cadena = letrasMay + letrasMin + numeros + caracteres;
        Random random = new Random();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt(cadena.length());
            sb.append(cadena.charAt(indice));
        }
        return sb.toString();
    }
}
