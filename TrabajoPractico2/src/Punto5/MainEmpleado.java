package Punto5;
public class MainEmpleado {
    public static void main(String[] args){
        //Crear empleados
        Empleado empleado1 = new Empleado(1, "Jose Gomez", 6000);
        Empleado empleado2 = new Empleado(2, "Sofia Perez", 8000);

        //Mostrar informacion inicial
        empleado1.mosstrarInformacion();
        empleado2.mosstrarInformacion();

        //Aumentar los salarios
        empleado1.aumentarSalarioPorPorcentaje(10, "Aumento anual");
        empleado2.aumentarSalarioPorMontoFijo(300, "Promocion");

        //Mostrar informacion luego de los aumentos
        empleado1.mosstrarInformacion();
        empleado2.mosstrarInformacion();

        //Obtener cantidad de empleados
        System.out.println("Cantidad total de empleados:" +Empleado.obtenerCantidadEmpleados());

    }
}

