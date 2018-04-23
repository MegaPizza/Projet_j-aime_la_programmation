package jeu;
import joueur.Heros;
import joueur.IJoueur;

public interface IPlateau {
	void ajouterJoueur(Heros joueur);
	void demarrerPartie();
	boolean estDemarree();
	void finTour(IJoueur joueur);
	void gagnePartie(IJoueur joueur);
	IJoueur getAdversaire(IJoueur joueur);
	IJoueur getJoueurCourant();
	void setJoueurCourant(IJoueur joueur);
}
