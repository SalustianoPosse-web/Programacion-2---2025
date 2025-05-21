package Punto1;
import java.util.Scanner;

import java.util.Scanner;
public class MainCalculadora {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Calculadora operaciones = new Calculadora();

        System.out.println("CALCULADORA");
        System.out.println("Elija alguna de las siguientes opciones:");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicacion");
        System.out.println("4.Dividir");
        System.out.println("Opcion:");
        int opcion = teclado.nextInt();

        if (opcion<1 || opcion>5){
            System.out.println("Opcion no valida");
            return;

        }

        System.out.println("Ingrese el primer numero:");
        double num1 = teclado.nextDouble();
        System.out.println("Ingrese el segundo numero:");
        double num2 = teclado.nextDouble();

        if(opcion == 1){
            operaciones.sumar(num1, num2);
            System.out.println("El resultado es:"+operaciones.suma);
        }
        if (opcion == 2){
            operaciones.restar(num1, num2);
            System.out.println("El resultado es:"+operaciones.resta);
        }
        if (opcion == 3){
            operaciones.multiplicar(num1, num2);
            System.out.println("El resultado es:"+operaciones.multiplicacion);
        }
        if (opcion == 4){
            operaciones.dividir(num1, num2);
            System.out.println("El resultado es:"+operaciones.division);
        }




    }
}