package Punto3;

public class productoRopa extends producto{
    private String talle;

    public productoRopa(String nombre, double precio, String talle){
        super(nombre, precio);
        this.talle = talle;
    }

    public String getTalle(){
        return talle;
    }

    public void setTalle(String talle) {
        this.talle= talle;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("PRODUCTO ROPA");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Talle: " + talle);
    }
}
