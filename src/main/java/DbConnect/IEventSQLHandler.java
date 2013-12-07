package DbConnect;

import DienstleistungVerw.Location;

public interface IEventSQLHandler {

	// public String getLocationInsert(Location location);

	// public String getCateringInsert(CateringHandler cateringHandler);
	// public String getEntertainmentInsert(EntertainmentHandler
	// entertainmentHandler);

	public String getInsert();

	public void insertLocation(Location location) throws EventException;
	// public void update();
	// public void delete();
}
