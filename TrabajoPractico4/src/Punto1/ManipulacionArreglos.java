package Punto1;

public class ManipulacionArreglos {

    public static int calcularSuma(int[] arreglo) {
        int suma = 0;
        for (int num : arreglo) {
            suma += num;
        }
        return suma;
    }

    public static int encontrarMayor(int[] arreglo) {
        int mayor = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
            }
        }
        return mayor;
    }

    public static int encontrarMenor(int[] arreglo) {
        int menor = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < menor) {
                menor = arreglo[i];
            }
        }
        return menor;
    }

    public static int[] invertirArreglo(int[] arreglo) {
        int n = arreglo.length;
        int[] invertido = new int[n];
        for (int i = 0; i < n; i++) {
            invertido[i] = arreglo[n - 1 - i];
        }
        return invertido;
    }
}
