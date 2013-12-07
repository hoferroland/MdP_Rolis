package GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;

import DbConnect.EventException;
import DienstleistungController.ILocationHandler;
import DienstleistungVerw.Location;

public class LocationErfassen extends JFrame {

	/**
	 * 
	 */

	private static final long serialVersionUID = -7781305609167524534L;
	private JPanel contentPane;
	private JTextField txtLocationBezeichnung;
	private JTextField textLocationStrasse;
	private JTextField textLocationNr;
	private JTextField textLocationPLZ;
	private JTextField textLocationOrt;
	private JTextField textLocationAnbieter;
	private JLabel lblNameDesAnbieters;
	private JButton btnLocSave;
	private JTextField textLocationDatum;
	private JTextField textLocationKosten;
	private JTextField textLocationDauer;

	String stBezeichnung = "";
	String stAnbieter = "";
	String stStrasse = "";
	int iNr;
	int iPLZ;
	String stOrt = "";

	private final ILocationHandler locationHandler;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { SwingUtilities.invokeLater(new
	 * Runnable() { // EventQueue.invokeLater(new Runnable() { public void run()
	 * { try { LocationErfassen frame = new LocationErfassen();
	 * frame.setVisible(true);
	 * 
	 * } catch (Exception e) { e.printStackTrace(); } } }); }
	 */

	/**
	 * Create the frame.
	 */

	public LocationErfassen(final ILocationHandler locationHandler) {

		this.locationHandler = locationHandler;
		// public LocationErfassen() {
		setTitle("EventPlattform - Location erfassen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 662, 497);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblBitteFllenSie = new JLabel(
				"Bitte f\u00FCllen Sie alle untenstehenden Felder aus");
		lblBitteFllenSie.setBounds(10, 11, 237, 14);
		contentPane.add(lblBitteFllenSie);

		txtLocationBezeichnung = new JTextField();
		txtLocationBezeichnung.setBounds(161, 36, 86, 20);
		contentPane.add(txtLocationBezeichnung);
		txtLocationBezeichnung.setColumns(10);

		JLabel lblNameDerLocation = new JLabel("Name der Location:");
		lblNameDerLocation.setBounds(20, 36, 110, 14);
		contentPane.add(lblNameDerLocation);

		textLocationStrasse = new JTextField();
		textLocationStrasse.setBounds(161, 67, 86, 20);
		contentPane.add(textLocationStrasse);
		textLocationStrasse.setColumns(10);

		JLabel lblStrasse = new JLabel("Strasse:");
		lblStrasse.setBounds(20, 70, 110, 14);
		contentPane.add(lblStrasse);

		textLocationNr = new JTextField();
		textLocationNr.setBounds(161, 98, 86, 20);
		contentPane.add(textLocationNr);
		textLocationNr.setColumns(10);

		JLabel lblHausnummer = new JLabel("Hausnummer:");
		lblHausnummer.setBounds(20, 101, 96, 14);
		contentPane.add(lblHausnummer);

		textLocationPLZ = new JTextField();
		textLocationPLZ.setBounds(161, 129, 86, 20);
		contentPane.add(textLocationPLZ);
		textLocationPLZ.setColumns(10);

		JLabel lblPlz = new JLabel("PLZ:");
		lblPlz.setBounds(20, 132, 110, 14);
		contentPane.add(lblPlz);

		textLocationOrt = new JTextField();
		textLocationOrt.setBounds(161, 160, 86, 20);
		contentPane.add(textLocationOrt);
		textLocationOrt.setColumns(10);

		JLabel lblOrt = new JLabel("Ort:");
		lblOrt.setBounds(20, 163, 110, 14);
		contentPane.add(lblOrt);

		textLocationAnbieter = new JTextField();
		textLocationAnbieter.setBounds(161, 227, 86, 20);
		contentPane.add(textLocationAnbieter);
		textLocationAnbieter.setColumns(10);

		lblNameDesAnbieters = new JLabel("Name des Anbieters:");
		lblNameDesAnbieters.setBounds(20, 230, 131, 14);
		contentPane.add(lblNameDesAnbieters);

		btnLocSave = new JButton("Eingaben abschliessen und speichern");
		btnLocSave.setBounds(20, 403, 227, 23);
		contentPane.add(btnLocSave);
		btnLocSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				trimValues();
				Validator validator = new Validator();
				// todo - wie kann ich vom GUI was speichern?????

				boolean allValid = true;
				Validation validateBezeichnung = validator
						.validateBezeichnung(txtLocationBezeichnung.getText());
				allValid &= validateBezeichnung.isValid();

				if (!validateBezeichnung.isValid()) {
					// fehler in gui anzeigen
					validateBezeichnung.getError();
				}

				if (allValid) {
					final Location location = new Location(stBezeichnung,
							stAnbieter, iPLZ, stOrt, stStrasse, iNr);

					// neuer Service (save....)
					// Nur zu Debugzwecken..
					// System.out.println(location.getBezeichnung());
					// Handler L
					SwingUtilities.invokeLater(new Runnable() {
						public void run() {
							try {
								locationHandler.insert(location);
							} catch (EventException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					});

				}

			}
		});

		JSeparator separator = new JSeparator();
		separator.setBounds(362, 299, 29, -251);
		contentPane.add(separator);

		JLabel lblDieseFelderSind = new JLabel("Diese Felder sind optional");
		lblDieseFelderSind.setBounds(362, 11, 258, 14);
		contentPane.add(lblDieseFelderSind);

		textLocationDatum = new JTextField();
		textLocationDatum.setBounds(161, 258, 86, 20);
		contentPane.add(textLocationDatum);
		textLocationDatum.setColumns(10);

		JLabel lblDatum = new JLabel("Datum:");
		lblDatum.setBounds(20, 261, 46, 14);
		contentPane.add(lblDatum);

		textLocationKosten = new JTextField();
		textLocationKosten.setBounds(161, 289, 86, 20);
		contentPane.add(textLocationKosten);
		textLocationKosten.setColumns(10);

		JLabel lblPreiskosten = new JLabel("Preis/Kosten:");
		lblPreiskosten.setBounds(20, 292, 110, 14);
		contentPane.add(lblPreiskosten);

		textLocationDauer = new JTextField();
		textLocationDauer.setBounds(161, 320, 86, 20);
		contentPane.add(textLocationDauer);
		textLocationDauer.setColumns(10);

		JLabel lblDauer = new JLabel("Dauer:");
		lblDauer.setBounds(20, 323, 46, 14);
		contentPane.add(lblDauer);

	}

	// Führende und nachfolgende Leerzeichen abschneiden (um Fehleingaben zu
	// vermeiden)
	private void trimValues() {
		stBezeichnung = txtLocationBezeichnung.getText().trim();
		// String stBezeichnung = txtLocationBezeichnung.getText();
		stStrasse = textLocationStrasse.getText().trim();
		// textLocationNr.setText(textLocationNr.getText().trim());
		String stNr = textLocationNr.getText().trim();
		iNr = Integer.valueOf(stNr);
		// textLocationPLZ.setText(textLocationPLZ.getText().trim());
		String stPLZ = textLocationPLZ.getText().trim();
		iPLZ = Integer.valueOf(stPLZ);
		stOrt = textLocationOrt.getText().trim();
		stAnbieter = textLocationAnbieter.getText().trim();

	}
	/*
	 * // Feldprüfungen private boolean inputIsValid() { boolean ok = true;
	 * String msg = "";
	 * 
	 * if (txtLocationBezeichnung.getText().length() == 0) { ok = false; msg +=
	 * "Location - Bezeichnung fehlt\n"; }
	 * 
	 * if (textLocationStrasse.getText().length() == 0) { ok = false; msg +=
	 * "Location - Strasse fehlt\n"; }
	 * 
	 * if (textLocationNr.getText().length() == 0) { ok = false; msg +=
	 * "Location - Hausnummer fehlt\n"; }
	 * 
	 * if (textLocationPLZ.getText().length() == 0) { ok = false; msg +=
	 * "Location - Postleitzahl fehlt\n"; }
	 * 
	 * if (textBezeichnungOrt.getText().length() == 0) { ok = false; msg +=
	 * "Location - Ortsangabe fehlt\n"; }
	 * 
	 * if (textLocationAnbieter.getText().length() == 0) { ok = false; msg +=
	 * "Location - Name des Anbieters fehlt\n"; }
	 * 
	 * if (!ok) JOptionPane.showMessageDialog(contentPane, msg, "Fehler",
	 * JOptionPane.ERROR_MESSAGE); return ok; }
	 */
}
