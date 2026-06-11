package contraseñas_aleatorias;

import java.util.Random;

public class GeneradorContraseñas {
	

	private int longitudPass;
	private String pass;
	
	public GeneradorContraseñas(int longitudPass) {
		this.longitudPass=longitudPass;
		pass=generarContraseña();
	}
		
	public String getContraseña() {
		return pass;
	}
	
	public int getTamañoContraseña() {
		return longitudPass;
	}
	
	
	private String generarContraseña() {
		
		String password="";
		Random rd= new Random();
		
		for(int i=0;i<getTamañoContraseña();i++) {
									
			int asc;
			int rama=rd.nextInt(3);
		
		if(rama==0) {
			asc=rd.nextInt(48, 58);
		}
		else if(rama==1) {
			asc= rd.nextInt(65, 91);	
		}
		else {
			asc=rd.nextInt(97, 123);	
		}
		
			password+=(char)asc;
	}
		return password;
}
		
	
	public String evaluaContraseña() {
			
		int contMayus=0;
		int contMinus=0;
		int contNum=0;
		char c;
		
			for(int i=0;i<pass.length();i++) {
				c=pass.charAt(i);
				if(Character.isDigit(c)) {
					contNum++;
				}
				else if(Character.isUpperCase(c)) {
					contMayus++;
				}
				else {
					contMinus++;
				}
			}
					
			if(contNum>5 && contMinus>1 && contMayus>2 ) {
				return "Contraseña Segura";
			}
			else
				return "Contraseña No Segura";
			
			
		}
}
