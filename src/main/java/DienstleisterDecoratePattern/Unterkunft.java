package DienstleisterDecoratePattern;

//Dekoration von Dienstleister mit 'Unterkunft'
public class Unterkunft extends DienstleistungDekorierer {

	// Definition der Variablen
	Dienstleister dienstleister;
	String sBeschreibung;
	String sName;
	double dPreis;
	String sKlasse;
	String sPlaetze;
	boolean bBeamer = false;
	String sParkplaetze;
	String sStrasse;
	String sHausNr;
	String sPLZ;
	String sOrt;

	// Konstruktor
	public Unterkunft(Dienstleister dienstleister) {
		this.dienstleister = dienstleister;
	}

	// Setter und Getter-Methoden
	public void setBeschreibung(String sBeschreibung) {
		this.sBeschreibung = sBeschreibung;
	}

	public void setName(String sName) {
		this.sName = sName;
	}

	public String getName() {
		return sName;
	}

	public String getBeschreibung() {
		return dienstleister.getBeschreibung() + ", " + sBeschreibung;
	}

	public String getBeschr() {
		return sBeschreibung;
	}

	public void setPreis(double dPreis) {
		this.dPreis = dPreis;
	}

	// Preis setzt sich aus Pauschalpreis Anbieter und Preis Dekoration zusammen
	public double preis() {
		return dPreis + dienstleister.preis();
	}

	public void setKomfortklasse(String sKlasse) {
		this.sKlasse = sKlasse;
	}

	public String getKomfortklasse() {
		return sKlasse;
	}

	public void setAnzPlaetze(String sPlaetze) {
		this.sPlaetze = sPlaetze;
	}

	public String getAnzPlaetze() {
		return sPlaetze;
	}

	public void hatBeamer(boolean bBeamer) {
		this.bBeamer = bBeamer;
	}

	public boolean getBeamer() {
		return bBeamer;
	}

	public void setAnzParkplaetze(String sParkplaetze) {
		this.sParkplaetze = sParkplaetze;
	}

	public String getAnzParkplaetze() {
		return sParkplaetze;
	}

	public void setStrasse(String sStrasse) {
		this.sStrasse = sStrasse;
	}

	public String getStrasse() {
		return sStrasse;
	}

	public void setHausNr(String sNr) {
		this.sHausNr = sNr;
	}

	public String getHausNr() {
		return sHausNr;
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
}
