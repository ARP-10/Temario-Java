package Fundamentos.POO.GestionLibros;

public class Biblioteca {
    public static void main(String[] args) {
        // Creamos objetos de tipo libro
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 417);
        Libro libro2 = new Libro("El Hobbit", "J.R.R. Tolkien", 310);

        // Imprimir los detalles de cada libro:
        System.out.println("Detalles libro 1: ");
        libro1.detalles();

        System.out.println("Detalles del libro 2:");
        libro2.detalles();
    }
}
