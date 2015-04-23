package Grandeur;


/**
 * 
 * Unit� compos�e de deux unit�s � l'aide d'un op�rateur binaire : *, /, etc.
 * exemples: km/h, m/s, Kw*h
 * 
 * 
 * 
 * */
public abstract class GrandeurCompos�e extends Grandeur
{

Grandeur gauche, droite;

/**
 * @param nom
 * @param abbr�viation
 * @param gauche
 * @param droite
 */
public GrandeurCompos�e(Grandeur gauche, Grandeur droite)
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
	return "Unit�Compos�e [gauche=" + gauche + ", droite=" + droite + "]";
}


}
