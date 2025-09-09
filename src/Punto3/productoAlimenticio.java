package Punto3;
import java.time.LocalDate;

public class productoAlimenticio extends producto {
    private LocalDate fechaVencimineto;

    public productoAlimenticio(String nombre, double precio, LocalDate fechaVencimineto) {
        super(nombre, precio);
        this.fechaVencimineto = fechaVencimineto;
    }

    public LocalDate getFechaVencimineto() {
        return fechaVencimineto;
    }

    public void setFechaVencimineto(LocalDate fechaVencimineto) {
        this.fechaVencimineto = fechaVencimineto;
    }

    public boolean estaPorVencer() {
        LocalDate hoy = LocalDate.now();
        return !fechaVencimineto.isAfter(hoy.plusDays(7));
    }

    public void mostrarDetalles(){
        System.out.println("PRODUCTO ALIMENTICIO");
        System.out.println("Nommbre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Fecha de vencimineto: " + fechaVencimineto);
        System.out.println("¿Próximo a vencer?: " + (estaPorVencer() ? "Si" : "No"));
    }
}
