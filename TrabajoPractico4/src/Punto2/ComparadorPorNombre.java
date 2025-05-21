package Punto2;

public class ComparadorPorNombre implements Comparable<Producto> {
    String nombre;
    double precio;
    int stock;

    public ComparadorPorNombre(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    @Override
    public int compareTo(Producto otro) {
        return this.nombre.compareToIgnoreCase(otro.nombre);
    }

    @Override
    public String toString() {
        return nombre + " - $" + precio + " - Stock: " + stock;
    }
}

