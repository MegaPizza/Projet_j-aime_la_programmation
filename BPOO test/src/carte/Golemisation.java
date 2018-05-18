package carte;
import carte.Capacite;
import joueur.Heros;

public class Golemisation extends Capacite{
	public Golemisation() {
		super("Gol�misation","Invoque un Golem endomag� +2/+1 qui n'a aucune capacit�");
	}
	
	public void executerEffetMiseEnJeu(Object cible) {
		if(cible instanceof Heros) {
			((Heros) cible).getAdversaireHeros().getJeu().add(new Serviteur("Golem endommag�", 1, null, 2, 1));
		}
		else
			System.out.println("Mauvaise cible !");
	}
}
