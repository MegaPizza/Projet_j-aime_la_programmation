package joueur;
import java.util.ArrayList;
import carte.Serviteur;
import carte.Sort;
import joueur.Heros;
import carte.InvocationDesChiens;

public class Rexxar extends Heros{
	public Rexxar() {
		super("Rexxar", "N�crotraqueur");
		InvocationDesChiens chiens = new InvocationDesChiens(); 
		getDeck().add(new Serviteur("Busard affam�", 5, "", "Pioche une carte", 3, 2));
		getDeck().add(new Sort("Marque du chasseur", 1, "Marque du chasseur", "Abaisse � 1 les points de vie du serviteur cibl�"));
		getDeck().add(new Sort("Tir des arcanes", 1, "Tir des arcanes", "Inflige 2 points de d�g�ts au personnage"));
		getDeck().add(new Sort("L�chez les chiens", 3, chiens.getNomCapacit�(), chiens.getDescription()));
		getDeck().add(new Sort("Ordre de tuer", 3, "Ordre de tuer", "Inflige 3 points de d�g�ts au personnage cibl�"));
	}
	public String toString() {
		return super.toString();
	}

}
