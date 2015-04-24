package COR;

import QuantitéMesurée.QuantitéMesurée;
import Unités.Unité;
import Unités.UnitéAtomique;
import Unités.UnitéRéférence;

public class Conversion$_£ extends ConversionCOR{

	public Conversion$_£(Conversion suivant) {
		super(suivant);
		// TODO Auto-generated constructor stub
	}

	@Override
	public QuantitéMesurée convertir1(QuantitéMesurée q1, String nvelleUnite)
			throws Exception {
		if(q1.getUnite().getGrandeur().getGrandeur().equals("argent") && nvelleUnite.equals("£")){
			QuantitéMesurée q2 =new QuantitéMesurée(q1.getUnite(),q1.getValeur());
			q2.setValeur(q1.getUnite().getRéférence(q1.getValeur()));
			q2.setValeur(q2.getValeur() * 0.65);
			Unité u1 = new UnitéAtomique("livre","£",q1.getUnite().getGrandeur(),1.5,new UnitéRéférence("dollar","$",q1.getUnite().getGrandeur()));
			return new QuantitéMesurée(u1,q2.getValeur());
		}
		return null;
	}

}
