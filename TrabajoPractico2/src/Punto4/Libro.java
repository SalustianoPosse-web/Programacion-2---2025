package Punto4;
public class Libro {

    //Atributos
    String titulo;
    String autor;
    String isbn;
    boolean disponible;

    //Constructor
    public Libro(String tit, String aut, String codIsbn){
        titulo = tit;
        autor = aut;
        isbn = codIsbn;
        disponible = true; //El libro esta disponible por defecto

    }

    //Metodos
    public void prestar(){
        if (disponible){
            disponible = false;
            System.out.println("El libro ha sido prestado");
        }else {
            System.out.println("El libro ya esta prestado");
        }
    }

    public void devolver(){
        if (!disponible){
            disponible = true;
            System.out.println("El libro ha sido devuelto");
        }else {
            System.out.println("El libro esta disponible");
        }
    }

    public void mostrarInformacion(){
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Isbn: "+isbn);

        if (disponible){
            System.out.println("Estado: Disponible");
        }else {
            System.out.println("Estado: Prestado");
        }
        System.out.println();
    }
}

