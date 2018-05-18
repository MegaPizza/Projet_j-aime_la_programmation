package carte;
import carte.Capacite;
import joueur.Heros;

public class OrdreDeTuer extends Capacite{
	public OrdreDeTuer() {
		super("Ordre de tuer","Inflige 3 points de d�g�ts au personnage cibl�");
	}

	public void executerEffetMiseEnJeu(Object cible) {
		
		if(cible instanceof Heros) {
				((Heros) cible).setNombrePointsDeVie(((Heros) cible).getNombrePointsDeVie()-3);
		}
		if(cible instanceof Serviteur) {
			((Serviteur) cible).setNombrePointsDeVie(((Serviteur) cible).getNombrePointsDeVie()-3);
		}
	}

}
