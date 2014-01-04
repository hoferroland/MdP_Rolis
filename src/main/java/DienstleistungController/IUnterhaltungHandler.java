package DienstleistungController;

import DbConnect.EventException;
import DienstleisterDecoratePattern.Unterhaltung;

public interface IUnterhaltungHandler {

	// public void update(Location location);
	// public void delete(Location location);

	void insert(Unterhaltung unterhaltung, String anbieter)
			throws EventException;

}
