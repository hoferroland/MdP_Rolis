package DienstleistungVerw;

// Decorate Pattern umgesetzt

// Klasse implementiert das Interface DienstleistungDecription und übernimmt den Konstruktor für die 
// im Interface definierten, zwingend notwendigen Bezeichnung und Anbieter sowie einige Getter-Methoden
// die anderen Felder werden in den jeweiligen Dienstleistungsklassen erzeugt.

public abstract class DienstleistungDescriptionDekorierer implements
		DienstleistungDescription {

	private String sBezeichnung;

	private String sAnbieter;
	private String sWebseite;
	private String sTelefon;
	private String sEmail;
	private String sZusatz;

	protected DienstleistungDescriptionDekorierer(String sBezeichnung,
			String sAnbieter) {
		this.sBezeichnung = sBezeichnung;
		this.sAnbieter = sAnbieter;
	}

	public String getBezeichnung() {
		return sBezeichnung;
	}

	public String getAnbieter() {
		return sAnbieter;
	}

	public String getWebseite() {
		return sWebseite;
	}

	public String getTelefon() {
		return sTelefon;
	}

	public String getEmail() {
		return sEmail;
	}

	public String getZusatz() {
		return sZusatz;
	}

}
