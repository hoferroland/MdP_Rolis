// Klasse wird erst später gebraucht --> Kunde kann ein Event zusammenstellen

package rentAnEvent;

import java.util.Vector;

public class Event {
	
	public String sDatum;
	Vector<Location> vLocation = new Vector<Location>();
	
	public void addLocation(String sBezeichnung, int iPLZ, String sOrt, String sStrasse, int iHausnummer, String sAnbieter, String sDatum, double dKosten, double dDauer) {
		Location myLocation = new Location(sBezeichnung, iPLZ, sOrt, sStrasse, iHausnummer, sAnbieter, sDatum, dKosten, dDauer);
		vLocation.add(myLocation);
	}
	
	public Location getLocation(int iLocation) {
		if (vLocation.size()>iLocation && iLocation >= 0) {
			return vLocation.elementAt(iLocation);
		}
		else {
			return null;
		}
	}
	
	
	
}
