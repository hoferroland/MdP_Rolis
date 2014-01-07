package DienstleistungController;

import DbConnect.EventException;
import DbConnect.IEventSQLHandler;
import DienstleisterDecoratePattern.Verpflegung;

public class VerpflegungHandler implements IVerpflegungHandler {

	public final IEventSQLHandler sqlHandler;

	public VerpflegungHandler(final IEventSQLHandler sqlHandler) {
		this.sqlHandler = sqlHandler;

	}

	String ins = "";

	@Override
	// Methode zum Aufruf der Methode 'insertUnterhaltung' in Klasse
	// EventSQLHandler.
	// Uebergabe von unterhaltung sowie anbieter (um Referenz in DB
	// herzustellen)
	public synchronized void insert(Verpflegung verpflegung, String anbieter)
			throws EventException {

		// System.out.println(ins);
		sqlHandler.insertVerpflegung(verpflegung, anbieter);

	}

	public String getInsert() {
		return ins;
	}

}
