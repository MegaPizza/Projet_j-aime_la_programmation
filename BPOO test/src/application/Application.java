package application;
import joueur.Rexxar;
import joueur.Jaina;
import joueur.Heros;
import carte.Sort;
import carte.Charge;
import jeu.Partie;

public class Application {
	public static void main(String[]arg){
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
		partie.setJoueurCourant(jaina);
		System.out.println("Le joueur courant est : " + partie.getJoueurCourant());
		
		//On cherche l'adversaire de chaque joueur
		System.out.println("L'adversaire de " + partie.getJoueurCourant() + " est " + partie.getAdversaire(jaina));
		System.out.println("L'adversaire de " + rexxar + " est " + partie.getAdversaire(rexxar));
		
		//On passe le tour a Rexxar
		partie.finTour(jaina);
		System.out.println("Le joueur courant maintenant est : " + partie.getJoueurCourant());
		
		//On fait gagner un joueur
		System.out.println("Avant : " + partie.getLesJoueurs());
		partie.gagnePartie(jaina);
		System.out.println("Après : " + partie.getLesJoueurs());
	}
}
