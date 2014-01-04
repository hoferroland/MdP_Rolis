package DienstleistungController;

import DbConnect.EventException;
import DbConnect.IEventSQLHandler;
import DienstleisterDecoratePattern.Unterhaltung;

public class UnterhaltungHandler implements IUnterhaltungHandler {

	public final IEventSQLHandler sqlHandler;

	// public LocationHandler() {
	public UnterhaltungHandler(final IEventSQLHandler sqlHandler) {
		this.sqlHandler = sqlHandler;

	}

	String ins = "";

	// public void getLocBezeichnung(Location location) {
	// System.out.println(location.getBezeichnung());
	// }

	@Override
	public synchronized void insert(Unterhaltung unterhaltung, String anbieter)
			throws EventException {

		// System.out.println(ins);
		sqlHandler.insertUnterhaltung(unterhaltung, anbieter);

	}

	public String getInsert() {
		return ins;
	}

}
