package DienstleisterDecoratePattern;

// Konkrete Implementierung von Dienstleister
public class Anbieter extends Dienstleister {

	// Definition der Variablen
	String sName = "";
	String sStrasse = "";
	String sNr;
	String sPLZ;
	String sOrt = "";
	String sEmail = "";

	// Konstruktoren
	public Anbieter(String sAnbieter, String sName, String sStrasse,
			String sNr, String sPLZ, String sOrt, String sEmail) {
		beschreibung = sAnbieter;
		this.sName = sName;
		this.sStrasse = sStrasse;
		this.sNr = sNr;
		this.sPLZ = sPLZ;
		this.sOrt = sOrt;
		this.sEmail = sEmail;
	}

	public Anbieter() {
	}

	public Anbieter(String sAnbieter) {
		beschreibung = sAnbieter;
	}

	// Setter und Getter-Methoden
	public void setPreis(Double dPreis) {
		preis = dPreis;
	}

	public double preis() {
		return preis;
	}

	public void setName(String sName) {
		this.sName = sName;
	}

	public String getName() {
		return sName;
	}

	public void setStrasse(String sStrasse) {
		this.sStrasse = sStrasse;
	}

	public String getStrasse() {
		return sStrasse;
	}

	public void setNr(String sNr) {
		this.sNr = sNr;
	}

	public String getNr() {
		return sNr;
	}

	public void setPLZ(String sPLZ) {
		this.sPLZ = sPLZ;
	}

	public String getPLZ() {
		return sPLZ;
	}

	public void setOrt(String sOrt) {
		this.sOrt = sOrt;
	}

	public String getOrt() {
		return sOrt;
	}

	public void setEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	public String getEmail() {
		return sEmail;
	}
}
