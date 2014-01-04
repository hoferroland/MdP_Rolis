package Main;

import DbConnect.EventSQLHandler;
import DbConnect.IEventSQLHandler;
import DienstleistungController.AnbieterHandler;
import DienstleistungController.DekorationHandler;
import DienstleistungController.IAnbieterHandler;
import DienstleistungController.IDekorationHandler;
import DienstleistungController.IUnterhaltungHandler;
import DienstleistungController.IUnterkunftHandler;
import DienstleistungController.UnterhaltungHandler;
import DienstleistungController.UnterkunftHandler;
import GUI.Startmaske;

public class Main {

	public static void main(String[] args) {

		IEventSQLHandler sqlHandler = new EventSQLHandler();
		// ILocationHandler handler = new LocationHandler(sqlHandler);
		IAnbieterHandler anbHandler = new AnbieterHandler(sqlHandler);
		IUnterkunftHandler ukunftHandler = new UnterkunftHandler(sqlHandler);
		IDekorationHandler dekorationHandler = new DekorationHandler(sqlHandler);
		IUnterhaltungHandler unterhaltungHandler = new UnterhaltungHandler(
				sqlHandler);

		Startmaske start = new Startmaske(anbHandler, ukunftHandler,
				dekorationHandler, unterhaltungHandler, sqlHandler);

		// AnbieterErfassen anberfa = new AnbieterErfassen(anbhandler);

		// LocationErfassen locInsert = new LocationErfassen(handler);
		start.setVisible(true);
		// final EventManager manager = new EventManager();

	}
}
