package carte;
import carte.Capacite;
import joueur.Heros;

public class ExplosionPyrotechnique extends Capacite{
	public ExplosionPyrotechnique() {
		super("Explosion pyrotechnique","Inflige 10 points de d�g�ts au personnage cibl�");
	}
	
	public void executerEffetMiseEnJeu(Object cible) {
		
		if(cible instanceof Heros) {
			((Heros) cible).setNombrePointsDeVie(((Heros) cible).getNombrePointsDeVie()-10);
		}
		if(cible instanceof Serviteur) {
			((Serviteur) cible).setNombrePointsDeVie(((Serviteur) cible).getNombrePointsDeVie()-10);
		}
	}

}
