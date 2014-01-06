package DienstleistungController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingUtilities;

import DbConnect.EventException;
import DienstleisterDecoratePattern.Anbieter;
import GUI.AnbieterErfassen;
import GUI.Validation;
import GUI.Validator;

// Controller-Klasse - implementiert ActionListener für 
// Speichern-Funktion der GUI-Klasse AnbieterErfassen
public class MyAnbSpeichernActionListener implements ActionListener {

	// Definition der Variablen
	String stAnbBeschreibung;
	String stAnbName;
	String stAnbStrasse;
	String stAnbHausNr;
	String stAnbPLZ;
	String stAnbOrt;
	String stAnbEmail;
	private final IAnbieterHandler anbieterHandler;
	AnbieterErfassen anbErfa;

	// Konstruktor
	// Uebergabe Objekt AnbieterErfassen und Instanz von anbieterHandler
	public MyAnbSpeichernActionListener(AnbieterErfassen anbErfa,
			final IAnbieterHandler anbieterHandler) {
		this.anbieterHandler = anbieterHandler;
		this.anbErfa = anbErfa;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		trimValues();
		Validator validator = new Validator();
		// todo - wie kann ich vom GUI was speichern?????

		boolean allValid = true;
		Validation validateBeschreibung = validator
				.validateBeschreibung(stAnbBeschreibung);
		allValid &= validateBeschreibung.isValid();
		if (!validateBeschreibung.isValid()) {
			// fehler in gui anzeigen
			validateBeschreibung.getError();
		}
		Validation validateName = validator.validateName(stAnbName);
		allValid &= validateName.isValid();
		if (!validateName.isValid()) {
			validateName.getError();
		}
		Validation validateStrasse = validator.validateStrasse(stAnbStrasse);
		allValid &= validateStrasse.isValid();
		if (!validateStrasse.isValid()) {
			validateStrasse.getError();
		}
		Validation validateOrt = validator.validateOrt(stAnbOrt);
		allValid &= validateOrt.isValid();
		if (!validateOrt.isValid()) {
			validateOrt.getError();
		}

		if (allValid) {
			final Anbieter anbieter = new Anbieter(stAnbBeschreibung);
			anbieter.setName(stAnbName);
			anbieter.setStrasse(stAnbStrasse);
			anbieter.setNr(stAnbHausNr);
			anbieter.setPLZ(stAnbPLZ);
			anbieter.setOrt(stAnbOrt);
			anbieter.setEmail(stAnbEmail);
			anbieter.setPreis(anbErfa.getPauschale());

			// neuer Service (save....)
			// Nur zu Debugzwecken..
			// System.out.println(location.getBezeichnung());
			// Handler L
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					try {
						anbieterHandler.insert(anbieter);
					} catch (EventException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
		}

	}

	private void trimValues() {
		stAnbBeschreibung = anbErfa.getAnbBeschr().trim();
		stAnbName = anbErfa.getAnbName().trim();
		// String stBezeichnung = txtLocationBezeichnung.getText();
		stAnbStrasse = anbErfa.getAnbStrasse().trim();
		stAnbHausNr = anbErfa.getAnbHausNr().trim();
		stAnbPLZ = anbErfa.getAnbPlz().trim();
		stAnbOrt = anbErfa.getAnbOrt().trim();
		stAnbEmail = anbErfa.getAnbEmail().trim();

	}
}
