package pooAbstract;

 public abstract class Empleado {
	private String dni;
	private String nombre;
	private String apellido;
	private int anioAlta;
	
	public Empleado(String dni,String nombre,String apellido, int anioAlta) {

		this.dni=dni;
		this.nombre=nombre;
		this.apellido=apellido;
		this.anioAlta=anioAlta;
	}
	
	
	public Empleado() {
		
	}
		
	
	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public void setAnioAlta(int anioAlta) {
		this.anioAlta = anioAlta;
	}


	public int getAnioAlta() {
		return anioAlta;
	}
	
	public void imprimir() {
			System.out.println("\nDNI: "+ getDni() +
				"\nNombre: " + getNombre()+
				"\nApellido: " + getApellido()+
				"\nAño Alta Empresa: " + getAnioAlta());
	}
	
	public abstract double getSalario();
	
	
}

class EmpleadoAsalariado extends Empleado{
	private double salarioFijo;
	private int anioActual= java.time.Year.now().getValue();
	public EmpleadoAsalariado(String dni, String nombre, String apellido, int anioAlta,double salarioFijo) {
		super(dni, nombre, apellido, anioAlta);
		this.salarioFijo=salarioFijo;
		
	}

	public EmpleadoAsalariado() {
		super();
	}
	
	public double getSalarioFijo() {
		return salarioFijo;
	}

	public void setSalarioFijo(double salarioFijo) {
		this.salarioFijo = salarioFijo;
	}

	public int getAnioActual() {
		return anioActual;
	}

	public void setAnioActual(int anioActual) {
		this.anioActual = anioActual;
	}


	@Override
	public double getSalario() {
		int tiempoEmpresa=calcularTiempoEmpresa();
		if(tiempoEmpresa<2) {
			return salarioFijo;
		}
		
		else if(tiempoEmpresa>=2 && tiempoEmpresa<=3 ){
			return salarioFijo*1.07;
		}
		else if(tiempoEmpresa>3 && tiempoEmpresa<=8){
			return salarioFijo*1.11;
		}
		else 
			return salarioFijo*1.17;
				
	}
	
	@Override 
	public void imprimir() {
		super.imprimir();
		System.out.println("Salario: " + getSalario());
	}
	
	public int calcularTiempoEmpresa() {
		return (anioActual-getAnioAlta());
	}
}

class EmpleadoComision extends Empleado{
	private int clientesCaptados;
	private double comisionCliente;
	final double salarioFijo=950;

	public EmpleadoComision(String dni, String nombre, String apellido, int anioAlta,int clientesCaptados, double comisionCliente) {
		super(dni, nombre, apellido, anioAlta);
		this.clientesCaptados=clientesCaptados;
		this.comisionCliente=comisionCliente;
		
	}
	
	public EmpleadoComision() {
		super();
	
	}
	
	public int getClientesCaptados() {
		return clientesCaptados;
	}

	public void setClientesCaptados(int clientesCaptados) {
		this.clientesCaptados = clientesCaptados;
	}

	public double getComisionCliente() {
		return comisionCliente;
	}

	public void setComisionCliente(double comisionCliente) {
		this.comisionCliente = comisionCliente;
	}

	

	@Override
	public double getSalario() {
		double totalComision=getClientesCaptados()*getComisionCliente();
		if(totalComision<salarioFijo) {
			return salarioFijo;
		}
		else {
			return totalComision;
		}
	}
	
	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Clientes Captados:  " + getClientesCaptados() + "\nComision por Cliente: " + getComisionCliente()  +
		"\nSalario " + getSalario());
		
	}

}
