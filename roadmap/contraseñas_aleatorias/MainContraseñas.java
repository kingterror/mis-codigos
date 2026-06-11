package contraseñas_aleatorias;

import javax.swing.JOptionPane;

public class MainContraseñas {

	public static void main(String[] args) {
		
		int cantidadPass=Integer.parseInt(JOptionPane.showInputDialog("Cauntas contraseñas desea generar?"));
		int longitudPass=Integer.parseInt(JOptionPane.showInputDialog("Longitud de la Contraseña"));
		GeneradorContraseñas almacen[]=new GeneradorContraseñas[cantidadPass];
		for(int i=0;i<cantidadPass;i++) {
			GeneradorContraseñas  nuevaPass=new GeneradorContraseñas(longitudPass);
			almacen[i]=nuevaPass;
			
		}
		
		for(int i=0;i<almacen.length;i++) {
			System.out.println(almacen[i].getContraseña() +"\t"+ almacen[i].getTamañoContraseña() + "\t" + almacen[i].evaluaContraseña());
		}
			
	}

}
