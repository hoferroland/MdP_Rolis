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

//Controller-Klasse - implementiert ActionListener für 
//Speichern-Funktion der GUI-Klasse UnterhaltungErfassen
public class MyUhaltSpeichernActionListener implements ActionListener {

	// Definition der Variablen
	String stUhaltBeschreibung;
	String stUhaltName;
	String stUhaltAnzahl;
	String stUhaltStil;
	private final IUnterhaltungHandler unterhaltungHandler;
	UnterhaltungErfassen uhaltErfa;
	Unterhaltung uhalt;

	// Konstruktor
	// Uebergabe Objekt UnterhaltungErfassen und Instanz von unterhaltungHandler
	public MyUhaltSpeichernActionListener(UnterhaltungErfassen uhaltErfa,
			final IUnterhaltungHandler unterhaltungHandler) {
		this.unterhaltungHandler = unterhaltungHandler;
		this.uhaltErfa = uhaltErfa;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Methodenaufruf um Leerzeichen zu eliminieren
		trimValues();
		// Validator instanzieren
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
		// Falls Validierung erfolgreich, neuen Dienstleister mit Anbieter
		// erstellen und mit
		// Unterhaltung dekorieren und Felder für Unterhaltung abfüllen
		if (allValid) {
			// Konkrete Erstellung eines Dienstleisters
			Dienstleister service1 = new Anbieter();
			// Dekoration des konkreten Dienstleisters
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

	// Leerzeichen eliminieren
	private void trimValues() {
		stUhaltBeschreibung = uhaltErfa.getBeschreibung().trim();
		stUhaltName = uhaltErfa.getName().trim();
		stUhaltAnzahl = uhaltErfa.getAnzahl().trim();
		stUhaltStil = uhaltErfa.getStil().trim();

	}
}
