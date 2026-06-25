package finalPOO;

public abstract class CuentaBancaria {
	
	protected String iban;
	protected String titular;
	protected double saldo;
	
	public CuentaBancaria(String iban,String titular,double saldo) {
		this.iban=iban;
		this.titular=titular;
		this.saldo=saldo;
	}
	
	public String getIban() {
		return iban;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public abstract void aplicarMantenimientoMensual();
	

}

class CuentaCorriente extends CuentaBancaria implements Auditable{

	public CuentaCorriente(String iban, String titular, double saldo) {
		super(iban, titular, saldo);
		
	}

	
	
	@Override
	public void aplicarMantenimientoMensual() {
		
		this.saldo-=15;
	}

	@Override
	public String generarReporteHacienda() {
		
		return "Numero Cuenta: " + getIban() + 
				"\nSaldo Cuenta: " + getSaldo();
	}
	
	
	
}

class CuentaAhorro extends CuentaBancaria{

	public CuentaAhorro(String iban, String titular, double saldo) {
		super(iban, titular, saldo);
		
	}

	private class CalculadoraIntereses {
		public void sumarInteresCompuesto(){
			saldo+=saldo*0.03;
			
		}
	};
	
	
	@Override
	public void aplicarMantenimientoMensual() {
		
		new CalculadoraIntereses().sumarInteresCompuesto();
				
	}
	
	
}
