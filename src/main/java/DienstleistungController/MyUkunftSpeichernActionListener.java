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

//Controller-Klasse - implementiert ActionListener für 
//Speichern-Funktion der GUI-Klasse UnterkunftErfassen
public class MyUkunftSpeichernActionListener implements ActionListener {

	// Definition der Variablen
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

	// Konstruktor
	// Uebergabe Objekt UnterkunftErfassen und Instanz von unterkunftHandler
	public MyUkunftSpeichernActionListener(UnterkunftErfassen ukunftErfa,
			final IUnterkunftHandler ukunftHandler) {
		this.unterkunftHandler = ukunftHandler;
		this.ukunftErfa = ukunftErfa;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Methodenaufruf um Leerzeichen zu eliminieren
		trimValues();
		// Validator instanzieren
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
		// Falls Validierung erfolgreich, neuen Dienstleister mit Anbieter
		// erstellen und mit
		// Unterkunft dekorieren und Felder für Unterkunft abfüllen
		if (allValid) {
			// Konkrete Erstellung eines Dienstleisters
			Dienstleister service1 = new Anbieter();
			// Dekoration des konkreten Dienstleisters
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

	// Leerzeichen eliminieren
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
