package carte;
import carte.Capacite;
import joueur.Heros;

/**
 * Cette capacit� permet � la carte qui la poss�de, d'attaquer le h�ros adverse, en toute circonstance,
 *  y compris lorsque le h�ros est prot�g� par la provocation
 * @author mange
 *
 */

public class AttaqueDuHeros extends Capacite{
	public AttaqueDuHeros() {
		super("Attaque du h�ros", "Cette capacit� permet � la carte qui la poss�de, d'attaquer le h�ros adverse, en toute circonstance, y compris lorsque le h�ros est prot�g� par la provocation");
	}
	
	public void executerAction(Object cible) {
		this.setPeutAttaquerHeros(true);
		if(cible instanceof Carte)
			System.out.println("Capacite n'attaque que le H�ros !");
	}
}
