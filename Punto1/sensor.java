package Punto1;

public class sensor extends dispositivos{
    public sensor(String nombre){
        super(nombre);
    }


    public void encender(){
        if (!estado){
            estado = true;
            historial.add("El sensor se ha encendido");
        }
    }


    public void apagar(){
        if (estado){
            estado = false;
            historial.add("El sensor se ha apagado");
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
