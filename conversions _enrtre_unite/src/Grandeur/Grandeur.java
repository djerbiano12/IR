package Grandeur;

public class Grandeur {
	private String grandeur;
	private String unitéRéférence;
	
	
	public Grandeur() {
		super();
	}



	public String getGrandeur() {
		return grandeur;
	}

	public void setGrandeur(String grandeur) {
		this.grandeur = grandeur;
	}



	public String getUnitéRéférence() {
		return unitéRéférence;
	}



	public void setUnitéRéférence(String unitéRéférence) {
		this.unitéRéférence = unitéRéférence;
	}



	@Override
	public String toString() {
		return "Grandeur [grandeur=" + grandeur + ", unitéRéférence="
				+ unitéRéférence + "]";
	}

	
	
	
	

}
