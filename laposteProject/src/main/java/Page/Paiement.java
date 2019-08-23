package Page;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

public class Paiement {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Paiement window = new Paiement();
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
	public Paiement() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAccueil = new JButton("Tout annuler / Retour \u00E0 l'accueil");
		btnAccueil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnCarteBancaire = new JButton("Carte bancaire");
		btnCarteBancaire.setBounds(230, 142, 240, 90);
		btnCarteBancaire.setBackground(new Color(30, 144, 255));
		frame.getContentPane().add(btnCarteBancaire);
		
		JButton btnEspce = new JButton("Esp\u00E8ce");
		btnEspce.setBounds(230, 236, 240, 90);
		btnEspce.setBackground(new Color(30, 144, 255));
		frame.getContentPane().add(btnEspce);
		
		Label label = new Label("Veuillez s\u00E9lectionner votre moyen de paiement");
		label.setForeground(new Color(0, 128, 128));
		label.setFont(new Font("Gabriola", Font.PLAIN, 30));
		label.setAlignment(Label.CENTER);
		label.setBounds(20, 10, 642, 115);
		frame.getContentPane().add(label);
	}
}
