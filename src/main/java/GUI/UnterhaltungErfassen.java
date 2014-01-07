package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import DienstleistungController.IUnterhaltungHandler;
import DienstleistungController.MyUhaltSpeichernActionListener;

public class UnterhaltungErfassen extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7868184337340054876L;
	private String anbieter;
	private JPanel contentPane;
	private JTextField txt_UhaltName;
	private JTextField txt_UhaltBeschreibung;
	private JTextField txt_UhaltAnzahl;
	private JTextField txt_UhaltStil;
	private JTextField txt_UhaltPreis;

	/**
	 * Create the frame.
	 */
	public UnterhaltungErfassen(final IUnterhaltungHandler unterhaltungHandler,
			String anbieter) {
		this.anbieter = anbieter;

		setTitle("\"BIG-EVENT  -  Dienstleistung Unterhaltung hinzuf\u00FCgen\"");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 341);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Labels

		JLabel lblNewLabel = new JLabel(
				"Bitte Angaben zur Unterhaltung eingeben");
		lblNewLabel.setBounds(10, 11, 242, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setBounds(10, 50, 99, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Beschreibung:");
		lblNewLabel_2.setBounds(10, 83, 99, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Anzahl Unterhalter:");
		lblNewLabel_3.setBounds(10, 152, 110, 14);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Stil / Art:");
		lblNewLabel_4.setBounds(10, 183, 73, 14);
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Preis:");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5.setBounds(10, 218, 99, 14);
		contentPane.add(lblNewLabel_5);

		// Datenfelder

		txt_UhaltName = new JTextField();
		txt_UhaltName.setBounds(139, 48, 285, 20);
		contentPane.add(txt_UhaltName);
		txt_UhaltName.setColumns(10);

		txt_UhaltBeschreibung = new JTextField();
		txt_UhaltBeschreibung.setBounds(139, 79, 285, 59);
		contentPane.add(txt_UhaltBeschreibung);
		txt_UhaltBeschreibung.setColumns(10);

		txt_UhaltAnzahl = new JTextField();
		txt_UhaltAnzahl.setBounds(139, 149, 86, 20);
		contentPane.add(txt_UhaltAnzahl);
		txt_UhaltAnzahl.setColumns(10);

		txt_UhaltStil = new JTextField();
		txt_UhaltStil.setToolTipText("Musikstil bzw. Genre");
		txt_UhaltStil.setBounds(139, 180, 86, 20);
		contentPane.add(txt_UhaltStil);
		txt_UhaltStil.setColumns(10);

		txt_UhaltPreis = new JTextField();
		txt_UhaltPreis.setBounds(139, 215, 86, 20);
		contentPane.add(txt_UhaltPreis);
		txt_UhaltPreis.setColumns(10);

		// Instanzierung der Controller-Klasse und Uebergabe GUI-Objekt sowie
		// unterhaltungHandler
		MyUhaltSpeichernActionListener btnSpeichernAC = new MyUhaltSpeichernActionListener(
				this, unterhaltungHandler);

		JButton btnUhaltSpeichern = new JButton("Angaben Speichern");
		btnUhaltSpeichern.setBounds(139, 258, 175, 23);
		contentPane.add(btnUhaltSpeichern);
		btnUhaltSpeichern.addActionListener(btnSpeichernAC);
	}

	// Getter-Methoden
	public String getAnbieterName() {
		return this.anbieter;
	}

	public String getName() {
		return txt_UhaltName.getText();
	}

	public String getBeschreibung() {
		return txt_UhaltBeschreibung.getText();
	}

	public String getAnzahl() {
		return txt_UhaltAnzahl.getText();
	}

	public String getStil() {
		return txt_UhaltStil.getText();
	}

	public double getPreis() {
		return Double.parseDouble(txt_UhaltPreis.getText());
	}

}
