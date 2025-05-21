import java.util.Scanner;
public class Plano {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la coordenada x ,distinta de 0:");
        int x = scanner.nextInt();
        System.out.println("Ingrese la coordenada y ,distinta de 0:");
        int y = scanner.nextInt();

        if (x == 0 || y == 0){
            System.out.println("Las coordenadas no pueden tener 0");
        }else {
            if (x > 0 && y > 0){
                System.out.println("El punto esta en el primer cuadrante");
            } else if (x < 0 && y > 0){
                System.out.println("El punto esta en el segundo cuadrante");
            } else if (x < 0 && y < 0) {
                System.out.println("El punto esta en el tercer cuadrante");
            } else {
                System.out.println("El punto esta en el cuarto cuadrante");
            }

        }
        }
    }

