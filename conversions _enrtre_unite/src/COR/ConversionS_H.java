package COR;

import Quantit�Mesur�e.Quantit�Mesur�e;
import Unit�s.Unit�;
import Unit�s.Unit�R�f�rence;

public class ConversionS_H extends ConversionCOR {

	public ConversionS_H(Conversion suivant) {
		super(suivant);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Quantit�Mesur�e convertir1(Quantit�Mesur�e q1, String nvelleUnite) {
		if(q1.getUnite().getGrandeur().getGrandeur().equals("temps") && nvelleUnite.equals("h")){
			Quantit�Mesur�e q2 =new Quantit�Mesur�e(q1.getUnite(),q1.getValeur());
			q2.setValeur(q1.getUnite().getR�f�rence(q1.getValeur()));
			Unit� u1 = new Unit�R�f�rence("Heure",q1.getUnite().getGrandeur().getUnit�R�f�rence(),q1.getUnite().getGrandeur());
			return new Quantit�Mesur�e(u1,q2.getValeur());

		}
		return null;
	}

}
