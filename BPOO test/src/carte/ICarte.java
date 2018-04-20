package carte;
import application.Application;

public interface ICarte {
	boolean disparait();
	void executerAction(Object cible);
	void executerEffetDebutMisEnJeu(Object cible);
	void executerDebutTour();
	void executerEffetDispaition();
	void executerFinTour();
	int getCout();
	String getNom();
}
