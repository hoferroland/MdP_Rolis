package DienstleistungVerw;

public abstract class DienstleistungDescriptionDekorierer implements
		DienstleistungDescription {

	private String sBezeichnung;

	private String sAnbieter;
	private String sWebseite;
	private String sTelefon;
	private String sEmail;

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

}
