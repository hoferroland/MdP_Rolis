package DienstleistungController;

import DbConnect.EventException;
import DienstleistungVerw.Location;

public interface ILocationHandler {

	public void insert(Location location) throws EventException;
	// public void update(Location location);
	// public void delete(Location location);

}
