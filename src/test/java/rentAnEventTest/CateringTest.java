package rentAnEventTest;

import static org.junit.Assert.*;

import org.junit.Test;

import rentAnEvent.Catering;

public class CateringTest {

	private String[] asKueche;
	private int iServicepersonal;
	private String sBezeichnung = "";
	private int iPLZ = 0;
	private String sOrt = "";
	private String sStrasse = "";
	private int iHausnummer = 0;
	private String sAnbieter = "";
	private String sDatum = "";
	private double dKosten = 0.0;
	private double dDauer = 0.0;
	private Catering myCatering = new Catering(this.sBezeichnung, this.sAnbieter, this.sDatum, this.dKosten, this.dDauer, this.asKueche, this.iServicepersonal);
	private String sWebseite = "";
	private String sBuchungsfrist = "";
	private String sAbsagebedingungen = "";
	private String sTelefon = "";
	private String sEmail = "";
	private String sZusatz = "";
	
	@Test
	public void testCatering() {
		assertNotNull(myCatering);
	}

	@Test
	public void testSetKueche() {
		String[] asKueche = {"italienisch", "französisch", "deutsch"}; 
		myCatering.setKueche(asKueche);
		assertArrayEquals(new String[]{"italienisch", "französisch", "deutsch"}, myCatering.getKueche());
	}
	
	@Test
	public void testSetServicepersonal() {
		myCatering.setServicepersonal(5);
		assertEquals(5, myCatering.getServicepersonal());
	}
	
	@Test
	public void testSetBezeichnung() {
		myCatering.setBezeichnung("Toni's Pizzadienst");
		assertEquals("Toni's Pizzadienst", myCatering.getBezeichnung());
	}

	@Test
	public void testSetPLZ() {
		myCatering.setPLZ(8005);
		assertEquals(8005, myCatering.getPLZ());
	}
	
	@Test
	public void testSetOrt() {
		myCatering.setOrt("Zürich");
		assertEquals("Zürich", myCatering.getOrt());
	}

	@Test
	public void testSetStrasse() {
		myCatering.setStrasse("Zürich");
		assertEquals("Zürich", myCatering.getStrasse());
	}
	
	@Test
	public void testSetHausnummer() {
		myCatering.setHausnummer(1);
		assertEquals(1, myCatering.getHausnummer());
	}
	
	@Test
	public void testSetAnbieter() {
		myCatering.setAnbieter("Toni Italiano");
		assertEquals("Toni Italiano", myCatering.getAnbieter());
	}

	@Test
	public void testSetDatum() {
		myCatering.setDatum("18.11.2013");
		assertEquals("18.11.2013", myCatering.getDatum());
	}

	@Test
	public void testSetKosten() {
		myCatering.setKosten(199.95);
		assertEquals(199.95, myCatering.getKosten(), 0.0);
	}

	@Test
	public void testSetDauer() {
		myCatering.setDauer(5.5);
		assertEquals(5.5, myCatering.getDauer(), 0.0);
	}
	
	@Test
	public void testSetWebseite() {
		myCatering.setWebseite("www.palais-x-tra.ch");
		assertEquals("www.palais-x-tra.ch", myCatering.getWebseite());
	}
	
	@Test
	public void testSetBuchungsfrist() {
		myCatering.setBuchungsfrist("17.11.2013");
		assertEquals("17.11.2013", myCatering.getBuchungsfrist());
	}

	@Test
	public void testSetAbsagebedingungen() {
		myCatering.setAbsagebedingungen("Krankheit, Unfall, etc");
		assertEquals("Krankheit, Unfall, etc", myCatering.getAbsagebedingungen());
	}

	@Test
	public void testSetTelefon() {
		myCatering.setTelefon("044 444 44 44");
		assertEquals("044 444 44 44", myCatering.getTelefon());
	}
	
	@Test
	public void testSetEmail() {
		myCatering.setEmail("tonipizza@maf.com");
		assertEquals("tonipizza@maf.com", myCatering.getEmail());
	}
	
	@Test
	public void testSetZusatz() {
		myCatering.setZusatz("...");
		assertEquals("...", myCatering.getZusatz());
	}
	

}
