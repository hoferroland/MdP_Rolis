package GUI;

public class Validator {

	public Validation validateDauer(String dauer) {
		Validation validation = null;
		// check if dauer is valid:
		try {
			Integer.parseInt(dauer);
			validation = new Validation(true);
		} catch (NumberFormatException nfe) {
			validation = new Validation(false, "Not a number");
		}

		return validation;
	}

	public Validation validateAnbieter(String anbieter) {
		Validation validation = null;
		if (anbieter.isEmpty()) {
			validation = new Validation(false,
					"Feld Anbieter darf nicht leer sein!");
		} else {
			validation = new Validation(true);
		}
		return validation;
	}

	public Validation validateBezeichnung(String bezeichnung) {
		Validation validation = null;
		if (bezeichnung.isEmpty()) {
			validation = new Validation(false,
					"Feld Bezeichnung darf nicht leer sein!");
		} else {
			validation = new Validation(true);
		}
		return validation;
	}

	public Validation validateStrasse(String strasse) {
		Validation validation = null;

		if (strasse.isEmpty()) {
			validation = new Validation(false,
					"Feld Strasse darf nicht leer sein!");
		} else {
			validation = new Validation(true);
		}
		return validation;
	}

	public Validation validateNr(Integer nr) {
		Validation validation = null;

		if (nr <= 0) {
			validation = new Validation(false,
					"Feld Hausnummer darf nicht leer sein!");
		} else {
			validation = new Validation(true);
		}
		return validation;
	}

	public Validation validatePLZ(Integer plz) {
		Validation validation = null;

		if (plz <= 999) {
			validation = new Validation(false,
					"Feld PLZ muss grösser 999 sein!");
		} else {
			validation = new Validation(true);
		}
		return validation;
	}

	public Validation validateOrt(String ort) {
		Validation validation = null;

		if (ort.isEmpty()) {
			validation = new Validation(false, "Feld Ort darf nicht leer sein!");
		} else {
			validation = new Validation(true);
		}
		return validation;
	}
}
