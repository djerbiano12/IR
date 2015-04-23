package COR;

import QuantitéMesurée.QuantitéMesurée;
import Unités.Unité;
import Unités.UnitéAtomique;
import Unités.UnitéRéférence;

public class ConversionH_MIN extends ConversionCOR {

	public ConversionH_MIN(Conversion suivant) {
		super(suivant);
		// TODO Auto-generated constructor stub
	}

	@Override
	public QuantitéMesurée convertir1(QuantitéMesurée q1, String nvelleUnite) throws Exception {
		if(q1.getUnite().getGrandeur().getGrandeur().equals("temps") && nvelleUnite.equals("min")){
			QuantitéMesurée q2 =new QuantitéMesurée(q1.getUnite(),q1.getValeur());
			q2.setValeur(q1.getUnite().getRéférence(q1.getValeur()));
			q2.setValeur(q2.getValeur() * 60);
			Unité u1 = new UnitéAtomique("Minutes","min",q1.getUnite().getGrandeur(),1.0/60.0,new UnitéRéférence("heure","h",q1.getUnite().getGrandeur()));
			return new QuantitéMesurée(u1,q2.getValeur());

		}
		return null;
	}

}
