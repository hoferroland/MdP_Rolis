package DbConnect;

import DienstleistungVerw.Catering;
import DienstleistungVerw.Entertainment;
import DienstleistungVerw.Location;

public interface IEventSQLHandler {

	// public String getLocationInsert(Location location);

	// public String getCateringInsert(CateringHandler cateringHandler);
	// public String getEntertainmentInsert(EntertainmentHandler
	// entertainmentHandler);

	public String getInsert();

	public void insertLocation(Location location) throws EventException;

	public void insertCatering(Catering catering) throws EventException;

	public void insertEntertainment(Entertainment entertainment)
			throws EventException;
}
