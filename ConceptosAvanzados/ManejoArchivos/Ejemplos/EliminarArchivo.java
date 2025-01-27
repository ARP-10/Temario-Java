package ConceptosAvanzados.ManejoArchivos.Ejemplos;

import java.io.File;

public class EliminarArchivo {
    public static void main(String[] args) {
        File archivo = new File("archivoEjemplo5.txt");
        if (archivo.delete()) {
            System.out.println("El archivo " + archivo.getName() + " fue eliminado");
        } else {
            System.out.println("No se pudo eliminar el archivo");
        }
    }
    
}