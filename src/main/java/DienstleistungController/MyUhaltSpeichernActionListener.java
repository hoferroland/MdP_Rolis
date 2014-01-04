package DienstleistungController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingUtilities;

import DbConnect.EventException;
import DienstleisterDecoratePattern.Anbieter;
import DienstleisterDecoratePattern.Dienstleister;
import DienstleisterDecoratePattern.Unterhaltung;
import GUI.UnterhaltungErfassen;
import GUI.Validation;
import GUI.Validator;

public class MyUhaltSpeichernActionListener implements ActionListener {

	// private AnbieterErfassen anbieterErfassen;

	String stUhaltBeschreibung;
	String stUhaltName;
	String stUhaltAnzahl;
	String stUhaltStil;

	private final IUnterhaltungHandler unterhaltungHandler;
	UnterhaltungErfassen uhaltErfa;
	Unterhaltung uhalt;

	/*
	 * public MyAnbSpeichernActionListener(String beschreibung, String name,
	 * String strasse, String nr, String plz, String ort, String email, double
	 * pauschale, final IAnbieterHandler anbieterHandler) {
	 * this.txt_AnbBeschreibung = beschreibung; this.txt_AnbName = name;
	 * this.txt_AnbStrasse = strasse; this.txt_AnbHausNr = nr; this.txt_AnbPLZ =
	 * plz; this.txt_AnbOrt = ort; this.txt_AnbEmail = email; this.dAnbPauschale
	 * = pauschale; this.anbieterHandler = anbieterHandler; }
	 */

	public MyUhaltSpeichernActionListener(UnterhaltungErfassen uhaltErfa,
			final IUnterhaltungHandler unterhaltungHandler) {
		this.unterhaltungHandler = unterhaltungHandler;
		this.uhaltErfa = uhaltErfa;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		trimValues();
		Validator validator = new Validator();

		boolean allValid = true;
		Validation validateBeschreibung = validator
				.validateBeschreibung(stUhaltBeschreibung);
		allValid &= validateBeschreibung.isValid();
		if (!validateBeschreibung.isValid()) {
			// fehler in gui anzeigen
			validateBeschreibung.getError();
		}
		Validation validateName = validator.validateName(stUhaltName);
		allValid &= validateName.isValid();
		if (!validateName.isValid()) {
			validateName.getError();
		}

		if (allValid) {
			Dienstleister service1 = new Anbieter();
			uhalt = new Unterhaltung(service1);
			service1 = uhalt;

			uhalt.setBeschreibung(stUhaltBeschreibung);
			uhalt.setName(stUhaltName);
			uhalt.setAnzahlUnterhalter(stUhaltAnzahl);
			uhalt.setMusikstil(stUhaltStil);
			uhalt.setPreis(uhaltErfa.getPreis());

			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					try {
						unterhaltungHandler.insert(uhalt,
								uhaltErfa.getAnbieterName());
					} catch (EventException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
		}

	}

	private void trimValues() {
		stUhaltBeschreibung = uhaltErfa.getBeschreibung().trim();
		stUhaltName = uhaltErfa.getName().trim();
		stUhaltAnzahl = uhaltErfa.getAnzahl().trim();
		stUhaltStil = uhaltErfa.getStil().trim();

	}
}
