package COR;

import Quantit�Mesur�e.Quantit�Mesur�e;
import Unit�s.Unit�;
import Unit�s.Unit�Atomique;
import Unit�s.Unit�Division;
import Unit�s.Unit�R�f�rence;

public class ConversionKmParH_DmParMin extends ConversionCOR {

	public ConversionKmParH_DmParMin(Conversion suivant) {
		super(suivant);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Quantit�Mesur�e convertir1(Quantit�Mesur�e q1, String nvelleUnite) throws Exception {
		if(q1.getUnite().getGrandeur().getGrandeur().equals("distance/temps") && nvelleUnite.equals("dm/min")){
			Quantit�Mesur�e q2 =new Quantit�Mesur�e(q1.getUnite(),q1.getValeur());
			Unit�Division unite = (Unit�Division) q1.getUnite();	
			Unit�Atomique gauche = (Unit�Atomique) unite.getGauche();
			Unit�Atomique droite = (Unit�Atomique) unite.getDroite();
			double valeurReference = q1.getValeur() * (gauche.getRapportConversion()/droite.getRapportConversion());	
			q2.setValeur(valeurReference);
			q2.setValeur(q2.getValeur() * 100.0/60.0);
			Unit� u1 = new Unit�Atomique("D�cam�tre","dm",gauche.getGrandeur(),0.01,new Unit�R�f�rence("kilom�tre","km",gauche.getGrandeur()));
			Unit� u2 = new Unit�Atomique("Minute","min",droite.getGrandeur(),1.0/60.0,new Unit�R�f�rence("heure","h",droite.getGrandeur()));
			Unit� u3 = new Unit�Division(u1.getNom()+"/"+u2.getNom(),u1.getAbbr�viation()+"/"+u2.getAbbr�viation(),q1.getUnite().getGrandeur(),u1,u2);
			return new Quantit�Mesur�e(u3,q2.getValeur());

		}
		return null;
	}

}
