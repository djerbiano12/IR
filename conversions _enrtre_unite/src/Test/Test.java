package Test;

import COR.*;
import Grandeur.Argent;
import Grandeur.Distance;
import Grandeur.Grandeur;
import Grandeur.GrandeurCompos�e;
import Grandeur.GrandeurDivision;
import Grandeur.Temps;
import Quantit�Mesur�e.Quantit�Mesur�e;
import Unit�s.Unit�;
import Unit�s.Unit�Atomique;
import Unit�s.Unit�Division;
import Unit�s.Unit�R�f�rence;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Grandeur g1 = new Distance ();
		Grandeur g2 = new Temps ();
		GrandeurCompos�e g3 = new GrandeurDivision(g1,g2);
		Grandeur g4 = new Argent ();
		
		Unit� u1;
		try {
			
		u1 = new Unit�Atomique("m�tre","m",g1,0.001,new Unit�R�f�rence("kilom�tre","km",g1));		
		Unit� u2 = new Unit�Atomique("Seconde","s",g2,1.0/3600.0,new Unit�R�f�rence("heure","h",g2));
		Unit� u3 = new Unit�Division(u1.getNom()+"/"+u2.getNom(),u1.getAbbr�viation()+"/"+u2.getAbbr�viation(),g3,u1,u2);
		Unit� u4 = new Unit�Atomique("livre","�",g4,1.5,new Unit�R�f�rence("dollar","$",g4));

		Quantit�Mesur�e q1 = new Quantit�Mesur�e(u1,1000);
		Quantit�Mesur�e q2 = new Quantit�Mesur�e(u2,60);
		Quantit�Mesur�e q3 = new Quantit�Mesur�e(u3,1000);
		Quantit�Mesur�e q4 = new Quantit�Mesur�e(u4,1);

		Conversion cor;
        ConversionCOR convertirKM_M, convertirKM_DM,convertirH_S,convertirH_MIN,
        convertirKmParH_DmParMin,convertirM_KM,convertirS_H,convertir�$_�,convertir$_�;
        convertirKM_M = new ConversionKM_M( null );
        convertirKM_DM = new ConversionKM_DM( convertirKM_M );
        convertirH_S = new ConversionH_S( convertirKM_DM );
        convertirH_MIN = new ConversionH_MIN(convertirH_S);
        convertirKmParH_DmParMin = new ConversionKmParH_DmParMin(convertirH_MIN);
        convertirM_KM = new ConversionM_KM(convertirKmParH_DmParMin);
        convertirS_H = new ConversionS_H(convertirM_KM);
        convertir�$_� = new Conversion$_�(convertirS_H);
        convertir$_� = new Conversion$_�(convertir�$_�);
        cor = convertir$_�;
        
        System.out.println(q1.getValeur()+" "+q1.getUnite().getAbbr�viation()+" = " +cor.convertir(q1, "km").getValeur()+" "+cor.convertir(q1, "km").getUnite().getAbbr�viation());
        System.out.println(q2.getValeur()+" "+q2.getUnite().getAbbr�viation()+" = " +cor.convertir(q2, "h").getValeur()+" "+cor.convertir(q2, "h").getUnite().getAbbr�viation());
        System.out.println(q1.getValeur()+" "+q1.getUnite().getAbbr�viation()+" = " +cor.convertir(q1, "dm").getValeur()+" "+cor.convertir(q1, "dm").getUnite().getAbbr�viation());
        System.out.println(q2.getValeur()+" "+q2.getUnite().getAbbr�viation()+" = " +cor.convertir(q2, "min").getValeur()+" "+cor.convertir(q2, "min").getUnite().getAbbr�viation());
        System.out.println(q3.getValeur()+" "+q3.getUnite().getAbbr�viation()+" = " +cor.convertir(q3, "dm/min").getValeur()+" "+cor.convertir(q3, "dm/min").getUnite().getAbbr�viation());
        System.out.println(q4.getValeur()+" "+q4.getUnite().getAbbr�viation()+" = " +cor.convertir(q4, "�").getValeur()+" "+cor.convertir(q4, "�").getUnite().getAbbr�viation());

        
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
