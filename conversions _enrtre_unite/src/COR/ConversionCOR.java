package COR;

import QuantitéMesurée.QuantitéMesurée;

public abstract class ConversionCOR implements Conversion {

	protected Conversion suivant;
	
	public ConversionCOR(Conversion suivant) {
		this.suivant = suivant;
	}

	@Override
	public QuantitéMesurée convertir(QuantitéMesurée q1, String nvelleUnite) throws Exception {
		QuantitéMesurée resultat = this.convertir1( q1,nvelleUnite );

        if ( resultat != null )
            return resultat;

        if ( this.suivant != null )
            return this.suivant.convertir( q1,nvelleUnite );
        else
            return null;
	}

	@Override
	public abstract QuantitéMesurée convertir1(QuantitéMesurée q1, String nvelleUnite) throws Exception ;

}
