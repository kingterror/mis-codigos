package polimorfismo;

public abstract class Cuenta {
	private double saldo;
	
	public Cuenta(double saldo) {
		if(saldo<0) {
			System.out.println("NO ES POSIBLE ABRIR UNA CUENTA CON SALDO NEGATIVO");
			return;
		}
		else {
		this.saldo=saldo;
		}
	}
	
	public void ingresar(double cantidad) {
		if(cantidad<=0) {
			System.out.println("No es posible ingresar valores iguales o menores que 0(ZERO)");
			return;
		}
		else {
			setNuevoSaldo(cantidad);
			System.out.println("Ingreso Exitoso, su nuevo saldo es: "+ getSaldoActual());
			
		}
			
	}
	
	public abstract void informacionCuenta();
	
	public boolean retirar(double cantidad) {
		if(cantidad<=0) {
			System.out.println("No es posible retirar valores iguales o menores que 0(ZERO)");
			return false;
		}
		else {
			return true;
		}
	}
	
	public double getSaldoActual() {
		return saldo;
	}
	
	
	protected void setNuevoSaldo(double cantidad) {
		saldo+=cantidad;
	}

}

class CuentaAhorro extends Cuenta{
	public CuentaAhorro(double saldo) {
		super(saldo);
	}
	
@Override
public boolean retirar(double cantidad) {
	if (!super.retirar(cantidad)) {
		return false;
	}
	
		if (cantidad>getSaldoActual()) {
			System.out.println("SALDO INSUFICIENTE,TRANSACCION CANCELADA");
			return false;
		}
		else {
			setNuevoSaldo(cantidad*-1);
			System.out.println("Retiro Exitoso, su nuevo saldo es: "+ getSaldoActual());
			return true;
		}
			
	}

@Override
public void informacionCuenta() {
	System.out.println("\n===============================");
	System.out.println("Cuenta Ahorro");
	System.out.println("Saldo Disponible: " + getSaldoActual());
	System.out.println("===============================\n");
}

}

class CuentaCorriente extends Cuenta{
	public CuentaCorriente(double saldo) {
		super(saldo);
	}
	
@Override
	public boolean retirar(double cantidad) {
		if(!super.retirar(cantidad)){
			return false;
		}
		
		double saldoActual=getSaldoActual();
		if(saldoActual<=0) {
			saldoActual*=-1;
			if((cantidad+saldoActual)<=500) {
				setNuevoSaldo(cantidad*-1);
				System.out.println("EL nuevo saldo es2: "+ getSaldoActual());
				return true;
			}
			else {
				System.out.println("No es posible realizar transaccion, quedaria al descubierto,TRANSACCION CANCELADA");
				return false;
			}
		}
		else if(saldoActual>=0) {
			if(cantidad<=(saldoActual+500)) {
				
				setNuevoSaldo(cantidad*-1);
				System.out.println("Retiro exitoso, su nuevo saldo es: "+ getSaldoActual());
				return true;
			}
			else if(cantidad>(saldoActual+500)) {
				System.out.println("No es posible realizar transaccion, quedaria al descubierto,,TRANSACCION CANCELADA");
				return false;
			}
			
			
		}
		return false;

		
	}
@Override
public void informacionCuenta() {
	System.out.println("\n===============================");
	System.out.println("Cuenta Corriente");
	System.out.println("Saldo Actual: " + getSaldoActual());
	if(getSaldoActual()<0) {
		System.out.println("Descubierto Disponible: "+((500+getSaldoActual())));
	}
	else {
		System.out.println("Descubierto Disponible: 500");
	}
	System.out.println("===============================\n");
	
}
	
}


