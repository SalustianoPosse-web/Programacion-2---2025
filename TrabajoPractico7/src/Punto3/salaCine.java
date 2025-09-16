package Punto3;

import java.util.ArrayList;
import java.util.List;

public class salaCine {
    private int capacidad;
    private List<Asiento> asientos;

    public salaCine(int capacidad){
        this.capacidad = capacidad;
        this.asientos = new ArrayList<>();

        for (int i = 0; i < capacidad; i++){
            asientos.add(new Asiento(i + 1));
        }
    }

    public boolean asientoValido(int numero){
        return numero >= 1 && numero <= capacidad;
    }

    public void reservar(int numero){
        if (!asientoValido(numero)){
            throw new IllegalArgumentException("El asiento " + numero +  " no existe en la sala");
        }
        Asiento asiento =  asientos.get(numero - 1);
        asiento.ocupar();
        System.out.println("✅ Reserva exitosa de su asiento " + numero);
    }

    public int asientosDisponibles(){
        int libres = 0;
        for (Asiento a : asientos){
            if (!a.estaOcupado()){
                libres++;
            }
        }
        return libres;
    }
}
