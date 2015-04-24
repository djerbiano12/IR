package Test;

import COR.*;
import Grandeur.Argent;
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
		Grandeur g4 = new Argent ();
		
		Unité u1;
		try {
			
		u1 = new UnitéAtomique("mètre","m",g1,0.001,new UnitéRéférence("kilomètre","km",g1));		
		Unité u2 = new UnitéAtomique("Seconde","s",g2,1.0/3600.0,new UnitéRéférence("heure","h",g2));
		Unité u3 = new UnitéDivision(u1.getNom()+"/"+u2.getNom(),u1.getAbbréviation()+"/"+u2.getAbbréviation(),g3,u1,u2);
		Unité u4 = new UnitéAtomique("livre","£",g4,1.5,new UnitéRéférence("dollar","$",g4));

		QuantitéMesurée q1 = new QuantitéMesurée(u1,1000);
		QuantitéMesurée q2 = new QuantitéMesurée(u2,60);
		QuantitéMesurée q3 = new QuantitéMesurée(u3,1000);
		QuantitéMesurée q4 = new QuantitéMesurée(u4,1);

		Conversion cor;
        ConversionCOR convertirKM_M, convertirKM_DM,convertirH_S,convertirH_MIN,
        convertirKmParH_DmParMin,convertirM_KM,convertirS_H,convertir£$_£,convertir$_€;
        convertirKM_M = new ConversionKM_M( null );
        convertirKM_DM = new ConversionKM_DM( convertirKM_M );
        convertirH_S = new ConversionH_S( convertirKM_DM );
        convertirH_MIN = new ConversionH_MIN(convertirH_S);
        convertirKmParH_DmParMin = new ConversionKmParH_DmParMin(convertirH_MIN);
        convertirM_KM = new ConversionM_KM(convertirKmParH_DmParMin);
        convertirS_H = new ConversionS_H(convertirM_KM);
        convertir£$_£ = new Conversion$_£(convertirS_H);
        convertir$_€ = new Conversion$_€(convertir£$_£);
        cor = convertir$_€;
        
        System.out.println(q1.getValeur()+" "+q1.getUnite().getAbbréviation()+" = " +cor.convertir(q1, "km").getValeur()+" "+cor.convertir(q1, "km").getUnite().getAbbréviation());
        System.out.println(q2.getValeur()+" "+q2.getUnite().getAbbréviation()+" = " +cor.convertir(q2, "h").getValeur()+" "+cor.convertir(q2, "h").getUnite().getAbbréviation());
        System.out.println(q1.getValeur()+" "+q1.getUnite().getAbbréviation()+" = " +cor.convertir(q1, "dm").getValeur()+" "+cor.convertir(q1, "dm").getUnite().getAbbréviation());
        System.out.println(q2.getValeur()+" "+q2.getUnite().getAbbréviation()+" = " +cor.convertir(q2, "min").getValeur()+" "+cor.convertir(q2, "min").getUnite().getAbbréviation());
        System.out.println(q3.getValeur()+" "+q3.getUnite().getAbbréviation()+" = " +cor.convertir(q3, "dm/min").getValeur()+" "+cor.convertir(q3, "dm/min").getUnite().getAbbréviation());
        System.out.println(q4.getValeur()+" "+q4.getUnite().getAbbréviation()+" = " +cor.convertir(q4, "€").getValeur()+" "+cor.convertir(q4, "€").getUnite().getAbbréviation());

        
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
