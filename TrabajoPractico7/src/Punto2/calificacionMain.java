package Punto2;

import java.util.Scanner;

public class calificacionMain {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la calificacion del estudiante:");

      try{
          int nota = scanner.nextInt();
          validadorCalificacion.validarCalif(nota);
          System.out.println("La calificacion: " + nota + "\nEs valida");
      }catch (calificacionInvalidaException e){
          System.out.println("Error:" +e.getMessage());
      }catch (Exception e){
          System.out.println("Error debe ingresar un valor numerico");
      }finally {
          scanner.close();
      }
    }
}
