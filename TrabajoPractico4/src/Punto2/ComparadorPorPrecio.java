package Punto2;

import java.util.Comparator;

public class ComparadorPorPrecio implements Comparator<Producto> {
    @Override
    public int compare(Producto p1, Producto p2) {
        return Double.compare(p1.precio, p2.precio);
    }
}
