package DienstleistungController;

import DbConnect.EventException;
import DbConnect.IEventSQLHandler;
import DienstleistungVerw.Entertainment;

public class EntertainmentHandler implements IEntertainmentHandler {

	public final IEventSQLHandler sqlHandler;

	// public LocationHandler() {
	public EntertainmentHandler(final IEventSQLHandler sqlHandler) {
		this.sqlHandler = sqlHandler;
	}

	String ins = "";

	public void getEntertainBezeichnung(Entertainment entertainment) {
		System.out.println(entertainment.getBezeichnung());
	}

	@Override
	public synchronized void insert(Entertainment entertainment)
			throws EventException {

		// System.out.println(ins);
		sqlHandler.insertEntertainment(entertainment);

	}

	public String getInsert() {
		return ins;
	}

}
