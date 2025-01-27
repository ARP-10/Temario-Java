package ConceptosAvanzados.ManejoArchivos.Ejemplos;

import java.io.FileWriter;
import java.io.IOException;

public class AgregarTexto {
    public static void main(String[] args) {
        try {
            FileWriter escritor = new FileWriter("archivoEjemplo4.txt", true); // True para agregar texto y NO sobrescribir
            escritor.write("\n Esta es una linea adicional");
            escritor.close();
            System.out.println("Se ha agregado texto al archivo");
        } catch (IOException e) {
            System.out.println("ERROR");
            e.printStackTrace();
        }
    }
}
