package DbConnect;

import java.util.Vector;

import DienstleisterDecoratePattern.Anbieter;
import DienstleisterDecoratePattern.Dekoration;
import DienstleisterDecoratePattern.Unterhaltung;
import DienstleisterDecoratePattern.Unterkunft;

public class EventSQLHandler implements IEventSQLHandler {

	public EventSQLHandler() {

	}

	String sqlInsert = "";

	@Override
	public void insertAnbieter(Anbieter anbieter) throws EventException {
		try {
			String query = "insert into tbl_anbieter (txt_AnbBeschreibung, txt_AnbName, txt_AnbStrasse, txt_AnbHausNr, txt_AnbPLZ, txt_AnbOrt, txt_AnbEmail, txt_AnbPreis)"
					+ "values (" + "'"
					+ anbieter.getBeschreibung()
					+ "',"
					+ "'"
					+ anbieter.getName()
					+ "',"
					+ "'"
					+ anbieter.getStrasse()
					+ "',"
					+ "'"
					+ anbieter.getNr()
					+ "',"
					+ "'"
					+ anbieter.getPLZ()
					+ "',"
					+ "'"
					+ anbieter.getOrt()
					+ "',"
					+ "'"
					+ anbieter.getEmail()
					+ "',"
					+ "'"
					+ anbieter.preis()
					+ "')";

			EventBroker eventBroker = EventBroker.getInstance();
			eventBroker.insertEvent(query);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public String[] getAnbieter() {
		try {
			Vector<Event> vector;

			String query = "select id_Anbieter, txt_AnbBeschreibung from tbl_Anbieter";
			EventBroker eventBroker = EventBroker.getInstance();

			vector = eventBroker.getList(query);
			String[] stringArray = new String[vector.size()];
			for (int i = 0; i < vector.size(); i++) {
				Event e = vector.get(i);
				stringArray[i] = e.getName();

			}

			return stringArray;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void insertUnterkunft(Unterkunft unterkunft, String anbieter)
			throws EventException {
		try {
			String query = "insert into tbl_unterkunft (txt_UkunftBeschreibung, txt_UkunftName, txt_UkunftAnbieter, txt_UkunftPreis, txt_UkunftKlasse, txt_UkunftAnzPlaetze, "
					+ "txt_UkunftBeamer, txt_UkunftAnzahlParkplaetze, txt_UkunftStrasse, txt_UkunftHausNr, txt_UkunftPLZ, txt_UkunftOrt)"
					+ "values (" + "'"
					+ unterkunft.getBeschr()
					+ "',"
					+ "'"
					+ unterkunft.getName()
					+ "',"
					+ "'"
					+ anbieter
					+ "',"
					+ "'"
					+ unterkunft.preis()
					+ "',"
					+ "'"
					+ unterkunft.getKomfortklasse()
					+ "',"
					+ "'"
					+ unterkunft.getAnzPlaetze()
					+ "',"
					+ "'"
					+ unterkunft.getBeamer()
					+ "',"
					+ "'"
					+ unterkunft.getAnzParkplaetze()
					+ "',"
					+ "'"
					+ unterkunft.getStrasse()
					+ "',"
					+ "'"
					+ unterkunft.getHausNr()
					+ "',"
					+ "'"
					+ unterkunft.getPLZ()
					+ "'," + "'" + unterkunft.getOrt() + "')";

			EventBroker eventBroker = EventBroker.getInstance();
			eventBroker.insertEvent(query);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void insertDekoration(Dekoration dekoration, String anbieter)
			throws EventException {
		try {
			String query = "insert into tbl_dekoration (txt_DekoBeschreibung, txt_DekoName, txt_DekoPreis, txt_Blumen, txt_DekoAnbieter)"
					+ "values ("
					+ "'"
					+ dekoration.getBeschr()
					+ "',"
					+ "'"
					+ dekoration.getName()
					+ "',"
					+ "'"
					+ dekoration.preis()
					+ "',"
					+ "'"
					+ dekoration.getBlumen()
					+ "',"
					+ "'"
					+ anbieter + "')";

			EventBroker eventBroker = EventBroker.getInstance();
			eventBroker.insertEvent(query);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void insertUnterhaltung(Unterhaltung unterhaltung, String anbieter)
			throws EventException {
		try {
			String query = "insert into tbl_unterhaltung (txt_UhaltBeschreibung, txt_UhaltName, txt_UhaltAnzahl, "
					+ "txt_UhaltStil, txt_UhaltPreis, txt_UhaltAnbieter)"
					+ "values ("
					+ "'"
					+ unterhaltung.getBeschr()
					+ "',"
					+ "'"
					+ unterhaltung.getName()
					+ "',"
					+ "'"
					+ unterhaltung.getAnzahlUnterhalter()
					+ "',"
					+ "'"
					+ unterhaltung.getStil()
					+ "',"
					+ "'"
					+ unterhaltung.preis() + "'," + "'" + anbieter + "')";
			EventBroker eventBroker = EventBroker.getInstance();
			eventBroker.insertEvent(query);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * @Override public void insertLocation(Location location) throws
	 * EventException { try { String query =
	 * "insert into tbl_location (txt_LocName, txt_LocAnbieter, txt_LocPLZ, txt_LocOrt, txt_LocStrasse, txt_LocHausnummer, txt_LocWebseite, txt_LocBuchungsfrist, txt_LocAbsagebed, txt_LocTelefon, txt_LocEmail, txt_LocZusatz)"
	 * + "values (" + "'" + location.getBezeichnung() + "'," + "'" +
	 * location.getAnbieter() + "'," + "'" + location.getPLZ() + "'," + "'" +
	 * location.getOrt() + "'," + "'" + location.getStrasse() + "'," + "'" +
	 * location.getHausnummer() + "'," + "'" + location.getWebseite() + "'," +
	 * "'" + location.getBuchungsfrist() + "'," + "'" +
	 * location.getAbsagebedingungen() + "'," + "'" + location.getTelefon() +
	 * "'," + "'" + location.getEmail() + "'," + "'" + location.getZusatz() +
	 * "')";
	 * 
	 * EventBroker eventBroker = EventBroker.getInstance();
	 * eventBroker.insertEvent(query);
	 * 
	 * } catch (Exception e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } }
	 * 
	 * @Override public void insertCatering(Catering catering) throws
	 * EventException { try { String query =
	 * "insert into tbl_catering (txt_CatName, int_CatServicepersonal, txt_CatPLZ, txt_CatOrt, txt_CatStrasse, txt_CatHausnummer, txt_CatWebseite, txt_CatBuchungsfrist, txt_CatAbsagebed, txt_CatTelefon, txt_CatEmail, txt_CatZusatz, txt_CatKueche)"
	 * + "values (" + "'" + catering.getBezeichnung() + "'," + "'" +
	 * catering.getServicepersonal() + "'," + "'" + catering.getPLZ() + "'," +
	 * "'" + catering.getOrt() + "'," + "'" + catering.getStrasse() + "'," + "'"
	 * + catering.getHausnummer() + "'," + "'" + catering.getWebseite() + "'," +
	 * "'" + catering.getBuchungsfrist() + "'," + "'" +
	 * catering.getAbsagebedingungen() + "'," + "'" + catering.getTelefon() +
	 * "'," + "'" + catering.getEmail() + "'," + "'" + catering.getZusatz() +
	 * "'," + "'" + catering.getKueche() + "')";
	 * 
	 * EventBroker eventBroker = EventBroker.getInstance();
	 * eventBroker.insertEvent(query);
	 * 
	 * } catch (Exception e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } }
	 * 
	 * @Override public void insertEntertainment(Entertainment entertainment)
	 * throws EventException { try { String query =
	 * "insert into tbl_entertainment (txt_EntertainName, txt_EntertainUnterhaltungsart, int_EntertainAnzahlUnterhalter, txt_EntertainPLZ, txt_EntertainOrt, txt_EntertainStrasse, txt_EntertainHausnummer, txt_EntertainWebseite, txt_EntertainBuchungsfrist, txt_EntertainAbsagebed, txt_EntertainTelefon, txt_EntertainEmail, txt_EntertainZusatz)"
	 * + "values (" + "'" + entertainment.getBezeichnung() + "'," + "'" +
	 * entertainment.getUnterhaltungsart() + "'," + "'" +
	 * entertainment.getAnzahlUnterhalter() + "'," + "'" +
	 * entertainment.getPLZ() + "'," + "'" + entertainment.getOrt() + "'," + "'"
	 * + entertainment.getStrasse() + "'," + "'" + entertainment.getHausnummer()
	 * + "'," + "'" + entertainment.getWebseite() + "'," + "'" +
	 * entertainment.getBuchungsfrist() + "'," + "'" +
	 * entertainment.getAbsagebedingungen() + "'," + "'" +
	 * entertainment.getTelefon() + "'," + "'" + entertainment.getEmail() + "',"
	 * + "'" + entertainment.getZusatz() + "')";
	 * 
	 * EventBroker eventBroker = EventBroker.getInstance();
	 * eventBroker.insertEvent(query);
	 * 
	 * } catch (Exception e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } }
	 */
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
