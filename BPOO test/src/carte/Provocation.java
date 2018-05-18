package carte;
import carte.Capacite;
import joueur.Heros;

public class Provocation extends Capacite{
	public Provocation() {
		super("Provocation", "Cette capacité, détenue par un serviteur, oblige l'adversaire à viser ce serviteur. Le héros ne peut pas être victime d'une attaque tant que l'un des serviteurs ayant la provocation est présent sur le plateau");
	}
	
	public void executerEffetMiseEnJeu(Object cible) {
		System.out.println("Héros protégé par la Carte Provocation");	
	}
}
