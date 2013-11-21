// Test nicht automatisiert, dient Kontrolle, ob Eingabeschemen in Ordnung/durchführbar

package rentAnEventTest;

import static org.junit.Assert.*;

import org.junit.Test;

import rentAnEvent.ServiceErfassen;

public class ServiceErfassenTest {

	private ServiceErfassen myServiceErfassen = new ServiceErfassen();
	
	@Test
	public void testLocationErfasst() {
		myServiceErfassen.chooseService();
		assertNotNull(myServiceErfassen);
	}
	
	// eventuell weitere Tests mit Objekt (da nicht automatisierbar, sinnvoll?
}
