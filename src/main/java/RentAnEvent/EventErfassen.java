/**
 * Klasse:		EventErfassen
 * Userstory:	Dienstleistung erfassen
 * Zweck:		Erfassen von neuen Dienstleistungsangeboten
 * Autor:		cbl
 * Erstellt:	06.11.2013
 * Version:		0.1
 * Änderung:	- 
**/


package RentAnEvent;

// Import-Statements
import java.util.Scanner; 


public class EventErfassen {
	
	private String sService = "";
	private String sLocation = "";
	private String sCatering = "";
	private String sEntertainment = "";
	private Scanner scanner = new Scanner(System.in);
	
	/** 
	 * Der Erfasser wählt aus einer Liste von Dienstleistungen aus, zu welcher er einen weiteren Eintrag erstellen möchte
	 */
	public void chooseService() {
		System.out.print("Bitte wählen Sie eine Dienstleistung aus: ");
		System.out.println("(L)ocation, (C)atering, (E)ntertainment");
		this.setService(scanner.next());
		this.goToService();
		//scanner.close();
	}
	
	/**
	 * Anhand der gewählten Dienstleistung wird der Erfasser weitergeleitet zur Eingabe derselben
	 */
	private void goToService() {
		switch(this.getService().substring(0, 1)) {
		case "L": 	this.setService("Location");
					this.enterLocation();
					break;
		case "C": 	this.setService("Catering");
					this.enterCatering();
					break;
		case "E": 	this.setService("Entertainment");
					this.enterEntertainment();
					break;
		default:	this.chooseService();
		}
	}
	
	/**
	 * Der Erfasser gibt eine Location ein
	 */
	private void enterLocation() {
		System.out.print("Bitte geben Sie eine Location ein: ");
		this.setLocation(scanner.next());
	}
	
	/**
	 * Der Erfasser gibt ein Cateringservice ein
	 */
	private void enterCatering() {
		System.out.print("Bitte geben Sie ein Catering ein: ");
		this.setCatering(scanner.next());
	}
	
	/**
	 * Der Erfasser gibt eine Unterhaltung ein
	 */
	private void enterEntertainment() {
		System.out.print("Bitte geben Sie eine Unterhaltung ein: ");
		this.setEntertainment(scanner.next());
	}
	
	/**
	 * 
	 */
	public void setService(String sParService) {
		this.sService = sParService;
	}
	
	/**
	 * 
	 */
	public void setLocation(String sParLocation) {
		this.sLocation = sParLocation;
	}
	
	/**
	 * 
	 */
	public void setCatering(String sParCatering) {
		this.sCatering = sParCatering;
	}
	
	/**
	 * 
	 */
	public void setEntertainment(String sParEntertainment) {	
		this.sEntertainment = sParEntertainment;
	}
	
	/**
	 * 
	 */
	public String getService() {
		return this.sService;
	}
	
	/**
	 * 
	 */
	public String getLocation() {
		return this.sLocation;
	}
	
	/**
	 * 
	 */
	public String getCatering() {
		return this.sCatering;
	}
	
	/**
	 * 
	 */
	public String getEntertainment() {	
		return this.sEntertainment;
	} 
	
	/**
	 * 
	 */
	public void clearService() {
		this.setService("");
	}
	
	/**
	 * 
	 */
	public void clearLocation() {
		this.setLocation("");
	}
	
	/**
	 * 
	 */
	public void clearCatering() {
		this.setCatering("");
	}
	
	/**
	 * 
	 */
	public void clearEntertainment() {	
		this.setEntertainment("");
	} 
	
}
