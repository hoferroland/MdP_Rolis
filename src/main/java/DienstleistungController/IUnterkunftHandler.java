package DienstleistungController;

import DbConnect.EventException;
import DienstleisterDecoratePattern.Unterkunft;

public interface IUnterkunftHandler {

	// public void update(Location location);
	// public void delete(Location location);

	void insert(Unterkunft unterkunft, String anbieter) throws EventException;

}
