package BBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexionDB {
	// Ruta de la base de datos SQLite (puede estar en cualquier ubicación de tu sistema)
	private static final String URL = "jdbc:sqlite:C:\\Users\\java\\Downloads\\monitores.sqlite"; // Ruta al archivo de la base de datos
	
	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			// Establecer la conexion
			conn = DriverManager.getConnection(URL);
			System.out.println("Conexión exitosa!");
			
			// Realizar una consulta simple
			String query = "Select * FROM monitores";
			PreparedStatement stmt = conn.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();
			
			// Crear un nuevo monitor
			String insertQuery = "INSERT INTO monitores (ancho, alto, diagonal, color) VALUES (?, ?, ?, ?)";
			PreparedStatement stmtCreate = conn.prepareStatement(insertQuery);
			
			// Metemos los parametros (CREATE)
			/*
			 * stmtCreate.setInt(1, 1366);
			stmtCreate.setInt(2, 768);
			stmtCreate.setInt(3, 17);
			stmtCreate.setString(4, "Morado");
			
			int rowsAffectedCreate = stmtCreate.executeUpdate(); // Ejecutar la inserción
            System.out.println(rowsAffectedCreate + " filas insertadas.");
			 */
			
			// Mostrar los resultados (READ)
			while (rs.next()) { // rs.next(): Mueve el cursor al siguiente registro en el ResultSet y devuelve true si la fila existe, o false si no hay más registros.
				System.out.println("ID: " + rs.getInt("id"));
				System.out.println("Ancho: " + rs.getInt("ancho"));
				System.out.println("Alto: " + rs.getInt("alto"));
				System.out.println("Diagonal: " + rs.getInt("diagonal"));
				System.out.println("Color: " + rs.getString("color"));
				System.out.println("-----------------------------------------------");
			}
			
			// Actualizar los datos de un monitor (UPDATE)
			/*
			 * // Actualizar por ID
			String updateQuery = "UPDATE monitores SET color = ? WHERE id = ?";
			PreparedStatement stmtUpdate = conn.prepareStatement(updateQuery);
			
			// Establecer valores
			stmtUpdate.setString(1, "Azul"); // Nuevo color
			stmtUpdate.setInt(2, 10); // ID del monitor a actualizar
			
			// Ejecutar la actualizacion
			int rowsAffectedUpdate = stmtUpdate.executeUpdate();
			System.out.println(rowsAffectedUpdate + " fila(s) actualizada(s)");
			 */
			
			
			// Eliminar un monitor (DELETE)
			//Eliminar por ID
			/*
			 * String deleteQuery = "DELETE FROM monitores WHERE id = ?";
			PreparedStatement stmtDelete = conn.prepareStatement(deleteQuery);
			
			// Establecer el valor del ID
			stmtDelete.setInt(1, 11);
			
			// Ejecutar el borrado
			int rowsAffectedDelete = stmtDelete.executeUpdate();
			System.out.println(rowsAffectedDelete + " fila(s) eliminada (s)");
			
			 */
			
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
