package DienstleistungVerw;

public class Location  extends DienstleistungDescriptionDekorierer {
	
	
	private int iPLZ;
	private String sOrt;
	private String sStrasse;
	private int iHausnummer;
	private String sWebseite;
	private String sBuchungsfrist;
	private String sAbsagebedingungen;
	private String sTelefon;
	private String sEmail;
	private String sZusatz;
	
	//DienstleistungDescriptionDekorierer location
	public Location(String sBezeichnung, String sAnbieter, int iPLZ, String sOrt, String sStrasse, int iHausnummer) {
		super(sBezeichnung, sAnbieter);
	
		this.iPLZ = iPLZ;
		this.sOrt = sOrt;
		this.sStrasse = sStrasse;
		this.iHausnummer = iHausnummer;
	}
	
	
	public int getPLZ() {
		return iPLZ;
	}
	
	public String getOrt() {
		return sOrt;
	}
	
	public String getStrasse() {
		return sStrasse;
	}
	
	public int getHausnummer() {
		return iHausnummer;
	}

}
