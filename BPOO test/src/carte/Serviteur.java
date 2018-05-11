package carte;
import carte.Carte;

public class Serviteur extends Carte{
	
	private int attaque;
	private int nombrePointsDeVie;
	private boolean actif = false;
	
	public Serviteur(String n, int c, Capacite capacite, int a, int nb){
		super(n,c, capacite);
		this.attaque = a;
		this.nombrePointsDeVie = nb;
	}
	
	
	public int getAttaque() {
		return this.attaque;
	}
	public int getNombrePointsDeVie() {
		return this.nombrePointsDeVie;
	}
	
	public boolean getActif () {
		return this.actif;
	}
	
	
	public void setAttaque(int a) {
		this.attaque = a;
	}
	public void setNombrePointsDeVie(int n) {
		this.nombrePointsDeVie = n;
	}
	
	public void setActif(boolean a) {
		this.actif = a;
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
	
	public boolean equals(Object obj) {
		if(obj == this) return true;
		if(obj == null) return false;
		if(!(obj instanceof Serviteur)) return false;
		Serviteur s = (Serviteur) obj; 
		return this.getNom().equals(s.getNom());
	}
	
	public String toString() {
		return "\nServiteur[" + super.toString() + "; attaque =" + this.getAttaque() + "; nombre de points de vie =" + this.getNombrePointsDeVie() + "]";
	}
	
	public String getDescription() {
		return this.getDescription();
	}

	
}
