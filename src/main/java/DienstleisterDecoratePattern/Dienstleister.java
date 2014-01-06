package DienstleisterDecoratePattern;

// Abstrakte Klasse 'Dienstleister' 
public abstract class Dienstleister {

	// Definition der Variablen
	String beschreibung = "Unbekannte Dienstleistung";
	double preis = 0.0;

	// Definiert, dass jede erbende Klasse die Methode getBeschreibung()
	// implementieren muss
	public String getBeschreibung() {
		return beschreibung;
	}

	// Definiert, dass jede erbende Klasse die Methode preis() implementieren
	// muss
	public abstract double preis();
}
