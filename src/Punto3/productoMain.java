package Punto3;
import java.time.LocalDate;

public class productoMain {
    public static void main(String[] args){
        productoAlimenticio leche = new productoAlimenticio("leche", 500, LocalDate.of(2025,9,15));

        productoElectronico parlante = new productoElectronico("jbl", 100000, 24);

        productoRopa remera = new productoRopa("adidas", 25000, "L");


        System.out.println("----INFORME DE PRODUCTOS----");

        leche.mostrarDetalles();
        System.out.println();

        parlante.mostrarDetalles();
        System.out.println();

        remera.mostrarDetalles();


    }




}
