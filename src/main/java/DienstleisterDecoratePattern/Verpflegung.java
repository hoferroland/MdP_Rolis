package DienstleisterDecoratePattern;

// Dekoration von Dienstleister mit 'Unterhaltung'
public class Verpflegung extends Dienstleister {

	// Definition der Variablen
	Dienstleister dienstleister;
	String sName;
	String sBeschreibung;
	double dPreis;
	String sRegion;
	boolean bVegi;
	boolean bAllergie;

	// Konstruktor
	public Verpflegung(Dienstleister dienstleister) {
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

	public void setRegion(String sRegion) {
		this.sRegion = sRegion;
	}

	public String getRegion() {
		return sRegion;
	}

	public void setVegi(boolean bVegi) {
		this.bVegi = bVegi;
	}

	public boolean getVegi() {
		return bVegi;
	}

	public void setAllergie(boolean bAllergie) {
		this.bAllergie = bAllergie;
	}

	public boolean getAllergie() {
		return bAllergie;
	}

}
