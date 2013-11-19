package rentAnEventTest;

import static org.junit.Assert.*;

import org.junit.Test;

import rentAnEvent.Entertainment;

public class EntertainmentTest {

	private String[] asUnterhaltungsart;
	private int iAnzahlUnterhalter;
	private String sBezeichnung = "";
	private int iPLZ = 0;
	private String sOrt = "";
	private String sStrasse = "";
	private int iHausnummer = 0;
	private String sAnbieter = "";
	private String sDatum = "";
	private double dKosten = 0.0;
	private double dDauer = 0.0;
	private Entertainment myEntertainment = new Entertainment(this.sBezeichnung, this.sAnbieter, this.sDatum, this.dKosten, this.dDauer, this.asUnterhaltungsart, this.iAnzahlUnterhalter);
	private String sWebseite = "";
	private String sBuchungsfrist = "";
	private String sAbsagebedingungen = "";
	private String sTelefon = "";
	private String sEmail = "";
	private String sZusatz = "";
	
	@Test
	public void testEntertainment() {
		assertNotNull(myEntertainment);
	}

	@Test
	public void testUnterhaltungsart() {
		String[] asUnterhaltungsart = {"Zaubershow", "Gesang", "Comedy"}; 
		myEntertainment.setUnterhaltungsart(asUnterhaltungsart);
		assertArrayEquals(new String[]{"Zaubershow", "Gesang", "Comedy"}, myEntertainment.getUnterhaltungsart());
	}
	
	@Test
	public void testSetServicepersonal() {
		myEntertainment.setAnzahlUnterhalter(2);
		assertEquals(2, myEntertainment.getAnzahlUnterhalter());
	}
	
	@Test
	public void testSetBezeichnung() {
		myEntertainment.setBezeichnung("Houdini's Erbe");
		assertEquals("Houdini's Erbe", myEntertainment.getBezeichnung());
	}

	@Test
	public void testSetPLZ() {
		myEntertainment.setPLZ(8005);
		assertEquals(8005, myEntertainment.getPLZ());
	}
	
	@Test
	public void testSetOrt() {
		myEntertainment.setOrt("Zürich");
		assertEquals("Zürich", myEntertainment.getOrt());
	}

	@Test
	public void testSetStrasse() {
		myEntertainment.setStrasse("Zürich");
		assertEquals("Zürich", myEntertainment.getStrasse());
	}
	
	@Test
	public void testSetHausnummer() {
		myEntertainment.setHausnummer(1);
		assertEquals(1, myEntertainment.getHausnummer());
	}
	
	@Test
	public void testSetAnbieter() {
		myEntertainment.setAnbieter("Houdini junior");
		assertEquals("Houdini junior", myEntertainment.getAnbieter());
	}

	@Test
	public void testSetDatum() {
		myEntertainment.setDatum("18.11.2013");
		assertEquals("18.11.2013", myEntertainment.getDatum());
	}

	@Test
	public void testSetKosten() {
		myEntertainment.setKosten(999.95);
		assertEquals(999.95, myEntertainment.getKosten(), 0.0);
	}

	@Test
	public void testSetDauer() {
		myEntertainment.setDauer(8.5);
		assertEquals(8.5, myEntertainment.getDauer(), 0.0);
	}
	
	@Test
	public void testSetWebseite() {
		myEntertainment.setWebseite("www.houdinison.ch");
		assertEquals("www.houdinison.ch", myEntertainment.getWebseite());
	}
	
	@Test
	public void testSetBuchungsfrist() {
		myEntertainment.setBuchungsfrist("17.11.2013");
		assertEquals("17.11.2013", myEntertainment.getBuchungsfrist());
	}

	@Test
	public void testSetAbsagebedingungen() {
		myEntertainment.setAbsagebedingungen("Krankheit, Unfall, etc");
		assertEquals("Krankheit, Unfall, etc", myEntertainment.getAbsagebedingungen());
	}

	@Test
	public void testSetTelefon() {
		myEntertainment.setTelefon("044 444 44 44");
		assertEquals("044 444 44 44", myEntertainment.getTelefon());
	}
	
	@Test
	public void testSetEmail() {
		myEntertainment.setEmail("houdinison@miracle.com");
		assertEquals("houdinison@miracle.com", myEntertainment.getEmail());
	}
	
	@Test
	public void testSetZusatz() {
		myEntertainment.setZusatz("...");
		assertEquals("...", myEntertainment.getZusatz());
	}
	

}

