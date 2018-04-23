package joueur;
import java.util.ArrayList;
import carte.ICarte;
import carte.Carte;
import carte.Serviteur;
import carte.Sort;
import carte.Charge;
import carte.Provocation;

public class Heros implements IJoueur{
	private String nom;
	private int nombrePointsDeVie;
	private String pouvoir;
	private ArrayList<Carte> deck = new ArrayList<Carte>();
	private ArrayList<Carte> main;
	private ArrayList<Carte> jeu;
	
	public Heros(String n, String p) {
		this.nom = n;
		this.nombrePointsDeVie = 15;
		this.pouvoir = p;
		Charge c = new Charge();
		Provocation prov = new Provocation();
		deck.add(new Serviteur("Chasse-marée murloc", 2, "Cri de guerre", "Invocation d'un serviteur", 2, 1));
		deck.add(new Sort("Charge", 1, c.getNomCapacité(), c.getDescription()));
		deck.add(new Sort("Attaque mentale", 2, "Attaque mentale", "Inflige 5 points de dégâts au héros"));
		deck.add(new Serviteur("Champion de Hurlevent", 7, "Bonus de Hurlevent", "Effet permanent sur les autres serviteurs alliés donnant un bonus +1/+1", 6, 6));
		deck.add(new Serviteur("Chef de raid", 3, "Bonus du Chef de raid", "Effet permanent sur les autres serviteurs alliés de +1/0", 2, 2));
		deck.add(new Serviteur("Garde de Baie-du-butin", 5, prov.getNomCapacité(), prov.getDescription(), 5, 4));
		deck.add(new Serviteur("La missilière téméraire", 6, c.getNomCapacité(), c.getDescription(), 5, 2));
		deck.add(new Serviteur("Archimage", 6, prov.getNomCapacité(), prov.getDescription(), 4, 7));
		deck.add(new Serviteur("Gnôme lépreux", 1, "Attaque du lépreux", "Inflige deux points de dégâts au héros.", 1, 1));
		deck.add(new Serviteur("Golem des moissons", 3, "Golémisation", "Invoque un Golem endomagé +2/+1 qui n'a aucune	capacité", 2, 3));
		main = new ArrayList<Carte>();
		jeu = new ArrayList<Carte>();
	}
	public String getNom() {
		return this.nom;
	}
	public int getNombrePointsDeVie() {
		return this.nombrePointsDeVie;
	}
	public String getPouvoir() {
		return this.pouvoir;
	}
	public void setNombrePointsDeVie(int nb) {
		this.nombrePointsDeVie = nb;
	}
	public ArrayList<Carte> getDeck(){
		return this.deck;
	}
	public String toString() {
		//return "Héros [ nom = " + this.nom + "; cartes =" + this.deck + " ]";
		return "Héros [ nom = " + this.nom + " ]";
	}
	@Override
	public void finirTour() {
		// TODO Auto-generated method stub
		
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
	public Carte getCarteEnMain(String nomCarteMain) {
		for(Carte m : main) {
			if(m.getNom().equals(nomCarteMain))
				return m;
		}
		return null;
	}
	@Override
	public Heros getHeros() {
		return this;
	}
	@Override
	public ArrayList<Carte> getJeu() {
		return this.jeu;
	}
	@Override
	public ArrayList<Carte> getMain() {
		return this.main;
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
		int aleatoire = 0 + (int)(Math.random() * ((15 - 0) + 1));
		main.add(deck.get(aleatoire));
		
	}
	@Override
	public void prendreTour() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void utiliserCarte(ICarte carte, Object cible) {
		// TODO Auto-generated method stub
		
	}
	
	public void utiliserPouvoir(Object cible) {
		// TODO Auto-generated method stub
		
	}
	
}
