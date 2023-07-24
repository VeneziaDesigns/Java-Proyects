package graficos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Button;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;
import java.awt.Label;
import javax.swing.SwingConstants;

public class Formulario extends JFrame implements ActionListener {

	private JPanel contentPane;
	//Declaramos los botones mas globales para poder acceder desde el metodo ActionPerformed
	JRadioButton rdbtnFeliz, rdbtnMuyFeliz, rdbtnNoFeliz;
	JLabel lblImage;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbTitulo = new JLabel("\u00BFEres feliz?");
		lbTitulo.setBounds(155, 10, 112, 24);
		lbTitulo.setFont(new Font("Arial", Font.BOLD, 20));
		contentPane.add(lbTitulo);
		
		JPanel panelOpciones = new JPanel();
		panelOpciones.setBounds(33, 57, 366, 54);
		contentPane.add(panelOpciones);
		panelOpciones.setLayout(null);
		
		rdbtnMuyFeliz = new JRadioButton("Si, soy muy feliz");
		rdbtnMuyFeliz.setBounds(6, 17, 111, 23);
		panelOpciones.add(rdbtnMuyFeliz);
		
		rdbtnFeliz = new JRadioButton("Si, soy feliz");
		rdbtnFeliz.setBounds(119, 17, 111, 23);
		panelOpciones.add(rdbtnFeliz);
		
		rdbtnNoFeliz = new JRadioButton("No estoy en mi mejor momento");
		rdbtnNoFeliz.setBounds(233, 17, 111, 23);
		panelOpciones.add(rdbtnNoFeliz);
		
		//Creamos el Button group para que funcionen los radiobutton
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnNoFeliz);
		bg.add(rdbtnFeliz);
		bg.add(rdbtnMuyFeliz);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 147, 418, 107);
		contentPane.add(panel);
		
		lblImage = new JLabel("");
		panel.add(lblImage);
		
		//Añadimos los ActionListeners
		rdbtnNoFeliz.addActionListener(this);
		rdbtnFeliz.addActionListener(this);
		rdbtnMuyFeliz.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		ImageIcon imagen = new ImageIcon();
		if(e.getSource() == rdbtnMuyFeliz) {
			imagen = new ImageIcon("src/Images/MuyFeliz.png");
		} else if (e.getSource() == rdbtnFeliz) {
			imagen = new ImageIcon("src/Images/Feliz.png");
		} else {
			imagen = new ImageIcon("src/Images/triste.png");
		}
		Image imagenAjustada = imagen.getImage().getScaledInstance(110, 110, Image.SCALE_SMOOTH);
	
		lblImage.setIcon(new ImageIcon(imagenAjustada));
	}
}
