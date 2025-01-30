package BBDD.ManejoBBDD;

import static BBDD.ManejoBBDD.Consola.pedirEntero;
import static BBDD.ManejoBBDD.Consola.pedirTexto;
import static BBDD.ManejoBBDD.Consola.pf;
import BBDD.ManejoBBDD.Monitor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ManejoMonitoresJDBC {
	private static final String URL = "jdbc:sqlite:C:\\Users\\java\\Downloads\\monitores.sqlite";

	// Queries
	private static final String SQL_SELECT = "SELECT * FROM monitores";
	private static final String SQL_SELECT_ID = "SELECT * FROM monitores WHERE id=?";
	private static final String SQL_SELECT_COLOR_PLANTILLA = "SELECT * FROM monitores WHERE color='%s'";
	private static final String SQL_INSERT_PLANTILLA = "INSERT INTO monitores (ancho, alto, diagonal, color) VALUES (%s, %s, %s,'%s')";
	private static final String SQL_UPDATE_PLANTILLA = "UPDATE monitores SET ancho=%s, alto=%s, diagonal=%s, color='%s' WHERE id=%s";
	private static final String SQL_DELETE = "DELETE FROM monitores WHERE id=?";
	
	private static Statement st;
	
	public static void main(String[] args) {
		try (Connection conn = DriverManager.getConnection(URL)){
			st = conn.createStatement();
			
			boolean salir = true;
			
			do {
				mostrarMenu(); 
				int opcion = pedirOpcion();
				procesar(opcion); 
				// Si no me han dicho salir, repetir desde mostrar menu
				salir = opcion == 0;
			} while(!salir);
		} catch (SQLException e) {
			System.out.println("ERROR en la BBDD");
		}
	}
	
	private static void mostrarMenu() {
		System.out.println("\n MENU");
		System.out.println("1. Listado");
		System.out.println("2. Buscar por color");
		System.out.println("3. Insertar");
		System.out.println("4. Modificar");
		System.out.println("5. Borrar");
		System.out.println("0. Salir");
	}
	
	private static int pedirOpcion() {
		return pedirEntero("Dime la opcion que deseas");
	}
	
	private static void procesar(int opcion) throws SQLException {
		switch (opcion) {
			case 1:
				listado(); 
				break;
	
			case 2:
				buscar();
				break;
				
				case 3:
				insertar();
				break;
		
			case 4:
				modificar();
				break;
		
			case 5:
				borrar();
				break;
				
			case 0:
				System.out.println("Saliendo...");
				break;
				
			default:
				break;
		}
	}

	private static void listado() {
		mostrarCabecera();
		
		ArrayList<Monitor> monitores = new ArrayList<Monitor>();
		
		try(ResultSet rs = st.executeQuery(SQL_SELECT)) {
			while (rs.next()) {
				Monitor monitor = new Monitor(rs.getInt("id"), rs.getInt("ancho"), rs.getInt("alto"), rs.getInt("diagonal"), rs.getString("color"));
				monitores.add(monitor);
			}
		} catch (SQLException e) {
			System.out.println("No se ha podido obtener la lista");
		}
		
		for(Monitor monitor : monitores) {
			mostrarLinea(monitor);
		}
	}
	
	// TODO: No funciona bien
	public static void buscar() throws SQLException {
		String color = pedirTexto("Dime que color quieres buscar");
		String sqlSelecrColor = String.format(SQL_SELECT_COLOR_PLANTILLA, color);
		ResultSet rs = st.executeQuery(sqlSelecrColor);
		
		ArrayList<Monitor> monitores = new ArrayList<Monitor>();
		
		while(rs.next()) {
			Monitor monitor = new Monitor(rs.getInt("id"), rs.getInt("ancho"), rs.getInt("alto"), rs.getInt("diagonal"), rs.getString("color"));
			monitores.add(monitor);
		}
		
		mostrarCabecera();
		for(Monitor monitor : monitores) {
			mostrarLinea(monitor);
		}
	}
	
	public static void insertar() throws SQLException {
		Monitor monitor = pedirDatosMonitor(null);
		
		String sqlInsert = String.format(SQL_INSERT_PLANTILLA, monitor.getAncho(), monitor.getAlto(), monitor.getDiagonal(), monitor.getColor());
		st.executeUpdate(sqlInsert);
	}
	
	private static void modificar() throws SQLException {
		int id = pedirEntero("Dime el id a modificar");
		Monitor monitor = pedirDatosMonitor(id);
		
		String sqlUpdate = String.format(SQL_UPDATE_PLANTILLA, monitor.getAncho(), monitor.getAlto(), monitor.getDiagonal(), monitor.getColor(), monitor.getId());
		st.executeUpdate(sqlUpdate);
	}
	
	private static void borrar() throws SQLException{
		int id = pedirEntero("Dime el id a borrar");
		st.executeUpdate(SQL_DELETE + id);
	}
	
	private static void mostrarCabecera() {
		pf("%5s %5s %5s %8s %-20s\n0", "Id", "Ancho", "Alto", "Diagonal", "Color");
	}
	
	private static void mostrarLinea(Monitor monitor) {
		pf("%5s %5s %5s %5s %-20s\n", monitor.getId(), monitor.getAlto(), monitor.getAncho(), monitor.getDiagonal(), monitor.getColor());
	}
	
	private static Monitor pedirDatosMonitor(Integer id) {
		int ancho = pedirEntero("Ancho");
		int alto = pedirEntero("Alto");
		int diagonal = pedirEntero("Diagonal");
		String color = pedirTexto("Color");
		
		return new Monitor(id, ancho, alto, diagonal, color);
	}
}
