package DienstleistungVerw;

public class Entertainment extends DienstleistungDescriptionDekorierer {

	// Pflichtangaben
	private String[] asUnterhaltungsart;
	private int iAnzahlUnterhalter;
	private String sDatum;
	private double dKosten;
	private double dDauer;
	// Zusätzliche Angaben
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

	public Entertainment(String sBezeichnung, String sAnbieter, String sDatum,
			double dKosten, double dDauer, String[] asUnterhaltungsart,
			int iAnzahlUnterhalter) {
		super(sBezeichnung, sAnbieter);

		this.setDatum(sDatum);
		this.setKosten(dKosten);
		this.setDauer(dDauer);
		this.setUnterhaltungsart(asUnterhaltungsart);
		this.setAnzahlUnterhalter(iAnzahlUnterhalter);
	}

	public String[] getUnterhaltungsart() {
		return this.asUnterhaltungsart;
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

	public String getDatum() {
		return this.sDatum;
	}

	public double getKosten() {
		return this.dKosten;
	}

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

	public void setUnterhaltungsart(String[] asUnterhaltungsart) {
		// to do: Überprüfung der Eingabe
		// ...
		this.asUnterhaltungsart = asUnterhaltungsart;
	}

	public void setAnzahlUnterhalter(int iAnzahlUnterhalter) {
		// to do: Überprüfung der Eingabe
		// ...
		this.iAnzahlUnterhalter = iAnzahlUnterhalter;
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

	public void setDatum(String sDatum) {
		// to do: Überprüfung der Eingabe
		// ...
		this.sDatum = sDatum;
	}

	public void setKosten(double dKosten) {
		// to do: Überprüfung der Eingabe
		// ...
		this.dKosten = dKosten;
	}

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
