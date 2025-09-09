package Punto3;

public class productoElectronico extends producto{
    private int garantia;

    public productoElectronico(String nombre, double precio, int garantia){
        super(nombre, precio);
        this.garantia = garantia;
    }

    public int getGarantia(){
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    public void mostrarDetalles(){
        System.out.println("PRODUCTO ELECTRONICO");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Garantia: " + garantia + "meses");
    }




}
