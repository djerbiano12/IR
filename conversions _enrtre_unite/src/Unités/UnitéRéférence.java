package Unit�s;

import Grandeur.Grandeur;


/**
 * Unit� non compos�e, de r�f�rence (syst�me S.I. ?)
 * 
 * exemples : m�tre, kilogramme, dollar, etc. 
 * 
 * */
public class Unit�R�f�rence extends Unit�
{

public Unit�R�f�rence(String nom, String abbr�viation,Grandeur grandeur)
{
super(nom, abbr�viation,grandeur);
}

public Unit�R�f�rence(Unit� u) throws Exception{
	super(u);
}

@Override
public String toString() {
	return "Unit�R�f�rence [nom=" + nom + ", abbr�viation=" + abbr�viation
			+ "]";
}

@Override
public double getR�f�rence(double valeur) {
	
	return valeur;
}



}
