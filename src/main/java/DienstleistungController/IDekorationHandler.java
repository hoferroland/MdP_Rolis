package DienstleistungController;

import DbConnect.EventException;
import DienstleisterDecoratePattern.Dekoration;

public interface IDekorationHandler {

	// public void update(Location location);
	// public void delete(Location location);

	void insert(Dekoration dekoration, String anbieter) throws EventException;

}
