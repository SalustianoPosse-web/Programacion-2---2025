package Punto2;

public class ArrayListProducto implements Comparable <ArrayListProducto> {
        String nombre;
        double precio;
        int stock;

        public ArrayListProducto(String nombre, double precio, int stock) {
            this.nombre = nombre;
            this.precio = precio;
            this.stock = stock;
        }

    public ArrayListProducto() {

    }

    @Override
    public int compareTo(ArrayListProducto otro) {
        return this.nombre.compareToIgnoreCase(otro.nombre);
    }




        @Override
        public String toString() {
            return nombre + " - $" + precio + " - Stock: " + stock;
        }

}


