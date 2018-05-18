package carte;
import carte.Capacite;
import joueur.Heros;

public class Golemisation extends Capacite{
	public Golemisation() {
		super("Golémisation","Invoque un Golem endomagé +2/+1 qui n'a aucune capacité");
	}
	
	public void executerEffetMiseEnJeu(Object cible) {
		if(cible instanceof Heros) {
			((Heros) cible).getAdversaireHeros().getJeu().add(new Serviteur("Golem endommagé", 1, null, 2, 1));
		}
		else
			System.out.println("Mauvaise cible !");
	}
}
