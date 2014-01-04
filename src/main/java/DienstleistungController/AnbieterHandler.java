package DienstleistungController;

import DbConnect.EventException;
import DbConnect.IEventSQLHandler;
import DienstleisterDecoratePattern.Anbieter;

public class AnbieterHandler implements IAnbieterHandler {

	public final IEventSQLHandler sqlHandler;

	// public LocationHandler() {
	public AnbieterHandler(final IEventSQLHandler sqlHandler) {
		this.sqlHandler = sqlHandler;

	}

	String ins = "";

	// public void getLocBezeichnung(Location location) {
	// System.out.println(location.getBezeichnung());
	// }

	@Override
	public synchronized void insert(Anbieter anbieter) throws EventException {

		// System.out.println(ins);
		sqlHandler.insertAnbieter(anbieter);

	}

	public String getInsert() {
		return ins;
	}

}
