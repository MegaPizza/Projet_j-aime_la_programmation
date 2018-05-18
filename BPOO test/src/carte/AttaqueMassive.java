package carte;
import carte.Capacite;
import joueur.Heros;

public class AttaqueMassive extends Capacite{
	public AttaqueMassive() {
		super("Attaque massive","Inflige 4 points de dégâts à tous les serviteurs adverses");
	}
	
	public void executerEffetMiseEnJeu(Object cible) {
		if(cible instanceof Heros) {
			for(ICarte c : ((Heros) cible).getJeu()){
				if(c instanceof Serviteur)
					((Serviteur) c).setNombrePointsDeVie(((Serviteur) c).getNombrePointsDeVie()-4);
			}
		}
		else
			System.out.println("Mauvaise cible !");
	}
}
