package carte;
import joueur.Heros;
import carte.Capacite;

public interface ICarte {
	boolean disparait();
	void executerAction(Object cible);
	void executerEffetDebutMiseEnJeu(Object cible);
	void executerDebutTour();
	void executerEffetDisparition();
	void executerFinTour();
	int getCout();
	String getNom();
	Heros getProprietaire();
	Carte clone();
	Capacite getCapacite();
}
