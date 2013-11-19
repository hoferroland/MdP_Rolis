package DbConnect;

/*
 * Klasse um Events entgegen zu nehmen um anschliessend die einzelnen Attributte
 * anschliessend an EventBroker weiter zu geben f�r die Bildung des SQL f�r die
 * Generierung des DB-Eintrages
 */

public class Event {
	
	// Variablen
	private int id_event;
	private String EventName;

	// Set und GetMethode f�r Id_event
	public void setId(int id) {
		this.id_event = id;
	}
		public int getId() {
		return id_event;
	}
	
	// Set und GetMethode f�r EventName
	public void setName(String name) {
		this.EventName = name;
	}
	public String getName() {
		return EventName;
	}
	
}
