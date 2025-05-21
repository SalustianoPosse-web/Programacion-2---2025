package Punto2;

import java.util.Comparator;

public class ComparadorPorStock implements Comparator<Producto> {
    @Override
    public int compare(Producto p1, Producto p2) {
        return Integer.compare(p1.stock, p2.stock);
    }
}

