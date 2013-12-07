package DbConnect;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

/* 
 * Singleton Pattern implementiert
 */

public class EventBroker extends Broker<Event> {
	private static EventBroker instance; // Felder in Klasse nicht immer atomar

	private EventBroker() {
	}

	// Singleton Pattern
	public synchronized static EventBroker getInstance() {
		if (instance == null)
			instance = new EventBroker();
		return instance;
	}

	// Einschub-Methode für Broker
	protected Event makeObject(ResultSet rs) throws SQLException {

		Event e = new Event();
		e.setId(rs.getInt(1));
		e.setName(rs.getString(2));

		return e;
	}

	// Alle Events holen (ToDo: Aktuell noch nicht fertig implementiert)
	public Vector<Event> getList() throws EventException {
		try {
			String sql = "SELECT * FROM TBL_EVENT";
			// ToDo - Syntax-Problem HSQL mit BY
			// String sql = "select ID_Event, txt_EventName " +
			// "from tbl_event order by txt_EventName";
			Vector<Event> result = query(sql);
			return result;
		} catch (Exception ex) {
			throw new EventException(ex.getMessage());
		}
	}

	// Ein neues Event hinzufügen
	// public int insertEvent(Event e)
	public int insertEvent(String sql) throws EventException {

		try {

			System.out.println(sql);
			int count = update(sql);
			return count;
		} catch (Exception ex) {
			throw new EventException(ex.getMessage());
		}
	}

	// Ein Event ändern ToDo (Aktuell noch nicht fertig implementiert)
	public int updateEvent(Event e) throws EventException {

		try {
			String sql = "update tbl_event set " + "txt_EventName = '"
					+ e.getName();
			int count = update(sql);
			return count;
		} catch (Exception ex) {
			throw new EventException(ex.getMessage());
		}
	}

	// Ein Event löschen ToDo (Aktuell noch nicht fertig implementiert)
	public int deleteEvent(int id) throws EventException {
		try {
			String sql = "delete from tbl_event where id_Event = " + id;
			int count = update(sql);
			return count;
		} catch (Exception ex) {
			throw new EventException(ex.getMessage());
		}
	}
}
