package Punto4;
public class MainLibro {
    public static void main(String[] args){
        Libro miLibro = new Libro("Harry Potter","J.K. Rowling", "978-0807286005" );

        miLibro.mostrarInformacion();
        miLibro.prestar();
        miLibro.mostrarInformacion();
        miLibro.devolver();
        miLibro.mostrarInformacion();
    }
}

