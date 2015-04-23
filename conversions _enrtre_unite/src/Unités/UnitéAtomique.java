package Unités;

import Grandeur.Grandeur;

/**
 * Unité atomique (c'est-à-dire non composée) définie par référence à une autre unité
 * 
 * 
 * Exemple : pied (ft)
 * 
 * */
public class UnitéAtomique extends Unité
{
Unité référence;    // exemple : pouce (in)
double rapportConversion;   // exemple : 12 car 1 ft = 12 in
/**
 * @param nom
 * @param abbréviation
 * @param référence
 * @param rapportConversion
 * @throws Exception 
 */
public UnitéAtomique(String nom, String abbréviation,Grandeur grandeur,
        double rapportConversion,UnitéRéférence ur) throws Exception
{
super(nom, abbréviation,grandeur);
if(!this.grandeur.getGrandeur().equals(ur.getGrandeur().getGrandeur()))
	throw new Exception ("Création impossible, il ne s'agit pas de même grandeurs !!");
this.rapportConversion = rapportConversion;
}

public UnitéAtomique(Unité u) throws Exception{
	super(u);
	UnitéAtomique u1 = (UnitéAtomique)u;
	this.référence = u1.getRéférence();
	this.rapportConversion = u1.getRapportConversion();
}

public Unité getRéférence() {
	return référence;
}
public void setRéférence(Unité référence) {
	this.référence = référence;
}
public double getRapportConversion() {
	return rapportConversion;
}
public void setRapportConversion(double rapportConversion) {
	this.rapportConversion = rapportConversion;
}

@Override
public String toString() {
	return "UnitéAtomique [référence=" + référence + ", rapportConversion="
			+ rapportConversion + "]";
}

@Override
public double getRéférence(double valeur) {
	return valeur * this.rapportConversion;
}



}
