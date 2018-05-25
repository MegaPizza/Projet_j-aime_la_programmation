package carte;
import carte.Capacite;

/**
 * Cette capacité Cette capacité permet à la carte qui la possède, d'attaquer le héros adverse,
 * en toute circonstance,y compris lorsque le héros est protégé par la provocation
 */

import joueur.Heros;

public class AttaqueDuLepreux extends Capacite{
	
	public AttaqueDuLepreux() {
		super("Attaque du lépreux","C");
	}
	
	public void executerEffetMiseEnJeu(Object cible) {
		
		if(cible instanceof Heros) {
			
			this.setPeutAttaquerHeros(true);
			if(cible instanceof Heros) {
				for(ICarte c : ((Heros)cible).getJeu()) {
					if((c instanceof Carte) && (c.getCapacite() instanceof Provocation))
						this.setPeutAttaquerHeros(false);
				}
				if(this.getPeutAttaquerHeros())
					((Heros) cible).setNombrePointsDeVie( ((Heros)cible).getNombrePointsDeVie() - 2);
				else
					System.out.println("Ne peut pas attaquer le héros tant que la carte possédant Provocation est présente sur le plateau !");
			
			}
		}
		else
			System.out.println("Mauvaise cible !");
	}
}
