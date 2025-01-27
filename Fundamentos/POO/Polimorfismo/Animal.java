package Fundamentos.POO.Polimorfismo;

public class Animal {
    // Atributos
    private String nombre;

    // Constructor
    public Animal(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Metodo sonido
    public void hacerSonido() {
      System.out.println("El animal hace un sonido");  
    }
}
