package Fundamentos.POO.Polimorfismo;

public class Casa {
    public static void main(String[] args) {
        Animal[] animales = new Animal[4];

        animales[0] = new Gato("Kronchi");
        animales[1] = new Gato("Manolo");
        animales[2] = new Perro("Nala");
        animales[3] = new Perro("Triskis");

        for (Animal animal : animales) {
            animal.hacerSonido();
        }

    
    }
}