package Grandeur;

public class Grandeur {
	private String grandeur;
	private String unit�R�f�rence;
	
	
	public Grandeur() {
		super();
	}



	public String getGrandeur() {
		return grandeur;
	}

	public void setGrandeur(String grandeur) {
		this.grandeur = grandeur;
	}



	public String getUnit�R�f�rence() {
		return unit�R�f�rence;
	}



	public void setUnit�R�f�rence(String unit�R�f�rence) {
		this.unit�R�f�rence = unit�R�f�rence;
	}



	@Override
	public String toString() {
		return "Grandeur [grandeur=" + grandeur + ", unit�R�f�rence="
				+ unit�R�f�rence + "]";
	}

	
	
	
	

}
