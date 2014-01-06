package DienstleisterDecoratePattern;

//Dekoration von Dienstleister mit 'Dekoration'
public class Dekoration extends Dienstleister {

	// Definition der Variablen
	Dienstleister dienstleister;
	String sBeschreibung;
	String sName;
	double dPreis;
	boolean bBlumen = false;

	// Konstruktor (Dekoration dekoriert einen Dienstleister)
	public Dekoration(Dienstleister dienstleister) {
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

	public void setBlumen(boolean bBlumen) {
		this.bBlumen = bBlumen;
	}

	public boolean getBlumen() {
		return bBlumen;
	}

}
