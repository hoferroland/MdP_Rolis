package DienstleistungController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingUtilities;

import DbConnect.EventException;
import DienstleisterDecoratePattern.Anbieter;
import DienstleisterDecoratePattern.Dienstleister;
import DienstleisterDecoratePattern.Unterkunft;
import GUI.UnterkunftErfassen;
import GUI.Validation;
import GUI.Validator;

public class MyUkunftSpeichernActionListener implements ActionListener {

	// private AnbieterErfassen anbieterErfassen;

	String stUkunftBeschreibung;
	String stUkunftName;
	String stUkunftPlaetze;
	String stUkunftKlasse;
	String stUkunftAnzPP;
	String stUkunftStrasse;
	String stUkunftHausNr;
	String stUkunftPLZ;
	String stUkunftOrt;
	Boolean stUkunftBeamer;

	double dAnbPauschale;
	private final IUnterkunftHandler unterkunftHandler;
	UnterkunftErfassen ukunftErfa;
	Unterkunft uku;

	/*
	 * public MyAnbSpeichernActionListener(String beschreibung, String name,
	 * String strasse, String nr, String plz, String ort, String email, double
	 * pauschale, final IAnbieterHandler anbieterHandler) {
	 * this.txt_AnbBeschreibung = beschreibung; this.txt_AnbName = name;
	 * this.txt_AnbStrasse = strasse; this.txt_AnbHausNr = nr; this.txt_AnbPLZ =
	 * plz; this.txt_AnbOrt = ort; this.txt_AnbEmail = email; this.dAnbPauschale
	 * = pauschale; this.anbieterHandler = anbieterHandler; }
	 */

	public MyUkunftSpeichernActionListener(UnterkunftErfassen ukunftErfa,
			final IUnterkunftHandler ukunftHandler) {
		this.unterkunftHandler = ukunftHandler;
		this.ukunftErfa = ukunftErfa;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		trimValues();
		Validator validator = new Validator();

		boolean allValid = true;
		Validation validateBeschreibung = validator
				.validateBeschreibung(stUkunftBeschreibung);
		allValid &= validateBeschreibung.isValid();
		if (!validateBeschreibung.isValid()) {
			// fehler in gui anzeigen
			validateBeschreibung.getError();
		}
		Validation validateName = validator.validateName(stUkunftName);
		allValid &= validateName.isValid();
		if (!validateName.isValid()) {
			validateName.getError();
		}

		Validation validateStrasse = validator.validateStrasse(stUkunftStrasse);
		allValid &= validateStrasse.isValid();
		if (!validateStrasse.isValid()) {
			validateStrasse.getError();
		}
		Validation validateOrt = validator.validateOrt(stUkunftOrt);
		allValid &= validateOrt.isValid();
		if (!validateOrt.isValid()) {
			validateOrt.getError();
		}

		if (allValid) {
			Dienstleister service1 = new Anbieter();
			uku = new Unterkunft(service1);
			service1 = uku;

			uku.setBeschreibung(stUkunftBeschreibung);
			uku.setName(stUkunftName);
			uku.setKomfortklasse(stUkunftKlasse);
			uku.setAnzPlaetze(stUkunftPlaetze);
			uku.setAnzParkplaetze(stUkunftAnzPP);
			uku.hatBeamer(stUkunftBeamer);
			uku.setStrasse(stUkunftStrasse);
			uku.setHausNr(stUkunftHausNr);
			uku.setPLZ(stUkunftPLZ);
			uku.setOrt(stUkunftOrt);
			uku.setPreis(ukunftErfa.getPreis());

			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					try {
						unterkunftHandler.insert(uku,
								ukunftErfa.getAnbieterName());
					} catch (EventException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
		}

	}

	private void trimValues() {
		stUkunftBeschreibung = ukunftErfa.getUkunftBeschreibung().trim();
		stUkunftName = ukunftErfa.getUkunftName().trim();
		stUkunftPlaetze = ukunftErfa.getAnzahlPl().trim();
		stUkunftKlasse = ukunftErfa.getKlasse().trim();
		stUkunftAnzPP = ukunftErfa.getAnzahlPP().trim();
		stUkunftStrasse = ukunftErfa.getStrasse().trim();
		stUkunftHausNr = ukunftErfa.getHausNr().trim();
		stUkunftPLZ = ukunftErfa.getPLZ().trim();
		stUkunftOrt = ukunftErfa.getOrt().trim();
		stUkunftBeamer = ukunftErfa.getBeamer();

	}
}
