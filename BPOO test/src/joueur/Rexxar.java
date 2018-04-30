package joueur;
import java.util.ArrayList;
import carte.Serviteur;
import carte.Sort;
import joueur.Heros;
import carte.InvocationDesChiens;
import carte.Necrotraqueur;
import carte.Capacite;

public class Rexxar extends Heros{
	public Rexxar() {
		super("Rexxar", new Necrotraqueur());
		InvocationDesChiens chiens = new InvocationDesChiens(); 
		getDeck().add(new Serviteur("Busard affamé", 5, new Capacite("", "Pioche une carte"), 3, 2).clone());
		getDeck().add(new Sort("Marque du chasseur", 1, new Capacite("Marque du chasseur", "Abaisse à 1 les points de vie du serviteur ciblé")).clone());
		getDeck().add(new Sort("Tir des arcanes", 1, new Capacite("Tir des arcanes", "Inflige 2 points de dégâts au personnage")).clone());
		getDeck().add(new Sort("Lâchez les chiens", 3, chiens).clone());
		getDeck().add(new Sort("Ordre de tuer", 3, new Capacite("Ordre de tuer", "Inflige 3 points de dégâts au personnage ciblé")).clone());
	}
	public String toString() {
		return super.toString();
	}

}
