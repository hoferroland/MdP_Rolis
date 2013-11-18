package rentAnEventTest;

import static org.junit.Assert.*;

import org.junit.Test;

import rentAnEvent.SupportErfassen;

public class SupportErfassenTest {

	private SupportErfassen mySupportErfassen = new SupportErfassen();
	
	@Test
	public void testLocationErfasst() {
		mySupportErfassen.chooseService();
		assertNotNull(mySupportErfassen);
	}

}
