package QuantitéMesurée;

import Unités.Unité;

public class QuantitéMesurée {
	
	Unité unite;
	double Valeur;
	
	public QuantitéMesurée(Unité unite, double valeur) {
		super();
		this.unite = unite;
		Valeur = valeur;
	}

	public Unité getUnite() {
		return unite;
	}

	public void setUnite(Unité unite) {
		this.unite = unite;
	}

	public double getValeur() {
		return Valeur;
	}

	public void setValeur(double valeur) {
		Valeur = valeur;
	}
	
	
	

}
