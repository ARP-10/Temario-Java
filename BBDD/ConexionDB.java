package BBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexionDB {
	// Ruta de la base de datos SQLite (puede estar en cualquier ubicación de tu sistema)
	private static final String URL = "jdbc:sqlite:testdb.db"; // Ruta al archivo de la base de datos
	
	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			// Establecer la conexion
			conn = DriverManager.getConnection(URL);
			System.out.println("Conexión exitosa!");
			
			// Realizar una consulta simple
			String query = "Select * FROM personas";
			PreparedStatement stmt = conn.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();
			
			// Mostrar los resultados
			while (rs.next()) {
				System.out.println("ID: " + rs.getInt("id"));
				System.out.println("Nombre: " + rs.getString("nombre"));
				System.out.println("Edad: " + rs.getInt("edad"));
				System.out.println("-----------------------------------------------");
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
}
