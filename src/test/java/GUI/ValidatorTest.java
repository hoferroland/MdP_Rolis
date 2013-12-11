package GUI;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ValidatorTest {

	private Validator validator;

	@Before
	public void getValidator() {
		validator = new Validator();
	}

	// Validation für Feld Anbieter prüfen (soll true und leeren String
	// zurückgeben)
	@Test
	public void testPositivValidateAnbieter() {
		// Validator validator = new Validator();
		Validation validation = validator.validateAnbieter("blaa");
		// assertEquals(true, validation.isValid());
		assertTrue(validation.isValid());
		assertEquals("", validation.getError());

	}

	// Validation für Feld Anbieter prüfen (soll false und Error-Meldung
	// zurückgeben)
	@Test
	public void testNegativValidateAnbieter() {
		Validation validation = validator.validateAnbieter("");
		assertTrue(!validation.isValid());
		assertEquals("Feld Anbieter darf nicht leer sein!",
				validation.getError());
	}

	// Validation für Feld Bezeichnung prüfen (soll true und leeren String
	// zurückgeben)
	@Test
	public void testPositivValidateBezeichnung() {
		Validation validation = validator.validateBezeichnung("blaa");
		assertTrue(validation.isValid());
		assertEquals("", validation.getError());
	}

	// Validation für Feld Bezeichnung prüfen (soll false und Error-Meldung
	// zurückgeben)
	@Test
	public void testNegativValidateBezeichnung() {
		Validation validation = validator.validateBezeichnung("");
		assertTrue(!validation.isValid());
		assertEquals("Feld Bezeichnung darf nicht leer sein!",
				validation.getError());
	}

	// Validation für Feld Strasse prüfen (soll true und leeren String
	// zurückgeben)
	@Test
	public void testPositivValidateStrasse() {
		Validation validation = validator.validateStrasse("blaa");
		assertTrue(validation.isValid());
		assertEquals("", validation.getError());
	}

	// Validation für Feld Strasse prüfen (soll false und Error-Meldung
	// zurückgeben)
	@Test
	public void testNegativValidateStrasse() {
		Validation validation = validator.validateStrasse("");
		assertTrue(!validation.isValid());
		assertEquals("Feld Strasse darf nicht leer sein!",
				validation.getError());
	}

	// Validation für Feld Nr prüfen (soll true und leeren String
	// zurückgeben)
	@Test
	public void testPositivValidateNr() {
		Validation validation = validator.validateNr(2);
		assertTrue(validation.isValid());
		assertEquals("", validation.getError());
	}

	// Validation für Feld Nr prüfen (soll false und Error-Meldung
	// zurückgeben)
	@Test
	public void testNegativValidateNr() {
		Validation validation = validator.validateNr(0);
		assertTrue(!validation.isValid());
		assertEquals("Feld Hausnummer darf nicht leer sein!",
				validation.getError());
	}

	// Validation für Feld PLZ prüfen (soll true und leeren String
	// zurückgeben)
	@Test
	public void testPositivValidatePLZ() {
		Validation validation = validator.validatePLZ(1111);
		assertTrue(validation.isValid());
		assertEquals("", validation.getError());
	}

	// Validation für Feld PLZ prüfen (soll false und Error-Meldung
	// zurückgeben)
	@Test
	public void testNegativValidatePLZ() {
		Validation validation = validator.validatePLZ(111);
		assertTrue(!validation.isValid());
		assertEquals("Feld PLZ muss grösser 999 sein!", validation.getError());
	}

	// Validation für Feld Ort prüfen (soll true und leeren String
	// zurückgeben)
	@Test
	public void testPositivValidateOrt() {
		Validation validation = validator.validateOrt("blaa");
		assertTrue(validation.isValid());
		assertEquals("", validation.getError());
	}

	// Validation für Feld Ort prüfen (soll false und Error-Meldung
	// zurückgeben)
	@Test
	public void testNegativValidateOrt() {
		Validation validation = validator.validateOrt("");
		assertTrue(!validation.isValid());
		assertEquals("Feld Ort darf nicht leer sein!", validation.getError());
	}
}
