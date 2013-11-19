package rentAnEvent;

public class Entertainment implements Service{
	
	// Pflichtangaben
		private String[] asUnterhaltungsart;
		private int iAnzahlUnterhalter;
		private String sBezeichnung;
		private String sAnbieter;
		private String sDatum;
		private double dKosten;
		private double dDauer;
		// Zus�tzliche Angaben
		private int iPLZ;
		private String sOrt;
		private String sStrasse;
		private int iHausnummer;
		private String sWebseite;
		private String sBuchungsfrist;
		private String sAbsagebedingungen;
		private String sTelefon;
		private String sEmail;
		private String sZusatz;	
		
		public Entertainment(String sBezeichnung, String sAnbieter, String sDatum, double dKosten, double dDauer, String[] asUnterhaltungsart, int iAnzahlUnterhalter) {
			this.setBezeichnung(sBezeichnung);
			this.setAnbieter(sAnbieter);
			this.setDatum(sDatum);
			this.setKosten(dKosten);
			this.setDauer(dDauer);
			this.setUnterhaltungsart(asUnterhaltungsart);
			this.setAnzahlUnterhalter(iAnzahlUnterhalter);
		}
		
		public String[] getUnterhaltungsart() {
			return this.asUnterhaltungsart;
		}
		
		public int getAnzahlUnterhalter() {
			return this.iAnzahlUnterhalter;
		}
		
		public int getPLZ() {
			return this.iPLZ;
		}
		
		public String getOrt() {
			return this.sOrt;
		}
		
		public String getStrasse() {
			return this.sStrasse;
		}
		
		public int getHausnummer() {
			return this.iHausnummer;
		}
		
		@Override
		public String getBezeichnung() {
			return this.sBezeichnung;
		} 
		
		@Override
		public String getAnbieter() {
			return this.sAnbieter;
		}

		@Override
		public String getDatum() {
			return this.sDatum;
		}

		@Override
		public double getKosten() {
			return this.dKosten;
		}

		@Override
		public double getDauer() {
			return this.dDauer;
		}
		
		public String getWebseite() {
			return this.sWebseite;
		}
		
		public String getBuchungsfrist() {
			return this.sBuchungsfrist;
		}
		
		public String getAbsagebedingungen() {
			return this.sAbsagebedingungen;
		}
		
		public String getTelefon() {
			return this.sTelefon;
		}
		
		public String getEmail() {
			return this.sEmail;
		}
		
		public String getZusatz() {
			return this.sZusatz;
		}
		
		public void setUnterhaltungsart(String[] asUnterhaltungsart) {
			// to do: �berpr�fung der Eingabe
			// ...
			this.asUnterhaltungsart = asUnterhaltungsart;
		}
		
		public void setAnzahlUnterhalter(int iAnzahlUnterhalter) {
			// to do: �berpr�fung der Eingabe
			// ...
			this.iAnzahlUnterhalter = iAnzahlUnterhalter;
		}
		
		public void setPLZ(int iPLZ) {
			// to do: �berpr�fung der Eingabe
					// ...
					this.iPLZ = iPLZ;
		}
		
		public void setOrt(String sOrt) {
			// to do: �berpr�fung der Eingabe
			// ...
			this.sOrt = sOrt;
		}
		
		public void setStrasse(String sStrasse) {
			// to do: �berpr�fung der Eingabe
			// ...
			this.sStrasse = sStrasse;
		}
		
		public void setHausnummer(int iHausnummer) {
			// to do: �berpr�fung der Eingabe
			// ...
			this.iHausnummer = iHausnummer;
		}
		
		@Override
		public void setBezeichnung(String sBezeichnung) {
			// to do: �berpr�fung der Eingabe
			// ...
			this.sBezeichnung = sBezeichnung;
		}
		
		@Override
		public void setAnbieter(String sAnbieter) {
			// to do: �berpr�fung der Eingabe
			// ...
			this.sAnbieter = sAnbieter;		
		}
		
		@Override
		public void setDatum(String sDatum) {
			// to do: �berpr�fung der Eingabe
			// ...
			this.sDatum = sDatum;
		}
		
		@Override
		public void setKosten(double dKosten) {
			// to do: �berpr�fung der Eingabe
			// ...
			this.dKosten = dKosten;
		}
		
		@Override
		public void setDauer(double dDauer) {
			// to do: �berpr�fung der Eingabe
			// ...		
			this.dDauer = dDauer;
		}

		public void setWebseite(String sWebseite) {
			this.sWebseite = sWebseite;
		}
		
		public void setBuchungsfrist(String sBuchungsfrist) {
			this.sBuchungsfrist = sBuchungsfrist;
		}
		
		public void setAbsagebedingungen(String sAbsagebedingungen) {
			this.sAbsagebedingungen = sAbsagebedingungen;
		}
		
		public void setTelefon(String sTelefon) {
			// to do: �berpr�fung der Eingabe
			// ...
			this.sTelefon = sTelefon;
		}
		
		public void setEmail(String sEmail) {
			// to do: �berpr�fung der Eingabe
			// ...
			this.sEmail = sEmail;
		}
		
		public void setZusatz(String sZusatz) {
			this.sZusatz = sZusatz;
		}
		
	}
