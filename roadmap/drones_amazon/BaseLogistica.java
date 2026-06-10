package drones_amazon;

public class BaseLogistica {
		
	private String nombreBase;
	private Dron flota[];
		
	public BaseLogistica(String nombreBase, int capacidadBase) {
		this.nombreBase=nombreBase;
		flota=new Dron[capacidadBase];
	}
	
	
	public String getNombreBase() {
		return nombreBase;
	}
	
	public int getCapacidadBase() {
		return flota.length;
	}
	
		
	public void comprarDron() {
		int huecoArray=buscarHueco();
		if(huecoArray!=-1) {
			Dron nuevoDron=new Dron();
			flota[huecoArray]=nuevoDron;
		}
		else System.out.println("BASE LLENA");
	}
	
	public void desplegarDronParaMision() {
			for(int i=0;i<flota.length;i++) {
				if((flota[i]!=null)&&(flota[i].getEstado().equals("EN_BASE")) && flota[i].getBateria()>20) {
					flota[i].setEstado("VOLANDO");
					flota[i].setBateria(flota[i].getBateria()-25);
					System.out.println(flota[i].getId() + " VOLANDO");
					return;
				}

			}
			System.out.println("NO HAY DRONES DISPONIBLES EN ESTE MOMENTO");
	}
	
	public void retornarDron(String idDron) {
		int ubiDron=buscarDron(idDron);
		if((ubiDron!=-1) && (flota[ubiDron].getEstado().equals("VOLANDO"))) {
			flota[ubiDron].setEstado("EN_BASE");
			System.out.println(flota[ubiDron].getId() +"en base" + flota[ubiDron].getBateria());
		}
		else {
			System.out.println("El DRON " + idDron + " NO EXISTE y/o NO ESTA VOLANDO");
		}
		
	}
	
	public void recargarDronesEnBase() {
		for(int i=0;i<flota.length;i++) {
			if( (flota[i]!=null) && (flota[i].getEstado().equals("EN_BASE")))
				flota[i].setBateria(100.0);
		}
	}

	public int buscarHueco() {
		for(int i=0;i<flota.length;i++ ) {
			if((flota[i]==null)) {
				return i;
			}
		
		}
		return -1;
	}
	
	public int buscarDron(String idDron) {
		for(int i=0;i<flota.length;i++ ) {
			if((flota[i]!=null)) {
				if(flota[i].getId().equals(idDron)){
					return i;
				}
			}
			
		}
		return -1;
	}
	
	public void reportarAveria(String idAveriado){
		int ubiDron=buscarDron(idAveriado);
			if(ubiDron!=-1) {
				flota[ubiDron].setEstado("AVERIADO");
			}
			else {
				System.out.println("ESE ID DE DRON NO EXISTE EN LA BASE");
			}
				
		
	}
	
	public void getEstadoDron(String idDron) {
		int ubiDron=buscarDron(idDron);
		if(ubiDron!=-1) {
			System.out.println(flota[ubiDron]);
		}
		else {
			System.out.println("El ID " + idDron + " NO EXISTE EN LA BASE");
		}
	}
	
	public void obtenerDronConMasBateria() {
		int dronGanador=-1;
		double bateriaMaxima=-1.0;
		
		for(int i=0;i<flota.length;i++) {
			if((flota[i]!=null) && (flota[i].getEstado().equals("EN_BASE"))){
				if(flota[i].getBateria()>bateriaMaxima) {
					dronGanador=i;
					bateriaMaxima=flota[i].getBateria();
				}
				
			}
					
				
		}
		if(dronGanador!=-1) {
			System.out.println(flota[dronGanador]);
		}
		else {
			System.out.println("LA BASE ESTA VACIA");
		}
		
	}
	
	
}
