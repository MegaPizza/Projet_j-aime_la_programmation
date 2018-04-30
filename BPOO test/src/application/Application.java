package application;
import java.util.ArrayList;
import joueur.Rexxar;
import joueur.Jaina;
import joueur.Heros;
import carte.ImageMirroir;
import carte.Charge;
import jeu.Partie;
import carte.EffetPermanent;
import carte.AttaqueCiblee;
import carte.AttaqueDuHeros;
import carte.Capacite;
import carte.Serviteur;

public class Application {
	public static void main(String[]arg){
		/**
		//A voir finirTour et prendreTour dans la classe Heros
		//On d�marre la partie
		Partie partie = new Partie();
		System.out.println("Au d�but, la partie est d�marr�e: " + partie.estDemarree());
		partie.demarrerPartie();
		System.out.println("Maintenant, la partie est d�marr�e: " + partie.estDemarree());
		
		//Cr�ation des h�ros qu'on ajoute � la partie
		Jaina jaina = new Jaina();
		Rexxar rexxar = new Rexxar();
		partie.ajouterJoueur(jaina);
		partie.ajouterJoueur(rexxar);
		System.out.println(partie);
		
		//Un joueur commence son tour
		partie.setJoueurCourant(jaina);
		System.out.println("Le joueur courant est : " + partie.getJoueurCourant());
		
		//On cherche l'adversaire de chaque joueur
		System.out.println("L'adversaire de " + partie.getJoueurCourant() + " est " + partie.getAdversaire(jaina));
		System.out.println("L'adversaire de " + rexxar + " est " + partie.getAdversaire(rexxar));
		
		//On passe le tour a Rexxar
		partie.finTour(jaina);
		System.out.println("Le joueur courant maintenant est : " + partie.getJoueurCourant());
		
		//On fait gagner un joueur
		//System.out.println("Avant : " + partie.getLesJoueurs());
		//partie.gagnePartie(jaina);
		//System.out.println("Apr�s : " + partie.getLesJoueurs());
		 **/
		
		/** Jaina et Rexxar, utilisation de leurs pouvoirs**/
		Jaina jaina = new Jaina();
		Rexxar rexxar = new Rexxar();
		//System.out.println("Le nombre de points de vie de Jaina �tait de " + jaina.getNombrePointsDeVie() );
		//rexxar.getPouvoir().executerAction(jaina);
		//System.out.println("Le nombre de points de vie de Jaina est de : " + jaina.getNombrePointsDeVie());
		
		/**Test avec la capacit� image mirroir**/
		Partie partie = new Partie();
		partie.demarrerPartie();
		partie.ajouterJoueur(jaina);
		partie.ajouterJoueur(rexxar);
		partie.setJoueurCourant(jaina);
		System.out.println("Le joueur courant est : " + partie.getJoueurCourant());
		System.out.println("L'adversaire de " + partie.getJoueurCourant() + " est " + jaina.getAdversaireHeros());
		AttaqueCiblee ep = new AttaqueCiblee();
		jaina.piocher();
		jaina.jouerCarte(jaina.getMain().get(0));
		jaina.piocher();
		jaina.jouerCarte(jaina.getMain().get(0));
		System.out.println("Main :" + jaina.getMain());
		System.out.println("Jeu :" + jaina.getJeu());
		ep.executerAction(jaina);
		System.out.println("Jeu maintenant :" + jaina.getJeu());
		System.out.println("Nombre de points de vie de Jaina : " + jaina.getNombrePointsDeVie());	

	}
}
