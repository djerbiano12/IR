package Unit�s;

import Grandeur.Grandeur;

/**
 * Unit� atomique (c'est-�-dire non compos�e) d�finie par r�f�rence � une autre unit�
 * 
 * 
 * Exemple : pied (ft)
 * 
 * */
public class Unit�Atomique extends Unit�
{
Unit� r�f�rence;    // exemple : pouce (in)
double rapportConversion;   // exemple : 12 car 1 ft = 12 in
/**
 * @param nom
 * @param abbr�viation
 * @param r�f�rence
 * @param rapportConversion
 * @throws Exception 
 */
public Unit�Atomique(String nom, String abbr�viation,Grandeur grandeur,
        double rapportConversion,Unit�R�f�rence ur) throws Exception
{
super(nom, abbr�viation,grandeur);
if(!this.grandeur.getGrandeur().equals(ur.getGrandeur().getGrandeur()))
	throw new Exception ("Cr�ation impossible, il ne s'agit pas de m�me grandeurs !!");
this.rapportConversion = rapportConversion;
}

public Unit�Atomique(Unit� u) throws Exception{
	super(u);
	Unit�Atomique u1 = (Unit�Atomique)u;
	this.r�f�rence = u1.getR�f�rence();
	this.rapportConversion = u1.getRapportConversion();
}

public Unit� getR�f�rence() {
	return r�f�rence;
}
public void setR�f�rence(Unit� r�f�rence) {
	this.r�f�rence = r�f�rence;
}
public double getRapportConversion() {
	return rapportConversion;
}
public void setRapportConversion(double rapportConversion) {
	this.rapportConversion = rapportConversion;
}

@Override
public String toString() {
	return "Unit�Atomique [r�f�rence=" + r�f�rence + ", rapportConversion="
			+ rapportConversion + "]";
}

@Override
public double getR�f�rence(double valeur) {
	return valeur * this.rapportConversion;
}



}
