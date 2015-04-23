package Unit�s;

import Grandeur.Grandeur;

public abstract class Unit�
{
String nom;
String abbr�viation;
Grandeur grandeur;
/**
 * @param nom
 * @param abbr�viation
 */
public Unit�(String nom, String abbr�viation,Grandeur grandeur)
{
this.nom = nom;
this.abbr�viation = abbr�viation;
this.grandeur = grandeur;
}

public Unit�(Unit� u) throws Exception{
	if(u.getGrandeur().getGrandeur().equals(this.grandeur.getGrandeur())){
		this.nom = u.getNom();
		this.abbr�viation = u.getAbbr�viation();
		this.grandeur = u.getGrandeur();
	}
	else throw new Exception();
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getAbbr�viation() {
	return abbr�viation;
}
public void setAbbr�viation(String abbr�viation) {
	this.abbr�viation = abbr�viation;
}

public Grandeur getGrandeur() {
	return grandeur;
}

public void setGrandeur(Grandeur grandeur) {
	this.grandeur = grandeur;
}

@Override
public String toString() {
	return "Unit� [nom=" + nom + ", abbr�viation=" + abbr�viation
			+ ", grandeur=" + grandeur + "]";
}

public abstract double getR�f�rence(double valeur);

}
