package carte;
import carte.Capacite;
import joueur.Heros;

public class AttaqueDuGivre extends Capacite{
	public AttaqueDuGivre() {
		super("Attaque du givre","Inflige 3 points de d�g�ts au personnage cibl�");
	}
	
	public void executerEffetMiseEnJeu(Object cible) {
		
		if(cible instanceof Heros) {
			this.setPeutAttaquerHeros(true);
			for(ICarte c : ((Heros)cible).getJeu()) {
				
				if((c instanceof Carte) && (c.getCapacite() instanceof Provocation))
					this.setPeutAttaquerHeros(false);
			}
			if(! this.getPeutAttaquerHeros()) 
				System.out.println("Ne peut pas attaquer le h�ros tant que la carte poss�dant Provocation est pr�sente sur le plateau !");
			else
				((Heros) cible).setNombrePointsDeVie(((Heros) cible).getNombrePointsDeVie()-3);
		}
		
		if(cible instanceof Serviteur) {
			((Serviteur) cible).setNombrePointsDeVie(((Serviteur) cible).getNombrePointsDeVie()-3);
		}
	}
}
