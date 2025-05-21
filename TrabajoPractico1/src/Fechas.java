import java.util.Scanner;
public class Fechas {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el dia:");
        int dia = scanner.nextInt();

        System.out.println("Ingrese el mes(1 al 12):");
        int mes = scanner.nextInt();

        System.out.println("Ingrese el año:");
        int año = scanner.nextInt();

        if (mes < 1 || mes > 12 || dia < 1 || dia > 31){
            System.out.println("Fecha invalida, verifique dia y mes ingresado");
        }else  {
            System.out.printf("Fecha ingresada: %d/%d/%d%n", dia, mes, año);
        if (mes >= 1 && mes <= 3){
            System.out.println("Corresponde al primer trimestre");
        } else if (mes >= 4 && mes <= 6) {
            System.out.println("Corresponde al segundo trimestre");
        } else if (mes >= 7 && mes <= 9) {
            System.out.println("Corresponde al tercer trimestre");
        }else {
            System.out.println("Corresponde al cuarto trimestre");
        }
        }
    }
}
