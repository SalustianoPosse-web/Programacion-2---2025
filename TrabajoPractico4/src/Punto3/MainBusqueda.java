package Punto3;

import java.util.Scanner;

public class MainBusqueda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear arreglo de nombres
        String[] nombres = {"Salu", "Feli", "Fran", "Huerto", "Seba", "Nacho", "Alberto"};

        // Mostrar arreglo ordenado
        BusquedaEnArreglos.mostrarArregloOrdenado(nombres);

        // Pedir al usuario qué buscar
        System.out.print("Ingrese una cadena para buscar: ");
        String busqueda = scanner.nextLine();

        // Buscar la cadena
        int posicion = BusquedaEnArreglos.buscarCadena(nombres, busqueda);

        // Mostrar resultado
        if (posicion >= 0) {
            System.out.println("Cadena encontrada en la posición: " + posicion);
        } else {
            System.out.println("Cadena no encontrada en el arreglo.");
        }

        scanner.close();
    }
}