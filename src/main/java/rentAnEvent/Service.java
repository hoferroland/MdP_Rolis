package rentAnEvent;

public interface Service {
	
	public String getBezeichnung();
	public String getAnbieter();
	public String getDatum();
	public double getKosten();
	public double getDauer();
	
	public void setBezeichnung(String sBezeichnung);
	public void setAnbieter(String sAnbieter);
	public void setDatum(String sDatum);
	public void setKosten(double dKosten);
	public void setDauer(double dDauer);
	
}
