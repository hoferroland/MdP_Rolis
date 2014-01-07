package DbConnect;

import DienstleisterDecoratePattern.Anbieter;
import DienstleisterDecoratePattern.Dekoration;
import DienstleisterDecoratePattern.Unterhaltung;
import DienstleisterDecoratePattern.Unterkunft;
import DienstleisterDecoratePattern.Verpflegung;

public interface IEventSQLHandler {

	public String getInsert();

	public void insertAnbieter(Anbieter anbieter) throws EventException;

	public void insertUnterkunft(Unterkunft unterkunft, String anbieter)
			throws EventException;

	public void insertDekoration(Dekoration dekoration, String anbieter)
			throws EventException;

	public void insertUnterhaltung(Unterhaltung unterhaltung, String anbieter)
			throws EventException;

	public void insertVerpflegung(Verpflegung verpflegung, String anbieter)
			throws EventException;

	public String[] getAnbieter();

	public String[] getUnterkunft(String anbieter);

}
