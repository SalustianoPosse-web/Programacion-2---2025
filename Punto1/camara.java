package Punto1;

public class camara extends dispositivos{

    public camara(String nombre){
        super(nombre);
    }


    public void encender(){
        if (!estado){
            estado = true;
            historial.add("La camara se ha prendido");
        }
    }


    public void apagar(){
        if (estado){
            estado = false;
            historial.add("La camara se ha apagado");
        }
    }


    public String obtenerEstado(){
        if (estado){
            return "Encendido";

        } else {
            return "Apagado";
        }
    }

}
