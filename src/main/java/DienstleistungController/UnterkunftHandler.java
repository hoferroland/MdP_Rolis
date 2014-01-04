package DienstleistungController;

import DbConnect.EventException;
import DbConnect.IEventSQLHandler;
import DienstleisterDecoratePattern.Unterkunft;

public class UnterkunftHandler implements IUnterkunftHandler {

	public final IEventSQLHandler sqlHandler;

	// public LocationHandler() {
	public UnterkunftHandler(final IEventSQLHandler sqlHandler) {
		this.sqlHandler = sqlHandler;

	}

	String ins = "";

	// public void getLocBezeichnung(Location location) {
	// System.out.println(location.getBezeichnung());
	// }

	@Override
	public synchronized void insert(Unterkunft unterkunft, String anbieter)
			throws EventException {

		// System.out.println(ins);
		sqlHandler.insertUnterkunft(unterkunft, anbieter);

	}

	public String getInsert() {
		return ins;
	}

}
