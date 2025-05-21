package Punto1;
public class Calculadora {
    //Atributos
    double suma;
    double resta;
    double multiplicacion;
    double division;

    //Metodos
    public void sumar (double numero1, double numero2){
        suma = numero1 + numero2;
    }
    public  void  restar (double numero1, double numero2){
        resta = numero1 - numero2;
    }
    public  void  multiplicar (double numero1, double numero2){
        multiplicacion = numero1 * numero2;
    }
    public void dividir (double numero1, double numero2){
        if (numero2 != 0){
            division = numero1 / numero2;
        }
        else {
            System.out.println("No se puede dividir por 0,ingrese otro numero");

        }
    }

}
