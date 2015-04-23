package Grandeur;


/**
 * 
 * Unité composée de deux unités à l'aide d'un opérateur binaire : *, /, etc.
 * exemples: km/h, m/s, Kw*h
 * 
 * 
 * 
 * */
public abstract class GrandeurComposée extends Grandeur
{

Grandeur gauche, droite;

/**
 * @param nom
 * @param abbréviation
 * @param gauche
 * @param droite
 */
public GrandeurComposée(Grandeur gauche, Grandeur droite)
{
this.gauche = gauche;
this.droite = droite;
}

public Grandeur getGauche() {
	return gauche;
}

public void setGauche(Grandeur gauche) {
	this.gauche = gauche;
}

public Grandeur getDroite() {
	return droite;
}

public void setDroite(Grandeur droite) {
	this.droite = droite;
}

@Override
public String toString() {
	return "UnitéComposée [gauche=" + gauche + ", droite=" + droite + "]";
}


}
