package carte;
import carte.Capacite;
import joueur.Heros;

public class Provocation extends Capacite{
	public Provocation() {
		super("Provocation", "Cette capacit�, d�tenue par un serviteur, oblige l'adversaire � viser ce serviteur. Le h�ros ne peut pas �tre victime d'une attaque tant que l'un des serviteurs ayant la provocation est pr�sent sur le plateau");
	}
	
	public void executerEffetMiseEnJeu(Object cible) {
		if(cible instanceof Heros)
			System.out.println("Carte Provocation, vous ne pouvez pas attaquer le h�ros");
	}
}
