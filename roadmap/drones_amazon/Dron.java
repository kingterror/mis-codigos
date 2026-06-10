package drones_amazon;

public class Dron {
	
	private String id;
	private double bateria;
	private String estado;
	static private int generarId=1;
	
	
	public Dron() {
		this.id="DRN-" + generarId;
		this.bateria=100.0;
		this.estado="EN_BASE";
		generarId++;
			
	}
	
	
	
	//==========METODOS GETTERS====================
	public String getEstado() {
		return estado;
	}
	
	public double getBateria() {
		return bateria;
	}
	
	public String getId() {
		return id;
	}
	
	//============METODOS SETTERS====================
	
	public void setEstado(String estado) {
		this.estado=estado;
	}
	
	public void setBateria(double bateria) {
		this.bateria=bateria;
	}
	@Override
	public String toString() {
		return  "==================="+
				"\nID Dron: " + id +
				"\nBateria(%): " + bateria + 
				"\nEstado: " + estado +
				"\n===================\n";
				
	}	
	
	
	
}