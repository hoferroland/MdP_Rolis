// Test nicht automatisiert, dient Kontrolle, ob Eingabeschemen in Ordnung/durchführbar

package rentAnEventTest;

import static org.junit.Assert.*;

import org.junit.Test;

import rentAnEvent.SupportErfassen;

public class ServiceErfassenTest {

	private SupportErfassen mySupportErfassen = new SupportErfassen();
	
	@Test
	public void testLocationErfasst() {
		mySupportErfassen.chooseService();
		assertNotNull(mySupportErfassen);
	}
	
	// eventuell weitere Tests mit Objekt (da nicht automatisierbar, sinnvoll?
}
