package DienstleistungController;

import DbConnect.EventException;
import DbConnect.IEventSQLHandler;
import DienstleisterDecoratePattern.Dekoration;

public class DekorationHandler implements IDekorationHandler {

	public final IEventSQLHandler sqlHandler;

	// public LocationHandler() {
	public DekorationHandler(final IEventSQLHandler sqlHandler) {
		this.sqlHandler = sqlHandler;

	}

	String ins = "";

	// public void getLocBezeichnung(Location location) {
	// System.out.println(location.getBezeichnung());
	// }

	@Override
	public synchronized void insert(Dekoration dekoration, String anbieter)
			throws EventException {

		// System.out.println(ins);
		sqlHandler.insertDekoration(dekoration, anbieter);

	}

	public String getInsert() {
		return ins;
	}

}
