package Test;

import COR.Conversion;
import COR.ConversionCOR;
import COR.ConversionH_MIN;
import COR.ConversionH_S;
import COR.ConversionKM_DM;
import COR.ConversionKM_M;
import COR.ConversionKmParH_DmParMin;
import COR.ConversionM_KM;
import COR.ConversionS_H;
import Grandeur.Distance;
import Grandeur.Grandeur;
import Grandeur.GrandeurComposée;
import Grandeur.GrandeurDivision;
import Grandeur.Temps;
import QuantitéMesurée.QuantitéMesurée;
import Unités.Unité;
import Unités.UnitéAtomique;
import Unités.UnitéDivision;
import Unités.UnitéRéférence;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Grandeur g1 = new Distance ();
		Grandeur g2 = new Temps ();
		GrandeurComposée g3 = new GrandeurDivision(g1,g2);
		
		Unité u1;
		try {
			
		u1 = new UnitéAtomique("mètre","m",g1,0.001,new UnitéRéférence("kilomètre","km",g1));		
		Unité u2 = new UnitéAtomique("Seconde","s",g2,1.0/3600.0,new UnitéRéférence("Heure","h",g2));
		Unité u3 = new UnitéDivision(u1.getNom()+"/"+u2.getNom(),u1.getAbbréviation()+"/"+u2.getAbbréviation(),g3,u1,u2);

		QuantitéMesurée q1 = new QuantitéMesurée(u1,1000);
		QuantitéMesurée q2 = new QuantitéMesurée(u2,60);
		QuantitéMesurée q3 = new QuantitéMesurée(u3,1000.0/3600.0);

		Conversion cor;
        ConversionCOR convertirKM_M, convertirKM_DM,convertirH_S,convertirH_MIN,
        convertirKmParH_DmParMin,convertirM_KM,convertirS_H;
        convertirKM_M = new ConversionKM_M( null );
        convertirKM_DM = new ConversionKM_DM( convertirKM_M );
        convertirH_S = new ConversionH_S( convertirKM_DM );
        convertirH_MIN = new ConversionH_MIN(convertirH_S);
        convertirKmParH_DmParMin = new ConversionKmParH_DmParMin(convertirH_MIN);
        convertirM_KM = new ConversionM_KM(convertirKmParH_DmParMin);
        convertirS_H = new ConversionS_H(convertirM_KM);
        cor = convertirS_H;
        
        System.out.println(q1.getValeur()+" "+q1.getUnite().getAbbréviation()+" = " +cor.convertir(q1, "km").getValeur()+" "+cor.convertir(q1, "km").getUnite().getAbbréviation());
        System.out.println(q2.getValeur()+" "+q2.getUnite().getAbbréviation()+" = " +cor.convertir(q2, "h").getValeur()+" "+cor.convertir(q2, "h").getUnite().getAbbréviation());
        System.out.println(q1.getValeur()+" "+q1.getUnite().getAbbréviation()+" = " +cor.convertir(q1, "dm").getValeur()+" "+cor.convertir(q1, "dm").getUnite().getAbbréviation());
        System.out.println(q2.getValeur()+" "+q2.getUnite().getAbbréviation()+" = " +cor.convertir(q2, "min").getValeur()+" "+cor.convertir(q2, "min").getUnite().getAbbréviation());
        System.out.println(q3.getValeur()+" "+q3.getUnite().getAbbréviation()+" = " +cor.convertir(q3, "dm/min").getValeur()+" "+cor.convertir(q3, "dm/min").getUnite().getAbbréviation());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
