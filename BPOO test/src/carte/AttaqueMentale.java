package carte;
import carte.Capacite;

/**
 * Cette capacit� inflige 5 points de d�g�ts au h�ros
 */
import joueur.Heros;

public class AttaqueMentale extends Capacite{
	public AttaqueMentale() {
		super("Attaque mentale", "Inflige 5 points de d�g�ts au h�ros");
	}
	
	public void executerEffetMiseEnJeu(Object cible) {
		
		if(cible instanceof Heros) {
			this.setPeutAttaquerHeros(true);
				((Heros) cible).setNombrePointsDeVie( ((Heros)cible).getNombrePointsDeVie() - 5);
		
		}
		else
			System.out.println("Mauvaise cible !");
	}
}
