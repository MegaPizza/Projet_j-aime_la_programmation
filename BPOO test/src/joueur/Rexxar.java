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
		getDeck().add(new Serviteur("Busard affam�", 5, new Capacite("", "Pioche une carte"), 3, 2).clone());
		getDeck().add(new Sort("Marque du chasseur", 1, new Capacite("Marque du chasseur", "Abaisse � 1 les points de vie du serviteur cibl�")).clone());
		getDeck().add(new Sort("Tir des arcanes", 1, new Capacite("Tir des arcanes", "Inflige 2 points de d�g�ts au personnage")).clone());
		getDeck().add(new Sort("L�chez les chiens", 3, chiens).clone());
		getDeck().add(new Sort("Ordre de tuer", 3, new Capacite("Ordre de tuer", "Inflige 3 points de d�g�ts au personnage cibl�")).clone());
	}
	public String toString() {
		return super.toString();
	}

}
