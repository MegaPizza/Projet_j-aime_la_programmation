package application;
import java.util.ArrayList;
import java.util.Scanner;
import joueur.Rexxar;
import joueur.Jaina;
import joueur.Heros;
import carte.ImageMirroir;
import carte.InvocationDeServiteurs;
import carte.InvocationDesChiens;
import carte.MarqueDuChasseur;
import carte.Necrotraqueur;
import carte.PiocheUneFois;
import carte.Charge;
import jeu.Partie;
import carte.EffetPermanent;
import carte.ICarte;
import carte.AttaqueCiblee;
import carte.AttaqueDuHeros;
import carte.AttaqueTotale;
import carte.Capacite;
import carte.Carte;
import carte.Serviteur;
import carte.Sort;
import carte.Provocation;

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
		
		/** Jaina et Rexxar, utilisation de leurs pouvoirs
		Jaina jaina = new Jaina();
		Rexxar rexxar = new Rexxar();
		//System.out.println("Le nombre de points de vie de Jaina était de " + jaina.getNombrePointsDeVie() );
		//rexxar.getPouvoir().executerAction(jaina);
		//System.out.println("Le nombre de points de vie de Jaina est de : " + jaina.getNombrePointsDeVie());
		**/
		/**Attaque de capacités
		Partie partie = new Partie();
		partie.demarrerPartie();
		partie.ajouterJoueur(jaina);
		partie.ajouterJoueur(rexxar);
		partie.setJoueurCourant(jaina);
		//System.out.println("Le joueur courant est : " + partie.getJoueurCourant());
		//System.out.println("L'adversaire de " + partie.getJoueurCourant() + " est " + jaina.getAdversaireHeros());
		
		Provocation ep = new Provocation();
		jaina.piocher();
		//jaina.jouerCarte(jaina.getMain().get(0));
		jaina.piocher();
		//jaina.jouerCarte(jaina.getMain().get(0));
		//System.out.println("Main :" + jaina.getMain());
		//System.out.println("Jeu :" + jaina.getJeu());
		rexxar.piocher();
		//rexxar.jouerCarte(rexxar.getMain().get(0));
		rexxar.piocher();
		//rexxar.jouerCarte(rexxar.getMain().get(0));
		
		

		//System.out.println("Jeu de Jaina avant : " + jaina.getJeu());
		//System.out.println("Jeu avant : " + jaina.getJeu());
		//System.out.println("Nombre de points de vie de Jaina avant : " + jaina.getNombrePointsDeVie());
		System.out.println("Main de Jaina avant : " + jaina.getMain());
		ep.executerEffetMiseEnJeu(rexxar);    
		//System.out.println("Nombre de points de vie de Jaina après : " + jaina.getNombrePointsDeVie());
		System.out.println("----------------------------------------------------------------");
		//System.out.println("Cartes de Jaina maintenant : " + jaina);
		//System.out.println("Jeu de Rexxar :" + rexxar.getJeu());
		//System.out.println("Jeu de Jaina :" + jaina.getJeu());
		//System.out.println("Nombre de points de vie de Jaina maintenant : " + jaina.getNombrePointsDeVie());	
		System.out.println("Main de Jaina maintenant : " + jaina.getMain());
		**/
		
		/** Attaque de cartes 
		Partie partie = new Partie();
		partie.demarrerPartie();
		partie.ajouterJoueur(jaina);
		partie.ajouterJoueur(rexxar);
		//Jeu de Jaina
		jaina.piocher();
		jaina.jouerCarte(jaina.getMain().get(0));
		jaina.piocher();
		jaina.jouerCarte(jaina.getMain().get(0));
		//Jeu de Rexxar
		rexxar.piocher();
		rexxar.jouerCarte(rexxar.getMain().get(0));
		rexxar.piocher();
		rexxar.jouerCarte(rexxar.getMain().get(0));
		System.out.println("Jeu de Jaina : " + jaina.getJeu());
		System.out.println("Jeu de Rexxar : " + rexxar.getJeu());
		System.out.println("------------------------------------------------------------");
		rexxar.getJeu().get(0).executerEffetMiseEnJeu(jaina);
		rexxar.getJeu().get(0).executerAction(jaina);
		
		System.out.println("Jeu de Jaina maintenant : " + jaina.getJeu());
		System.out.println("Jeu de Rexxar maintenant : " + rexxar.getJeu());
		System.out.println("Nombre de points de vie de Jaina maintenant : " + jaina.getNombrePointsDeVie());
		System.out.println("Nombre de points de vie de Rexxar maintenant : " + rexxar.getNombrePointsDeVie());
		**/
		boolean continuer = true;
		Jaina jaina = new Jaina();
		Rexxar rexxar = new Rexxar();
		Partie partie = new Partie();
		partie.demarrerPartie();
		partie.ajouterJoueur(jaina);
		partie.ajouterJoueur(rexxar);
		
		/**Menu**/
		while(continuer) {
			
		System.out.println("1. Recommencer une partie");
		System.out.println("2. Jouer une carte");
		System.out.println("3. Attaquer avec une carte du jeu");
		System.out.println("4. Fin de tour");
		System.out.println("5. Quitter");
		Scanner sc = new Scanner(System.in);
		System.out.println("Votre choix : ");
		int str = sc.nextInt();
		switch(str) {
		case 1 :
			partie.setJoueurCourant(jaina);
			System.out.println("A vous de commencer le tour, vous serez Jaina, vous jouez contre Rexxar");
			//System.out.println("Voici votre deck : " + jaina.getDeck());
			for(int i=1; i<=4; i++) {
				jaina.piocher();
				rexxar.piocher();
			}
			System.out.println("Vous avez 4 cartes dans votre main maintenant : " + partie.getJoueurCourant().getMain());
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("Voici la main du joueur adverse : " + partie.getJoueurCourant().getAdversaireHeros().getMain());
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("Voici le jeu du joueur adverse : " + partie.getJoueurCourant().getAdversaireHeros().getJeu());
			break;
		case 2 :
			Scanner scanner = new Scanner(System.in);
			System.out.println("Sélectionnez le nom de la carte que vous souhaitez jouer : ");
			String carte = scanner.nextLine();
			ICarte c = partie.getJoueurCourant().getCarteEnMain(carte);
			if(c!=null) {
				partie.getJoueurCourant().jouerCarte(c);
				System.out.println("Sélectionnez maintenant votre cible : ");
				String cible = scanner.nextLine();
				
				if(partie.getHerosString(cible)==null) {
					ICarte cartecible = partie.getJoueurCourant().getAdversaireHeros().getCarteEnJeu(cible);
					int trouve = 0;
					for(ICarte jeu : partie.getJoueurCourant().getAdversaireHeros().getJeu()) {
						if (jeu.getNom().equals(cartecible.getNom()))
							trouve = 1;
					}
					
					if(trouve==0) {
						System.out.println("Carte non présente sur le plateau");
						partie.getJoueurCourant().getMain().add(c);
						partie.getJoueurCourant().getJeu().remove(c);
					}
					else{
						c.getCapacite().executerAction(cible);
						c.getCapacite().executerEffetMiseEnJeu(cible);
					}
					
					
				}
				else {
					Heros heroscible = partie.getHerosString(cible);
					c.getCapacite().executerAction(heroscible);
					c.getCapacite().executerEffetMiseEnJeu(heroscible);
				}
				if(c instanceof Sort) {
					partie.getJoueurCourant().getJeu().remove(c);
				}
				System.out.println("Votre main maintenant : " + partie.getJoueurCourant().getMain());
				System.out.println("---------------------------------------------------------------------------------");
				System.out.println("Votre jeu maintenant : " + partie.getJoueurCourant().getJeu());
				System.out.println("---------------------------------------------------------------------------------");
				System.out.println("Le jeu de votre adversaire maintenant : " + partie.getJoueurCourant().getAdversaireHeros().getJeu());
				System.out.println("---------------------------------------------------------------------------------");
				//System.out.println("La main de votre adversaire maintenant : " + partie.getJoueurCourant().getAdversaireHeros().getMain());
				//System.out.println("---------------------------------------------------------------------------------");
				System.out.println("Nombre de points de vie du joueur courant : " + partie.getJoueurCourant().getNombrePointsDeVie());
				System.out.println("Nombre de points de vie du joueur adverse : " + partie.getJoueurCourant().getAdversaireHeros().getNombrePointsDeVie());
			}
		
			break;
		case 3 :
			Scanner scanner2 = new Scanner(System.in);
			System.out.println("Sélectionnez la carte en jeu avec laquelle vous souhaitez attaquer : ");
			String carte2 = scanner2.nextLine();
			ICarte c2 = partie.getJoueurCourant().getCarteEnJeu(carte2);
			if(c2!=null) {
				System.out.println("Sélectionnez maintenant votre cible : ");
				String cible2 = scanner2.nextLine();
				
				if(partie.getHerosString(cible2)==null) {
					ICarte cartecible2 = jaina.getCarteEnJeu(cible2);
					c2.executerAction(cartecible2);
				}
				else {
					Heros heroscible2 = partie.getHerosString(cible2);
					c2.executerAction(heroscible2);
					c2.executerEffetMiseEnJeu(heroscible2);
				}
				System.out.println("Votre main maintenant : " + jaina.getMain());
				System.out.println("---------------------------------------------------------------------------------");
				System.out.println("La main de votre adversaire maintenant : " + partie.getJoueurCourant().getAdversaireHeros().getMain());
				System.out.println("---------------------------------------------------------------------------------");
				System.out.println("Votre jeu maintenant : " + partie.getJoueurCourant().getJeu());
				System.out.println("---------------------------------------------------------------------------------");
				System.out.println("Le jeu de votre adversaire maintenant : " + partie.getJoueurCourant().getAdversaireHeros().getJeu());
				System.out.println("---------------------------------------------------------------------------------");
				System.out.println("Nombre de points de vie du joueur courant : " + partie.getJoueurCourant().getNombrePointsDeVie());
				System.out.println("Nombre de points de vie du joueur adverse : " + partie.getJoueurCourant().getAdversaireHeros().getNombrePointsDeVie());
			}
			break;
			
		case 4 :
			partie.finTour(partie.getJoueurCourant());
			System.out.println("Au tour de " + partie.getJoueurCourant().getNom() + " avec la main " + partie.getJoueurCourant().getMain() + "de jouer !");
			System.out.println("Voici votre jeu : " + partie.getJoueurCourant().getJeu());
			System.out.println("Voici le jeu du serviteur adverse : " + partie.getJoueurCourant().getAdversaireHeros().getJeu());
			partie.getJoueurCourant().piocher();
			break;
			
		case 5 :
			System.out.println("Au revoir !");
			System.exit(0);
			break;
		}
		
		}
	}
}


//________test interface graphique_____________

Fenetre fen1 = new Fenetre;
