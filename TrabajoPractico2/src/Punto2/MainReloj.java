package Punto2;

import java.util.Scanner;
public class MainReloj {

    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);

        Reloj miReloj = new Reloj();
        int opcion = 1;
        System.out.println("Reloj");
        miReloj.establecerHora(13,30,40);

        while (opcion == 1){
            miReloj.mostrarHora();
            System.out.println("Quiere avanzar el tiempo del reloj?");
            System.out.println("1.SI");
            System.out.println("2.NO");
            System.out.println("Ingrese la opcion elegida:");
            opcion = teclado.nextInt();
            if (opcion == 1){
                miReloj.avanzarSegundos();
                miReloj.mostrarHora();
            }
            if (opcion == 2){
                System.out.println("Regrese luego");
            }
            if (opcion<1 || opcion>2){
                System.out.println("La opcion no es valida");
            }
        }


    }
}
