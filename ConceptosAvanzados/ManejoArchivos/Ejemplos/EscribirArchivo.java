package ConceptosAvanzados.ManejoArchivos.Ejemplos;

import java.io.FileWriter;
import java.io.IOException;

public class EscribirArchivo {
    public static void main(String[] args) {
        try {
            FileWriter escritor = new FileWriter("archivoEjemplo2.txt");
            /*  No se va a crear una linea nueva cada vez que ejecutemos el programa.
                FileWriter esta configurado para reemplazar todo lo que hay en el archivo.
            */
            escritor.write("Hola, se esta escribiendo este archivo");
            escritor.close();
            System.out.println("Se ha escrito en el archivo");
        } catch (IOException e) {
            System.out.println("ERROR");
            e.printStackTrace();
        }
    }
}
