package DienstleistungController;

import DbConnect.EventException;
import DbConnect.IEventSQLHandler;
import DienstleisterDecoratePattern.Dekoration;

public class DekorationHandler implements IDekorationHandler {

	public final IEventSQLHandler sqlHandler;

	public DekorationHandler(final IEventSQLHandler sqlHandler) {
		this.sqlHandler = sqlHandler;

	}

	String ins = "";

	@Override
	// Methode zum Aufruf der Methode 'insertDekoration' in Klasse
	// EventSQLHandler.
	// Uebergabe von dekoration sowie anbieter (um Referenz in DB herzustellen)
	public synchronized void insert(Dekoration dekoration, String anbieter)
			throws EventException {

		// System.out.println(ins);
		sqlHandler.insertDekoration(dekoration, anbieter);

	}

	public String getInsert() {
		return ins;
	}

}
