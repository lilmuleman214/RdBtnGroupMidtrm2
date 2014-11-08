package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;

import java.awt.FlowLayout;

public class main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
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
	public main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ButtonGroup RadioTest = new ButtonGroup();
		
		JPanel pnlRadioBTN = new JPanel();
		pnlRadioBTN.setBounds(23, 71, 79, 96);
		contentPane.add(pnlRadioBTN);
		pnlRadioBTN.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JRadioButton rdbtnSmall = new JRadioButton("Small");
		pnlRadioBTN.add(rdbtnSmall);
		RadioTest.add(rdbtnSmall);
		
		JRadioButton rdbtnMedium = new JRadioButton("Medium");
		pnlRadioBTN.add(rdbtnMedium);
		RadioTest.add(rdbtnMedium);
		
		JRadioButton rdbtnLarge = new JRadioButton("Large");
		pnlRadioBTN.add(rdbtnLarge);
		RadioTest.add(rdbtnLarge);
	}
}
