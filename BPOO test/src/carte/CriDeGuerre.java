package carte;
import carte.Capacite;
import joueur.Heros;

public class CriDeGuerre extends Capacite{
	public CriDeGuerre() {
		super("Cri de guerre", "Invocation d'un serviteur");
	}
	
	public void executerEffetMiseEnJeu(Object cible) {
		if(cible instanceof Heros) {
			this.setPeutAttaquerHeros(false);
			boolean trouve = false;
			while(! trouve) {
				int aleatoire = 0 + (int)(Math.random() * ( ((Heros) cible).getDeck().size() -1 - 0) + 0 );
				if(((Heros) cible).getAdversaireHeros().getDeck().get(aleatoire) instanceof Serviteur){
					((Heros) cible).getAdversaireHeros().getJeu().add(new Serviteur("Serviteur invoqué", 1, null, 1, 1));
					trouve = true;
				}
			}
		}
		else
			System.out.println("Mauvaise cible !");
	}

}
