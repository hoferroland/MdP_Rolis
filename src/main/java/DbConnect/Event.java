package DbConnect;

/*
 * Klasse um Events entgegen zu nehmen um anschliessend die einzelnen Attributte
 * anschliessend an EventBroker weiter zu geben für die Bildung des SQL für die
 * Generierung des DB-Eintrages
 */

public class Event {
	
	// Variablen
	private int id_event;
	private String EventName;

	// Set und GetMethode für Id_event
	public void setId(int id) {
		this.id_event = id;
	}
		public int getId() {
		return id_event;
	}
	
	// Set und GetMethode für EventName
	public void setName(String name) {
		this.EventName = name;
	}
	public String getName() {
		return EventName;
	}
	
}
