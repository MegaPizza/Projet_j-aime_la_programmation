package carte;
import carte.Capacite;
import joueur.Heros;

public class MarqueDuChasseur extends Capacite{
	public MarqueDuChasseur() {
		super("Marque du chasseur", "Cette capacité vise un serviteur et réduit à 1 son nombre de points de vie (quel que soit le nombre de points de vie qu'il avait au départ)");
	}
	
	public void executerAction(Object cible) {
		if(cible instanceof Serviteur) {
			((Serviteur) cible).setNombrePointsDeVie(1);
		}
		else
			System.out.println("Marque du chasseur n'attaque qu'un serviteur");
	}
}
