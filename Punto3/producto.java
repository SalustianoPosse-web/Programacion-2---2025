package Punto3;

public abstract class producto {
   protected String nombre;
    protected double precio;

    public producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public double calcularPrecio(){
        return precio;
    }

    public abstract void mostrarDetalles();
}
