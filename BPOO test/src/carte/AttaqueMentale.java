package carte;
import carte.Capacite;

/**
 * Cette capacité inflige 5 points de dégâts au héros
 */
import joueur.Heros;

public class AttaqueMentale extends Capacite{
	public AttaqueMentale() {
		super("Attaque mentale", "Inflige 5 points de dégâts au héros");
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
