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

public class CDV extends JFrame {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CDV frame = new CDV();
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
	public CDV() {
		setBounds(100, 100, 700, 500);
		getContentPane().setLayout(null);
		
		JTextArea txtrArticle = new JTextArea();
		txtrArticle.setWrapStyleWord(true);
		txtrArticle.setLineWrap(true);
		txtrArticle.setText("Article 1 : Objet Les pr�sentes Conditions G�n�rales de Vente d�terminent les droits et obligations des parties dans le cadre de la vente en ligne de Produits ou Services propos�s par le Vendeur.\r\n" + 
				
				"NOTE: On d�taille ici l�objet du contrat qui est la vente en ligne de Produits et de Services par le Vendeur\r\n" + 
				
				"Article 2 : Dispositions g�n�rales Les pr�sentes Conditions G�n�rales de Vente r�gissent les ventes de Produits ou de Services, effectu�es au travers des sites Internet de la Soci�t�, et sont partie int�grante du Contrat entre l�Acheteur et le Vendeur. Elles sont pleinement opposables � l�Acheteur qui les a accept�s avant de passer commande.\r\n" + 
				
				"Le Vendeur se r�serve la possibilit� de modifier les pr�sentes, � tout moment par la publication d�une nouvelle version sur son site Internet. Les CGV applicables alors sont celles �tant en vigueur � la date du paiement (ou du premier paiement en cas de paiements multiples) de la commande. Ces CGV sont consultables sur le site Internet de la Soci�t� � l�adresse suivante : XXX .");
		txtrArticle.setBounds(10, 11, 664, 372);
		getContentPane().add(txtrArticle);
		
		JButton btnAccueil = new JButton("Accueil");
		btnAccueil.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				Accueil.main(null);
			}
		});
		btnAccueil.setBounds(300, 410, 89, 23);
		getContentPane().add(btnAccueil);
		btnAccueil.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				Accueil.main(null);
			}
		});
		

	}
}
