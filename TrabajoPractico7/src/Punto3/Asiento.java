package Punto3;

public class Asiento {
    private int numero;
    private boolean ocupado;

    public Asiento(int numero){
        this.numero = numero;
        this.ocupado = false;

    }
    public int getNumero(){
        return numero;
    }

    public boolean estaOcupado(){
        return ocupado;
    }

    public void ocupar(){
        if (ocupado){
            throw new IllegalStateException("El asiento " + numero +  " ya se encuentra ocupado");
        }
        this.ocupado = true;
    }
}
