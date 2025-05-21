package Punto1;

import java.util.Arrays;
import java.util.Scanner;

public class MainManipulacionArreglos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir el tamaño del arreglo
        System.out.print("Ingrese la cantidad de números: ");
        int tamaño = scanner.nextInt();
        int[] arreglo = new int[tamaño];

        // Leer los valores del arreglo
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Ingrese el número en la posición " + i + ": ");
            arreglo[i] = scanner.nextInt();
        }

        System.out.println("\nArreglo original: " + Arrays.toString(arreglo));

        // Usar métodos de la clase manipulacionArreglos
        int suma = ManipulacionArreglos.calcularSuma(arreglo);
        int mayor = ManipulacionArreglos.encontrarMayor(arreglo);
        int menor = ManipulacionArreglos.encontrarMenor(arreglo);
        int[] invertido = ManipulacionArreglos.invertirArreglo(arreglo);

        // Mostrar resultados
        System.out.println("Suma de elementos: " + suma);
        System.out.println("Mayor elemento: " + mayor);
        System.out.println("Menor elemento: " + menor);
        System.out.println("Arreglo invertido: " + Arrays.toString(invertido));

        scanner.close();
    }
}
