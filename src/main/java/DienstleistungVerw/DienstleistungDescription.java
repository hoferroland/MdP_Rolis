package DienstleistungVerw;

// Eine Dienstleistung braucht zwingend eine Bezeichnung
// und einen Anbieter (quasi der Verk�ufer)
public interface DienstleistungDescription {

	public abstract String getBezeichnung();

	public abstract String getAnbieter();

}
