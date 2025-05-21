import java.util.Scanner;

public class NotaAlumno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la nota del primer parcial: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Ingrese la nota del segundo parcial: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Ingrese la nota del tercer parcial: ");
        double nota3 = scanner.nextDouble();

        double promedio = (nota1+nota2+nota3)/3;

        if (promedio >= 8) {
            System.out.println("El alumno está promocionado, ¡felicitaciones!");
        } else if (promedio >= 4) {
            System.out.println("El alumno esta regular.");
        } else {
            System.out.println("El alumno desaprobó la materia.");
        }


    }
}

