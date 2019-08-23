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
				"Les présentes conditions régissent les ventes par la société.......... (dénomination sociale et adresse) de ......... "+"\n" +
				"\n" +
				"(catégories ou nature des produits commercialisés par le site Internet). \n" + 
				"\n" + 
				"Article 2 - Prix\n" + 
				"\n" + 
				"Les prix de nos produits sont indiqués en euros toutes taxes comprises (TVA et autres taxes applicables au jour "+"\n" +
				"\n" +
				"de la commande), sauf indication contraire et hors frais de traitement et d'expédition. \n" + 
				"\n" + 
				"En cas de commande vers un pays autre que la France métropolitaine vous êtes l'importateur du ou des produits"+"\n" +
				"\n" +
				" concernés. Des droits de douane ou autres taxes locales ou droits d'importation ou taxes d'état sont susceptibles "+"\n" +
				"\n" +
				"d'être exigibles. Ces droits et sommes ne relèvent pas du ressort de la société \n" + 
				"\n" + 
				".........(dénomination sociale). Ils seront à votre charge et relèvent de votre entière responsabilité, tant en termes de"+"\n" +
				"\n" +
				" déclarations que de paiements aux autorités et organismes compétents de votre pays. Nous vous conseillons de "+"\n" +
				"\n" +
				"vous renseigner sur ces aspects auprès de vos autorités locales. \n" + 
				"\n" + 
				"Toutes les commandes quelle que soit leur origine sont payables en euros.  \n" + 
				"\n" + 
				"La société ......... (dénomination sociale) se réserve le droit de modifier ses prix à tout moment, mais le produit sera "+"\n" +
				"\n" +
				"facturé sur la base du tarif en vigueur au moment de la validation de la commande et sous réserve de disponibilité. \n" + 
				"\n" + 
				"Les produits demeurent la propriété de la société ......... (dénomination sociale) jusqu'au paiement complet du prix.  \n" + 
				"\n" + 
				"Attention : dès que vous prenez possession physiquement des produits commandés, les risques de perte ou "+"\n" +
				"\n" +
				"d'endommagement des produits vous sont transférés.");
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
