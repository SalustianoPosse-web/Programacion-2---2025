package Punto1;

import java.util.concurrent.Callable;

public class dispositivosMain {

    public static void main(String[] args){
        camara Camara = new camara("Camara");
        sensor Sensor = new sensor("Sensor");
        altavoz Altavoz = new altavoz("Altavoz");


    //CAMARA
        System.out.println("CAMARA");
        Camara.encender();
        Camara.apagar();
        Camara.encender();
        System.out.println(Camara.historial);
        System.out.println("Estado actual:" +Camara.obtenerEstado());

    //SENSOR
        System.out.println("SENSOR");
        Sensor.apagar();
        Sensor.encender();
        Sensor.apagar();
        System.out.println(Sensor.historial);
        System.out.println("Estado actual:" +Sensor.obtenerEstado());

    //ALTAVOZ
        System.out.println("ALTAVOZ");
        Altavoz.encender();
        Altavoz.apagar();
        Altavoz.encender();
        Altavoz.apagar();
        System.out.println(Altavoz.historial);
        System.out.println("Estado actual:" +Altavoz.obtenerEstado());







        }

    }

