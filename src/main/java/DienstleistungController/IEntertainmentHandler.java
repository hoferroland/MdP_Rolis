package DienstleistungController;

import DbConnect.EventException;
import DienstleistungVerw.Entertainment;

public interface IEntertainmentHandler {

	public void insert(Entertainment entertainment) throws EventException;
	// public void update(Entertainment entertainment);
	// public void delete(Entertainment entertainment);

}
