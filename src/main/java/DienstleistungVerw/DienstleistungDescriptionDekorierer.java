package DienstleistungVerw;

public abstract class DienstleistungDescriptionDekorierer implements DienstleistungDescription {

	private String sBezeichnung;
	
	private String sAnbieter;
	
	protected DienstleistungDescriptionDekorierer(String sBezeichnung, String sAnbieter){
		this.sBezeichnung = sBezeichnung;
		this.sAnbieter  = sAnbieter;
	}
	
	public String getBezeichnung() {
		return sBezeichnung;
	}

	public String getAnbieter() {
		return sAnbieter;
	}

	
	
}
