package Page;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
//import javax.swing.JProgressBar;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class affranchirlettre {

	private JFrame frame;
	private Label label;
	//private JLabel lblPoidsDeLa_1;
	private JLabel lblPoidsDeLa;
	private JSpinner spinner;
	private JSpinner spinner_1;
	private JLabel label_1;
	private int total;
	
	//get du spinner
	public JSpinner getSpinner1() {
		return this.spinner;
	}
	
	//set du spinner
	public void setSpinner1(int i) {
		this.spinner.setValue(i);
	}
	//
	/**
	 * Launch the application.
	 */
	
	//
	public static void affranchirlettre(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					affranchirlettre window = new affranchirlettre();
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
	public affranchirlettre() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

    // function to increase progress 
   
	
	private void initialize() {

		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 250, 205));
		frame.setTitle("Affranchir une lettre");
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		label = new Label("Veuillez d\u00E9poser votre lettre sur la balance.");
		label.setForeground(new Color(0, 128, 128));
		label.setFont(new Font("Gabriola", Font.PLAIN, 30));
		label.setAlignment(Label.CENTER);
		label.setBounds(0, 0, 684, 233);
		frame.getContentPane().add(label);

		//int n = (int) (Math.random() * 5);
		//double prix = 0.9;
		//String prixfinal = String.valueOf(prix);
	
	
		JButton btnAccueil = new JButton("Tout annuler/Retour \u00E0 l'accueil");
		btnAccueil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAccueil.setBounds(200, 402, 300, 25);
		frame.getContentPane().add(btnAccueil);
		
		lblPoidsDeLa = new JLabel("Poids de la lettre");
		lblPoidsDeLa.setBounds(310, 249, 89, 14);
		frame.getContentPane().add(lblPoidsDeLa);
		
		spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(0, 0, 1000, 1));
		spinner_1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				Integer poids = (Integer) spinner_1.getValue();
				if (poids < 20) {
					label_1.setText("Dans mon panier: "+(Accueil.getPanier().getPanierValue()+1)+" €");
					total = Accueil.getPanier().getPanierValue()+1;
					
				}
				else {
					label_1.setText("Dans mon panier: "+(Accueil.getPanier().getPanierValue()+2)+" €");
					total = Accueil.getPanier().getPanierValue()+2;
				}
			}
		});
		spinner_1.setBounds(326, 274, 52, 20);
		frame.getContentPane().add(spinner_1);
		
		//bouton valider
		JButton btnValider = new JButton("Valider");
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnValider.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				Accueil.getPanier().setPanierValue(total);
				Accueil.main(null);
			}
		});
		
		btnValider.setBounds(305, 305, 89, 23);
		frame.getContentPane().add(btnValider);
		
		label_1 = new JLabel("Dans mon panier : "+Accueil.getPanier().getPanierValue()+" €");
		label_1.setBounds(10, 436, 639, 14);
		frame.getContentPane().add(label_1);
		
		
		
		//bouton accueil
		btnAccueil.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				Accueil.main(null);
		
		}
		
	});	
		
			
}
}



