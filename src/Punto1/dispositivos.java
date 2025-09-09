package Punto1;
import java.util.ArrayList;
import java.util.List;

public  abstract class dispositivos {

    protected  String nombre;
    protected boolean estado;
    protected List <String> historial;

public dispositivos(String nombre){
    this.nombre = nombre;
    this.estado = false;
    this.historial = new ArrayList<>();
    this.historial.add("Dispositivo: " + nombre + "esta apagado");
}

public void mostrarHistorial(){
    System.out.println("Historial del dispositivo:" + nombre);
    for (String lista : historial){
        System.out.println(lista);

    }
}



}
