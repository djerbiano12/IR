package COR;

import QuantitéMesurée.QuantitéMesurée;
import Unités.Unité;
import Unités.UnitéAtomique;
import Unités.UnitéDivision;
import Unités.UnitéRéférence;

public class ConversionKmParH_DmParMin extends ConversionCOR {

	public ConversionKmParH_DmParMin(Conversion suivant) {
		super(suivant);
		// TODO Auto-generated constructor stub
	}

	@Override
	public QuantitéMesurée convertir1(QuantitéMesurée q1, String nvelleUnite) throws Exception {
		if(q1.getUnite().getGrandeur().getGrandeur().equals("distance/temps") && nvelleUnite.equals("dm/min")){
			QuantitéMesurée q2 =new QuantitéMesurée(q1.getUnite(),q1.getValeur());
			UnitéDivision unite = (UnitéDivision) q1.getUnite();	
			UnitéAtomique gauche = (UnitéAtomique) unite.getGauche();
			UnitéAtomique droite = (UnitéAtomique) unite.getDroite();
			double valeurReference = q1.getValeur() * (gauche.getRapportConversion()/droite.getRapportConversion());	
			q2.setValeur(valeurReference);
			q2.setValeur(q2.getValeur() * 100.0/60.0);
			Unité u1 = new UnitéAtomique("Décamètre","dm",gauche.getGrandeur(),0.01,new UnitéRéférence("kilomètre","km",gauche.getGrandeur()));
			Unité u2 = new UnitéAtomique("Minute","min",droite.getGrandeur(),1.0/60.0,new UnitéRéférence("heure","h",droite.getGrandeur()));
			Unité u3 = new UnitéDivision(u1.getNom()+"/"+u2.getNom(),u1.getAbbréviation()+"/"+u2.getAbbréviation(),q1.getUnite().getGrandeur(),u1,u2);
			return new QuantitéMesurée(u3,q2.getValeur());

		}
		return null;
	}

}
