package componentes_swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class EjercicioHistoricoSwing {

	public static void main(String[] args) {
		MarcoHistorico historico=new MarcoHistorico();
		historico.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}
}


class MarcoHistorico extends JFrame{
	public MarcoHistorico () {
		setTitle("Ejercicio Historico");
		setBounds(700,300,550,350);
		add(new LaminaHistorico());
		setVisible(true);
	}
}

class LaminaHistorico extends JPanel{
	private JLabel labelNombre,labelApellido;
	private JTextField textNombre,textApellido;
	private JPanel superior,inferior,centro;
	private JTextArea historial;
	private JButton boton1,boton2;
	private JCheckBox check1,check2;
	private JRadioButton radioBoton1,radioBoton2;
	private String ultimoRadioButton="";
	private boolean esPrimeraVez=true;
	
	
	
	
	public LaminaHistorico() {
		
		setLayout(new BorderLayout() );
		
		//------------------------PARTE SUPERIOR-------------------------
		superior=new JPanel();
		superior.setLayout(new FlowLayout());
		labelNombre=new JLabel("Nombre");
		labelApellido=new JLabel("Apellido");
		textNombre=new JTextField(10);
		textApellido=new JTextField(10);
		superior.add(labelNombre);
		superior.add(textNombre);
		superior.add(labelApellido);
		superior.add(textApellido);
		add(superior,BorderLayout.NORTH);
		
		//------------------------PARTE CENTRAL-------------------------
		centro=new JPanel();
		centro.setLayout(new FlowLayout());
		historial=new JTextArea(12,30);
		historial.setLineWrap(true);
		JScrollPane scroll=new JScrollPane(historial);
		centro.add(scroll);
		add(centro,BorderLayout.CENTER);
		
		//------------------------PARTE INFERIOR-------------------------
		inferior=new JPanel();
		inferior.setLayout(new FlowLayout());
		
		boton1=new JButton("Boton 1");
		boton2=new JButton("Boton 2");
		//--AGREGAMOS ACTION LISTENER--
		boton1.addActionListener(new ManejarAcciones("Boton 1"));
		boton2.addActionListener(new ManejarAcciones("Boton 2"));
		
		check1=new JCheckBox("Casilla 1");
		check2=new JCheckBox("Casilla 2");
		//--AGREGAMOS ACTION LISTENER--
		check1.addActionListener(new ManejarAcciones("Casilla 1"));
		check2.addActionListener(new ManejarAcciones("Casilla 2"));
		
		radioBoton1= new JRadioButton("Radio 1");
		radioBoton2= new JRadioButton("Radio 2");
		ButtonGroup grupoRadio=new ButtonGroup();
		grupoRadio.add(radioBoton1);
		grupoRadio.add(radioBoton2);
		radioBoton1.addActionListener(new ManejarAcciones("Radio 1"));
		radioBoton2.addActionListener(new ManejarAcciones("Radio 2"));
		inferior.add(boton2);
		inferior.add(boton1);
		inferior.add(check1);
		inferior.add(check2);
		inferior.add(radioBoton1);
		inferior.add(radioBoton2);
		add(inferior,BorderLayout.SOUTH);
	}
	
	private class ManejarAcciones implements ActionListener{
		private String nombre;
		public ManejarAcciones(String nombre) {
			this.nombre=nombre;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if(esPrimeraVez) {
				historial.append(textNombre.getText() + " " + textApellido.getText() + " Realiza las siguientes Acciones:\n" );
				esPrimeraVez=false;
			}
			Object origen=e.getSource();
			//--COMPROBAMOS SI ES UN JCHECKBOX
			if(origen instanceof JCheckBox) {
				JCheckBox casilla=(JCheckBox)origen;
				
				if(casilla.isSelected()) {
					historial.append(this.nombre+" Activada\n");
				}
				else {
					historial.append(this.nombre+" Desactivada\n");
				}
						
			}
			
			//--COMPROBAMOS SI ES UN JRADIOBUTTON
			
			else if(origen instanceof JRadioButton) {
			//	JRadioButton rBoton=(JRadioButton)origen;
				
				if(!(ultimoRadioButton.equals(this.nombre))) {
					historial.append(this.nombre+" Activado\n");
					ultimoRadioButton=this.nombre;
				}
				
				
			}
			else {
			
				historial.append(this.nombre+" Presionado\n");
			}
				
			
		}
		
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	