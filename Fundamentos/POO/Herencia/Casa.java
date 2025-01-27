package Fundamentos.POO.Herencia;

public class Casa {
    public static void main(String[] args) {
        Gato gato1 = new Gato("Kronchi");
        Perro perro1 = new Perro("Nala");

        System.out.println("Buenas tardes, " + gato1.getNombre());
        gato1.hacerSonido();
        System.out.println("Buenas tardes, " + perro1.getNombre());
        perro1.hacerSonido();

    }
}