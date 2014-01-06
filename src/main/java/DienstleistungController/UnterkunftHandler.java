package DienstleistungController;

import DbConnect.EventException;
import DbConnect.IEventSQLHandler;
import DienstleisterDecoratePattern.Unterkunft;

public class UnterkunftHandler implements IUnterkunftHandler {

	public final IEventSQLHandler sqlHandler;

	public UnterkunftHandler(final IEventSQLHandler sqlHandler) {
		this.sqlHandler = sqlHandler;

	}

	String ins = "";

	@Override
	// Methode zum Aufruf der Methode 'insertUnterkunft' in Klasse
	// EventSQLHandler.
	// Uebergabe von unterkunft sowie anbieter (um Referenz in DB herzustellen)
	public synchronized void insert(Unterkunft unterkunft, String anbieter)
			throws EventException {

		// System.out.println(ins);
		sqlHandler.insertUnterkunft(unterkunft, anbieter);

	}

	public String getInsert() {
		return ins;
	}

}
