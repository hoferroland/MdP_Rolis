package DienstleistungController;

import DbConnect.EventException;
import DienstleisterDecoratePattern.Anbieter;

public interface IAnbieterHandler {

	public void insert(Anbieter anbieter) throws EventException;

}
