package carte;
import carte.ICapacite;
import joueur.Heros;

public class Capacite implements ICapacite{

	private String nomCapacit�;
	private String description;
	private boolean peutAttaquerHeros;
	private boolean attaqueServiteur;
	
	public Capacite(String nom, String description) {
		this.nomCapacit� = nom;
		this.description = description;
		this.peutAttaquerHeros = false;
		this.setAttaqueServiteur(false);
	}
	
	/*		-------------
	 * 		|	GETTER	|
	      	-------------     */
	 
	public boolean getAttaqueServiteur() {
		return this.attaqueServiteur;
	}
	
	public boolean getPeutAttaquerHeros() {
		return this.peutAttaquerHeros;
	}
	
	@Override
	public String getDescription() {
		return this.description;
	}

	@Override
	public String getNomCapacit�() {
		return this.nomCapacit�;
	
	/*		-------------
	 * 		|	SETTER	|
	      	-------------     */
		
	public void setAttaqueServiteur(boolean b) {
		this.attaqueServiteur = b;
	}
	
	public void setPeutAttaquerHeros(boolean b) {
		this.peutAttaquerHeros = b;
	}
	
	public void setDescription(String d) {
		this.description = d;
	}
	
	public void setNomCapacit�(String n) {
		this.nomCapacit� = n;
	}
	
	/*		---------------------
	 * 		|	AUTRE FONCTIONS	|
	      	---------------------  */
	
	
	public String toString() {
		return "Capacit�[ nom = " + this.nomCapacit� + "; description = " + this.description + "]";
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
	
}
