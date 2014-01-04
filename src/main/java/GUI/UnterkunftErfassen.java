package GUI;

import java.awt.Component;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import DienstleistungController.IUnterkunftHandler;
import DienstleistungController.MyUkunftSpeichernActionListener;

public class UnterkunftErfassen extends JFrame {

	private String anbieter;
	private JPanel contentPane;
	private JTextField txt_UkunftBeschreibung;
	private JTextField txt_UkunftName;
	private JTextField txt_UkunftPreis;
	private JTextField txt_UkunftKlasse;
	private JTextField txt_UkunftAnzPl;
	private JTextField txt_UkunftStrasse;
	private JTextField txt_UkunftHausNr;
	private JTextField txt_UkunftPLZ;
	private JTextField txt_UkunftOrt;
	private JTextField txt_UkunftAnzParkpl;
	private JCheckBox chbox_UkunftBeamer;
	private Boolean bUkunftBeamer;

	/**
	 * Launch the application.
	 */

	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { UnterkunftErfassen frame = new
	 * UnterkunftErfassen(); frame.setVisible(true); } catch (Exception e) {
	 * e.printStackTrace(); } } }); }
	 */

	/**
	 * Create the frame.
	 */
	public UnterkunftErfassen(final IUnterkunftHandler unterkunftHandler,
			String anbieter) {
		this.anbieter = anbieter;

		setTitle("Unterkunft Erfassen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 507, 441);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		contentPane.setLayout(null);

		txt_UkunftBeschreibung = new JTextField();
		txt_UkunftBeschreibung.setBounds(115, 81, 307, 56);
		contentPane.add(txt_UkunftBeschreibung);
		txt_UkunftBeschreibung.setColumns(10);

		txt_UkunftName = new JTextField();
		txt_UkunftName.setBounds(115, 48, 307, 20);
		contentPane.add(txt_UkunftName);
		txt_UkunftName.setColumns(10);

		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setBounds(10, 51, 46, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Beschreibung:");
		lblNewLabel_1.setBounds(10, 82, 78, 14);
		contentPane.add(lblNewLabel_1);

		MyUkunftSpeichernActionListener btnSpeichernAC = new MyUkunftSpeichernActionListener(
				this, unterkunftHandler);

		JButton btnUkunftSpeichern = new JButton("Angaben Speichern");
		btnUkunftSpeichern.setBounds(178, 369, 125, 23);
		contentPane.add(btnUkunftSpeichern);
		btnUkunftSpeichern.addActionListener(btnSpeichernAC);

		txt_UkunftPreis = new JTextField();
		txt_UkunftPreis.setBounds(115, 242, 86, 20);
		contentPane.add(txt_UkunftPreis);
		txt_UkunftPreis.setColumns(10);

		txt_UkunftKlasse = new JTextField();
		txt_UkunftKlasse.setBounds(115, 148, 86, 20);
		contentPane.add(txt_UkunftKlasse);
		txt_UkunftKlasse.setColumns(10);

		txt_UkunftAnzPl = new JTextField();
		txt_UkunftAnzPl.setBounds(115, 179, 86, 20);
		contentPane.add(txt_UkunftAnzPl);
		txt_UkunftAnzPl.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Komfortklasse:");
		lblNewLabel_2.setBounds(10, 151, 78, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Anzahl Pl\u00E4tze:");
		lblNewLabel_3.setBounds(10, 182, 78, 14);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Preis:");
		lblNewLabel_4.setBounds(10, 245, 46, 14);
		contentPane.add(lblNewLabel_4);

		Box horizontalBox = Box.createHorizontalBox();
		horizontalBox.setBounds(231, 146, 172, 88);
		contentPane.add(horizontalBox);

		chbox_UkunftBeamer = new JCheckBox("Beamer");
		horizontalBox.add(chbox_UkunftBeamer);
		chbox_UkunftBeamer.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				if (chbox_UkunftBeamer.isSelected()) {
					bUkunftBeamer = true;
				}
			}
		});
		txt_UkunftStrasse = new JTextField();
		txt_UkunftStrasse.setBounds(115, 273, 165, 20);
		contentPane.add(txt_UkunftStrasse);
		txt_UkunftStrasse.setColumns(10);

		txt_UkunftHausNr = new JTextField();
		txt_UkunftHausNr.setBounds(290, 273, 43, 20);
		contentPane.add(txt_UkunftHausNr);
		txt_UkunftHausNr.setColumns(10);

		JLabel lblStrasseNr = new JLabel("Strasse / Nr:");
		lblStrasseNr.setBounds(10, 276, 78, 14);
		contentPane.add(lblStrasseNr);

		txt_UkunftPLZ = new JTextField();
		txt_UkunftPLZ.setBounds(115, 304, 53, 20);
		contentPane.add(txt_UkunftPLZ);
		txt_UkunftPLZ.setColumns(10);

		txt_UkunftOrt = new JTextField();
		txt_UkunftOrt.setBounds(178, 304, 155, 20);
		contentPane.add(txt_UkunftOrt);
		txt_UkunftOrt.setColumns(10);

		JLabel lblPlzOrt = new JLabel("PLZ / Ort:");
		lblPlzOrt.setBounds(10, 307, 66, 14);
		contentPane.add(lblPlzOrt);

		JLabel lblBitteAngabenZur = new JLabel(
				"Bitte Angaben zur Unterkunft eingeben");
		lblBitteAngabenZur.setBounds(12, 11, 268, 14);
		contentPane.add(lblBitteAngabenZur);

		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setBounds(10, 36, 471, 1);
		contentPane.add(horizontalStrut);

		txt_UkunftAnzParkpl = new JTextField();
		txt_UkunftAnzParkpl.setBounds(115, 210, 86, 20);
		contentPane.add(txt_UkunftAnzParkpl);
		txt_UkunftAnzParkpl.setColumns(10);

		JLabel lblAnzahlParkpltze = new JLabel("Anzahl Parkpl\u00E4tze:");
		lblAnzahlParkpltze.setBounds(10, 220, 86, 14);
		contentPane.add(lblAnzahlParkpltze);

	}

	public String getAnbieterName() {
		return this.anbieter;
	}

	public String getUkunftBeschreibung() {
		return txt_UkunftBeschreibung.getText();
	}

	public String getUkunftName() {
		return txt_UkunftName.getText();
	}

	public String getKlasse() {
		return txt_UkunftKlasse.getText();
	}

	public String getAnzahlPl() {
		return txt_UkunftAnzPl.getText();
	}

	public double getPreis() {
		return Double.parseDouble(txt_UkunftPreis.getText());
	}

	public String getAnzahlPP() {
		return txt_UkunftAnzParkpl.getText();
	}

	public String getStrasse() {
		return txt_UkunftStrasse.getText();
	}

	public String getHausNr() {
		return txt_UkunftHausNr.getText();
	}

	public String getPLZ() {
		return txt_UkunftPLZ.getText();
	}

	public String getOrt() {
		return txt_UkunftOrt.getText();
	}

	public boolean getBeamer() {
		return bUkunftBeamer;
	}

}
