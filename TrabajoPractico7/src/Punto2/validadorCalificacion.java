package Punto2;

public class validadorCalificacion {

    public static void validarCalif(double calificacion)throws calificacionInvalidaException{

        if (calificacion < 0 || calificacion > 10 )
            throw new calificacionInvalidaException("La nota debe ser entre 0 y 10");
    }

}
