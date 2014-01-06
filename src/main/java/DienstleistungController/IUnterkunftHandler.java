package DienstleistungController;

import DbConnect.EventException;
import DienstleisterDecoratePattern.Unterkunft;

public interface IUnterkunftHandler {

	void insert(Unterkunft unterkunft, String anbieter) throws EventException;

}
