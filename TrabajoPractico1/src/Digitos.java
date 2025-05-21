import java.util.Scanner;
public class Digitos {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero del 1 al 99:");
        int numero = scanner.nextInt();

        if (numero < 1 || numero > 99 ){
            System.out.println("Numero fuera de rango.Debe estar entre 1 y 99");
        } else if (numero < 10) {
            System.out.println("El numero tiene un digito");

        }else {
            System.out.println("El numero tiene dos digitos");
        }
    }

}
