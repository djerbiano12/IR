package Unités;

import Grandeur.Grandeur;

public abstract class Unité
{
String nom;
String abbréviation;
Grandeur grandeur;
/**
 * @param nom
 * @param abbréviation
 */
public Unité(String nom, String abbréviation,Grandeur grandeur)
{
this.nom = nom;
this.abbréviation = abbréviation;
this.grandeur = grandeur;
}

public Unité(Unité u) throws Exception{
	if(u.getGrandeur().getGrandeur().equals(this.grandeur.getGrandeur())){
		this.nom = u.getNom();
		this.abbréviation = u.getAbbréviation();
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
public String getAbbréviation() {
	return abbréviation;
}
public void setAbbréviation(String abbréviation) {
	this.abbréviation = abbréviation;
}

public Grandeur getGrandeur() {
	return grandeur;
}

public void setGrandeur(Grandeur grandeur) {
	this.grandeur = grandeur;
}

@Override
public String toString() {
	return "Unité [nom=" + nom + ", abbréviation=" + abbréviation
			+ ", grandeur=" + grandeur + "]";
}

public abstract double getRéférence(double valeur);

}
