package DienstleistungController;

import DbConnect.EventException;
import DienstleisterDecoratePattern.Anbieter;

public interface IAnbieterHandler {

	public void insert(Anbieter anbieter) throws EventException;
	// public void update(Location location);
	// public void delete(Location location);

}
