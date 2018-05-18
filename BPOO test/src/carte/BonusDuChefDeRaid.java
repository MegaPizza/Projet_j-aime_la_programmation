package carte;
import carte.Capacite;
import joueur.Heros;
import carte.EffetPermanent;

public class BonusDuChefDeRaid extends Capacite{
	public BonusDuChefDeRaid() {
		super("Bonus du chef de Raid","Effet permanent sur les autres serviteurs alliés de +1/0");
	}
	public void executerEffetMiseEnJeu(Object cible) {
		if(cible instanceof Heros){
			for(ICarte c : ((Heros) cible).getAdversaireHeros().getJeu()) {
				if(c instanceof Serviteur && ((Serviteur) c).getNombrePointsDeVie()==0 && ((Serviteur) c).getAttaque()==1) {
					((Serviteur) c).setAttaque(((Serviteur) c).getAttaque() + 1 );
					((Serviteur) c).setNombrePointsDeVie(((Serviteur) c).getNombrePointsDeVie() + 1 );
				}
			}
		}
		else
			System.out.println("Mauvaise cible !");

	}

}
