package DienstleistungController;

import DbConnect.EventException;
import DienstleistungVerw.Catering;

public interface ICateringHandler {

	public void insert(Catering catering) throws EventException;
	// public void update(Catering catering);
	// public void delete(Catering catering);

}
