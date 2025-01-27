package Fundamentos.POO.Herencia;

public class Perro extends Animal{
    // Constructor
    public Perro(String nombre) {
        super(nombre);
    }
 
    // Metodo sonido
    @Override
    public void hacerSonido() {
        System.out.println("Guauuuu");  
    }
}
