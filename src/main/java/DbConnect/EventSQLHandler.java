package DbConnect;

import DienstleistungVerw.Catering;
import DienstleistungVerw.Entertainment;
import DienstleistungVerw.Location;

public class EventSQLHandler implements IEventSQLHandler {

	public EventSQLHandler() {

	}

	String sqlInsert = "";

	@Override
	public void insertLocation(Location location) throws EventException {
		try {
			String query = "insert into tbl_location (txt_LocName, txt_LocAnbieter, txt_LocPLZ, txt_LocOrt, txt_LocStrasse, txt_LocHausnummer, txt_LocWebseite, txt_LocBuchungsfrist, txt_LocAbsagebed, txt_LocTelefon, txt_LocEmail, txt_LocZusatz)"
					+ "values (" + "'"
					+ location.getBezeichnung()
					+ "',"
					+ "'"
					+ location.getAnbieter()
					+ "',"
					+ "'"
					+ location.getPLZ()
					+ "',"
					+ "'"
					+ location.getOrt()
					+ "',"
					+ "'"
					+ location.getStrasse()
					+ "',"
					+ "'"
					+ location.getHausnummer()
					+ "',"
					+ "'"
					+ location.getWebseite()
					+ "',"
					+ "'"
					+ location.getBuchungsfrist()
					+ "',"
					+ "'"
					+ location.getAbsagebedingungen()
					+ "',"
					+ "'"
					+ location.getTelefon()
					+ "',"
					+ "'"
					+ location.getEmail()
					+ "'," + "'" + location.getZusatz() + "')";

			EventBroker eventBroker = EventBroker.getInstance();
			eventBroker.insertEvent(query);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void insertCatering(Catering catering) throws EventException {
		try {
			String query = "insert into tbl_catering (txt_CatName, int_CatServicepersonal, txt_CatPLZ, txt_CatOrt, txt_CatStrasse, txt_CatHausnummer, txt_CatWebseite, txt_CatBuchungsfrist, txt_CatAbsagebed, txt_CatTelefon, txt_CatEmail, txt_CatZusatz, txt_CatKueche)"
					+ "values (" + "'"
					+ catering.getBezeichnung()
					+ "',"
					+ "'"
					+ catering.getServicepersonal()
					+ "',"
					+ "'"
					+ catering.getPLZ()
					+ "',"
					+ "'"
					+ catering.getOrt()
					+ "',"
					+ "'"
					+ catering.getStrasse()
					+ "',"
					+ "'"
					+ catering.getHausnummer()
					+ "',"
					+ "'"
					+ catering.getWebseite()
					+ "',"
					+ "'"
					+ catering.getBuchungsfrist()
					+ "',"
					+ "'"
					+ catering.getAbsagebedingungen()
					+ "',"
					+ "'"
					+ catering.getTelefon()
					+ "',"
					+ "'"
					+ catering.getEmail()
					+ "',"
					+ "'"
					+ catering.getZusatz()
					+ "',"
					+ "'"
					+ catering.getKueche() + "')";

			EventBroker eventBroker = EventBroker.getInstance();
			eventBroker.insertEvent(query);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void insertEntertainment(Entertainment entertainment)
			throws EventException {
		try {
			String query = "insert into tbl_entertainment (txt_EntertainName, txt_EntertainUnterhaltungsart, int_EntertainAnzahlUnterhalter, txt_EntertainPLZ, txt_EntertainOrt, txt_EntertainStrasse, txt_EntertainHausnummer, txt_EntertainWebseite, txt_EntertainBuchungsfrist, txt_EntertainAbsagebed, txt_EntertainTelefon, txt_EntertainEmail, txt_EntertainZusatz)"
					+ "values (" + "'"
					+ entertainment.getBezeichnung()
					+ "',"
					+ "'"
					+ entertainment.getUnterhaltungsart()
					+ "',"
					+ "'"
					+ entertainment.getAnzahlUnterhalter()
					+ "',"
					+ "'"
					+ entertainment.getPLZ()
					+ "',"
					+ "'"
					+ entertainment.getOrt()
					+ "',"
					+ "'"
					+ entertainment.getStrasse()
					+ "',"
					+ "'"
					+ entertainment.getHausnummer()
					+ "',"
					+ "'"
					+ entertainment.getWebseite()
					+ "',"
					+ "'"
					+ entertainment.getBuchungsfrist()
					+ "',"
					+ "'"
					+ entertainment.getAbsagebedingungen()
					+ "',"
					+ "'"
					+ entertainment.getTelefon()
					+ "',"
					+ "'"
					+ entertainment.getEmail()
					+ "',"
					+ "'"
					+ entertainment.getZusatz() + "')";

			EventBroker eventBroker = EventBroker.getInstance();
			eventBroker.insertEvent(query);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String getInsert() {
		// TODO Auto-generated method stub
		System.out.println(sqlInsert);
		return sqlInsert;

		// if (getLocationInsert(LocationHandler locationHandler) != null) {
		// sqlInsert = "";
		// if (getCateringInsert(null) ! = null ) {
		// sqlInsert = "";
		// if (getEntertainmentInsert(null) ! = null) {
		// sqlInsert = "";
		// } else {
		// sqlInsert = entertainmentHandler.getInsert();
		// } else {
		// sqlInsert = cateringHandler.getInsert();
		// } else {
		// sqlInsert = getLocationInsert(locationHandler);

		// }

	}
}
