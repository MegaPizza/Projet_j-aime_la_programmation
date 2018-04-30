package joueur;
import java.util.ArrayList;
import carte.Capacite;
import joueur.Heros;
import carte.Sort;
import carte.ImageMirroir;
import carte.BouleDeFeu;

public class Jaina extends Heros{
	
	public Jaina() {
		super("Jaina", new BouleDeFeu());
		ImageMirroir m = new ImageMirroir();
		getDeck().add(new Sort("Choc de flamme", 7, new Capacite("Attaque massive", "Inflige 4 points de dégâts à tous les serviteurs adverses")).clone());
		getDeck().add(new Sort("Eclair de givre", 2, new Capacite("Attaque du givre", "Inflige 3 points de dégâts au personnage ciblé")).clone());
		getDeck().add(new Sort("Intelligence des arcanes", 2, new Capacite("", "Pioche 2 cartes")).clone());
		getDeck().add(new Sort("Image mirroir", 7, m).clone());
		getDeck().add(new Sort("Explosion pyrotechnique", 10, new Capacite("Explosion pyrotechnique", "Inflige 10 points de dégâts au personnage ciblé")).clone());
	}
	public String toString(){
		return super.toString();
	}

}
