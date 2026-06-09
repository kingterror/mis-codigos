package biblioteca;

public class Libro {
	private String titulo;
	private String autor;
	private boolean estaPrestado;
	
	//CONSTRUCTOR
	public Libro(String titulo,String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}
	
	//CREACION DE METODOS
	
	public void prestar() {
		if(estaPrestado) System.out.println("LIBRO NO DISPONIBLE");
		else {
			estaPrestado = true;
			System.out.println("Libro Prestado a cliente");
		}
			
		
	}
	
	public void devolver() {
		System.out.println("LIBRO DEVUELTO");
		estaPrestado = false;
	}
	
	public String toString() {
		String estadoLibro = estaPrestado ? "No Disponible" : "Disponible";
		return "Titulo: " + titulo +
				"\nAutor: " + autor +
				"\nDisponible: " + estadoLibro;
	}
	
	public boolean estaPrestado() {
		return estaPrestado;
	}
}
