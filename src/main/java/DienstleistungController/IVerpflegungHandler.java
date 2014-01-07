package DienstleistungController;

import DbConnect.EventException;
import DienstleisterDecoratePattern.Verpflegung;

public interface IVerpflegungHandler {

	void insert(Verpflegung verpflegung, String anbieter) throws EventException;

}
