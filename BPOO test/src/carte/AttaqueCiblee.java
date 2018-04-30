package carte;
import carte.Capacite;
import joueur.Heros;

public class AttaqueCiblee extends Capacite{
	public AttaqueCiblee() {
		super("Attaque cibl�e","Cette capacit� permet � la carte qui la poss�de d'attaquer une cible, soit le h�ros, soit l'un de ses serviteurs. Cette capacit� est sensible � la provocation");
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
				System.out.println("Ne peut pas attaquer le h�ros tant que la carte poss�dant Provocation est pr�sente sur le plateau !");
		}
		if(cible instanceof Serviteur) {
			//((Serviteur) cible).setNombrePointsDeVie(((Serviteur) cible).getNombrePointsDeVie()-1);
			System.out.println("Nombre de points de vie maintenant : " + ((Serviteur) cible).getNombrePointsDeVie());
		}
	}
}
