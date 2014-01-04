package DienstleistungController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingUtilities;

import DbConnect.EventException;
import DienstleisterDecoratePattern.Anbieter;
import DienstleisterDecoratePattern.Dekoration;
import DienstleisterDecoratePattern.Dienstleister;
import GUI.DekorationErfassen;
import GUI.Validation;
import GUI.Validator;

public class MyDekoSpeichernActionListener implements ActionListener {

	// private AnbieterErfassen anbieterErfassen;

	String stDekoBeschreibung;
	String stDekoName;
	// Boolean stDekoBlumen;

	private final IDekorationHandler dekorationHandler;
	DekorationErfassen dekoErfa;
	Dekoration deko;

	// Unterkunft uku;

	/*
	 * public MyAnbSpeichernActionListener(String beschreibung, String name,
	 * String strasse, String nr, String plz, String ort, String email, double
	 * pauschale, final IAnbieterHandler anbieterHandler) {
	 * this.txt_AnbBeschreibung = beschreibung; this.txt_AnbName = name;
	 * this.txt_AnbStrasse = strasse; this.txt_AnbHausNr = nr; this.txt_AnbPLZ =
	 * plz; this.txt_AnbOrt = ort; this.txt_AnbEmail = email; this.dAnbPauschale
	 * = pauschale; this.anbieterHandler = anbieterHandler; }
	 */

	public MyDekoSpeichernActionListener(DekorationErfassen dekoErfa,
			final IDekorationHandler dekorationHandler) {
		this.dekorationHandler = dekorationHandler;
		this.dekoErfa = dekoErfa;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		trimValues();
		Validator validator = new Validator();

		boolean allValid = true;
		Validation validateBeschreibung = validator
				.validateBeschreibung(stDekoBeschreibung);
		allValid &= validateBeschreibung.isValid();
		if (!validateBeschreibung.isValid()) {
			// fehler in gui anzeigen
			validateBeschreibung.getError();
		}
		Validation validateName = validator.validateName(stDekoName);
		allValid &= validateName.isValid();
		if (!validateName.isValid()) {
			validateName.getError();
		}

		if (allValid) {
			Dienstleister service1 = new Anbieter();
			deko = new Dekoration(service1);
			service1 = deko;

			deko.setBeschreibung(stDekoBeschreibung);
			deko.setName(stDekoName);
			deko.setBlumen(dekoErfa.getBlumen());
			deko.setPreis(dekoErfa.getPreis());

			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					try {
						dekorationHandler.insert(deko,
								dekoErfa.getAnbieterName());
					} catch (EventException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
		}

	}

	private void trimValues() {
		stDekoBeschreibung = dekoErfa.getBeschreibung().trim();
		stDekoName = dekoErfa.getName().trim();

	}
}
