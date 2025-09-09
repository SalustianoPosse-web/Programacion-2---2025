package Punto1;

public class altavoz extends dispositivos {
    public altavoz(String nombre){
        super(nombre);
    }


    public void encender(){
        if (!estado){
            estado = true;
            historial.add("El altavoz se ha encendido");
        }
    }


    public void apagar(){
        if (estado){
            estado = false;
            historial.add("El altavoz se ha apagado");
        }
    }


    public String obtenerEstado(){
        if (estado){
            return "Encendido";
        }else{
            return "Apagado";
        }
    }


}
