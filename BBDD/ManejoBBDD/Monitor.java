package BBDD.ManejoBBDD;

public class Monitor {
	// Atributos
	private int id;
	private int ancho;
	private int alto;
	private int diagonal;
	private String color;
	
	// Constructor
	public Monitor(int id, int ancho, int alto, int diagonal, String color) {
		this.id = id;
		this.ancho = ancho;
		this.alto = alto;
		this.diagonal = diagonal;
		this.color = color;
	}
	
	// COnstructor sin ID
	public Monitor(int ancho, int alto, int diagonal, String color) {
		this.ancho = ancho;
		this.alto = alto;
		this.diagonal = diagonal;
		this.color = color;
	}
	
	// Constructor vacio
	public Monitor() {
		
	}

	// Getters y Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		if(ancho < 0) {
			throw new IllegalArgumentException("No se puede menter un ancho negativo");
		}
		
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		if(alto < 0) {
			throw new IllegalArgumentException("No se puede menter un alto negativo");
		}
		
		this.alto = alto;
	}

	public int getDiagonal() {
		return diagonal;
	}

	public void setDiagonal(int diagonal) {
		this.diagonal = diagonal;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	// FUncion para obtener los pixeles del monitor
	public int getNumeroPixels() {
		return ancho * alto;
	}
	
	@Override
	public String toString() {
		return "Monitor [id=" + id + ", ancho=" + ancho + ", alto=" + alto + ", diagonal=" + diagonal + ", color="
				+ color + "]";
	}
	
	
}
