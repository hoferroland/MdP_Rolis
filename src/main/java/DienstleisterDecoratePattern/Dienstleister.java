package DienstleisterDecoratePattern;

public abstract class Dienstleister {

	String beschreibung = "Unbekannte Dienstleistung";
	double preis = 0.0;

	public String getBeschreibung() {
		return beschreibung;
	}

	public abstract double preis();
}
