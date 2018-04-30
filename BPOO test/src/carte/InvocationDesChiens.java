package carte;
import carte.Capacite;
import joueur.Heros;

public class InvocationDesChiens extends Capacite{
	public InvocationDesChiens() {
		super("Invocation des chiens", "C'est une capacit� propre �	Rexxar,	de la famille des invocations de serviteurs. Lorsqu'une	carte poss�dant	cette capacit� est mise	en jeu,	des	serviteurs chiens sont cr��s. Il y a autant	de chiens que le joueur	adverse	a de serviteurs");
	}
	
	public void executerEffetMiseEnJeu(Object cible) {
		int nbserviteurs = 0;
		int i;
		for(ICarte c : ((Heros) cible).getAdversaireHeros().getJeu()) {
			if (c instanceof Serviteur)
				nbserviteurs = nbserviteurs + 1;
		}
		for(i=1; i<=nbserviteurs; i++) {
			((Heros) cible).getJeu().add(new Serviteur("Chien", 1, new Charge(), 1, 1));
		}
	}
}
