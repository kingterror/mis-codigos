package polimorfismo;

import java.util.ArrayList;

public class CuentaMain {

	public static void main(String Args[]) {
		ArrayList<Cuenta> cuentas=new ArrayList<>();
		cuentas.add(new CuentaAhorro(1200));
		cuentas.add(new CuentaCorriente(100));
		cuentas.add(new CuentaCorriente(2000));
		cuentas.add(new CuentaAhorro(50));
				
		cuentas.get(0).ingresar(400);
		cuentas.get(0).ingresar(200);
		cuentas.get(1).ingresar(500);
		cuentas.get(0).retirar(600);
		cuentas.get(2).retirar(1500);
		cuentas.get(0).retirar(1201);
		cuentas.get(2).ingresar(1000);
		cuentas.get(2).retirar(1600);
		cuentas.get(2).retirar(400);
		cuentas.get(2).ingresar(501);
		cuentas.get(2).retirar(502);
		cuentas.get(2).retirar(501);
		cuentas.get(3).retirar(50);
		cuentas.get(3).ingresar(150);
		cuentas.get(3).retirar(149.50);
		
		for(Cuenta cuenta: cuentas) {
			cuenta.informacionCuenta();
		
			
		}
		
	}
}
