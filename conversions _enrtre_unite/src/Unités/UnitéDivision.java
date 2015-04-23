package Unit�s;

import Grandeur.Grandeur;


/**
 * unit� compos�e exprim�e � l'aide d'une division : km/h, m/s, m^3/s, etc...
 * 
 * 
 * */
public class Unit�Division extends Unit�Compos�e
{

public Unit�Division(String nom, String abbr�viation,Grandeur grandeur, Unit� gauche, Unit� droite)
{
super(nom, abbr�viation,grandeur, gauche, droite);
}

public Unit�Division(Unit� u) throws Exception{
	super(u);
}


@Override
public String toString() {
	return "nom="
			+ nom + ", abbr�viation=" + abbr�viation + "]";
}

@Override
public double getR�f�rence(double valeur) {
	return this.gauche.getR�f�rence(valeur)/this.droite.getR�f�rence(valeur);
}


}
