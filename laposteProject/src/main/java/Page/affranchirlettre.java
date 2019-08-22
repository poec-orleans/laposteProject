package Page;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;

public class affranchirlettre {

	private JFrame frame;
	private Label label;
	//
	/**
	 * Launch the application.
	 */
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
		label.setBounds(0, 0, 684, 414);
		frame.getContentPane().add(label);

		int n = (int) (Math.random() * 5);
		double prix = 0.9;
		String prixfinal = String.valueOf(prix);
	}

}
