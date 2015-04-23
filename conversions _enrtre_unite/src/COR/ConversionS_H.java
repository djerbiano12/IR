package COR;

import QuantitéMesurée.QuantitéMesurée;
import Unités.Unité;
import Unités.UnitéRéférence;

public class ConversionS_H extends ConversionCOR {

	public ConversionS_H(Conversion suivant) {
		super(suivant);
		// TODO Auto-generated constructor stub
	}

	@Override
	public QuantitéMesurée convertir1(QuantitéMesurée q1, String nvelleUnite) {
		if(q1.getUnite().getGrandeur().getGrandeur().equals("temps") && nvelleUnite.equals("h")){
			QuantitéMesurée q2 =new QuantitéMesurée(q1.getUnite(),q1.getValeur());
			q2.setValeur(q1.getUnite().getRéférence(q1.getValeur()));
			Unité u1 = new UnitéRéférence("Heure",q1.getUnite().getGrandeur().getUnitéRéférence(),q1.getUnite().getGrandeur());
			return new QuantitéMesurée(u1,q2.getValeur());

		}
		return null;
	}

}
