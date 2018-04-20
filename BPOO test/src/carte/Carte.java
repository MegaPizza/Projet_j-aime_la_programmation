package carte;

public abstract class Carte implements ICarte{
	private String nom;
	private int cout;
	private int attaque;
	private int nombrePointsDeVie;
	private Capacité capacité;
	
	public Carte(String n, int c, Capacité capacité){
		this.nom = n;
		this.cout = c;
		this.capacité = capacité;
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
	public Capacité getCapacité() {
		return this.capacité;
	}
	//éventuelles exceptions
	public void setNom(String n){
		this.nom = n;
	}
}
