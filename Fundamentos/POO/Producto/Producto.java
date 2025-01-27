package Fundamentos.POO.Producto;

public class Producto {
    // Atributos
    private String nombre;
    private double precio;

    // Constructor
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }


    // Metodo para mostrar el producto
    public void detalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
    }

    
    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Metodo para calcular el costo total
    public void costo(int cantidad) {
        double costo = cantidad * precio;
        System.out.println("El costo del producto es de: " + costo);
    }
}