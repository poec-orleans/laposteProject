package Page;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import java.awt.Button;
import java.awt.Container;

import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.SpinnerNumberModel;
import java.awt.Font;

public class Timbre {

	private JFrame frame;
	
	private int nombre1;
	private int nombre2;
	private JSpinner spinner;
	private JSpinner spinner1;
	private int total = 0;
	
	//********************//
	//	Getters / Setters //
	//********************//
	public int getNombre1() {
		return this.nombre1;
	}
	
	public JSpinner getSpinner1() {
		return this.spinner;
	}
	
	public JSpinner getSpinner2() {
		return this.spinner1;
	}
	
	public void setSpinner1(int i) {
		this.spinner.setValue(i);
	}
	
	public void setSpinner2(int i) {
		this.spinner1.setValue(i);
	}
	
	public int getTotal() {
		return this.total;
	}
	
	/**
	 * Launch the application.
	 */
	public static void TimbreNormal(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Timbre window = new Timbre();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Timbre() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 250, 205));
		frame.setBackground(new Color(255, 250, 205));
		frame.setForeground(new Color(255, 250, 205));
		frame.getContentPane().setForeground(new Color(255, 250, 205));
		frame.setTitle("Acheter des timbres");
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTimbreAuCarnet = new JLabel("10 timbres en carnet (9\u20AC)");
		lblTimbreAuCarnet.setBounds(10, 60, 146, 14);
		frame.getContentPane().add(lblTimbreAuCarnet);
		
		JLabel lblTimbreLunit = new JLabel("Timbre \u00E0 l'unit\u00E9 (1\u20AC)");
		lblTimbreLunit.setBounds(10, 108, 122, 14);
		frame.getContentPane().add(lblTimbreLunit);
		
		final JLabel label_1 = new JLabel("Dans mon panier : "+Accueil.getPanier().getPanierValue()+" €");
		label_1.setBounds(10, 436, 639, 14);
		frame.getContentPane().add(label_1);
		
		//********************************//
		//	Bouton "Continuer les achats" //
		//********************************//
		JButton btnachat = new JButton("Continuer les achats !!!!!");
		btnachat.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 25));
		btnachat.setBounds(175, 253, 344, 122);
		frame.getContentPane().add(btnachat);
		btnachat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				Accueil.getPanier().setPanierValue((Accueil.getPanier().getPanierValue() + total));
				Accueil.main(null);
			}
		});
		
		//*********************************************//
		//	Bouton "Tout annuler / Retour à l'accueil" //
		//*********************************************//
		JButton btnAccueil = new JButton("Tout annuler / Retour à l'accueil");
		btnAccueil.setBounds(200, 402, 300, 23);
		frame.getContentPane().add(btnAccueil);
		btnAccueil.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				Accueil.getPanier().resetPanierValue();
				Accueil.main(null);
			}
		});
		
		//******************************//
		//	Spinner "Timbres en carnet" //
		//******************************//
		spinner = new JSpinner();
		spinner.setBounds(591, 57, 83, 20);
		frame.getContentPane().add(spinner);
		spinner.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				Integer somme = (Integer) spinner.getValue() * 9;
				nombre1 = somme;
				total = (nombre1 + nombre2);
				label_1.setText("Dans mon panier : " + (Accueil.getPanier().getPanierValue() + total) + " €");
			
			}
		});
		
		//******************************//
		//	Spinner "Timbres à l'unité" //
		//******************************//
		spinner1 = new JSpinner();
		spinner1.setBounds(591, 105, 83, 20);
		frame.getContentPane().add(spinner1);
		spinner1.setModel(new SpinnerNumberModel(0, 0, 1000, 1));
		spinner1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				Integer somme2 = (Integer) spinner1.getValue();
				nombre2 = somme2;
				total = (nombre1 + nombre2);
				label_1.setText("Dans mon panier : " + (Accueil.getPanier().getPanierValue() + total) + " €");
			}
		});
}
}