package DienstleistungController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingUtilities;

import DbConnect.EventException;
import DienstleisterDecoratePattern.Anbieter;
import DienstleisterDecoratePattern.Dienstleister;
import DienstleisterDecoratePattern.Verpflegung;
import GUI.Validation;
import GUI.Validator;
import GUI.VerpflegungErfassen;

//Controller-Klasse - implementiert ActionListener für 
//Speichern-Funktion der GUI-Klasse VerpflegungErfassen
public class MyVerpfSpeichernActionListener implements ActionListener {

	// Definition der Variablen
	String stVerpfBeschreibung;
	String stVerpfName;
	String stVerpfRegion;
	Boolean stVerpfVegi;
	Boolean stVerpfAllergie;
	double dVerpfPreis;

	double dAnbPauschale;
	private final IVerpflegungHandler verpflegungHandler;
	VerpflegungErfassen verpfErfa;
	Verpflegung verpf;

	// Konstruktor
	// Uebergabe Objekt UnterkunftErfassen und Instanz von unterkunftHandler
	public MyVerpfSpeichernActionListener(VerpflegungErfassen verpfErfa,
			final IVerpflegungHandler verpflegungHandler) {
		this.verpflegungHandler = verpflegungHandler;
		this.verpfErfa = verpfErfa;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Methodenaufruf um Leerzeichen zu eliminieren
		trimValues();
		// Validator instanzieren
		Validator validator = new Validator();

		boolean allValid = true;
		Validation validateBeschreibung = validator
				.validateBeschreibung(stVerpfBeschreibung);
		allValid &= validateBeschreibung.isValid();
		if (!validateBeschreibung.isValid()) {
			// fehler in gui anzeigen
			validateBeschreibung.getError();
		}
		Validation validateName = validator.validateName(stVerpfName);
		allValid &= validateName.isValid();
		if (!validateName.isValid()) {
			validateName.getError();
		}

		// Falls Validierung erfolgreich, neuen Dienstleister mit Anbieter
		// erstellen und mit
		// Unterkunft dekorieren und Felder für Unterkunft abfüllen
		if (allValid) {
			// Konkrete Erstellung eines Dienstleisters
			Dienstleister service1 = new Anbieter();
			// Dekoration des konkreten Dienstleisters
			verpf = new Verpflegung(service1);
			service1 = verpf;

			verpf.setBeschreibung(stVerpfBeschreibung);
			verpf.setName(stVerpfName);
			verpf.setRegion(stVerpfRegion);
			verpf.setVegi(stVerpfVegi);
			verpf.setAllergie(stVerpfAllergie);
			verpf.setPreis(verpfErfa.getPreis());

			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					try {
						verpflegungHandler.insert(verpf,
								verpfErfa.getAnbieterName());
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
		stVerpfBeschreibung = verpfErfa.getVerpfBeschr().trim();
		stVerpfName = verpfErfa.getVerpfName().trim();
		stVerpfRegion = verpfErfa.getVerpfRegion().trim();
		stVerpfVegi = verpfErfa.istVerpfVegi();
		stVerpfAllergie = verpfErfa.istVerpfAllergie();

	}
}
