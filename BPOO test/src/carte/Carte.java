package carte;

public abstract class Carte implements ICarte{
	private String nom;
	private int cout;
	public Carte(String n, int c){
		this.nom = n;
		this.cout = c;
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
}
