package DbConnect;

public class EventApp {

	// Main Klasse - wird zu einem sp�teren Zeitpunkt GUI aufrufen
	
	public static void main(String[] args) throws EventException {
		// TODO Auto-generated method stub
		final old_EventManager manager = new old_EventManager();
		
		// Pr�fung ob Test-DB-Eintrag in Konsole angezeigt wird
		manager.getList();
		System.out.println(manager.getList());
		
	}

}
