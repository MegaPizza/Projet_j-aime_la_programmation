package carte;
import java.util.ArrayList;
import carte.ICarte;
import carte.Capacite;
import joueur.Heros;
import joueur.Jaina;
import joueur.Rexxar;

public class Carte extends Capacite implements ICarte{
	private String nom;
	private int cout;
	
	public Carte(String n, int c, String nomCapacité, String descriptionCapacité){
		super(nomCapacité, descriptionCapacité);
		this.nom = n;
		this.cout = c;
	}
	
	public String toString() {
		return "Carte = [ nom = " + this.nom + "; cout = " + this.cout + " mana; " + super.toString();
	}
	public String getNom(){
		return this.nom;
	}
	public int getCout(){
		return this.cout;
	}
	
	public void setNom(String n){
		this.nom = n;
	}
	
	public void setCout(int cout){
		this.cout = cout;
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
		
		Jaina j = new Jaina();
		Rexxar r = new Rexxar();
		for(Carte c : r.getMain()) {
			if(c.getNom().equals(this.getNom()))
				return r;
		}
		return null;
		
	}

}
