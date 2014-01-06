package DbConnect;

import DienstleisterDecoratePattern.Anbieter;
import DienstleisterDecoratePattern.Dekoration;
import DienstleisterDecoratePattern.Unterhaltung;
import DienstleisterDecoratePattern.Unterkunft;

public interface IEventSQLHandler {

	// public String getLocationInsert(Location location);

	// public String getCateringInsert(CateringHandler cateringHandler);
	// public String getEntertainmentInsert(EntertainmentHandler
	// entertainmentHandler);

	public String getInsert();

	public void insertAnbieter(Anbieter anbieter) throws EventException;

	public void insertUnterkunft(Unterkunft unterkunft, String anbieter)
			throws EventException;

	public void insertDekoration(Dekoration dekoration, String anbieter)
			throws EventException;

	public void insertUnterhaltung(Unterhaltung unterhaltung, String anbieter)
			throws EventException;

	public String[] getAnbieter();

	// public void insertLocation(Location location) throws EventException;

	// public void insertCatering(Catering catering) throws EventException;

	// public void insertEntertainment(Entertainment entertainment)
	// throws EventException;
}
