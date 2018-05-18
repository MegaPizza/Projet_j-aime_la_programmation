package carte;

import joueur.Heros;

public class Charge extends Capacite{
	
	public Charge() {
		super("Charge", "Cette capacité permet de ne pas attendre avant d'attaquer \n");
	}
	@Override
	public void executerEffetMiseEnJeu(Object cible) {
		if(cible instanceof Heros) {
			this.setAttaqueServiteur(true);
		}
	}

}
