package Page;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class AffranchirLR {

	private JFrame frame;
	private Label label;
	private Label label2;
	private JLabel lblPoidsDeLa;
	private JSpinner spinner_1;
	private JLabel label_1;
	private int total;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AffranchirLR window = new AffranchirLR();
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
	public AffranchirLR() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 250, 205));
		frame.setTitle("Affranchir une lettre recommand\u00E9e");
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		label = new Label("Veuillez d\u00E9poser votre lettre recommand\u00E9e");
		label.setForeground(new Color(0, 128, 128));
		label.setFont(new Font("Gabriola", Font.PLAIN, 30));
		label.setAlignment(Label.CENTER);
		label.setBounds(0, 63, 684, 44);
		frame.getContentPane().add(label);
		
		label2 = new Label("sur la balance.");
		label2.setForeground(new Color(0, 128, 128));
		label2.setFont(new Font("Gabriola", Font.PLAIN, 30));
		label2.setAlignment(Label.CENTER);
		label2.setBounds(0, 113, 684, 44);
		frame.getContentPane().add(label2);

		JButton btnAccueil = new JButton("Retour \u00E0 l'accueil");
		btnAccueil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAccueil.setBounds(200, 402, 300, 25);
		frame.getContentPane().add(btnAccueil);
		
		lblPoidsDeLa = new JLabel("Poids de la lettre :");
		lblPoidsDeLa.setHorizontalAlignment(SwingConstants.CENTER);
		lblPoidsDeLa.setBounds(295, 249, 110, 14);
		frame.getContentPane().add(lblPoidsDeLa);
		
		spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(0, 0, 1000, 1));
		spinner_1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				Integer poids = (Integer) spinner_1.getValue();
				if (poids < 20 && poids > 0) {
					label_1.setText("Dans mon panier : "+(Accueil.getPanier().getPanierValue()+7)+" �");
					//total = Accueil.getPanier().getPanierValue()+7;
					total = 7;
					
				}
				else if (poids == 0){
					label_1.setText("Dans mon panier : "+ Accueil.getPanier().getPanierValue() + " �");
					//total = Accueil.getPanier().getPanierValue();
					total = 0;
				}
				else {
					label_1.setText("Dans mon panier : "+(Accueil.getPanier().getPanierValue()+10)+" �");
					//total = Accueil.getPanier().getPanierValue()+10;
					total = 10;
				}
			}
		});
		spinner_1.setBounds(326, 274, 52, 20);
		frame.getContentPane().add(spinner_1);
		
		//bouton valider
		JButton btnValider = new JButton("Valider");

		btnValider.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				Accueil.getPanier().setPanierValue(Accueil.getPanier().getPanierValue() + total);
				Accueil.main(null);
			}
		});
		
		btnValider.setBounds(305, 305, 89, 23);
		frame.getContentPane().add(btnValider);
		
		label_1 = new JLabel("Dans mon panier : "+Accueil.getPanier().getPanierValue()+" �");
		label_1.setBounds(10, 436, 639, 14);
		frame.getContentPane().add(label_1);
				
		//bouton accueil
		btnAccueil.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				//Accueil.getPanier().resetPanierValue();
				Accueil.main(null);
		
		}
		
	});	
		
		JButton btnViderLePanier = new JButton("Vider le panier");
		btnViderLePanier.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				spinner_1.setValue(0);
				Accueil.getPanier().resetPanierValue();
				label_1.setText("Dans mon panier : 0 �");
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
