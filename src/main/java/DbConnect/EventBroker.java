package DbConnect;

import java.sql.*;
import java.util.*;

public class EventBroker extends Broker<Event> {
	private static EventBroker instance;
	
	private EventBroker() {
	}
	
	
	public static EventBroker getInstance() {
		if (instance == null)
			instance = new EventBroker();
		return instance;
	}
	// Einschub-Methode für Broker
	protected Event makeObject(ResultSet rs)
		throws SQLException {
		
		Event e = new Event();
		e.setId(rs.getInt(1));
		e.setName(rs.getString(2));
		
		return e;
	}
	// Alle Events holen
	public Vector<Event> getList() throws EventException {
		try {
			String sql = "SELECT * FROM TBL_EVENT";
			// ToDo - Syntax-Problem HSQL mit BY
//			String sql = "select ID_Event, txt_EventName " + 
//					"from tbl_event order by txt_EventName";
			Vector<Event> result = query(sql);
			return result;
		} catch (Exception ex) {
			throw new EventException(ex.getMessage());
		}
	}
	// Ein neues Event hinzufügen
	public int insertEvent(Event e) 
		throws EventException {
		
		try {
			String sql =
					"insert into tbl_event (txt_EventName)" +
					"values (" +
					"'" + e.getName() + "')";
			
			int count = update(sql);
			return count;
		} catch (Exception ex) {
			throw new EventException(ex.getMessage());
		}
	}
	
	// Ein Event ändern
	public int updateEvent(Event e)
		throws EventException {
		
		try {
			String sql = "update tbl_event set " +
			"txt_EventName = '" + e.getName();
			int count = update(sql);
			return count;
		} catch (Exception ex) {
			throw new EventException(ex.getMessage());
		}
	}
	// Ein Event löschen
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
