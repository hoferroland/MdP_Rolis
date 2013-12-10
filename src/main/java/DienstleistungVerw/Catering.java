package DienstleistungVerw;

public class Catering extends DienstleistungDescriptionDekorierer {

	// Pflichtangaben
	private String sKueche;
	private int iServicepersonal;
	// private String sDatum;
	private double dKosten;
	// private double dDauer;
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

	public Catering(String sBezeichnung, String sAnbieter, double dKosten,
			String sKueche, int iServicepersonal, int iPLZ, String sStrasse,
			int iHausnummer, String sOrt, String sWebseite,
			String sBuchungsfrist, String sAbsagebedingungen, String sTelefon,
			String sEmail, String sZusatz) {
		super(sBezeichnung, sAnbieter);

		this.setKosten(dKosten);
		this.setKueche(sKueche);
		this.setServicepersonal(iServicepersonal);
		this.setPLZ(iPLZ);
		this.setStrasse(sStrasse);
		this.setHausnummer(iHausnummer);
		this.setOrt(sOrt);
		this.setWebseite(sWebseite);
		this.setBuchungsfrist(sBuchungsfrist);
		this.setAbsagebedingungen(sAbsagebedingungen);
		this.setTelefon(sTelefon);
		this.setEmail(sEmail);
		this.setZusatz(sZusatz);
	}

	public String getKueche() {
		return this.sKueche;
	}

	public int getServicepersonal() {
		return this.iServicepersonal;
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

	public void setKueche(String sKueche) {
		// to do: Überprüfung der Eingabe
		// ...
		this.sKueche = sKueche;
	}

	public void setServicepersonal(int iServicepersonal) {
		// to do: Überprüfung der Eingabe
		// ...
		this.iServicepersonal = iServicepersonal;
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

	public void setKosten(double dKosten) {
		// to do: Überprüfung der Eingabe
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
