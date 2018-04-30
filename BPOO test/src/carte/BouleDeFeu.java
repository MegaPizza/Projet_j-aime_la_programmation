package carte;
import carte.Capacite;
import joueur.Heros;

public class BouleDeFeu extends Capacite{
	
	public BouleDeFeu(){
		super("Boule de feu","Inflige un point de dégâts au personnage ciblé");
	}
	
	public void executerAction(Object cible) {
		if(cible instanceof Serviteur)
			((Serviteur) cible).setNombrePointsDeVie(((Serviteur) cible).getNombrePointsDeVie()-1);
		if(cible instanceof Heros)
			((Heros) cible).setNombrePointsDeVie(((Heros) cible).getNombrePointsDeVie()-1);
	} 
}
