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

//Controller-Klasse - implementiert ActionListener für 
//Speichern-Funktion der GUI-Klasse DekorationErfassen
public class MyDekoSpeichernActionListener implements ActionListener {

	// Definition der Variablen
	String stDekoBeschreibung = "";
	String stDekoName = "";
	private final IDekorationHandler dekorationHandler;
	DekorationErfassen dekoErfa;
	Dekoration deko;

	// Konstruktor
	// Uebergabe Objekt DekorationErfassen und Instanz von dekorationHandler
	public MyDekoSpeichernActionListener(DekorationErfassen dekoErfa,
			final IDekorationHandler dekorationHandler) {
		this.dekorationHandler = dekorationHandler;
		this.dekoErfa = dekoErfa;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Methodenaufruf um Leerzeichen zu eliminieren
		trimValues();
		// Validator instanzieren
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
		// Falls Validierung erfolgreich, neuen Dienstleister mit Anbieter
		// erstellen und mit
		// Dekoration dekorieren und Felder für Dekoration abfüllen
		if (allValid) {
			// Konkrete Erstellung eines Dienstleisters
			Dienstleister service1 = new Anbieter();
			// Dekoration des konkreten Dienstleisters
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

	// Leerzeichen eliminieren
	private void trimValues() {
		stDekoBeschreibung = dekoErfa.getBeschreibung().trim();
		stDekoName = dekoErfa.getName().trim();

	}
}
