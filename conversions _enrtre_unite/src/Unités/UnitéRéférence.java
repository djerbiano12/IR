package Unités;

import Grandeur.Grandeur;


/**
 * Unité non composée, de référence (système S.I. ?)
 * 
 * exemples : mètre, kilogramme, dollar, etc. 
 * 
 * */
public class UnitéRéférence extends Unité
{

public UnitéRéférence(String nom, String abbréviation,Grandeur grandeur)
{
super(nom, abbréviation,grandeur);
}

public UnitéRéférence(Unité u) throws Exception{
	super(u);
}

@Override
public String toString() {
	return "UnitéRéférence [nom=" + nom + ", abbréviation=" + abbréviation
			+ "]";
}

@Override
public double getRéférence(double valeur) {
	
	return valeur;
}



}
