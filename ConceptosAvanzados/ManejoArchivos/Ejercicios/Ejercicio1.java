package ConceptosAvanzados.ManejoArchivos.Ejercicios;

import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio1 {
    public static void main(String[] args) {
        try {
            FileWriter archivo = new FileWriter("archivoEjer1.txt");
            archivo.write("Hola! Este es un mensaje en el archivo");
            archivo.close();
            System.out.println("Se ha escrito en el archivo");
        } catch (IOException e) {
            System.out.println("ERROR");
            e.printStackTrace();
        }
    }
}
