package jeu;
import java.util.ArrayList;
import jeu.IPlateau;
import joueur.Heros;
import joueur.IJoueur;

public class Partie implements IPlateau{
	Heros joueurcourant;
	boolean demarree;
	ArrayList <Heros> lesjoueurs;
	
	public Partie() {
		lesjoueurs = new ArrayList<Heros>();
		demarree = false;
	}
	@Override
	public void ajouterJoueur(Heros joueur) {
		lesjoueurs.add(joueur);
	}

	@Override
	public void demarrerPartie() {
		demarree = true;
	}

	@Override
	public boolean estDemarree() {
		return this.demarree;
	}

	@Override
	public void finTour(IJoueur joueur) {
		if(lesjoueurs.get(0).equals(joueur))
			setJoueurCourant(lesjoueurs.get(1));
		else
			setJoueurCourant(lesjoueurs.get(0));
		
	}

	@Override
	public void gagnePartie(IJoueur joueur) {
		if(lesjoueurs.get(0).equals(joueur))
			lesjoueurs.remove(lesjoueurs.get(1));
		else
			lesjoueurs.remove(lesjoueurs.get(0));
		
		System.out.println("C'est le joueur " + joueur + " qui a gagné !");
	}

	@Override
	public IJoueur getAdversaire(IJoueur joueur) {
		if(lesjoueurs.get(0).equals(joueur))
			return lesjoueurs.get(1);
		else 
			return lesjoueurs.get(0);
	}

	@Override
	public IJoueur getJoueurCourant() {
		return this.joueurcourant;
	}

	@Override
	public void setJoueurCourant(IJoueur joueur) {
		this.joueurcourant = (Heros) joueur;
		
	}
	
	public ArrayList <Heros> getLesJoueurs(){
		return this.lesjoueurs;
	}
	
	public String toString() {
		return "La partie est composée des joueurs : [" + this.lesjoueurs + "]";
	}

}
