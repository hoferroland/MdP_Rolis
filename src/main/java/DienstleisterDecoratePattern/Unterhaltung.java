package DienstleisterDecoratePattern;

public class Unterhaltung extends Dienstleister {

	Dienstleister dienstleister;
	String sName;
	String sBeschreibung;
	double dPreis;
	String sAnzahl;
	String sMusikstil;

	public Unterhaltung(Dienstleister dienstleister) {
		this.dienstleister = dienstleister;
	}

	public void setName(String sName) {
		this.sName = sName;
	}

	public String getName() {
		return sName;
	}

	public void setBeschreibung(String sBeschreibung) {
		this.sBeschreibung = sBeschreibung;
	}

	public String getBeschr() {
		return sBeschreibung;
	}

	public String getBeschreibung() {
		return dienstleister.getBeschreibung() + ", " + sBeschreibung;
	}

	public void setPreis(double dPreis) {
		this.dPreis = dPreis;
	}

	public double preis() {
		return dPreis + dienstleister.preis();
	}

	public void setAnzahlUnterhalter(String sAnzahl) {
		this.sAnzahl = sAnzahl;
	}

	public String getAnzahlUnterhalter() {
		return sAnzahl;
	}

	public void setMusikstil(String sMusikstil) {
		this.sMusikstil = sMusikstil;
	}

	public String getStil() {
		return sMusikstil;
	}

}
