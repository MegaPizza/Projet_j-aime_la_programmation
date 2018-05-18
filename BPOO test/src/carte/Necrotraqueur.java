package carte;
import carte.Capacite;
import carte.Serviteur;
import carte.Carte;
import carte.Sort;
import carte.ICapacite;
import carte.ICarte;
import joueur.Heros;

public class Necrotraqueur extends Capacite{
	public Necrotraqueur(){
		super("N�crotraqueur","Inflige deux points de d�g�ts au personnage cibl�");
	}

	public void executerAction(Object cible) {
		if(cible instanceof Serviteur)
			((Serviteur) cible).setNombrePointsDeVie(((Serviteur) cible).getNombrePointsDeVie()-2);
		if(cible instanceof Heros) {
			((Heros) cible).setNombrePointsDeVie(((Heros) cible).getNombrePointsDeVie()-2);
		}
	} 
}
