package DienstleisterDecoratePattern;

// Abstrakte Klasse f�r Dekorierung der Klasse Dienstleister
public abstract class DienstleistungDekorierer extends Dienstleister {

	// .. dabei wird verlangt, dass jede 'Dekoration' die Methode
	// getBeschreibung() implementiert
	public abstract String getBeschreibung();
}
