package carte;
import carte.Carte;

public class Serviteur extends Carte{
	
	private int attaque;
	private int nombrePointsDeVie;
	
	public Serviteur(String n, int c, String nomCapacité, String descriptionCapacité, int a, int nb){
		super(n,c, nomCapacité, descriptionCapacité);
		this.attaque = a;
		this.nombrePointsDeVie = nb;
	}
	public int getAttaque() {
		return this.attaque;
	}
	public int getNombrePointsDeVie() {
		return this.nombrePointsDeVie;
	}
	public void setAttaque(int a) {
		this.attaque = a;
	}
	public void setNombrePointsDeVie(int n) {
		this.nombrePointsDeVie = n;
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
	
	@Override
	public void executerEffetDebutTour() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executerEffetDisparition(Object cible) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executerEffetFinTour() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executerEffetMiseEnJeu(Object cible) {
		// TODO Auto-generated method stub
		
	}
	
	public String getDescription() {
		return this.getDescription();
	}

	@Override
	public String getNomCapacité() {
		return this.getNomCapacité();
	}
	
	
}
