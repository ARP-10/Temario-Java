package Fundamentos.Excepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2 {
    public static void main(String[] args) {
        String rutaArchivo = "Fundamentos\\Excepciones\\Archivo.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))){
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        }  catch (FileNotFoundException e){
            System.out.println("Error: Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Error: Archivo ilegible");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Operacion finalizada");
        }
    }
}
