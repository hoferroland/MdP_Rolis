package DbConnect;

import java.util.Vector;

import DienstleisterDecoratePattern.Anbieter;
import DienstleisterDecoratePattern.Dekoration;
import DienstleisterDecoratePattern.Unterhaltung;
import DienstleisterDecoratePattern.Unterkunft;
import DienstleisterDecoratePattern.Verpflegung;

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

	public String[] getUnterkunft(String anbieter) {
		try {
			Vector<Event> vector;

			String query = "select txt_UkunftName from tbl_Unterkunft where txt_UkunftAnbieter = (txt_UkunftAnbieter)"
					+ "values (" + "'" + anbieter + "')";

			EventBroker eventBroker = EventBroker.getInstance();

			vector = eventBroker.getList(query);
			String[] stringArrayUkunft = new String[vector.size()];
			for (int i = 0; i < vector.size(); i++) {
				Event e = vector.get(i);
				stringArrayUkunft[i] = e.getName();
			}

			return stringArrayUkunft;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

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

	@Override
	public void insertVerpflegung(Verpflegung verpflegung, String anbieter)
			throws EventException {
		try {
			String query = "insert into tbl_verpflegung (txt_VerpfBeschreibung, txt_VerpfName, txt_VerpfRegion, "
					+ "txt_VerpfVegi, txt_VerpfAllergie, txt_VerpfPreis, txt_VerpfAnbieter)"
					+ "values ("
					+ "'"
					+ verpflegung.getBeschr()
					+ "',"
					+ "'"
					+ verpflegung.getName()
					+ "',"
					+ "'"
					+ verpflegung.getRegion()
					+ "',"
					+ "'"
					+ verpflegung.getVegi()
					+ "',"
					+ "'"
					+ verpflegung.getAllergie()
					+ "',"
					+ "'"
					+ verpflegung.preis() + "'," + "'" + anbieter + "')";
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
		return null;
	}

}
