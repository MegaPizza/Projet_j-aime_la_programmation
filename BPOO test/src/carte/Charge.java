package carte;

public class Charge extends Capacité{
	
	public Charge() {
		super("Charge", "Cette capacité permet à un serviteur de ne pas attendre avant d'attaquer");
	}
	public String toString() {
		return "[" + this.getNom() + ";" + this.getDescription() + "]";
	}

}
