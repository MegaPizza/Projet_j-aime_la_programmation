package carte;
import carte.ICarte;
import carte.Capacite;
import joueur.Heros;

public class Carte implements ICarte{
	private String nom;
	private int cout;
	private Heros proprietaire;
	private Capacite capacite;
	
	public Carte(String n, int c, Capacite capacite){
		this.nom = n;
		this.cout = c;
		this.capacite = capacite;
	}
	
	public String toString() {
		return "\nCarte = [ nom = " + this.nom + "; cout = " + this.cout + " mana " + "; Capacité : " + this.capacite;
	}
	public String getNom(){
		return this.nom;
	}
	public int getCout(){
		return this.cout;
	}
	public Capacite getCapacite() {
		return this.capacite;
	}
	public void setNom(String n){
		this.nom = n;
	}
	
	public void setCout(int cout){
		this.cout = cout;
	}
	public void setCapacite(Capacite c) {
		this.capacite = c;
	}

	@Override
	public boolean disparait() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void executerAction(Object cible) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void executerEffetDebutMiseEnJeu(Object cible) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void executerDebutTour() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void executerEffetDisparition() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void executerFinTour() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Heros getProprietaire() {
		return this.proprietaire.getHeros();
	}
	
	public Carte clone() {
		return new Carte(nom, cout, capacite);
	}

}
