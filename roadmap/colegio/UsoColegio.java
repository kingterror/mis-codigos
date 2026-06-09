package torres.chinchilla.poo;

public class UsoColegio {

	public static void main(String[] args) {
		
		Colegio Salamanca=new Colegio("Salamanca",4);
		Colegio SanVicente=new Colegio("San Vicente",10);
				
				
		SanVicente.nuevoAlumno("Alex", 8);
		SanVicente.nuevoAlumno("Pau", 9);
		
		Salamanca.nuevoAlumno("Maria", 9);
		Salamanca.nuevoAlumno("Cora", 7);
		Salamanca.nuevoAlumno("Enya", 10);
		Salamanca.nuevoAlumno("Ana", 8.5);
		Salamanca.nuevoAlumno("Ana2", 8.5);
		Salamanca.getTodosAlumnos();
		Salamanca.expulsarAlumno("Enya");
		Salamanca.getTodosAlumnos();
		Salamanca.nuevoAlumno("Ana2", 8.5);
		Salamanca.getTodosAlumnos();		
	}

}
