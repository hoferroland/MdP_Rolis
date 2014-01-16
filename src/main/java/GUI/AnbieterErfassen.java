package GUI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import DienstleistungController.IAnbieterHandler;
import DienstleistungController.MyAnbSpeichernActionListener;

public class AnbieterErfassen extends JFrame {

	/**
	 * Variablen
	 */
	private static final long serialVersionUID = -3609697716827606332L;
	private IAnbieterHandler anbieterHandler;
	private JPanel contentPane;
	private JTextField txt_AnbBeschreibung;
	private JTextField txt_AnbName;
	private JTextField txt_AnbStrasse;
	private JTextField txt_AnbHausNr;
	private JTextField txt_AnbPLZ;
	private JTextField txt_AnbOrt;
	private JTextField txt_AnbEmail;
	private JTextField txt_AnbPauschale;
	private double dAnbPauschale;

	/**
	 * Create the frame.
	 */
	// Konstruktor mit Uebergabe anbieterHandler
	public AnbieterErfassen(final IAnbieterHandler anbieterHandler) {
		setTitle("\"BIG-EVENT  -  Neuen Anbieter erfassen\"");
		this.anbieterHandler = anbieterHandler;

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		// setDefault(CloseOperation(JFrame.));
		setBounds(100, 100, 538, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Labels

		JLabel lblAnbieterNeuerfassung = new JLabel("Anbieter Neu-Erfassung");
		lblAnbieterNeuerfassung.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAnbieterNeuerfassung.setBounds(10, 11, 186, 21);
		contentPane.add(lblAnbieterNeuerfassung);

		JLabel lblAnbietername = new JLabel("Firma-/K\u00FCnstler:");
		lblAnbietername.setToolTipText("Firma- oder K\u00FCnstlername");
		lblAnbietername.setBounds(20, 47, 96, 20);
		contentPane.add(lblAnbietername);

		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setBounds(20, 96, 115, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Strasse:");
		lblNewLabel_1.setBounds(20, 127, 115, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Hausnummer:");
		lblNewLabel_2.setBounds(20, 158, 96, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("PLZ:");
		lblNewLabel_3.setBounds(20, 189, 96, 14);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Ort:");
		lblNewLabel_4.setBounds(20, 220, 96, 14);
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("E-Mail-Adresse:");
		lblNewLabel_5.setBounds(20, 251, 115, 14);
		contentPane.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("Pauschale (Preis):");
		lblNewLabel_6.setBounds(20, 282, 115, 14);
		contentPane.add(lblNewLabel_6);

		// Datenfelder

		txt_AnbBeschreibung = new JTextField();
		txt_AnbBeschreibung.setBounds(145, 47, 132, 20);
		contentPane.add(txt_AnbBeschreibung);
		txt_AnbBeschreibung.setColumns(10);

		txt_AnbName = new JTextField();
		txt_AnbName.setBounds(145, 93, 86, 20);
		contentPane.add(txt_AnbName);
		txt_AnbName.setColumns(10);

		txt_AnbStrasse = new JTextField();
		txt_AnbStrasse.setBounds(145, 124, 86, 20);
		contentPane.add(txt_AnbStrasse);
		txt_AnbStrasse.setColumns(10);

		txt_AnbHausNr = new JTextField();
		txt_AnbHausNr.setBounds(145, 155, 86, 20);
		contentPane.add(txt_AnbHausNr);
		txt_AnbHausNr.setColumns(10);

		txt_AnbPLZ = new JTextField();
		txt_AnbPLZ.setBounds(145, 186, 86, 20);
		contentPane.add(txt_AnbPLZ);
		txt_AnbPLZ.setColumns(10);

		txt_AnbOrt = new JTextField();
		txt_AnbOrt.setBounds(145, 217, 86, 20);
		contentPane.add(txt_AnbOrt);
		txt_AnbOrt.setColumns(10);

		txt_AnbEmail = new JTextField();
		txt_AnbEmail.setBounds(145, 248, 86, 20);
		contentPane.add(txt_AnbEmail);
		txt_AnbEmail.setColumns(10);

		txt_AnbPauschale = new JTextField();
		txt_AnbPauschale.setBounds(145, 279, 86, 20);
		contentPane.add(txt_AnbPauschale);
		txt_AnbPauschale.setColumns(10);
		// dAnbPauschale = Double.parseDouble(txt_AnbPauschale.getText());

		// Instanzierung der Controller-Klasse und Uebergabe GUI-Objekt sowie
		// anbieterHandler
		MyAnbSpeichernActionListener btnSpeichernAC = new MyAnbSpeichernActionListener(
				this, anbieterHandler);

		JButton btn_AnbSpeichern = new JButton("Angaben speichern");
		btn_AnbSpeichern.setToolTipText("Eingaben speichern");
		btn_AnbSpeichern.setBounds(20, 334, 211, 23);
		contentPane.add(btn_AnbSpeichern);
		btn_AnbSpeichern.addActionListener(btnSpeichernAC);

		JButton btnNewAnb = new JButton("Weiteren Anbieter erfassen");
		btnNewAnb.setBounds(283, 334, 229, 23);
		contentPane.add(btnNewAnb);
		btnNewAnb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				AnbieterErfassen anbErfa = new AnbieterErfassen(anbieterHandler);

				anbErfa.setVisible(true);
			}
		});

	}

	// Getter-Methoden
	public double getPauschale() {
		return Double.parseDouble(txt_AnbPauschale.getText());
	}

	public String getAnbBeschr() {
		return txt_AnbBeschreibung.getText();
	}

	public String getAnbName() {
		return txt_AnbName.getText();
	}

	public String getAnbStrasse() {
		return txt_AnbStrasse.getText();
	}

	public String getAnbHausNr() {
		return txt_AnbHausNr.getText();
	}

	public String getAnbOrt() {
		return txt_AnbOrt.getText();
	}

	public String getAnbPlz() {
		return txt_AnbPLZ.getText();
	}

	public String getAnbEmail() {
		return txt_AnbEmail.getText();
	}
}
