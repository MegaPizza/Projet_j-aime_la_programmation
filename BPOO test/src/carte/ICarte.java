package carte;

public interface ICarte {
	boolean disparait();
	void executerAction(Object cible);
	void executerEffetDebutMiseEnJeu(Object cible);
	void executerDebutTour();
	void executerEffetDisparition();
	void executerFinTour();
	int getCout();
	String getNom();
}
