package carte;
import carte.Capacite;
import joueur.Heros;

public class TirDesArcanes extends Capacite{
	public TirDesArcanes() {
		super("Tir des Arcanes","Inflige 2 points de dégâts au personnage");
	}

	public void executerEffetMiseEnJeu(Object cible) {
		
		if(cible instanceof Heros) 
			((Heros) cible).setNombrePointsDeVie(((Heros) cible).getNombrePointsDeVie()-2);
	
		if(cible instanceof Serviteur)
			((Serviteur) cible).setNombrePointsDeVie(((Serviteur) cible).getNombrePointsDeVie()-2);
	}

}
