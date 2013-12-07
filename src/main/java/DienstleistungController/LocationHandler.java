package DienstleistungController;

import DbConnect.EventException;
import DbConnect.IEventSQLHandler;
import DienstleistungVerw.Location;

public class LocationHandler implements ILocationHandler {

	public final IEventSQLHandler sqlHandler;

	// public LocationHandler() {
	public LocationHandler(final IEventSQLHandler sqlHandler) {
		this.sqlHandler = sqlHandler;
	}

	String ins = "";

	public void getLocBezeichnung(Location location) {
		System.out.println(location.getBezeichnung());
	}

	@Override
	public synchronized void insert(Location location) throws EventException {

		// System.out.println(ins);
		sqlHandler.insertLocation(location);

	}

	public String getInsert() {
		return ins;
	}

}
