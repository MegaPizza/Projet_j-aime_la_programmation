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
		//On démarre la partie
		Partie partie = new Partie();
		System.out.println("Au début, la partie est démarrée: " + partie.estDemarree());
		partie.demarrerPartie();
		System.out.println("Maintenant, la partie est démarrée: " + partie.estDemarree());
		
		//Création des héros qu'on ajoute à la partie
		Jaina jaina = new Jaina();
		Rexxar rexxar = new Rexxar();
		partie.ajouterJoueur(jaina);
		partie.ajouterJoueur(rexxar);
		System.out.println(partie);
		
		//Un joueur commence son tour
		jaina.jeu.carte.serviteur.getActif(true); 
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
		//System.out.println("Après : " + partie.getLesJoueurs());
		 **/
		
		/** 
		 // on part du principe que le joueur a choisi son héros et qu'il est dans la variable choix 1 pour jaina, 2 pour rexxar
		  void jouerTour(int choix){
		  
			  if(choix==1){
				  listeDeCarte = jaina.getJeu();
				  if(listeDeCarte.isEmpty());
				  else if{
				  	for (Carte c : listeDeCarte){
				  		if(c.getNom="Serviteur")
				  			c.setActif(true);
				  	}
				  }
			  	 System.out.println("Voici vos cartes :/n ")
			  	 System.out.println("Main :" + jaina.getMain() +"/n");
				 System.out.println("Jeu :" + jaina.getJeu() + "/n");
				 System.out.println("Que voulez-vous faire ?(entrez le numeros correspondant)/n 1. Piocher /n 2.jouer une carte /n 3.attaque ciblée /n 4. attaque du Héros")
			  	partie.finTour(jaina)
			  }
			  
			 else if(choix==2){
			 	 listeDeCarte = rexxar.getJeu();
				  if(listeDeCarte.isEmpty();
				  else if{
				  	for (Carte c : listeDeCarte){
				  		if(c.getNom="Serviteur")
				  			c.setActif(true);
				  	}
				  }
			  	//action de ce joueur 
			  	partie.finTour(rexxar);
			  }
			 
			 else 
			 System.out.println("votre choix ne correspond pas à un héros.");
			 //de toute façon verifiera quand le joeur entrera une donnée		  
		 */
		
		/** Jaina et Rexxar, utilisation de leurs pouvoirs**/
		Jaina jaina = new Jaina();
		Rexxar rexxar = new Rexxar();
		//System.out.println("Le nombre de points de vie de Jaina était de " + jaina.getNombrePointsDeVie() );
		//rexxar.getPouvoir().executerAction(jaina);
		//System.out.println("Le nombre de points de vie de Jaina est de : " + jaina.getNombrePointsDeVie());
		
		/**Test avec la capacité image mirroir**/
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
