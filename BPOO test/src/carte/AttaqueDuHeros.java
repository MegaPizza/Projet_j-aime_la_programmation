package carte;
import carte.Capacite;
import joueur.Heros;

public class AttaqueDuHeros extends Capacite{
	public AttaqueDuHeros() {
		super("Attaque du héros", "Cette capacité permet à la carte qui la possède, d'attaquer le héros adverse, en toute circonstance, y compris lorsque le héros est protégé par la provocation");
	}
	
	public void executerAction(Object cible) {
		if(cible instanceof Heros)
			((Heros) cible).setNombrePointsDeVie(((Heros) cible).getNombrePointsDeVie()-1);
		if(cible instanceof Serviteur)
			System.out.println("Capacite n'attaque que le Héros !");
	}
}
