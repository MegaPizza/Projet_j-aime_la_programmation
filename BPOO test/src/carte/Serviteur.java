package carte;
import carte.Carte;
import joueur.Heros;

public class Serviteur extends Carte{
	
	private int attaque;
	private int nombrePointsDeVie;
	
	public Serviteur(String n, int c, Capacite capacite, int a, int nb){
		super(n,c, capacite);
		this.attaque = a;
		this.nombrePointsDeVie = nb;
	}
	
	/*		-------------
	 * 		|	GETTER	|
	      	-------------     */
	
	public int getAttaque() {
		return this.attaque;
	}
	public int getNombrePointsDeVie() {
		return this.nombrePointsDeVie;
	}
	
	public String getDescription() {
		return this.getDescription();
	}
	
	/*		-------------
	 * 		|	SETTER	|
	      	-------------     */
	
	public void setAttaque(int a) {
		this.attaque = a;
	}
	public void setNombrePointsDeVie(int n) {
		this.nombrePointsDeVie = n;
	}
	
	/*		-------------------------
	 * 		|	AUTRES FONCTIONS	|
	      	-------------------------  */
	
	public String toString() {
		return "\nServiteur[" + super.toString() + "; attaque =" + this.getAttaque() + "; nombre de points de vie =" + this.getNombrePointsDeVie() + "]";
	}
	
	public boolean equals(Object obj) {
		if(obj == this) return true;
		if(obj == null) return false;
		if(!(obj instanceof Serviteur)) return false;
		Serviteur s = (Serviteur) obj; 
		return this.getNom().equals(s.getNom());
	}
	
	public void executerAction(Object cible) {
		if(cible instanceof Heros && this.getCapacite().getPeutAttaquerHeros()) {
			if(this.getCapacite().getPeutAttaquerHeros() && this.getCapacite().getAttaqueServiteur())
				((Heros) cible).setNombrePointsDeVie(((Heros) cible).getNombrePointsDeVie() - this.attaque);
		}
		if(cible instanceof Serviteur) {
			if(this.getCapacite().getAttaqueServiteur())
				((Serviteur) cible).setNombrePointsDeVie(((Serviteur) cible).getNombrePointsDeVie() - this.attaque);
		}
		if(! this.getCapacite().getAttaqueServiteur()) {
			System.out.println("Doit attendre un tour pour attaquer !");
		}
		
		if(! this.getCapacite().getPeutAttaquerHeros())
			System.out.println("Vous ne pouvez pas attaquer le héros");
		
		if(cible instanceof Serviteur) {
			if(((Serviteur) cible).getNombrePointsDeVie()<=0)
				((Serviteur) cible).disparait();	
		}
	}
	
	public void executerEffetDebutMiseEnJeu(Object cible) {
		if(cible instanceof Heros && this.getCapacite().getPeutAttaquerHeros())
			((Heros) cible).setNombrePointsDeVie(((Heros) cible).getNombrePointsDeVie() - this.attaque);
		if(cible instanceof Serviteur)
			((Serviteur) cible).setNombrePointsDeVie(((Serviteur) cible).getNombrePointsDeVie() - this.attaque);
		if(! this.getCapacite().getAttaqueServiteur()) {
			System.out.println("Doit attendre un tour pour attaquer !");
		}
		if(! this.getCapacite().getPeutAttaquerHeros())
			System.out.println("Vous ne pouvez pas attaquer le héros");
		
		if(cible instanceof Serviteur) {
			if(((Serviteur) cible).getNombrePointsDeVie()<=0)
				((Serviteur) cible).disparait();	
		}
	}
	
	public void executerEffetMiseEnJeu(Object cible) {
		if(cible instanceof Heros) {
			if(this.getCapacite().getPeutAttaquerHeros() && this.getCapacite().getPeutAttaquerHeros()) 
				((Heros) cible).setNombrePointsDeVie(((Heros) cible).getNombrePointsDeVie() - this.attaque);
		}
		if(cible instanceof Serviteur)
			((Serviteur) cible).setNombrePointsDeVie(((Serviteur) cible).getNombrePointsDeVie() - this.attaque);
		
		if(! this.getCapacite().getAttaqueServiteur()) {
			System.out.println("Doit attendre un tour pour attaquer !");
		}
		if(! this.getCapacite().getPeutAttaquerHeros())
			System.out.println("Vous ne pouvez pas attaquer le héros");
		
		if(cible instanceof Serviteur) {
			if(((Serviteur) cible).getNombrePointsDeVie()<=0)
				((Serviteur) cible).disparait();	
		}
	}

}
