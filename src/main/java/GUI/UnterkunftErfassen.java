package GUI;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

	/**
	 * 
	 */
	private static final long serialVersionUID = -840484330111554948L;
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
	 * Create the frame.
	 */
	public UnterkunftErfassen(final IUnterkunftHandler unterkunftHandler,
			final String anbieter) {
		this.anbieter = anbieter;

		setTitle("\"BIG-EVENT  -  Dienstleistung Unterkunft hinzuf\u00FCgen\"");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 507, 441);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Labels

		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setBounds(10, 51, 95, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Beschreibung:");
		lblNewLabel_1.setBounds(10, 82, 105, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Komfortklasse:");
		lblNewLabel_2.setBounds(10, 151, 105, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Anzahl Pl\u00E4tze:");
		lblNewLabel_3.setBounds(10, 182, 105, 14);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Preis:");
		lblNewLabel_4.setBounds(10, 258, 66, 14);
		contentPane.add(lblNewLabel_4);

		JLabel lblStrasseNr = new JLabel("Strasse / Nr:");
		lblStrasseNr.setBounds(10, 289, 105, 14);
		contentPane.add(lblStrasseNr);

		JLabel lblPlzOrt = new JLabel("PLZ / Ort:");
		lblPlzOrt.setBounds(10, 320, 105, 14);
		contentPane.add(lblPlzOrt);

		JLabel lblBitteAngabenZur = new JLabel(
				"Bitte Angaben zur Unterkunft eingeben");
		lblBitteAngabenZur.setBounds(12, 11, 268, 14);
		contentPane.add(lblBitteAngabenZur);

		JLabel lblAnzahlParkpltze = new JLabel("Anzahl Parkpl\u00E4tze:");
		lblAnzahlParkpltze.setBounds(10, 220, 105, 14);
		contentPane.add(lblAnzahlParkpltze);

		// Datenfelder

		txt_UkunftBeschreibung = new JTextField();
		txt_UkunftBeschreibung.setBounds(162, 82, 307, 56);
		contentPane.add(txt_UkunftBeschreibung);
		txt_UkunftBeschreibung.setColumns(10);

		txt_UkunftName = new JTextField();
		txt_UkunftName.setBounds(162, 48, 307, 20);
		contentPane.add(txt_UkunftName);
		txt_UkunftName.setColumns(10);

		txt_UkunftPreis = new JTextField();
		txt_UkunftPreis.setBounds(162, 255, 86, 20);
		contentPane.add(txt_UkunftPreis);
		txt_UkunftPreis.setColumns(10);

		txt_UkunftKlasse = new JTextField();
		txt_UkunftKlasse.setBounds(162, 148, 86, 20);
		contentPane.add(txt_UkunftKlasse);
		txt_UkunftKlasse.setColumns(10);

		txt_UkunftAnzPl = new JTextField();
		txt_UkunftAnzPl.setBounds(162, 179, 86, 20);
		contentPane.add(txt_UkunftAnzPl);
		txt_UkunftAnzPl.setColumns(10);

		txt_UkunftStrasse = new JTextField();
		txt_UkunftStrasse.setBounds(162, 286, 165, 20);
		contentPane.add(txt_UkunftStrasse);
		txt_UkunftStrasse.setColumns(10);

		txt_UkunftHausNr = new JTextField();
		txt_UkunftHausNr.setBounds(341, 286, 43, 20);
		contentPane.add(txt_UkunftHausNr);
		txt_UkunftHausNr.setColumns(10);

		txt_UkunftPLZ = new JTextField();
		txt_UkunftPLZ.setBounds(162, 317, 53, 20);
		contentPane.add(txt_UkunftPLZ);
		txt_UkunftPLZ.setColumns(10);

		txt_UkunftOrt = new JTextField();
		txt_UkunftOrt.setBounds(229, 317, 155, 20);
		contentPane.add(txt_UkunftOrt);
		txt_UkunftOrt.setColumns(10);

		txt_UkunftAnzParkpl = new JTextField();
		txt_UkunftAnzParkpl.setBounds(162, 217, 86, 20);
		contentPane.add(txt_UkunftAnzParkpl);
		txt_UkunftAnzParkpl.setColumns(10);
		Box horizontalBox = Box.createHorizontalBox();
		horizontalBox.setBounds(297, 148, 172, 88);
		contentPane.add(horizontalBox);

		// Checkbox für Beamer
		chbox_UkunftBeamer = new JCheckBox("Beamer");
		horizontalBox.add(chbox_UkunftBeamer);
		chbox_UkunftBeamer.addItemListener(new ItemListener() {
			// Zustandänderung der Checkbox abfragen
			public void itemStateChanged(ItemEvent ie) {
				if (chbox_UkunftBeamer.isSelected()) {
					bUkunftBeamer = true;
				}
			}
		});

		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setBounds(10, 36, 471, 1);
		contentPane.add(horizontalStrut);

		// Instanzierung der Controller-Klasse und Uebergabe GUI-Objekt sowie
		// unterkunftHandler
		MyUkunftSpeichernActionListener btnSpeichernAC = new MyUkunftSpeichernActionListener(
				this, unterkunftHandler);

		JButton btnUkunftSpeichern = new JButton("Angaben Speichern");
		btnUkunftSpeichern.setBounds(10, 369, 181, 23);
		contentPane.add(btnUkunftSpeichern);
		btnUkunftSpeichern.addActionListener(btnSpeichernAC);

		JButton btnNewUkunft = new JButton("Weitere Unterkunft erfassen");
		btnNewUkunft.setBounds(261, 369, 208, 23);
		contentPane.add(btnNewUkunft);
		btnNewUkunft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				UnterkunftErfassen ukunftErfa = new UnterkunftErfassen(
						unterkunftHandler, anbieter);

				ukunftErfa.setVisible(true);
			}
		});
	}

	// Getter-Methoden

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
