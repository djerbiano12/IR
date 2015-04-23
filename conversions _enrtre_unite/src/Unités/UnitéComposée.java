package Unit�s;

import Grandeur.Grandeur;


/**
 * 
 * Unit� compos�e de deux unit�s � l'aide d'un op�rateur binaire : *, /, etc.
 * exemples: km/h, m/s, Kw*h
 * 
 * 
 * 
 * */
public abstract class Unit�Compos�e extends Unit�
{

Unit� gauche, droite;

/**
 * @param nom
 * @param abbr�viation
 * @param gauche
 * @param droite
 */
public Unit�Compos�e(String nom, String abbr�viation,Grandeur grandeur, Unit� gauche, Unit� droite)
{
super(nom, abbr�viation,grandeur);
this.gauche = gauche;
this.droite = droite;
}

public Unit�Compos�e(Unit� u) throws Exception{
	super(u);
	Unit�Compos�e u1 = (Unit�Compos�e)u;
	this.gauche = u1.getGauche();
	this.droite = u1.getDroite();
}

public Unit� getGauche() {
	return gauche;
}

public void setGauche(Unit� gauche) {
	this.gauche = gauche;
}

public Unit� getDroite() {
	return droite;
}

public void setDroite(Unit� droite) {
	this.droite = droite;
}

@Override
public String toString() {
	return "Unit�Compos�e [gauche=" + gauche + ", droite=" + droite + ", nom="
			+ nom + ", abbr�viation=" + abbr�viation + ", grandeur=" + grandeur
			+ "]";
}

public abstract double getR�f�rence(double valeur);




}
