package torres.chinchilla.poo;

public class Colegio {

	private   String nombreColegio;
	private Alumno[] listaAlumnos; 
	
	public Colegio(String nombreColegio,int cantidadAlumnos ) {
		this.nombreColegio=nombreColegio;
		this.listaAlumnos=new Alumno[cantidadAlumnos];
		
	}
	
	public void nuevoAlumno(String nombre,double nota) {
		for(int i=0;i<listaAlumnos.length;i++) {
			if(listaAlumnos[i]==null) {
				Alumno nuevo=new Alumno(nombre,nota,nombreColegio);
				listaAlumnos[i]=nuevo;
				System.out.println("Alumno/a "+nombre+" registrado en el centro "+nombreColegio);
				return;
			}
		}
		
		System.out.println("El Centro no permite matricular mas Alumnos");
	}
	
	public void expulsarAlumno(String alumno) {
		int ubicacionAlumno=buscarAlumno(alumno);
		
		if(ubicacionAlumno!=-1) {
			listaAlumnos[ubicacionAlumno]=null;
			System.out.println("Alumno "+alumno+" Expulsad@");
		}
		else {
			System.out.println("Alumno "+alumno+" no existe");
		}
	}
	
	
	public void setNotaMedia(String alumno,double nota) {
		int ubicacionAlumno=buscarAlumno(alumno);
		
		if(ubicacionAlumno!=-1) {
			listaAlumnos[ubicacionAlumno].setNotaMedia(nota);
			System.out.println("Nota media modificada");
		}
		else {
			System.out.println("Alumno no existe");
		}
	}
				
	public void getAlumno(String alumno) {
		int ubicacionAlumno=buscarAlumno(alumno);
		
		if(ubicacionAlumno!=-1) {
			System.out.println("====Informacion del Alumno====");
			System.out.println(listaAlumnos[ubicacionAlumno].getDatosAlumno());
		}
		else {
			System.out.println("Alumno no existe");
		}
	}
	
	private int buscarAlumno(String nombre) {
		for(int i=0;i<listaAlumnos.length;i++) {
			if(listaAlumnos[i]!=null) {
				if(listaAlumnos[i].getNombreAlumno().equals(nombre)) {
					return i; //UBICACION DENTRO DEL ARRAY
				}
			}
		}
		return -1; //ALUMNO NO EXISTE
	}
	
	public void getTodosAlumnos() {
		
		System.out.println("==============================="+
							"\nNombre del Colegio: "+nombreColegio+
							"\nCapacidad Maxima: "+listaAlumnos.length+
							"\n===============================\n");
		
			for(int i=0;i<listaAlumnos.length;i++) {
				if(listaAlumnos[i] != null) {	
					System.out.println(listaAlumnos[i].getDatosAlumno());
				}
				
			}
	}
		
}
