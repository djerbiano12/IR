package COR;

import QuantitéMesurée.QuantitéMesurée;
import Unités.Unité;
import Unités.UnitéAtomique;
import Unités.UnitéRéférence;

public class ConversionH_S extends ConversionCOR{

	public ConversionH_S(Conversion suivant) {
		super(suivant);
		// TODO Auto-generated constructor stub
	}

	@Override
	public QuantitéMesurée convertir1(QuantitéMesurée q1, String nvelleUnite) throws Exception {
		if(q1.getUnite().getGrandeur().getGrandeur().equals("temps") && nvelleUnite.equals("s")){
			QuantitéMesurée q2 =new QuantitéMesurée(q1.getUnite(),q1.getValeur());
			q2.setValeur(q1.getUnite().getRéférence(q1.getValeur()));
			q2.setValeur(q2.getValeur() * 3600);
			Unité u1 = new UnitéAtomique("Seconde","s",q1.getUnite().getGrandeur(),1.0/3600.0,new UnitéRéférence("heure","h",q1.getUnite().getGrandeur()));
			return new QuantitéMesurée(u1,q2.getValeur());

		}
		return null;
	}

}
