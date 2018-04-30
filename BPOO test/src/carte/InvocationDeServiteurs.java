package carte;
import carte.Capacite;
import joueur.Heros;
import carte.Provocation;

public class InvocationDeServiteurs extends Capacite{
	public InvocationDeServiteurs() {
		super("Invocation de serviteurs", "La carte qui possède cette capacité crée automatiquement, au moment de sa mise en jeu, un nouveau serviteur");
	}
	
	public void executerEffetMiseEnJeu(Object cible) {
		((Heros) cible).getAdversaireHeros().getJeu().add(new Serviteur("Garde de Baie-du-butin", 5, new Provocation(), 5, 4));
	}
}
