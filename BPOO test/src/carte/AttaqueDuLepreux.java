package carte;
import carte.Capacite;

/**
 * Cette capacit� Cette capacit� permet � la carte qui la poss�de, d'attaquer le h�ros adverse,
 * en toute circonstance,y compris lorsque le h�ros est prot�g� par la provocation
 */

import joueur.Heros;

public class AttaqueDuLepreux extends Capacite{
	
	public AttaqueDuLepreux() {
		super("Attaque du l�preux","C");
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
					System.out.println("Ne peut pas attaquer le h�ros tant que la carte poss�dant Provocation est pr�sente sur le plateau !");
			
			}
		}
		else
			System.out.println("Mauvaise cible !");
	}
}
