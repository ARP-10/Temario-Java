package ConceptosAvanzados.ManejoArchivos.EjerciciosPlus;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        String entrada = "ConceptosAvanzados\\ManejoArchivos\\Ejercicios\\entrada.txt";
        String salida = "ConceptosAvanzados\\ManejoArchivos\\Ejercicios\\salida.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(entrada));
            BufferedWriter bw = new BufferedWriter(new FileWriter(salida))) {
            
            String linea;
            while((linea = br.readLine()) != null) {
                bw.write(linea);
                bw.newLine(); // Agrega un salto de linea
            }
            System.out.println("Archivo copiado con exito");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}