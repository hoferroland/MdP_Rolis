package DienstleisterDecoratePattern;

// Dekoration von Dienstleister mit 'Unterhaltung'
public class Unterhaltung extends Dienstleister {

	// Definition der Variablen
	Dienstleister dienstleister;
	String sName;
	String sBeschreibung;
	double dPreis;
	String sAnzahl;
	String sMusikstil;

	// Konstruktor
	public Unterhaltung(Dienstleister dienstleister) {
		this.dienstleister = dienstleister;
	}

	// Setter und Getter-Methoden
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

	// Preis setzt sich aus Pauschalpreis Anbieter und Preis Dekoration zusammen
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
