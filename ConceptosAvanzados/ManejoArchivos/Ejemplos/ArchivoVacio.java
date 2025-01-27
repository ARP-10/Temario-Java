package ConceptosAvanzados.ManejoArchivos.Ejemplos;

import java.io.File;
import java.io.IOException;

public class ArchivoVacio {
    public static void main(String[] args) {
        try {
            File archivo = new File("archivoEjemplo.txt"); 
            if (archivo.createNewFile()) { // .createNewFile no sobrescribe archivos existentes
                System.out.println("Archivo creado: " + archivo.getName());
            } else {
                System.out.println("El archivo ya existe");
            }
        } catch (IOException e) {
            System.out.println("ERROR");
            e.printStackTrace();
        }
    }
}