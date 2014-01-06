package DienstleistungController;

import DbConnect.EventException;
import DbConnect.IEventSQLHandler;
import DienstleisterDecoratePattern.Unterhaltung;

public class UnterhaltungHandler implements IUnterhaltungHandler {

	public final IEventSQLHandler sqlHandler;

	public UnterhaltungHandler(final IEventSQLHandler sqlHandler) {
		this.sqlHandler = sqlHandler;

	}

	String ins = "";

	@Override
	// Methode zum Aufruf der Methode 'insertUnterhaltung' in Klasse
	// EventSQLHandler.
	// Uebergabe von unterhaltung sowie anbieter (um Referenz in DB
	// herzustellen)
	public synchronized void insert(Unterhaltung unterhaltung, String anbieter)
			throws EventException {

		// System.out.println(ins);
		sqlHandler.insertUnterhaltung(unterhaltung, anbieter);

	}

	public String getInsert() {
		return ins;
	}

}
