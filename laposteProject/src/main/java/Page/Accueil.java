package Page;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;

public class Accueil {

	private JFrame frame;
	private Timbre timbre = new Timbre();
	//private String totalpanier = timbre.getTotalStr();
	private static Panier panier = new Panier();
	
	public static Panier getPanier () {
		return panier;
	}
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Accueil window = new Accueil();
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
	public Accueil() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Accueil");
		frame.getContentPane().setBackground(new Color(255, 250, 205));
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Affranchir une lettre");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				affranchirlettre.Affranchirlettre(null);
			}
		});
		btnNewButton.setBackground(new Color(30, 144, 255));
		btnNewButton.setBounds(230, 49, 240, 90);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Affranchir une lettre recommand\u00E9e");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				AffranchirLR.main();
			}
		});
		btnNewButton_1.setBackground(new Color(30, 144, 255));
		btnNewButton_1.setBounds(230, 142, 240, 90);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Acheter des timbres");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				Timbre.TimbreNormal(null);
			}
		});
		btnNewButton_2.setBackground(new Color(30, 144, 255));
		btnNewButton_2.setBounds(230, 236, 240, 90);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnConditionsDeVente = new JButton("Conditions de vente et tarifs");
		btnConditionsDeVente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				CDV.main(null);
			}
		});
		btnConditionsDeVente.setBackground(new Color(30, 144, 255));
		btnConditionsDeVente.setBounds(230, 330, 240, 90);
		frame.getContentPane().add(btnConditionsDeVente);
		
		
		final JLabel label_2 = new JLabel("Dans mon panier : "+panier.getPanierValue()+" €");
		label_2.setBounds(10, 436, 333, 14);
		frame.getContentPane().add(label_2);
		//
		JButton btnViderLePanier = new JButton("Vider le panier");
		btnViderLePanier.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panier.resetPanierValue();
				label_2.setText("Dans mon panier : 0 €");
			}
		});
		btnViderLePanier.setBackground(new Color(30, 144, 255));
		btnViderLePanier.setBounds(552, 432, 122, 23);
		frame.getContentPane().add(btnViderLePanier);
		
		JButton btnNewButton_3 = new JButton("Payement");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				Paiement.main(null);
			}
		});
		btnNewButton_3.setBackground(new Color(30, 144, 255));
		btnNewButton_3.setBounds(552, 397, 122, 23);
		frame.getContentPane().add(btnNewButton_3);

		
	}
}

