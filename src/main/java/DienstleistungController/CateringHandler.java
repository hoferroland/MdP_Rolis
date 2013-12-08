package DienstleistungController;

import DbConnect.EventException;
import DbConnect.IEventSQLHandler;
import DienstleistungVerw.Catering;

public class CateringHandler implements ICateringHandler {

	public final IEventSQLHandler sqlHandler;

	// public LocationHandler() {
	public CateringHandler(final IEventSQLHandler sqlHandler) {
		this.sqlHandler = sqlHandler;
	}

	String ins = "";

	public void getCaterBezeichnung(Catering catering) {
		System.out.println(catering.getBezeichnung());
	}

	@Override
	public synchronized void insert(Catering catering) throws EventException {

		// System.out.println(ins);
		sqlHandler.insertCatering(catering);

	}

	public String getInsert() {
		return ins;
	}

}
