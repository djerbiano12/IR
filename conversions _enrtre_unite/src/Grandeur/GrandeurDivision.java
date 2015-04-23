package Grandeur;


/**
 * unité composée exprimée à l'aide d'une division : km/h, m/s, m^3/s, etc...
 * 
 * 
 * */
public class GrandeurDivision extends GrandeurComposée
{

public GrandeurDivision( Grandeur gauche, Grandeur droite)
{
super(gauche, droite);
String grandeur = gauche.getGrandeur()+"/"+droite.getGrandeur();
this.setGrandeur(grandeur);
this.setUnitéRéférence(gauche.getUnitéRéférence()+"/"+droite.getUnitéRéférence());
}

@Override
public String toString() {
	return "GrandeurDivision [gauche=" + gauche + ", droite=" + droite + "]";
}

}
