package DienstleistungVerw;

public class Entertainment extends DienstleistungDescriptionDekorierer {

	// Pflichtangaben
	private String sUnterhaltungsart;
	private int iAnzahlUnterhalter;
	// private String sDatum;
	private double dKosten;
	// private double dDauer;
	// Zus�tzliche Angaben
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

	public Entertainment(String sBezeichnung, String sAnbieter, double dKosten,
			String sUnterhaltungsart, int iAnzahlUnterhalter, int iPLZ,
			String sOrt, String sStrasse, int iHausnummer, String sWebseite,
			String sBuchungsfrist, String sAbsagebedingungen, String sTelefon,
			String sEmail, String sZusatz) {
		super(sBezeichnung, sAnbieter);

		this.setKosten(dKosten);
		this.setUnterhaltungsart(sUnterhaltungsart);
		this.setAnzahlUnterhalter(iAnzahlUnterhalter);
	}

	public String getUnterhaltungsart() {
		return this.sUnterhaltungsart;
	}

	public int getAnzahlUnterhalter() {
		return this.iAnzahlUnterhalter;
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

	public double getKosten() {
		return this.dKosten;
	}

	public String getBuchungsfrist() {
		return this.sBuchungsfrist;
	}

	public String getAbsagebedingungen() {
		return this.sAbsagebedingungen;
	}

	public void setUnterhaltungsart(String sUnterhaltungsart) {
		// to do: �berpr�fung der Eingabe
		// ...
		this.sUnterhaltungsart = sUnterhaltungsart;
	}

	public void setAnzahlUnterhalter(int iAnzahlUnterhalter) {
		// to do: �berpr�fung der Eingabe
		// ...
		this.iAnzahlUnterhalter = iAnzahlUnterhalter;
	}

	public void setPLZ(int iPLZ) {
		// to do: �berpr�fung der Eingabe
		// ...
		this.iPLZ = iPLZ;
	}

	public void setOrt(String sOrt) {
		// to do: �berpr�fung der Eingabe
		// ...
		this.sOrt = sOrt;
	}

	public void setStrasse(String sStrasse) {
		// to do: �berpr�fung der Eingabe
		// ...
		this.sStrasse = sStrasse;
	}

	public void setHausnummer(int iHausnummer) {
		// to do: �berpr�fung der Eingabe
		// ...
		this.iHausnummer = iHausnummer;
	}

	public void setKosten(double dKosten) {
		// to do: �berpr�fung der Eingabe
		// ...
		this.dKosten = dKosten;
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
		// to do: �berpr�fung der Eingabe
		// ...
		this.sTelefon = sTelefon;
	}

	public void setEmail(String sEmail) {
		// to do: �berpr�fung der Eingabe
		// ...
		this.sEmail = sEmail;
	}

	public void setZusatz(String sZusatz) {
		this.sZusatz = sZusatz;
	}

}
