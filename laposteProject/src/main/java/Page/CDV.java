package Page;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.DropMode;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.JFormattedTextField;
import java.awt.TextArea;
import java.awt.Color;
import java.awt.SystemColor;

public class CDV extends JFrame {
	
	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CDV window = new CDV();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CDV() {
		getContentPane().setBackground(new Color(255, 250, 205));
		setBounds(100, 100, 700, 500);
		getContentPane().setLayout(null);
		
		JButton btnAccueil = new JButton("Accueil");
		btnAccueil.setBounds(300, 410, 89, 23);
		getContentPane().add(btnAccueil);
		
		TextArea textArea = new TextArea();
		textArea.setBackground(new Color(255, 250, 205));
		textArea.setEditable(false);
		textArea.setForeground(Color.BLACK);
		textArea.setText("Article 1 - Objet\n" + 
				"\n" + 
				"Les pr�sentes conditions r�gissent les ventes par la soci�t�.......... (d�nomination sociale et adresse) de ......... "+"\n" +
				"\n" +
				"(cat�gories ou nature des produits commercialis�s par le site Internet). \n" + 
				"\n" + 
				"Article 2 - Prix\n" + 
				"\n" + 
				"Les prix de nos produits sont indiqu�s en euros toutes taxes comprises (TVA et autres taxes applicables au jour "+"\n" +
				"\n" +
				"de la commande), sauf indication contraire et hors frais de traitement et d'exp�dition. \n" + 
				"\n" + 
				"En cas de commande vers un pays autre que la France m�tropolitaine vous �tes l'importateur du ou des produits"+"\n" +
				"\n" +
				" concern�s. Des droits de douane ou autres taxes locales ou droits d'importation ou taxes d'�tat sont susceptibles "+"\n" +
				"\n" +
				"d'�tre exigibles. Ces droits et sommes ne rel�vent pas du ressort de la soci�t� \n" + 
				"\n" + 
				".........(d�nomination sociale). Ils seront � votre charge et rel�vent de votre enti�re responsabilit�, tant en termes de"+"\n" +
				"\n" +
				" d�clarations que de paiements aux autorit�s et organismes comp�tents de votre pays. Nous vous conseillons de "+"\n" +
				"\n" +
				"vous renseigner sur ces aspects aupr�s de vos autorit�s locales. \n" + 
				"\n" + 
				"Toutes les commandes quelle que soit leur origine sont payables en euros.  \n" + 
				"\n" + 
				"La soci�t� ......... (d�nomination sociale) se r�serve le droit de modifier ses prix � tout moment, mais le produit sera "+"\n" +
				"\n" +
				"factur� sur la base du tarif en vigueur au moment de la validation de la commande et sous r�serve de disponibilit�. \n" + 
				"\n" + 
				"Les produits demeurent la propri�t� de la soci�t� ......... (d�nomination sociale) jusqu'au paiement complet du prix.  \n" + 
				"\n" + 
				"Attention : d�s que vous prenez possession physiquement des produits command�s, les risques de perte ou "+"\n" +
				"\n" +
				"d'endommagement des produits vous sont transf�r�s.");
		textArea.setSelectionStart(14);
		textArea.setBounds(10, 10, 664, 394);
		getContentPane().add(textArea);
		
		btnAccueil.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				Accueil.main(null);
			}
		});
		

	}
}
