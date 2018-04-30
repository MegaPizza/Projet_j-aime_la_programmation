package carte;
import carte.Capacite;
import joueur.Heros;

public class MarqueDuChasseur extends Capacite{
	public MarqueDuChasseur() {
		super("Marque du chasseur", "Cette capacit� vise un serviteur et r�duit � 1 son nombre de points de vie (quel que soit le nombre de points de vie qu'il avait au d�part)");
	}
	
	public void executerAction(Object cible) {
		if(cible instanceof Heros)
			System.out.println("Marque du chasseur ne peut pas attaquer un h�ros");
		if(cible instanceof Serviteur)
			((Serviteur) cible).setNombrePointsDeVie(1);
	}
}
