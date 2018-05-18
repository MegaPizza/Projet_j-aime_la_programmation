package carte;
import carte.ICapacite;
import joueur.Heros;

public class Capacite implements ICapacite{

	private String nomCapacité;
	private String description;
	private boolean peutAttaquerHeros;
	private boolean attaqueServiteur;
	
	public Capacite(String nom, String description) {
		this.nomCapacité = nom;
		this.description = description;
		this.peutAttaquerHeros = false;
		this.setAttaqueServiteur(false);
	}
	
	public String toString() {
		return "Capacité[ nom = " + this.nomCapacité + "; description = " + this.description + "]";
	}
	
	public boolean getAttaqueServiteur() {
		return this.attaqueServiteur;
	}
	
	public void setAttaqueServiteur(boolean b) {
		this.attaqueServiteur = b;
	}
	
	public boolean getPeutAttaquerHeros() {
		return this.peutAttaquerHeros;
	}
	
	public void setPeutAttaquerHeros(boolean b) {
		this.peutAttaquerHeros = b;
	}
	
	@Override
	public void executerAction(Object cible) {
		if(cible instanceof Serviteur) {
			if(((Serviteur) cible).getNombrePointsDeVie()<=0)
				((Serviteur) cible).disparait();
		}
		
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
		if(cible instanceof Serviteur) {
			if(((Serviteur) cible).getNombrePointsDeVie()<=0)
				((Serviteur) cible).disparait();
		}
	}

	@Override
	public String getDescription() {
		return this.description;
	}

	@Override
	public String getNomCapacité() {
		return this.nomCapacité;
	}
	
	public void setDescription(String d) {
		this.description = d;
	}
	
	public void setNomCapacité(String n) {
		this.nomCapacité = n;
	}
	
}
