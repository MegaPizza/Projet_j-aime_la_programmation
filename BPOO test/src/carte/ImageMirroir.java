package carte;
import carte.Capacite;
import joueur.Heros;

public class ImageMirroir extends Capacite{
	public ImageMirroir() {
		super("Image Mirroir", "c'est aussi une capacit� de la famille des invocations de serviteurs. Elle est propre � Jaina. La carte poss�dant cette capacit� invoque automatiquement, au d�but du tour, deux serviteurs 0/+2 avec la capacit� \"Provocation\"");
	}
	public void executerEffetMiseEnJeu(Object cible) {
		int compteur = 0;
		for(ICarte c : ((Heros) cible).getAdversaireHeros().getDeck()) {
			if(c instanceof Serviteur) {
				if(((Serviteur) c).getAttaque()==0 && ((Serviteur) c).getNombrePointsDeVie()==2 && compteur <2) {
					((Heros) cible).getAdversaireHeros().getJeu().add((Serviteur) c);
					compteur = compteur + 1;
				}
			}
		}
	}
}
