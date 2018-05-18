ppackage carte;
import carte.Capacite;
import joueur.Heros;

public class BonusDeHurlevent extends Capacite{

	public BonusDeHurlevent() {
		super("Bonus de Hurlevent", "Effet permanent sur les autres serviteurs alliés donnant un bonus +1/+1");
	}
	public void executerEffetMiseEnJeu(Object cible) {
		if(cible instanceof Heros){
	
			for(ICarte c : ((Heros) cible).getAdversaireHeros().getJeu()) {
				if(c instanceof Serviteur) {
					((Serviteur) c).setAttaque(((Serviteur) c).getAttaque() + 1 );
					((Serviteur) c).setNombrePointsDeVie(((Serviteur) c).getNombrePointsDeVie() + 1 );
				}
			}
		}
		else
			System.out.println("Mauvaise cible !");

	}

}
