package carte;
import carte.Capacite;
import carte.ICapacite;
import joueur.Heros;

public class AttaqueTotale extends Capacite{
	public AttaqueTotale(){
		super("Attaque totale","Cette capacité permet à la carte qui la possède d'attaquer simultanément tous les serviteurs adverses");
	}
	public void executerEffetMiseEnJeu(Object cible) {
		if(cible instanceof Heros){
			
			for(ICarte c : ((Heros) cible).getJeu()) {
				if(c instanceof Serviteur) //erreur
					this.executerEffetMiseEnJeu(c);
			}
		}
		else
			System.out.println("Mauvaise cible !");
	}
}
