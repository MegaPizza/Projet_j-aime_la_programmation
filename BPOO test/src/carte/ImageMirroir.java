package carte;
import carte.Capacite;
import joueur.Heros;

public class ImageMirroir extends Capacite{
	public ImageMirroir() {
		super("Image Mirroir", "c'est aussi une capacité de la famille des invocations de serviteurs. Elle est propre à Jaina. La carte possédant cette capacité invoque automatiquement, au début du tour, deux serviteurs 0/+2 avec la capacité \"Provocation\"");
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
