package joueur;
import joueur.Heros;
import carte.Sort;
import carte.ImageMirroir;

public class Jaina extends Heros{
	
	public Jaina() {
		super("Jaina", "Boule de feu");
		ImageMirroir m = new ImageMirroir();
		getDeck().add(new Sort("Choc de flamme", 7, "Attaque massive", "Inflige 4 points de dégâts à tous les serviteurs adverses"));
		getDeck().add(new Sort("Eclair de givre", 2, "Attaque du givre", "Inflige 3 points de dégâts au personnage ciblé"));
		getDeck().add(new Sort("Intelligence des arcanes", 2, "", "Pioche 2 cartes"));
		getDeck().add(new Sort("Image mirroir", 7, m.getNomCapacité(), m.getDescription()));
		getDeck().add(new Sort("Explosion pyrotechnique", 10, "Explosion pyrotechnique", "Inflige 10 points de dégâts au personnage ciblé"));
	}
	public String toString(){
		return super.toString();
	}

}
