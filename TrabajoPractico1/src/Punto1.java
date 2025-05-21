import java.util.Scanner;

public class Punto1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresá la nota del alumno (0 a 10): ");
        int nota = scanner.nextInt();

        if (nota < 0 || nota > 10) {
            System.out.println("La nota ingresada no es válida. Debe estar" + " entre 0 y 10.");
        } else if (nota < 4) {
            System.out.println("El alumno desaprobó la materia.");
        } else if (nota == 10) {
            System.out.println("El alumno aprobó y es sobresaliente.");
        } else {
            System.out.println("El alumno aprobó la materia.");
        }

        scanner.close();
    }
}
