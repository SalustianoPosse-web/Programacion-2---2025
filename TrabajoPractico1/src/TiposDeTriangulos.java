import java.util.Scanner;
public class TiposDeTriangulos {
    public static void main(String[] args) {

        Scanner Lados = new Scanner(System.in);

        System.out.println("Cuantos triangulos va a ingresar?: ");
        int n = Lados.nextInt();

        int contEquilateros = 0;
        int contIsosceles = 0;
        int contEscaleno = 0;

        for (int i = 1; i <= n; i++) {

            System.out.println("triangulo: " + i);

            System.out.println("Lado 1: ");
            int lado1 = Lados.nextInt();

            System.out.println("Lado 2: ");
            int lado2 = Lados.nextInt();

            System.out.println("Lado 3: ");
            int lado3 = Lados.nextInt();


            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("El triangulo es Equilatero");
                contEquilateros++;
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("El triangulo es Isosceles");
                contIsosceles++;
            } else {
                System.out.println("El triangulo es Escaleno");
                contEscaleno++;
            }
        }

        System.out.println("\nCantidad de triángulos Equiláteros: " + contEquilateros);
        System.out.println("Cantidad de triángulos Isósceles: " + contIsosceles);
        System.out.println("Cantidad de triángulos Escalenos: " + contEscaleno);

        if (contEquilateros <= contIsosceles && contEquilateros <= contEscaleno) {
            System.out.println("El tipo con menor cantidad es: Equilátero");
        } else if (contIsosceles <= contEquilateros && contIsosceles <= contEscaleno) {
            System.out.println("El tipo con menor cantidad es: Isósceles");
        } else {
            System.out.println("El tipo con menor cantidad es: Escaleno");
        }


    }
}
