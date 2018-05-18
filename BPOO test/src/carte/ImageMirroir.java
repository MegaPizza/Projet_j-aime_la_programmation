package carte;
import carte.Capacite;
import joueur.Heros;

public class ImageMirroir extends Capacite{
	public ImageMirroir() {
		super("Image Mirroir", "c'est aussi une capacit� de la famille des invocations de serviteurs. Elle est propre � Jaina. La carte poss�dant cette capacit� invoque automatiquement, au d�but du tour, deux serviteurs 0/+2 avec la capacit� \"Provocation\"");
	}
	public void executerEffetMiseEnJeu(Object cible) {
		if(cible instanceof Heros) {
			((Heros) cible).getAdversaireHeros().getJeu().add(new Serviteur("Carte1", 0, new Provocation(), 0, 2));
			((Heros) cible).getAdversaireHeros().getJeu().add(new Serviteur("Carte2", 0, new Provocation(), 0, 2));
		}
		else
			System.out.println("Mauvaise cible !");
	}
}
