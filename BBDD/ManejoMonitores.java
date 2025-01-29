package BBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ManejoMonitores {
	private static final String URL = "jdbc:sqlite:C:\\Users\\java\\Downloads\\monitores.sqlite";
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Connection conn = null;
		
		try {
			// Establecemos conexión
			conn = DriverManager.getConnection(URL);
			System.out.println("Conexión exitosa!");
			
			boolean salir = false;
			while(!salir) {
				// TODO: Crear funcion para mostrar el menu
				mostrarMenu();
				
				int opcion = teclado.nextInt();
				teclado.nextLine(); // Limpiamos el buffer
				
				switch(opcion) {
					case 1: 
						// TODO: Crear función para leer la BBDD
						listaMonitores(conn);
						break;
					
					case 2: 
						// TODO: Crear función para crear un nuevo monitor
						crearMonitor(conn, teclado)
						break;
						
					case 3: 
						// TODO: Crear función para actualizar un monitor
						actualizarMonitor(conn, teclado);
						break;
						
					case 4: 
						// TODO: Crear función para eliminar un monitor
						eliminarMonitor();
						break;
						
					case 5: 
						System.out.println("Cerrando programa...");
						salir = true;
						teclado.close();
						
					default: 
						System.out.println("Opción no válida!");
						break;
						
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
	}
	
	public static void mostrarMenu() {
		System.out.println("\\n--- MENÚ ---");
		System.out.println("Selecciona una opcion: ");
		System.out.println("1. Mostrar lista completa monitores");
		System.out.println("2. Añadir nuevo monitor");
		System.out.println("3. Actualizar datos monitor existente");
		System.out.println("4. Eliminar un monitor");
		System.out.println("5. Salir");
	}
	
	private static void listaMonitores(Connection conn) {
		String query = "SELECT * FROM monitores";
		
		try (PreparedStatement stmt = conn.prepareStatement(query);
				ResultSet rs = stmt.executeQuery()) {
			
			System.out.println("\n BBDD Monitores:");
			while(rs.next()) {
				System.out.println("ID: " + rs.getInt("id"));
				System.out.println("Ancho: " + rs.getInt("ancho"));
				System.out.println("Alto: " + rs.getInt("alto"));
				System.out.println("Diagonal: " + rs.getInt("diagonal"));
				System.out.println("Color: " + rs.getString("color"));
				System.out.println("---------------------------------");
			}
		} catch (SQLException e) {
			System.out.println("Error al listar los monitores");
		}
	}
	
	private static void crearMonitor(Connection conn, Scanner teclado) {
		System.out.println("\n Crear Monitor: ");
		System.out.println("Ancho: ");
		int ancho = teclado.nextInt();
		System.out.println("Alto: ");
		int alto = teclado.nextInt();
		System.out.println("Diagonal: ");
		int diagonal = teclado.nextInt();
		teclado.nextLine(); // Limpiamos el Buffer
		System.out.println("Color: ");
		String color = teclado.nextLine();
		
		String insertQuery = "INSERT INTO monitores (ancho, alto, diagonal, color) VALUES (?, ?, ?, ?)";
		
		try (PreparedStatement stmt = conn.prepareStatement(insertQuery)){
			stmt.setInt(1, ancho);
			stmt.setInt(2, alto);
			stmt.setInt(3, diagonal);
			stmt.setString(4, color);
			
			int rowsAffected = stmt.executeUpdate();
			System.out.println(rowsAffected + " monitor(es) insertado(s)");
			
		} catch (SQLException e) {
			System.out.println("Error al insertar nuevo monitor");
			e.printStackTrace();
		}
	}
	
	
}
