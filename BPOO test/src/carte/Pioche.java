package carte;
import carte.Capacite;
import joueur.Heros;

public class Pioche extends Capacite{
	public Pioche() {
		super("Pioche","La carte qui poss�de cette capacit� permet de piocher une ou plusieurs cartes");
	}
	
	public void executerEffetMiseEnJeu(Object cible) {
		((Heros) cible).getAdversaireHeros().piocher();
	}
}
