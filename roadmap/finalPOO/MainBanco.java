package finalPOO;


public class MainBanco {

	public static void main(String[] args) {
		
			
		ValidadorRiesgo validador=new ValidadorRiesgo() {
			
			@Override
			
				public boolean evaluar(double cantidad) {
					return(cantidad<=5000);
			}
		};
		
		// --- TEST FASE 4: Trabajador Temporal (Clase Anónima) ---
		System.out.println("=== TEST VALIDADOR DE RIESGO ===");
		// Asumiendo que tu variable se llama validadorRiesgo
		System.out.println("Prueba 3000€ (Esperado: true): " + validador.evaluar(3000));
		System.out.println("Prueba 6000€ (Esperado: false): " + validador.evaluar(6000));
		System.out.println();

		
		CuentaBancaria[] cuentas=new CuentaBancaria[4];
		
		cuentas[0] = new CuentaCorriente("ES91-1000", "Empresa Alpha", 10000.0);
		cuentas[1] = new CuentaAhorro("ES92-2000", "Ahorrador Beta", 2000.0);
		cuentas[2] = new CuentaCorriente("ES93-3000", "Autónomo Gamma", 50.0);
		cuentas[3] = new CuentaAhorro("ES94-4000", "Inversor Delta", 10000.0);
		
		
		
		for(CuentaBancaria cuenta : cuentas) {
			
			cuenta.aplicarMantenimientoMensual();
			
			if(cuenta instanceof Auditable) {
				
				System.out.println(((Auditable) cuenta).generarReporteHacienda());
			}
			else
				System.out.println(cuenta.saldo);
		}
		
		

	}

}
