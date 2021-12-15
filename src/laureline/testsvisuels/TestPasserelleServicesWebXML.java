package laureline.testsvisuels;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import laureline.classes.Outils;
import laureline.classes.PasserelleServicesWebXML;
import laureline.classes.PointDeTrace;
import laureline.classes.Trace;
import laureline.classes.Utilisateur;

public class TestPasserelleServicesWebXML {

	public static void main(String[] args) throws ParseException {
		String msg;
	
		// test visuel de la méthode getTousLesUtilisateurs
		ArrayList<Utilisateur> lesUtilisateurs = new ArrayList<Utilisateur>();
		msg = PasserelleServicesWebXML.getTousLesUtilisateurs("europa", Outils.sha1("mdputilisateur"), lesUtilisateurs);
		
		// affichage de la réponse
		System.out.println(msg);
		
		// affichage du nombre d'utilisateurs
		System.out.println("Nombre d'utilisateurs : " + lesUtilisateurs.size());
		
		// affichage de tous les utilisateurs
		for (Utilisateur unUtilisateur : lesUtilisateurs)
		{	
			System.out.println(unUtilisateur.toString());
		}


		// test visuel de la méthode getLesUtilisateursQueJautorise		
		msg = PasserelleServicesWebXML.getLesUtilisateursQueJautorise("galileo", Outils.sha1("mdputilisateur"), lesUtilisateurs);
		
		// affichage de la réponse
		System.out.println(msg);
		
		// affichage du nombre d'utilisateurs
		System.out.println("Nombre d'utilisateurs : " + lesUtilisateurs.size());
		
		// affichage de tous les utilisateurs
		for (Utilisateur unUtilisateur : lesUtilisateurs)
		{	
			System.out.println(unUtilisateur.toString());
		}

		// test visuel de la méthode getLesUtilisateursQuiMautorisent		
		msg = PasserelleServicesWebXML.getLesUtilisateursQuiMautorisent("europa", Outils.sha1("mdputilisateur"), lesUtilisateurs);
		
		// affichage de la réponse
		System.out.println(msg);
		
		// affichage du nombre d'utilisateurs
		System.out.println("Nombre d'utilisateurs : " + lesUtilisateurs.size());
		
		// affichage de tous les utilisateurs
		for (Utilisateur unUtilisateur : lesUtilisateurs)
		{	
			System.out.println(unUtilisateur.toString());
		}

		
		// test visuel de la méthode getLesParcoursDunUtilisateur
		ArrayList<Trace> lesTraces = new ArrayList<Trace>();
		msg = PasserelleServicesWebXML.getLesParcoursDunUtilisateur("europa", Outils.sha1("mdputilisateur"), "callisto", lesTraces);
		
		// affichage de la réponse
		System.out.println(msg);
		
		// affichage du nombre de traces
		System.out.println("Nombre de traces : " + lesTraces.size());
		
		// affichage de tous les utilisateurs
		for (Trace uneTrace : lesTraces)
		{	
			System.out.println(uneTrace.toString());
		}
		
		
		// test visuel de la méthode getUnParcoursEtSesPoints
		Trace laTrace = new Trace();
		msg = PasserelleServicesWebXML.getUnParcoursEtSesPoints("europa", "bf65a3f3eae46af8192408b64b6f1e8db1cbc6d8", 4, laTrace);
		
		//affichage de la réponse
		System.out.println(msg);
		
		// affichage de la trace
		System.out.println(laTrace.toString());
		
		// test visuel de la méthode envoyerPosition
		Date laDate = Outils.convertirEnDateHeure("24/01/2018 13:42:21");
		
		PointDeTrace lePoint = new PointDeTrace(26, 0, 48.15, -1.68, 50, laDate, 80);
		msg = PasserelleServicesWebXML.envoyerPosition("europa", Outils.sha1("mdputilisateur"), lePoint);
		System.out.println(msg);
		
	} // fin Main
} // fin class
