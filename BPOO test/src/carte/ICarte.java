package carte;
import joueur.Heros;
import carte.Capacite;
import jeu.Partie;

public interface ICarte {
	void disparait();
	void executerAction(Object cible);
	void executerEffetDebutMiseEnJeu(Object cible);
	void executerDebutTour();
	void executerEffetDisparition(Object cible);
	void executerFinTour();
	void executerEffetMiseEnJeu(Object cible);
	int getCout();
	String getNom();
	Heros getProprietaire();
	Carte clone();
	Capacite getCapacite();
}
