package Main;

import DbConnect.EventSQLHandler;
import DbConnect.IEventSQLHandler;
import DienstleistungController.ILocationHandler;
import DienstleistungController.LocationHandler;
import GUI.LocationErfassen;

public class Main {

	public static void main(String[] args) {

		IEventSQLHandler sqlHandler = new EventSQLHandler();
		ILocationHandler handler = new LocationHandler(sqlHandler);
		LocationErfassen locInsert = new LocationErfassen(handler);
		locInsert.setVisible(true);
		// final EventManager manager = new EventManager();

	}
}
