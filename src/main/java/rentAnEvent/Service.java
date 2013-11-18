package rentAnEvent;

public interface Service {
	
	public String getAnbieter();
	public String getDatum();
	public double getKosten();
	public double getDauer();
	
	public void setAnbieter(String sAnbieter);
	public void setDatum(String sDatum);
	public void setKosten(double dKosten);
	public void setDauer(double dDauer);
	
}
