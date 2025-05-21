package Punto2;

public class Producto implements Comparable <Producto> {
    String nombre;
    double precio;
    int stock;

    //Constructor
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    @Override
    public int compareTo(Producto o) {
        return
        Double.compare(this.precio , o.precio);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre= '" + nombre + '\'' +
                ", precio= $" + precio +
                ", stock= " + stock +
                '}';
    }
}
