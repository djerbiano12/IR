package COR;

import QuantitéMesurée.QuantitéMesurée;

public interface Conversion {
	
	QuantitéMesurée convertir(QuantitéMesurée q1,String nvelleUnite) throws Exception;
	QuantitéMesurée convertir1(QuantitéMesurée q1,String nvelleUnite) throws Exception;

}
