package componentes_swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.text.StyledEditorKit;

public class ProcesadorDeTextos {

	public static void main(String[] args) {
		MarcoProcesadorTexto marco=new MarcoProcesadorTexto();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
		
	}

}


class MarcoProcesadorTexto extends JFrame{
	
	public MarcoProcesadorTexto() {
		setTitle("Procesador de Texto");
		setBounds(500,200,700,600);
		add(new LaminaProcesadorTexto());
		setResizable(false);
	}


}

class LaminaProcesadorTexto extends JPanel{
	
	//StyledEditorKit editorEstilos=new StyledEditorKit();
	
	public LaminaProcesadorTexto() {
		
		setLayout(new BorderLayout());
		JMenuBar barraMenu=new JMenuBar();
		
		//----ELEMTENOS DEL MENU---
		JMenu fuente=new JMenu("Fuente");
		JMenu estilo=new JMenu("Estilo");
		JMenu tamanio=new JMenu("Tamaño");
		
		barraMenu.add(fuente);
		barraMenu.add(estilo);
		barraMenu.add(tamanio);
		
		//---ELEMENTOS DEL MENU FUENTE---
		JMenuItem arial=new JMenuItem("Arial");
		JMenuItem verdana=new JMenuItem("Verdana");
		JMenuItem freeMono=new JMenuItem("FreeMono");
		arial.addActionListener(new StyledEditorKit.FontFamilyAction("letra_Arial", "Arial"));
		verdana.addActionListener(new StyledEditorKit.FontFamilyAction("letra_verdana", "Verdana"));
		freeMono.addActionListener(new StyledEditorKit.FontFamilyAction("letra_FreeMono", "FreeMono"));
		
		fuente.add(arial);
		fuente.add(verdana);
		fuente.add(freeMono);
		
		
		//---ELEMENTOS DEL MENU ESTILO---
		JMenuItem negrita=new JMenuItem("Negrita");
		JMenuItem cursiva=new JMenuItem("Cursiva");
		negrita.addActionListener(new StyledEditorKit.BoldAction());
		cursiva.addActionListener(new StyledEditorKit.ItalicAction());
		estilo.add(negrita);
		estilo.add(cursiva);
		
		//---ELEMENTOS DEL MENU TAMAÑO---
		JMenuItem _12=new JMenuItem("12");
		JMenuItem _16=new JMenuItem("16");
		JMenuItem _18=new JMenuItem("18");
		JMenuItem _20=new JMenuItem("20");
		_12.addActionListener(new StyledEditorKit.FontSizeAction("tamaño_12",12));
		_16.addActionListener(new StyledEditorKit.FontSizeAction("tamaño_16",16));
		_18.addActionListener(new StyledEditorKit.FontSizeAction("tamaño_18",18));
		_20.addActionListener(new StyledEditorKit.FontSizeAction("tamaño_20",20));
		
		tamanio.add(_12);
		tamanio.add(_16);
		tamanio.add(_18);
		tamanio.add(_20);
		
		
		
		add(barraMenu,BorderLayout.NORTH);
		
		JTextPane areaTexto=new JTextPane();
		JScrollPane scroll=new JScrollPane(areaTexto);
		
		add(scroll,BorderLayout.CENTER);
		
		
		
		
		
	}
	
}








