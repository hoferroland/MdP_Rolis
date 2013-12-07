package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JRadioButtonMenuItem;

public class DienstleistungServiceErfassen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DienstleistungServiceErfassen frame = new DienstleistungServiceErfassen();
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
	public DienstleistungServiceErfassen() {
		setTitle("EventPlattform - Dienstleistung erfassen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 424, 10);
		contentPane.add(panel);
		
		JRadioButton rdbtnLocation = new JRadioButton("Location");
		rdbtnLocation.setBounds(34, 41, 109, 23);
		contentPane.add(rdbtnLocation);
		
		JRadioButton rdbtnCatering = new JRadioButton("Catering");
		rdbtnCatering.setBounds(34, 67, 109, 23);
		contentPane.add(rdbtnCatering);
		
		JRadioButton rdbtnEntertainment = new JRadioButton("Entertainment");
		rdbtnEntertainment.setBounds(34, 93, 109, 23);
		contentPane.add(rdbtnEntertainment);
		
		JLabel lblBitteWhlenSie = new JLabel("Bitte w\u00E4hlen Sie die Art der zu erfassenden Dienstleistung aus");
		lblBitteWhlenSie.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBitteWhlenSie.setBounds(15, 20, 414, 14);
		contentPane.add(lblBitteWhlenSie);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBounds(34, 130, 89, 23);
		contentPane.add(btnOk);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(DienstleistungServiceErfassen.class.getResource("/Pic/BigEvent.jpg")));
		lblNewLabel.setBounds(172, 41, 230, 200);
		contentPane.add(lblNewLabel);
		
		JLabel lblcMdprolis = new JLabel("(c) MdPRolis 2013 by zhaw");
		lblcMdprolis.setFont(new Font("Tahoma", Font.PLAIN, 6));
		lblcMdprolis.setBounds(15, 227, 147, 14);
		contentPane.add(lblcMdprolis);
	}
}
