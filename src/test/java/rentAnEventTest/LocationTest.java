package rentAnEventTest;

import static org.junit.Assert.*;

import org.junit.Test;

import rentAnEvent.Location;

public class LocationTest {

	private String sBezeichnung = "";
	private int iPLZ = 0;
	private String sOrt = "";
	private String sStrasse = "";
	private int iHausnummer = 0;
	private String sAnbieter = "";
	private String sDatum = "";
	private double dKosten = 0.0;
	private double dDauer = 0.0;
	private Location myLocation = new Location(this.sBezeichnung, this.iPLZ, this.sOrt, this.sStrasse, this.iHausnummer, this.sAnbieter, this.sDatum, this.dKosten, this.dDauer);
	private String sWebseite = "";
	private String sBuchungsfrist = "";
	private String sAbsagebedingungen = "";
	private String sTelefon = "";
	private String sEmail = "";
	private String sZusatz = "";
	
	@Test
	public void testLocation() {
		assertNotNull(myLocation);
	}

	@Test
	public void testSetBezeichnung() {
		myLocation.setBezeichnung("Palais X-tra");
		assertEquals("Palais X-tra", myLocation.getBezeichnung());
	}

	@Test
	public void testSetPLZ() {
		myLocation.setPLZ(8005);
		assertEquals(8005, myLocation.getPLZ());
	}
	
	@Test
	public void testSetOrt() {
		myLocation.setOrt("Zürich");
		assertEquals("Zürich", myLocation.getOrt());
	}

	@Test
	public void testSetStrasse() {
		myLocation.setStrasse("Zürich");
		assertEquals("Zürich", myLocation.getStrasse());
	}
	
	@Test
	public void testSetHausnummer() {
		myLocation.setHausnummer(1);
		assertEquals(1, myLocation.getHausnummer());
	}
	
	@Test
	public void testSetAnbieter() {
		myLocation.setAnbieter("Palais X-tra");
		assertEquals("Palais X-tra", myLocation.getAnbieter());
	}

	@Test
	public void testSetDatum() {
		myLocation.setDatum("18.11.2013");
		assertEquals("18.11.2013", myLocation.getDatum());
	}

	@Test
	public void testSetKosten() {
		myLocation.setKosten(99.95);
		assertEquals(99.95, myLocation.getKosten(), 0.0);
	}

	@Test
	public void testSetDauer() {
		myLocation.setDauer(23.5);
		assertEquals(23.5, myLocation.getDauer(), 0.0);
	}
	
	@Test
	public void testSetWebseite() {
		myLocation.setWebseite("www.palais-x-tra.ch");
		assertEquals("www.palais-x-tra.ch", myLocation.getWebseite());
	}
	
	@Test
	public void testSetBuchungsfrist() {
		myLocation.setBuchungsfrist("17.11.2013");
		assertEquals("17.11.2013", myLocation.getBuchungsfrist());
	}

	@Test
	public void testSetAbsagebedingungen() {
		myLocation.setAbsagebedingungen("Krankheit, Unfall, etc");
		assertEquals("Krankheit, Unfall, etc", myLocation.getAbsagebedingungen());
	}

	@Test
	public void testSetTelefon() {
		myLocation.setTelefon("044 444 44 44");
		assertEquals("044 444 44 44", myLocation.getTelefon());
	}
	
	@Test
	public void testSetEmail() {
		myLocation.setEmail("palaisxtra@dmc.com");
		assertEquals("palaisxtra@dmc.com", myLocation.getEmail());
	}
	
	@Test
	public void testSetZusatz() {
		myLocation.setZusatz("...");
		assertEquals("...", myLocation.getZusatz());
	}
	

}
