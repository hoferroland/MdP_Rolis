package GUI;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import DienstleistungController.IDekorationHandler;
import DienstleistungController.MyDekoSpeichernActionListener;

public class DekorationErfassen extends JFrame {

	private String anbieter;
	private JPanel contentPane;
	private JTextField txt_DekoName;
	private JTextField txt_DekoBeschreibung;
	private JTextField txt_DekoPreis;
	private JCheckBox checkBoxDekoBlumen;
	private Boolean bDekoBlumen = false;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { DekorationErfassen frame = new
	 * DekorationErfassen(); frame.setVisible(true); } catch (Exception e) {
	 * e.printStackTrace(); } } }); }
	 */

	/**
	 * Create the frame.
	 */
	public DekorationErfassen(final IDekorationHandler dekorationHandler,
			String anbieter) {
		this.anbieter = anbieter;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Bitte Angaben zur Dekoration eingeben");
		lblNewLabel.setBounds(10, 11, 228, 14);
		contentPane.add(lblNewLabel);

		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(10, 36, 46, 14);
		contentPane.add(lblName);

		JLabel lblBeschreibung = new JLabel("Beschreibung:");
		lblBeschreibung.setBounds(10, 61, 76, 14);
		contentPane.add(lblBeschreibung);

		txt_DekoName = new JTextField();
		txt_DekoName.setBounds(92, 33, 290, 20);
		contentPane.add(txt_DekoName);
		txt_DekoName.setColumns(10);

		txt_DekoBeschreibung = new JTextField();
		txt_DekoBeschreibung.setBounds(92, 58, 290, 58);
		contentPane.add(txt_DekoBeschreibung);
		txt_DekoBeschreibung.setColumns(10);

		checkBoxDekoBlumen = new JCheckBox("Mit Blumen");
		checkBoxDekoBlumen.setBounds(92, 123, 97, 23);
		contentPane.add(checkBoxDekoBlumen);
		checkBoxDekoBlumen.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				if (checkBoxDekoBlumen.isSelected()) {
					bDekoBlumen = true;
				}
			}
		});

		// bDekoBlumen = checkBoxDekoBlumen.isSelected();

		JLabel lblNewLabel_1 = new JLabel("Preis:");
		lblNewLabel_1.setBounds(10, 161, 46, 14);
		contentPane.add(lblNewLabel_1);

		txt_DekoPreis = new JTextField();
		txt_DekoPreis.setBounds(92, 158, 86, 20);
		contentPane.add(txt_DekoPreis);
		txt_DekoPreis.setColumns(10);

		MyDekoSpeichernActionListener btnSpeichernAC = new MyDekoSpeichernActionListener(
				this, dekorationHandler);

		JButton btnDekoSpeichern = new JButton("Angaben Speichern");
		btnDekoSpeichern.setBounds(161, 228, 125, 23);
		contentPane.add(btnDekoSpeichern);
		btnDekoSpeichern.addActionListener(btnSpeichernAC);
	}

	public String getAnbieterName() {
		return this.anbieter;
	}

	public String getName() {
		return txt_DekoName.getText();
	}

	public String getBeschreibung() {
		return txt_DekoBeschreibung.getText();
	}

	public boolean getBlumen() {
		return Boolean.parseBoolean(bDekoBlumen.toString());
	}

	public double getPreis() {
		return Double.parseDouble(txt_DekoPreis.getText());
	}

}
