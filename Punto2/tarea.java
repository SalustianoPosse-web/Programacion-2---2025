package Punto2;
import java.util.List;

public  abstract class tarea {

    protected int fechaInicio;
    protected int fechaFin;
    protected String responsable;

    public tarea(int fechaInicio, int fechaFin, String responsable){
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.responsable = responsable;
    }

    public int calcularTiempoTotal(){
       return Math.abs(fechaFin - fechaInicio);
    }

    public void generarInforme(){
        System.out.println("INFORME DE TAREA");
        System.out.println("Responsable: " + responsable);
        System.out.println("Inicio: " + fechaInicio);
        System.out.println("Fin: " + fechaFin);
        System.out.println("Duracion: " + calcularTiempoTotal());

    }




}
