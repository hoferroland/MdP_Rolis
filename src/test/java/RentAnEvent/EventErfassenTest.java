package RentAnEvent;

import static org.junit.Assert.*;

import org.junit.Test;

import RentAnEvent.EventErfassen;

public class EventErfassenTest {

	EventErfassen testObject = new EventErfassen();
	
	@Test
	public void test() {
		// Wurde Object erschaffen?
		assertNotNull(testObject);
		// Sind globale Variablen leere Strings ?
		assertEquals(testObject.getService(),"");
		assertEquals(testObject.getLocation(),"");
		assertEquals(testObject.getCatering(),"");
		assertEquals(testObject.getEntertainment(),"");
		// Können globale Variablen gesetzt und abgefragt werden ?
		testObject.setService("Location");
		assertEquals(testObject.getService(), "Location");
		testObject.setLocation("ZHAW");
		assertEquals(testObject.getLocation(),"ZHAW");
		testObject.setCatering("Hiltl");
		assertEquals(testObject.getCatering(),"Hiltl");
		testObject.setEntertainment("Zaubershow");
		assertEquals(testObject.getEntertainment(),"Zaubershow");
		// Funktioniert Auswahl und Zuweisung einer Dienstleistung ?
		testObject.chooseService(); // Eingabe von "L" und "Train"
		assertEquals(testObject.getService(), "Location");
		testObject.clearService();
		assertEquals(testObject.getService(), "");
		assertEquals(testObject.getLocation(), "Train");
		testObject.chooseService(); // Eingabe von "C" und "Railbar"
		assertEquals(testObject.getService(), "Catering");
		testObject.clearService();
		assertEquals(testObject.getService(), "");
		assertEquals(testObject.getCatering(), "Railbar");
		testObject.chooseService(); // Eingabe von "E" und "View"
		assertEquals(testObject.getService(), "Entertainment");
		testObject.clearService();
		assertEquals(testObject.getService(), "");
		assertEquals(testObject.getEntertainment(), "View");		
// kommentar 
	}

}
