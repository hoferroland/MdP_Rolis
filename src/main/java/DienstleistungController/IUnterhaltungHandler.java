package DienstleistungController;

import DbConnect.EventException;
import DienstleisterDecoratePattern.Unterhaltung;

public interface IUnterhaltungHandler {

	void insert(Unterhaltung unterhaltung, String anbieter)
			throws EventException;

}
