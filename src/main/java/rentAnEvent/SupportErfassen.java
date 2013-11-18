package rentAnEvent;

import java.util.Scanner;

public class SupportErfassen {

	private String sService;
	private Scanner scanner = new Scanner(System.in);
	
	/** 
	 * Der Erfasser wählt aus einer Liste von Dienstleistungen aus, zu welcher er einen weiteren Eintrag erstellen möchte
	 */
	public void chooseService() {
		System.out.print("Bitte wählen Sie eine Dienstleistung aus: ");
		System.out.println("(L)ocation, (C)atering, (E)ntertainment");
		this.setService(scanner.next());
		this.goToService();
	}
	
	/**
	 * Anhand der gewählten Dienstleistung wird der Erfasser weitergeleitet zur Eingabe derselben
	 */
	private void goToService() {
		switch(this.getService().substring(0, 1)) {
		case "L": 	this.setService("Location");
					this.enterLocation();
					break;
/*
		case "C": 	this.setService("Catering");
					this.enterCatering();
					break;
		case "E": 	this.setService("Entertainment");
					this.enterEntertainment();
					break;
*/
		default:	this.chooseService();
		}
	}
	
	/**
	 * Der Erfasser gibt eine Location ein
	 * 
	 * --> Geplant: Datenbankspeicherung
	 * 		Wichtig: Check der Eingaben (PLZ, Hausnummer, Kosten, Mietdauer --> Zahlen, nicht Buchstaben
	 */
	private void enterLocation() {
		System.out.print("Bitte geben Sie die Bezeichnung der Location ein: ");
		String sBezeichnung = scanner.next();
		System.out.print("Bitte geben Sie die PLZ der Location ein: ");
		int iPLZ = Integer.parseInt(scanner.next());
		System.out.print("Bitte geben Sie den Ort der Location ein: ");
		String sOrt = scanner.next();
		System.out.print("Bitte geben Sie die Strasse der Location ein: ");
		String sStrasse = scanner.next();
		System.out.print("Bitte geben Sie die Hausnummer der Location ein: ");
		int iHausnummer = Integer.parseInt(scanner.next());
		System.out.print("Bitte geben Sie den Anbieter der Location ein: ");
		String sAnbieter = scanner.next();
		System.out.print("Bitte geben Sie das Datum für die Buchung der Location ein: ");
		String sDatum = scanner.next();
		System.out.print("Bitte geben Sie die Kosten der Location ein: ");
		double dKosten = Integer.parseInt(scanner.next());
		System.out.print("Bitte geben Sie die Mietdauer der Location ein: ");
		double dDauer = Integer.parseInt(scanner.next());
		Location myLocation = new Location(sBezeichnung, iPLZ, sOrt, sStrasse, iHausnummer, sAnbieter, sDatum, dKosten, dDauer);
		scanner.close();
		// Zusätzliche Angaben, für Objekt Location nicht obligatorisch
		String sWebseite = "";
		String sBuchungsfrist;
		String sAbsagebedingungen;
		String sTelefon = "";
		String sEmail = "";
		String sZusatz;
//		this.setLocation(scanner.next());
	}	
		
	private String getService() {
		return this.sService;
	}	
	
	private void setService(String sService) {
		this.sService = sService;
	}
	
	
}
