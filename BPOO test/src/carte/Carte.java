package carte;

public abstract class Carte implements ICarte{
	private String nom;
	private int cout;
	private int attaque;
	private int nombrePointsDeVie;
	private Capacit� capacit�;
	
	public Carte(String n, int c, Capacit� capacit�){
		this.nom = n;
		this.cout = c;
		this.capacit� = capacit�;
	}
	public String getNom(){
		return this.nom;
	}
	public int getCout(){
		return this.cout;
	}
	public int getAttaque() {
		return this.attaque;
	}
	public int getNombrePointsDeVie() {
		return this.nombrePointsDeVie;
	}
	public Capacit� getCapacit�() {
		return this.capacit�;
	}
	//�ventuelles exceptions
	public void setNom(String n){
		this.nom = n;
	}
}
