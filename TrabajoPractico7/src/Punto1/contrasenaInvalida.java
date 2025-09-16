package Punto1;

public class contrasenaInvalida extends Exception{

    public contrasenaInvalida(String message){
        super(message);
    }

    public contrasenaInvalida(){
        super("Contraseña invalida");
    }
}
