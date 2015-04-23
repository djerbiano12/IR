package COR;

import Quantit�Mesur�e.Quantit�Mesur�e;

public abstract class ConversionCOR implements Conversion {

	protected Conversion suivant;
	
	public ConversionCOR(Conversion suivant) {
		this.suivant = suivant;
	}

	@Override
	public Quantit�Mesur�e convertir(Quantit�Mesur�e q1, String nvelleUnite) throws Exception {
		Quantit�Mesur�e resultat = this.convertir1( q1,nvelleUnite );

        if ( resultat != null )
            return resultat;

        if ( this.suivant != null )
            return this.suivant.convertir( q1,nvelleUnite );
        else
            return null;
	}

	@Override
	public abstract Quantit�Mesur�e convertir1(Quantit�Mesur�e q1, String nvelleUnite) throws Exception ;

}
