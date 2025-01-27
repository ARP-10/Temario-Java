package Fundamentos.POO.Producto;

public class Tienda {
    public static void main(String[] args) {
        Producto producto1 = new Producto("PC", 1500);
        Producto producto2 = new Producto("Teclado", 80);
        Producto producto3 = new Producto("Raton", 30);

        System.out.println("Estos son los productos que tenemos disponibles: ");
        producto1.detalles();
        System.out.println("\n");
        producto2.detalles();
        System.out.println("\n");
        producto3.detalles();
        System.out.println("\n");

        System.out.println("Hacen un encargo de 4 producto1, el costo total seria de: ");
        producto1.costo(4);

        System.out.println("Hacen un encargo de 10 producto2, el costo total seria de: ");
        producto2.costo(10);

        System.out.println("Hacen un encargo de 35 producto3, el costo total seria de: ");
        producto3.costo(35);
    }
}
