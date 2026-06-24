package pooAbstract;

public class GestionEmpleados {

	public static void main(String[] args) {

		Empleado[] empleados=new Empleado[4];
		empleados[0]=new EmpleadoAsalariado("6546546Z","Antonio","Lopez",2025,1125);
		empleados[1]=new  EmpleadoComision("7879879S", "Sandra", "Nieto", 2011, 185, 2);
		empleados[2]=new EmpleadoComision();
		empleados[3]=new EmpleadoAsalariado();
		
		empleados[2].setNombre("Manuel");
		empleados[2].setApellido("Ruiz");
		empleados[2].setDni("24654654D");
		empleados[2].setAnioAlta(2010);
		((EmpleadoComision) empleados[2]).setClientesCaptados(300);
		((EmpleadoComision)empleados[2]).setComisionCliente(6.90);
	
		empleados[3].setNombre("Maria");
		empleados[3].setApellido("Ramos");
		empleados[3].setDni("77879878F");
		empleados[3].setAnioAlta(2025);
		((EmpleadoAsalariado)empleados[3]).setSalarioFijo(4055);
		
		mostrarTodos(empleados);
		mostrarMayor(empleados);
	}
	
	
	public static void mostrarTodos(Empleado[] empleado) {
		for(Empleado e: empleado) {
				e.imprimir();
		}
	}
	
	public static void mostrarMayor(Empleado[] empleado) {
		int empleadoMayor=-1;
		double salarioMayor=0;
		for(int i=0; i<empleado.length;i++) {
			if(empleado[i].getSalario()>salarioMayor) {
				empleadoMayor=i;
				salarioMayor=empleado[i].getSalario();
			}
		}
		System.out.println("El empleado " + empleado[empleadoMayor].getNombre()  + " " +
				empleado[empleadoMayor].getApellido() + 
		" es el que mas gana y tiene un salario de " + empleado[empleadoMayor].getSalario());
		
		
		
	}



}
