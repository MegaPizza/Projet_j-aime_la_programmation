package carte;
import carte.Capacite;
import joueur.Heros;

public class PiocheUneFois extends Capacite{
	public PiocheUneFois() {
		super("Pioche1","Pioche une carte");
	}
	
	public void executerEffetMiseEnJeu(Object cible) {
		if(cible instanceof Heros) 
			((Heros) cible).getAdversaireHeros().piocher();
		else
			System.out.println("Mauvaise cible !");
	}
}
