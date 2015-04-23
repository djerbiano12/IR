package Grandeur;


/**
 * unit� compos�e exprim�e � l'aide d'une division : km/h, m/s, m^3/s, etc...
 * 
 * 
 * */
public class GrandeurDivision extends GrandeurCompos�e
{

public GrandeurDivision( Grandeur gauche, Grandeur droite)
{
super(gauche, droite);
String grandeur = gauche.getGrandeur()+"/"+droite.getGrandeur();
this.setGrandeur(grandeur);
this.setUnit�R�f�rence(gauche.getUnit�R�f�rence()+"/"+droite.getUnit�R�f�rence());
}

@Override
public String toString() {
	return "GrandeurDivision [gauche=" + gauche + ", droite=" + droite + "]";
}

}
