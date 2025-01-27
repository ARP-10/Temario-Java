package Fundamentos.POO.Herencia;

public class Gato extends Animal{
    // Constructor
    public Gato(String nombre) {
        super(nombre);
    }


    // Metodo sonido
    @Override
    public void hacerSonido() {
        System.out.println("Miauuuu");  
    }
    
}
