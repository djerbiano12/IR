package Quantit�Mesur�e;

import Unit�s.Unit�;

public class Quantit�Mesur�e {
	
	Unit� unite;
	double Valeur;
	
	public Quantit�Mesur�e(Unit� unite, double valeur) {
		super();
		this.unite = unite;
		Valeur = valeur;
	}

	public Unit� getUnite() {
		return unite;
	}

	public void setUnite(Unit� unite) {
		this.unite = unite;
	}

	public double getValeur() {
		return Valeur;
	}

	public void setValeur(double valeur) {
		Valeur = valeur;
	}
	
	
	

}
