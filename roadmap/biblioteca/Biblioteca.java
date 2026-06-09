package biblioteca;

import java.util.ArrayList;

public class Biblioteca {

	public static void main(String[] args) {
		ArrayList<Libro> listaLibros=new ArrayList<>();
		//Creo instancias de LIBRO
		Libro libro1=new Libro("La Asistenta","Ana Cora");
		Libro libro2=new Libro("Atletico de Madrid","Cholo Simeone");
		Libro libro3=new Libro("Salamanca","Alex Torres");
		Libro libro4=new Libro("Ilerna","Pau");
		Libro libro5=new Libro("Otro","Otro");
		

		libro2.prestar();
		libro4.prestar();
		
		
		
		//Agrego al ArrayList los libros
		listaLibros.add(libro1);
		listaLibros.add(libro2);
		listaLibros.add(libro3);
		listaLibros.add(libro4);
		listaLibros.add(libro5);
			
		
		
		for(Libro libro:listaLibros) {
			if(!libro.estaPrestado()) System.out.println(libro);
			
		}
	}

}