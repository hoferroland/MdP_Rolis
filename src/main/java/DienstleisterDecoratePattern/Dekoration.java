package DienstleisterDecoratePattern;

public class Dekoration extends Dienstleister {

	Dienstleister dienstleister;
	String sBeschreibung;
	String sName;
	double dPreis;
	boolean bBlumen = false;

	public Dekoration(Dienstleister dienstleister) {
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

	public void setBlumen(boolean bBlumen) {
		this.bBlumen = bBlumen;
	}

	public boolean getBlumen() {
		return bBlumen;
	}

}
