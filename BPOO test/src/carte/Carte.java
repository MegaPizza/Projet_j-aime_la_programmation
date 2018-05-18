package carte;
import carte.ICarte;
import jeu.Partie;
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
	
	/*		-------------
	 * 		|	GETTER	|
	      	-------------     */
	
	public String getNom(){
		return this.nom;
	}

	public int getCout(){
		return this.cout;
	}
	
	public Capacite getCapacite() {
		return this.capacite;
	}
	
	@Override
	public Heros getProprietaire() {
		return this.proprietaire.getHeros();
	}
	
	
	/*		-------------
	 * 		|	SETTER	|
	      	-------------     */
	
	public void setNom(String n){
		this.nom = n;
	}
	
	public void setCout(int cout){
		this.cout = cout;
	}
	public void setCapacite(Capacite c) {
		this.capacite = c;
	}
	
	/*		-------------------------
	 * 		|	AUTRE FONCTIONS 	|
	      	-------------------------   */
	 
	public String toString() {
		return "\nCarte = [ nom = " + this.nom + "; cout = " + this.cout + " mana " + "; " + this.capacite;
	}

	@Override
	public void disparait() {
		this.getProprietaire().getJeu().remove(this);
	}
	@Override
	public void executerAction(Object cible) {
			if(cible instanceof Serviteur) {
				if(((Serviteur) cible).getNombrePointsDeVie()<=0)
					((Serviteur) cible).disparait();	
			}
		
	}
	
	@Override
	public void executerEffetDebutMiseEnJeu(Object cible) {
		
	}
	
	@Override
	public void executerDebutTour() {
			
	}
	
	@Override
	public void executerEffetDisparition(Object cible) {
		
	}
	
	public void executerEffetMiseEnJeu(Object cible) {
		if(cible instanceof Serviteur) {
			if(((Serviteur) cible).getNombrePointsDeVie()<=0)
				((Serviteur) cible).disparait();	
		}
	}
	
	@Override
	public void executerFinTour() {
		
	}
	
	public Carte clone() {
		return new Carte(nom, cout, capacite);
	}

}
