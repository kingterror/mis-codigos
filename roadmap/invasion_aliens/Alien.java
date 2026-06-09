package invasion_aliens;

public class Alien {

	public static final String PLANETA_ORIGEN="Marte";
	private static int alienesVivos=0;
	private String nombre;
	private int vida;
	
	public Alien(String nombre) {
		this.nombre=nombre;
		this.vida=100;
		Alien.alienesVivos++;
	}

	public void recibirDisparo() {
		if(vida>50)	{
			vida-=50;
		}
		
		else if(vida>0){
		vida=0;
		Alien.alienesVivos--;
		}
	}
	
	public static String estadoInvasion() {
		String mensaje;
		
		if(alienesVivos>0) mensaje="LA INVASION SIGUE "+alienesVivos+" ALIENS VIVOS";
		else mensaje="PLANETA A SALVO";
		
		return mensaje;
	}
}
