package GUI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import DbConnect.IEventSQLHandler;
import DienstleistungController.IAnbieterHandler;
import DienstleistungController.IDekorationHandler;
import DienstleistungController.IUnterhaltungHandler;
import DienstleistungController.IUnterkunftHandler;

public class Startmaske extends JFrame {

	private JPanel contentPane;
	private JComboBox<String> comboBox;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { Startmaske frame = new
	 * Startmaske(); frame.setVisible(true); } catch (Exception e) {
	 * e.printStackTrace(); } } }); }
	 */
	/**
	 * Create the frame.
	 */
	public Startmaske(final IAnbieterHandler anbHandler,
			final IUnterkunftHandler ukunftHandler,
			final IDekorationHandler dekorationHandler,
			final IUnterhaltungHandler unterhaltungHandler,
			final IEventSQLHandler sqlHandler) {
		setTitle("BIG-EVENT  -  Dienstleistung Administration");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblHauptauswahl = new JLabel("Hauptauswahl");
		lblHauptauswahl.setBounds(46, 11, 82, 14);
		contentPane.add(lblHauptauswahl);

		JButton btnAnbieterHinzufgen = new JButton("Anbieter hinzuf\u00FCgen");
		btnAnbieterHinzufgen.setBounds(39, 46, 134, 23);
		contentPane.add(btnAnbieterHinzufgen);

		comboBox = new JComboBox<String>(sqlHandler.getAnbieter());
		comboBox.setBounds(39, 110, 183, 23);
		contentPane.add(comboBox);

		JLabel lblBestehendenAnbieterWhlen = new JLabel(
				"Bestehenden Anbieter w\u00E4hlen:");
		lblBestehendenAnbieterWhlen.setBounds(39, 90, 183, 14);
		contentPane.add(lblBestehendenAnbieterWhlen);

		JButton btnNewUkunft = new JButton("Neue Unterkunft hinzuf\u00FCgen");
		btnNewUkunft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewUkunft.setBounds(10, 166, 212, 33);
		contentPane.add(btnNewUkunft);
		// Button nur sichtbar wenn 'ComboBox' Anbieter Wert enthält
		if (comboBox.getSelectedItem() == null) {
			btnNewUkunft.setVisible(false);
		} else {
			btnNewUkunft.setVisible(true);
		}
		btnNewUkunft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				UnterkunftErfassen ukunftErfa = new UnterkunftErfassen(
						ukunftHandler, comboBox.getSelectedItem().toString());
				ukunftErfa.setVisible(true);
			}
		});
		JButton btnNewDeko = new JButton("Neue Dekoration hinzuf\u00FCgen");
		btnNewDeko.setBounds(10, 210, 212, 33);
		contentPane.add(btnNewDeko);
		btnNewDeko.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				DekorationErfassen dekoErfa = new DekorationErfassen(
						dekorationHandler, comboBox.getSelectedItem()
								.toString());
				dekoErfa.setVisible(true);
			}
		});

		JButton btnNewUhalt = new JButton("Neue Unterhaltung hinzuf\u00FCgen");
		btnNewUhalt.setBounds(10, 254, 212, 33);
		contentPane.add(btnNewUhalt);

		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon(Startmaske.class
				.getResource("/Pic/BigEvent.jpg")));
		label.setBounds(272, 90, 230, 200);
		contentPane.add(label);

		JLabel label_1 = new JLabel("(c) MdPRolis 2013 by zhaw");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 6));
		label_1.setBounds(10, 297, 147, 14);
		contentPane.add(label_1);

		JLabel lblVersion = new JLabel("Version 0.1 - 06.01.2014");
		lblVersion.setHorizontalAlignment(SwingConstants.RIGHT);
		lblVersion.setFont(new Font("Tahoma", Font.PLAIN, 6));
		lblVersion.setBounds(355, 295, 147, 14);
		contentPane.add(lblVersion);
		btnNewUhalt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				UnterhaltungErfassen uhaltErfa = new UnterhaltungErfassen(
						unterhaltungHandler, comboBox.getSelectedItem()
								.toString());
				uhaltErfa.setVisible(true);
			}
		});
	}

}
