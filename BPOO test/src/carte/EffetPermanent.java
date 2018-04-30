package carte;
import java.util.ArrayList;
import carte.Capacite;
import joueur.Heros;
import carte.Carte;

public class EffetPermanent extends Capacite{

	public EffetPermanent() {
		super("Effet permanent","Cette capacité permet de modifier les caractéristiques des serviteurs en jeu, en leur ajoutant des points d'attaque et/ou de vie en bonus. L'effet disparaît lorsque la carte qui possède cette capacité n'est plus en jeu");
	}

	public void executerEffetMiseEnJeu(Object cible) {
		for(ICarte c : ((Heros) cible).getAdversaireHeros().getJeu()) {
			if(c instanceof Serviteur) {
				((Serviteur) c).setAttaque(((Serviteur) c).getAttaque() + 1 );
				((Serviteur) c).setNombrePointsDeVie(((Serviteur) c).getNombrePointsDeVie() + 1 );
			}
		}
		
	}

}
