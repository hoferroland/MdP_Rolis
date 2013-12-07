package rentAnEvent;

public class Location implements Service {
	
	// Pflichtangaben
	private int iPLZ;
	private String sOrt;
	private String sStrasse;
	private int iHausnummer;
	private String sBezeichnung;
	private String sAnbieter;
	private String sDatum;
	private double dKosten;
	private double dDauer;
	// Zusätzliche Angaben
	private String sWebseite;
	private String sBuchungsfrist;
	private String sAbsagebedingungen;
	private String sTelefon;
	private String sEmail;
	private String sZusatz;
	
	public Location(String sBezeichnung, int iPLZ, String sOrt, String sStrasse, int iHausnummer, String sAnbieter, String sDatum, double dKosten, double dDauer) {
		this.setBezeichnung(sBezeichnung);
		this.setPLZ(iPLZ);
		this.setOrt(sOrt);
		this.setStrasse(sStrasse);
		this.setHausnummer(iHausnummer);
		this.setAnbieter(sAnbieter);
		this.setDatum(sDatum);
		this.setKosten(dKosten);
		this.setDauer(dDauer);
	}
	public Location() {
		
	}
	
	
	public int getPLZ() {
		return this.iPLZ;
	}
	
	public String getOrt() {
		return this.sOrt;
	}
	
	public String getStrasse() {
		return this.sStrasse;
	}
	
	public int getHausnummer() {
		return this.iHausnummer;
	}
	
	@Override
	public String getBezeichnung() {
		return this.sBezeichnung;
	} 
	
	@Override
	public String getAnbieter() {
		return this.sAnbieter;
	}

	@Override
	public String getDatum() {
		return this.sDatum;
	}

	@Override
	public double getKosten() {
		return this.dKosten;
	}

	@Override
	public double getDauer() {
		return this.dDauer;
	}
	
	public String getWebseite() {
		return this.sWebseite;
	}
	
	public String getBuchungsfrist() {
		return this.sBuchungsfrist;
	}
	
	public String getAbsagebedingungen() {
		return this.sAbsagebedingungen;
	}
	
	public String getTelefon() {
		return this.sTelefon;
	}
	
	public String getEmail() {
		return this.sEmail;
	}
	
	public String getZusatz() {
		return this.sZusatz;
	}
	
	public void setPLZ(int iPLZ) {
		// to do: Überprüfung der Eingabe
				// ...
				this.iPLZ = iPLZ;
	}
	
	public void setOrt(String sOrt) {
		// to do: Überprüfung der Eingabe
		// ...
		this.sOrt = sOrt;
	}
	
	public void setStrasse(String sStrasse) {
		// to do: Überprüfung der Eingabe
		// ...
		this.sStrasse = sStrasse;
	}
	
	public void setHausnummer(int iHausnummer) {
		// to do: Überprüfung der Eingabe
		// ...
		this.iHausnummer = iHausnummer;
	}
	
	@Override
	public void setBezeichnung(String sBezeichnung) {
		// to do: Überprüfung der Eingabe
		// ...
		this.sBezeichnung = sBezeichnung;
	}
	
	@Override
	public void setAnbieter(String sAnbieter) {
		// to do: Überprüfung der Eingabe
		// ...
		this.sAnbieter = sAnbieter;		
	}
	
	@Override
	public void setDatum(String sDatum) {
		// to do: Überprüfung der Eingabe
		// ...
		this.sDatum = sDatum;
	}
	
	@Override
	public void setKosten(double dKosten) {
		// to do: Überprüfung der Eingabe
		// ...
		this.dKosten = dKosten;
	}
	
	@Override
	public void setDauer(double dDauer) {
		// to do: Überprüfung der Eingabe
		// ...		
		this.dDauer = dDauer;
	}

	public void setWebseite(String sWebseite) {
		this.sWebseite = sWebseite;
	}
	
	public void setBuchungsfrist(String sBuchungsfrist) {
		this.sBuchungsfrist = sBuchungsfrist;
	}
	
	public void setAbsagebedingungen(String sAbsagebedingungen) {
		this.sAbsagebedingungen = sAbsagebedingungen;
	}
	
	public void setTelefon(String sTelefon) {
		// to do: Überprüfung der Eingabe
		// ...
		this.sTelefon = sTelefon;
	}
	
	public void setEmail(String sEmail) {
		// to do: Überprüfung der Eingabe
		// ...
		this.sEmail = sEmail;
	}
	
	public void setZusatz(String sZusatz) {
		this.sZusatz = sZusatz;
	}
	
}