package DienstleistungController;

import DbConnect.EventException;
import DbConnect.IEventSQLHandler;
import DienstleisterDecoratePattern.Anbieter;

public class AnbieterHandler implements IAnbieterHandler {

	public final IEventSQLHandler sqlHandler;

	public AnbieterHandler(final IEventSQLHandler sqlHandler) {
		this.sqlHandler = sqlHandler;

	}

	String ins = "";

	@Override
	// Methode zum Aufruf der Methode 'insertAnbieter' in Klasse
	// EventSQLHandler.
	// Uebergabe von anbieter
	public synchronized void insert(Anbieter anbieter) throws EventException {

		// System.out.println(ins);
		sqlHandler.insertAnbieter(anbieter);

	}

	public String getInsert() {
		return ins;
	}

}
