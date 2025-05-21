package Punto2;

import javax.print.attribute.standard.OrientationRequested;
import java.util.*;
import java.util.Collections;

import static Punto2.OrdenamientoComparacion.bubbleSort;
import static Punto2.OrdenamientoComparacion.crearArreglo;

public class Main {
    public static void main(String[] args) {

        int[] tamaños = {100, 1000, 10000};

        for (int tamaño : tamaños) {
            int[] original = crearArreglo(tamaño);

            int[] arreglo1 = Arrays.copyOf(original, original.length);
            int[] arreglo2 = Arrays.copyOf(original, original.length);

            long inicio1 = System.nanoTime();
            bubbleSort(arreglo1);
            long fin1 = System.nanoTime();

            long inicio2 = System.nanoTime();
            Arrays.sort(arreglo2);
            long fin2 = System.nanoTime();

            System.out.println("Tamaño: " + tamaño);
            System.out.println("Bubble Sort: " + (fin1 - inicio1) / 1_000_000.0 + " ms");
            System.out.println("Arrays.sort(): " + (fin2 - inicio2) / 1_000_000.0 + " ms");
            System.out.println();
        }
        System.out.println("--------------------------------");

        //Creacion de los productos
        Producto p1 = new Producto("Jean",200,2);
        Producto p2 = new Producto("Buzo",150,4);
        Producto p3 = new Producto("Zapatillas",250,6);

        //Guardarlos en un arreglo
        Producto[] productos = {p1,p2,p3};


        //Ordenar por precio
        Arrays.sort(productos);

        System.out.println("Ordenados por precio:");
        for (Producto p : productos){
            System.out.println(p);
        }
        System.out.println("------------------------------");


        //Ordenar por nombre
        Arrays.sort(productos);


        System.out.println("Ordenados por nombre:");
        for (Producto p : productos){
            System.out.println(p);
        }

        System.out.println("------------------------------");

        ArrayListProducto producto1 = new ArrayListProducto("Heladera",500,1);
        ArrayListProducto producto2 = new ArrayListProducto("Televisor",800,4);
       ArrayListProducto producto3 = new ArrayListProducto("Notebook", 600, 2);

        List<ArrayListProducto> listaArrayList = new java.util.ArrayList<>();
        listaArrayList.add(producto1);
        listaArrayList.add(producto2);
        listaArrayList.add(producto3);

        //Ordenar por nombres (COMPARABLE)
        System.out.println("Ordenados por nombres:");
        Collections.sort(listaArrayList);
        for (ArrayListProducto p : listaArrayList){
            System.out.println(p);
        }

        System.out.println("-------------------------");

        //Ordenar por precio(Comparator)
        System.out.println("Ordenado por precio:");
        Collections.sort (listaArrayList);
        for (ArrayListProducto p : listaArrayList){
            System.out.println(p);
        }

        System.out.println("-------------------------");

        //OrdenarPorStock
        System.out.println("Ordenados por stock:");
        Collections.sort (listaArrayList);
        for (ArrayListProducto p : listaArrayList){
            System.out.println(p);
        }





    }

}