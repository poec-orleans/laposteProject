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
		txtrArticle.setText("Article 1 : Objet Les présentes Conditions Générales de Vente déterminent les droits et obligations des parties dans le cadre de la vente en ligne de Produits ou Services proposés par le Vendeur.\r\n" + 
				
				"NOTE: On détaille ici l’objet du contrat qui est la vente en ligne de Produits et de Services par le Vendeur\r\n" + 
				
				"Article 2 : Dispositions générales Les présentes Conditions Générales de Vente régissent les ventes de Produits ou de Services, effectuées au travers des sites Internet de la Société, et sont partie intégrante du Contrat entre l’Acheteur et le Vendeur. Elles sont pleinement opposables à l’Acheteur qui les a acceptés avant de passer commande.\r\n" + 
				
				"Le Vendeur se réserve la possibilité de modifier les présentes, à tout moment par la publication d’une nouvelle version sur son site Internet. Les CGV applicables alors sont celles étant en vigueur à la date du paiement (ou du premier paiement en cas de paiements multiples) de la commande. Ces CGV sont consultables sur le site Internet de la Société à l’adresse suivante : XXX .");
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
