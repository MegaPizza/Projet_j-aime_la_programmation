package joueur;
import java.util.ArrayList;
import jeu.Partie;
import carte.ICarte;
import carte.Carte;
import carte.Serviteur;
import carte.Sort;
import carte.Charge;
import carte.Provocation;
import carte.Capacite;

public class Heros implements IJoueur{
	private String nom;
	private int nombrePointsDeVie;
	private ArrayList<ICarte> deck = new ArrayList<ICarte>();
	private ArrayList<ICarte> main;
	private ArrayList<ICarte> jeu;
	Capacite pouvoir;
	private Partie partie;
	
	public Heros(String n, Capacite p) {
		this.nom = n;
		this.pouvoir = p;
		this.nombrePointsDeVie = 15;
		this.partie = null;
		Charge c = new Charge();
		Provocation prov = new Provocation();
		deck.add(new Serviteur("Chasse-marée murloc", 2, new Capacite("Cri de guerre", "Invocation d'un serviteur"), 2, 1).clone());
		deck.add(new Sort("Charge", 1, c).clone());
		deck.add(new Sort("Attaque mentale", 2, new Capacite("Attaque mentale", "Inflige 5 points de dégâts au héros")).clone());
		deck.add(new Serviteur("Champion de Hurlevent", 7, new Capacite("Bonus de Hurlevent", "Effet permanent sur les autres serviteurs alliés donnant un bonus +1/+1"), 6, 6).clone());
		deck.add(new Serviteur("Chef de raid", 3, new Capacite("Bonus du Chef de raid", "Effet permanent sur les autres serviteurs alliés de +1/0"), 2, 2).clone());
		deck.add(new Serviteur("Garde de Baie-du-butin", 5, prov, 5, 4).clone());
		deck.add(new Serviteur("La missilière téméraire", 6, c, 5, 2).clone());
		deck.add(new Serviteur("Archimage", 6, prov, 4, 7).clone());
		deck.add(new Serviteur("Gnôme lépreux", 1, new Capacite("Attaque du lépreux", "Inflige deux points de dégâts au héros"), 1, 1).clone());		
		deck.add(new Serviteur("Golem des moissons", 3, new Capacite("Golémisation", "Invoque un Golem endomagé +2/+1 qui n'a aucune capacité"), 2, 3).clone());
		main = new ArrayList<Carte>();
		jeu = new ArrayList<Carte>();
	}
	
	/*		-------------
	 * 		|	GETTER	|
	 */		-------------
	
	public String getNom() {
		return this.nom;
	}
	public int getNombrePointsDeVie() {
		return this.nombrePointsDeVie;
	}	
	public ArrayList<Carte> getDeck(){
		return this.deck;
	}	
	@Override
	public ArrayList<Carte> getMain() {
		return this.main;
	}
	@Override
	public ArrayList<Carte> getJeu() {
		return this.jeu;
	}
	public Capacite getPouvoir() {
		return this.pouvoir;
	}
	public Partie getPartie() {
		return this.partie;
	}
	
	@Override
	public Heros getHeros() {
		return this;
	}
	public Heros getAdversaireHeros() {
		return partie.getAdversaire(this);
	}
	
	@Override
	public Carte getCarteEnMain(String nomCarteMain) {
		for(Carte m : main) {
			if(m.getNom().equals(nomCarteMain))
				return m;
		}
		return null;
	}
	@Override
	public Carte getCarteEnJeu(String nomCarte) {
		for(Carte j : jeu) {
			if(j.getNom().equals(nomCarte))
				return j;
		}
		return null;
	}
	
	@Override
	public int getMana() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String getPseudo() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getStockMana() {
		// TODO Auto-generated method stub
		return 0;
	}

	/*		-------------
	 * 		|	SETTER	|
	 */		-------------
	
	
	public void setPartie(Partie p) {
		this.partie = p;
	}

	public void setNombrePointsDeVie(int nb) {
		this.nombrePointsDeVie = nb;
	}
	
	/*		---------------------
	 * 		|	AUTRE FONCTION	|
	 */		---------------------
	

	public String toString() {
		//return "Héros [ nom = " + this.nom + "; cartes =" + this.deck + " ]";
		return "Héros [ nom = " + this.nom + " ]";
	}
	@Override
	public void finirTour() {
		
	}
	
	@Override
	public void jouerCarte(Carte carte) {
		jeu.add(carte);
		main.remove(carte);
		
	}
	@Override
	public void jouerCarte(ICarte carte, Object cible) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void perdreCarte(ICarte carte) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void piocher() {
		int aleatoire = 0 + (int)(Math.random() * ((14 - 0) + 0));
		main.add(deck.get(aleatoire).clone());
		deck.remove(deck.get(aleatoire).clone());
	}
	@Override
	public void prendreTour() {
		
	}
	@Override
	public void utiliserCarte(ICarte carte, Object cible) {
		// TODO Auto-generated method stub
		
	}
	
	public void utiliserPouvoir(Object cible) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
