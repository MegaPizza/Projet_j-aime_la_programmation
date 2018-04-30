package carte;
import carte.Capacite;
import joueur.Heros;

public class AttaqueCiblee extends Capacite{
	public AttaqueCiblee() {
		super("Attaque ciblée","Cette capacité permet à la carte qui la possède d'attaquer une cible, soit le héros, soit l'un de ses serviteurs. Cette capacité est sensible à la provocation");
	}
	public void executerAction(Object cible) {
		int trouve = 0;
		if(cible instanceof Heros) {
			for(Carte c : ((Heros)cible).getJeu()) {
				if((c instanceof Carte) && (c.getCapacite() instanceof Provocation))
					trouve = 1;
			}
			if(trouve == 0)
			((Heros) cible).setNombrePointsDeVie(((Heros) cible).getNombrePointsDeVie()-1);
			else
				System.out.println("Ne peut pas attaquer le héros tant que la carte possédant Provocation est présente sur le plateau !");
		}
		if(cible instanceof Serviteur) {
			//((Serviteur) cible).setNombrePointsDeVie(((Serviteur) cible).getNombrePointsDeVie()-1);
			System.out.println("Nombre de points de vie maintenant : " + ((Serviteur) cible).getNombrePointsDeVie());
		}
	}
}
