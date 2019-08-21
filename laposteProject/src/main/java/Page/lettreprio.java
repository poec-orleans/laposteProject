package Page;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class lettreprio {

	private JFrame frame;
	private JTextField txtDansLePanier;
	private JTextField txtPrix;
	private JTextField textField;
	private JTextField textField_1;
	private JButton button_1;

	/**
	 * Launch the application.
	 */
	public static void lettreprioritaire(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lettreprio window = new lettreprio();
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
	public lettreprio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Affranchir une lettre");
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtDansLePanier = new JTextField();
		txtDansLePanier.setFont(new Font("Stencil", Font.PLAIN, 11));
		txtDansLePanier.setForeground(new Color(0, 139, 139));
		txtDansLePanier.setText("Dans votre panier");
		txtDansLePanier.setBounds(10, 430, 541, 20);
		frame.getContentPane().add(txtDansLePanier);
		txtDansLePanier.setColumns(10);
		
		txtPrix = new JTextField();
		txtPrix.setText("Prix :");
		txtPrix.setBounds(554, 430, 34, 20);
		frame.getContentPane().add(txtPrix);
		txtPrix.setColumns(10);
		
		textField = new JTextField();
		textField.setText("\u20AC");
		textField.setBounds(655, 430, 19, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(590, 430, 63, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnLettreStandard = new JButton("Lettre verte");
		btnLettreStandard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLettreStandard.setBounds(50, 100, 150, 100);
		frame.getContentPane().add(btnLettreStandard);
		
		JButton button = new JButton("Lettre prioritaire");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(263, 100, 150, 100);
		frame.getContentPane().add(button);
		
		button_1 = new JButton("Lettre internationale");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setBounds(475, 100, 150, 100);
		frame.getContentPane().add(button_1);
	}

}
