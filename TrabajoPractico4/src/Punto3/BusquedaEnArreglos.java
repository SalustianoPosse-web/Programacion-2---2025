package Punto3;

import java.util.Arrays;

public class BusquedaEnArreglos {

    public static void mostrarArregloOrdenado(String[] nombres) {
        Arrays.sort(nombres);
        System.out.println("Arreglo ordenado: " + Arrays.toString(nombres));
    }

    public static int buscarCadena(String[] nombres, String busqueda) {
        return Arrays.binarySearch(nombres, busqueda);
    }
}

