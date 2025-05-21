package Punto2;
import java.util.Scanner;

public class calculoDeInteres {
    public static void calcular() {

        Scanner scanner = new Scanner(System.in);

        double inversionInicial = 10000;
        double tasaInteresAnual = 0.06;
        int años = 5;

        double valorFuturo = inversionInicial * Math.pow(1 + tasaInteresAnual, años);
        System.out.println("Valor futuro sin redondeo:" + valorFuturo);

        long redondeoNormal1 = Math.round(valorFuturo);
        System.out.println("Valor futuro redondeado:" + redondeoNormal1);

        double redondeoAbajo = Math.ceil(valorFuturo);
        System.out.println("Valor futuro redondeado hacia abajo:" + redondeoAbajo);

        double redondeoArriba = Math.floor(valorFuturo);
        System.out.println("Valor futuro redondeado hacia arriba:" + redondeoArriba);
    }
}
