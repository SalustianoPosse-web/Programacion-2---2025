package Punto5;
public class Empleado {
    //Atributos
    int legajo;
    String nombre;
    double salario;
    static int cantidadEmpleados = 0;

    //Constructor
    public Empleado(int leg, String nom, double sal){
        legajo = leg;
        nombre = nom;
        salario = sal;
        cantidadEmpleados++;
    }

    //Metodos
    public void aumentarSalarioPorPorcentaje(double porcentaje, String motivo){
        double aumento = salario * porcentaje / 100;
        salario += aumento;
        System.out.println("Aumento de salario por porcentaje ("+ porcentaje + "%): " + motivo);
        System.out.println("Nuevo salario:" +salario);
    }

    public void aumentarSalarioPorMontoFijo(double monto, String motivo){
        salario += monto;
        System.out.println("Aumento de salario por monto fijo (" + monto + "): " + motivo);
        System.out.println("Nuevo salario:" +salario);
    }

    public static int obtenerCantidadEmpleados(){
        return cantidadEmpleados;
    }

    public void mosstrarInformacion(){
        System.out.println("Legajo:" +legajo);
        System.out.println("Nombre:" +nombre);
        System.out.println("Salario:" +salario);
        System.out.println();
    }


}

