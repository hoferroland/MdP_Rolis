package DienstleistungController;

import DbConnect.EventException;
import DienstleisterDecoratePattern.Dekoration;

public interface IDekorationHandler {

	void insert(Dekoration dekoration, String anbieter) throws EventException;

}
