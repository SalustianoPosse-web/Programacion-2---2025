package Punto2;

public class calificacionInvalidaException extends Exception{
    public calificacionInvalidaException(String message){
        super(message);
    }

    public calificacionInvalidaException(){
        super("Calificacion invalida");
    }


}
