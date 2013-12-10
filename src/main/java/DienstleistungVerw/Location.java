package DienstleistungVerw;

public class Location extends DienstleistungDescriptionDekorierer {

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

	// DienstleistungDescriptionDekorierer location
	/*
	 * public Location(String sBezeichnung, String sAnbieter, int iPLZ, String
	 * sOrt, String sStrasse, int iHausnummer) { super(sBezeichnung, sAnbieter);
	 * 
	 * this.iPLZ = iPLZ; this.sOrt = sOrt; this.sStrasse = sStrasse;
	 * this.iHausnummer = iHausnummer; }
	 */
	public Location(String sBezeichnung, String sAnbieter, int iPLZ,
			String sOrt, String sStrasse, int iHausnummer, String sWebseite,
			String sBuchungsfrist, String sAbsagebedingungen, String sTelefon,
			String sEmail, String sZusatz) {

		super(sBezeichnung, sAnbieter);
		this.iPLZ = iPLZ;
		this.sOrt = sOrt;
		this.sStrasse = sStrasse;
		this.iHausnummer = iHausnummer;
		this.sWebseite = sWebseite;
		this.sBuchungsfrist = sBuchungsfrist;
		this.sAbsagebedingungen = sAbsagebedingungen;
		this.sTelefon = sTelefon;
		this.sEmail = sEmail;
		this.sZusatz = sZusatz;

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

	public String getBuchungsfrist() {
		return sBuchungsfrist;
	}

	public String getAbsagebedingungen() {
		return sAbsagebedingungen;
	}

}
