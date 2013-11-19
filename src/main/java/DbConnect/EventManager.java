package DbConnect;

import java.util.*;
import java.io.*;

public class EventManager {

	// Alle Events holen
	public Vector<Event> getList() throws EventException {
		return EventBroker.getInstance().getList();
	}
	
	// Ein neues Event hinzufügen
	public int insertEvent(Event e)
		throws EventException {
		return EventBroker.getInstance().insertEvent(e);
	}
	
	// Ein Event ändern
	public int updateEvent(Event e)
		throws EventException {
		return EventBroker.getInstance().updateEvent(e);
	}
	
	// Ein Event löschen
	public int deleteEvent(int id) throws EventException {
		return EventBroker.getInstance().deleteEvent(id);
	}
	
	// Daten im CSV-Format expoertieren
	public void export(File file) throws EventException {
		try {
			Vector<Event> list = getList();
			PrintWriter out = new PrintWriter(new FileWriter(file));
			Event e;
			String quote = "\"";
			String sep = ";";
			for (int i = 0; i < list.size(); i++) {
				e = list.get(i);
				StringBuilder sb = new StringBuilder();
				sb.append(quote + e.getName() + quote + sep);
				out.println(sb);
			}
			out.close();
		} catch (IOException ex) {
			throw new EventException(ex.getMessage());
		}
	}
	
	// Anwendung beenden
	public void exit() {
		ConnectionManager.closeConnection();
	}
}
