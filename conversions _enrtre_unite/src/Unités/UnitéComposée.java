package Unités;

import Grandeur.Grandeur;


/**
 * 
 * Unité composée de deux unités à l'aide d'un opérateur binaire : *, /, etc.
 * exemples: km/h, m/s, Kw*h
 * 
 * 
 * 
 * */
public abstract class UnitéComposée extends Unité
{

Unité gauche, droite;

/**
 * @param nom
 * @param abbréviation
 * @param gauche
 * @param droite
 */
public UnitéComposée(String nom, String abbréviation,Grandeur grandeur, Unité gauche, Unité droite)
{
super(nom, abbréviation,grandeur);
this.gauche = gauche;
this.droite = droite;
}

public UnitéComposée(Unité u) throws Exception{
	super(u);
	UnitéComposée u1 = (UnitéComposée)u;
	this.gauche = u1.getGauche();
	this.droite = u1.getDroite();
}

public Unité getGauche() {
	return gauche;
}

public void setGauche(Unité gauche) {
	this.gauche = gauche;
}

public Unité getDroite() {
	return droite;
}

public void setDroite(Unité droite) {
	this.droite = droite;
}

@Override
public String toString() {
	return "UnitéComposée [gauche=" + gauche + ", droite=" + droite + ", nom="
			+ nom + ", abbréviation=" + abbréviation + ", grandeur=" + grandeur
			+ "]";
}

public abstract double getRéférence(double valeur);




}
