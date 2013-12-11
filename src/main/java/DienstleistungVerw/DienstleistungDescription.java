package DienstleistungVerw;

// Eine Dienstleistung braucht zwingend eine Bezeichnung
// und einen Anbieter (quasi der Verkäufer)
public interface DienstleistungDescription {

	public abstract String getBezeichnung();

	public abstract String getAnbieter();

}
