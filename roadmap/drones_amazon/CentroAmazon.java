package drones_amazon;

import java.util.Scanner;

public class CentroAmazon {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("Nombre de la Base");
		String nombreBase=sc.nextLine();
		System.out.println("Capacidad Maxima");
		int tamanioFlota=sc.nextInt();
		BaseLogistica nuevaBase=new BaseLogistica(nombreBase,tamanioFlota);
		
		System.out.println(nuevaBase.getNombreBase());
		System.out.println(nuevaBase.getCapacidadBase());
		
		sc.close();
		
		nuevaBase.comprarDron();
		nuevaBase.comprarDron();
		nuevaBase.comprarDron();
		
		
		nuevaBase.desplegarDronParaMision();
		nuevaBase.desplegarDronParaMision();
		nuevaBase.desplegarDronParaMision();
		nuevaBase.retornarDron("DRN-2");
		nuevaBase.recargarDronesEnBase();
		nuevaBase.retornarDron("DRN-1");
		nuevaBase.retornarDron("DRN-3");
		
		nuevaBase.obtenerDronConMasBateria();
		
		
	}

}
