package Unités;

import Grandeur.Grandeur;


/**
 * unité composée exprimée à l'aide d'une division : km/h, m/s, m^3/s, etc...
 * 
 * 
 * */
public class UnitéDivision extends UnitéComposée
{

public UnitéDivision(String nom, String abbréviation,Grandeur grandeur, Unité gauche, Unité droite)
{
super(nom, abbréviation,grandeur, gauche, droite);
}

public UnitéDivision(Unité u) throws Exception{
	super(u);
}


@Override
public String toString() {
	return "nom="
			+ nom + ", abbréviation=" + abbréviation + "]";
}

@Override
public double getRéférence(double valeur) {
	return this.gauche.getRéférence(valeur)/this.droite.getRéférence(valeur);
}


}
