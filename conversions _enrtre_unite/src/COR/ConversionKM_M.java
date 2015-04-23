package COR;

import QuantitéMesurée.QuantitéMesurée;
import Unités.Unité;
import Unités.UnitéAtomique;
import Unités.UnitéRéférence;

public class ConversionKM_M extends ConversionCOR{

	public ConversionKM_M(Conversion suivant) {
		super(suivant);
		// TODO Auto-generated constructor stub
	}

	@Override
	public QuantitéMesurée convertir1(QuantitéMesurée q1, String nvelleUnite) throws Exception {
		if(q1.getUnite().getGrandeur().getGrandeur().equals("distance") && nvelleUnite.equals("m")){
			QuantitéMesurée q2 =new QuantitéMesurée(q1.getUnite(),q1.getValeur());

			q2.setValeur(q1.getUnite().getRéférence(q1.getValeur()));
			q2.setValeur(q2.getValeur() * 1000);
			Unité u1 = new UnitéAtomique("Mètre","m",q1.getUnite().getGrandeur(),0.001,new UnitéRéférence("kilomètre","km",q1.getUnite().getGrandeur()));
			return new QuantitéMesurée(u1,q2.getValeur());

		}
		return null;
	}

}
