package Punto2;

import java.util.Comparator;
public class ComparatorProducto implements Comparator <Producto> {
    @Override
    public int compare(Producto o1, Producto o2) {
        return o1.nombre.compareToIgnoreCase(o2.nombre);
    }
}
