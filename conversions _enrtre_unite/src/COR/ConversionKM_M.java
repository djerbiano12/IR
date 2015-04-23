package COR;

import Quantit�Mesur�e.Quantit�Mesur�e;
import Unit�s.Unit�;
import Unit�s.Unit�Atomique;
import Unit�s.Unit�R�f�rence;

public class ConversionKM_M extends ConversionCOR{

	public ConversionKM_M(Conversion suivant) {
		super(suivant);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Quantit�Mesur�e convertir1(Quantit�Mesur�e q1, String nvelleUnite) throws Exception {
		if(q1.getUnite().getGrandeur().getGrandeur().equals("distance") && nvelleUnite.equals("m")){
			Quantit�Mesur�e q2 =new Quantit�Mesur�e(q1.getUnite(),q1.getValeur());

			q2.setValeur(q1.getUnite().getR�f�rence(q1.getValeur()));
			q2.setValeur(q2.getValeur() * 1000);
			Unit� u1 = new Unit�Atomique("M�tre","m",q1.getUnite().getGrandeur(),0.001,new Unit�R�f�rence("kilom�tre","km",q1.getUnite().getGrandeur()));
			return new Quantit�Mesur�e(u1,q2.getValeur());

		}
		return null;
	}

}
