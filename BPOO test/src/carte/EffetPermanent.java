package carte;
import java.util.ArrayList;
import carte.Capacite;
import joueur.Heros;
import carte.Carte;

public class EffetPermanent extends Capacite{

	public EffetPermanent() {
		super("Effet permanent","Cette capacit� permet de modifier les caract�ristiques des serviteurs en jeu, en leur ajoutant des points d'attaque et/ou de vie en bonus. L'effet dispara�t lorsque la carte qui poss�de cette capacit� n'est plus en jeu");
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
